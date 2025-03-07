package com.group_finity.mascotnative.macclassic;

import com.group_finity.mascotnative.shared.BaseTranslucentSwingWindow;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Component;

/**
 * Can't pass mouse clicks through the transparent areas like other platforms
 *
 * @see <a href="https://bugs.openjdk.java.net/browse/JDK-8013450">Bug [JDK-8013450]</a>
 */
class MacTranslucentWindow extends BaseTranslucentSwingWindow<MacNativeImage> {

    @Override
    public void setUp() {

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(final Graphics g) {
                g.drawImage(getImage().bufferedImage(), 0,0, null);
            }
        };

        setBackground(CLEAR);
        panel.setBackground(CLEAR);

        setContentPane(panel);

        //so it won't interfere with any custom shadows the user wants to add
        getRootPane().putClientProperty("Window.shadow", Boolean.FALSE);
        // it gets rid of the 'flickering' when dragging,
        getRootPane().putClientProperty("apple.awt.draggableWindowBackground", Boolean.FALSE);


        setAlwaysOnTop(true);
    }

    @Override
    public void updateImage() {
        if (isImageChanged()) {
            getContentPane().repaint();
            setImageChanged(false);
        }
    }

    @Override
    public Component asComponent() {
        return this;  // 因为MacTranslucentWindow继承自JWindow
    }
}
