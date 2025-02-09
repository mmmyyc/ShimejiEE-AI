package com.group_finity.mascot.chat;

import com.group_finity.mascot.config.CharacterConfig;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.data.message.SystemMessage;
import dev.langchain4j.data.message.UserMessage;

import java.util.logging.Level;
import java.util.logging.Logger;

import static dev.langchain4j.model.openai.OpenAiChatModelName.GPT_4_O_MINI;

public class DefaultAIChatService implements AIChatService {
    private static final Logger log = Logger.getLogger(DefaultAIChatService.class.getName());
    private final ChatLanguageModel model;
    private final boolean isConfigured;
    private final String imageSet;
    
    public DefaultAIChatService(String imageSet) {
        this.imageSet = imageSet;
        System.out.println("Creating DefaultAIChatService with imageSet: " + imageSet);
        String apiKey = ApiKeyConfigDialog.getApiKey();
        if (apiKey == null || apiKey.isEmpty()) {
            log.warning("OpenAI API Key not configured - using fallback responses");
            this.model = null;
            this.isConfigured = false;
        } else {
            this.model = OpenAiChatModel.builder()
                .apiKey(apiKey)
                .modelName(GPT_4_O_MINI)
                .temperature(0.7)
                .build();
            this.isConfigured = true;
        }
    }
    
    public boolean isConfigured() {
        return isConfigured;
    }
    
    public String getImageSet() {
        return imageSet;
    }
    
    @Override
    public String chat(String input) {
        if (!isConfigured) {
            String name = CharacterConfig.getCharacterName(imageSet);
            // 提供一些基本的回复，用于测试UI是否正常工作
            if (input.toLowerCase().contains("hello") || input.toLowerCase().contains("hi")) {
                return "Hello! I'm " + name + "! (Note: AI chat is not configured, using basic responses)";
            } else if (input.toLowerCase().contains("how are you")) {
                return "I'm doing great! How about you? (Note: AI chat is not configured)";
            } else if (input.toLowerCase().contains("name")) {
                return "I'm " + name + "! (Note: AI chat is not configured)";
            } else {
                return "I can only give basic responses right now. To enable AI chat, please click the settings icon and configure your OpenAI API Key.";
            }
        }
        
        try {
            // 每次对话时重新获取角色信息
            String personality = CharacterConfig.getPersonality(imageSet);
            SystemMessage systemMessage = SystemMessage.from(personality);
            UserMessage userMessage = UserMessage.from(input);
            
            return model.generate(systemMessage, userMessage).content().text();
        } catch (Exception e) {
            log.log(Level.WARNING, "Failed to get AI response", e);
            return "Sorry, I couldn't process that message. Error: " + e.getMessage();
        }
    }
    
    @Override
    public void close() {
        // No need to close anything with langchain4j
    }
}