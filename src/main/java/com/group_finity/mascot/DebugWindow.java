package com.group_finity.mascot;

/**
 * @author Kilkakon
 */
public class DebugWindow extends javax.swing.JFrame {

    // TODO: 2021-05-01 add line contrast and possibly convert to jtable
    public DebugWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblShimejiX = new javax.swing.JLabel();
        lblShimejiXValue = new javax.swing.JLabel();
        lblShimejiYValue = new javax.swing.JLabel();
        lblShimejiY = new javax.swing.JLabel();
        lblWindowX = new javax.swing.JLabel();
        lblWindowY = new javax.swing.JLabel();
        lblWindowWidth = new javax.swing.JLabel();
        lblWindowHeight = new javax.swing.JLabel();
        lblWindowXValue = new javax.swing.JLabel();
        lblWindowYValue = new javax.swing.JLabel();
        lblWindowWidthValue = new javax.swing.JLabel();
        lblWindowHeightValue = new javax.swing.JLabel();
        lblBehaviour = new javax.swing.JLabel();
        lblBehaviourValue = new javax.swing.JLabel();
        lblEnvironmentY = new javax.swing.JLabel();
        lblEnvironmentX = new javax.swing.JLabel();
        lblEnvironmentXValue = new javax.swing.JLabel();
        lblEnvironmentYValue = new javax.swing.JLabel();
        lblEnvironmentWidth = new javax.swing.JLabel();
        lblEnvironmentHeight = new javax.swing.JLabel();
        lblEnvironmentHeightValue = new javax.swing.JLabel();
        lblEnvironmentWidthValue = new javax.swing.JLabel();
        lblActiveIE = new javax.swing.JLabel();
        lblActiveIEValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblShimejiX.setText("Shimeji X");

        lblShimejiXValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblShimejiXValue.setText("N/A");

        lblShimejiYValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblShimejiYValue.setText("N/A");

        lblShimejiY.setText("Shimeji Y");

        lblWindowX.setText("Window X");

        lblWindowY.setText("Window Y");

        lblWindowWidth.setText("Window W");

        lblWindowHeight.setText("Window H");

        lblWindowXValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWindowXValue.setText("N/A");

        lblWindowYValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWindowYValue.setText("N/A");

        lblWindowWidthValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWindowWidthValue.setText("N/A");

        lblWindowHeightValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWindowHeightValue.setText("N/A");

        lblBehaviour.setText("Behaviour");

        lblBehaviourValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBehaviourValue.setText("N/A");

        lblEnvironmentY.setText("Environment Y");

        lblEnvironmentX.setText("Environment X");

        lblEnvironmentXValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEnvironmentXValue.setText("N/A");

        lblEnvironmentYValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEnvironmentYValue.setText("N/A");

        lblEnvironmentWidth.setText("Environment W");

        lblEnvironmentHeight.setText("Environment H");

        lblEnvironmentHeightValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEnvironmentHeightValue.setText("N/A");

        lblEnvironmentWidthValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEnvironmentWidthValue.setText("N/A");

        lblActiveIE.setText("Active IE");

        lblActiveIEValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblActiveIEValue.setText("N/A");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblShimejiX)
                                        .addComponent(lblShimejiY)
                                        .addComponent(lblBehaviour)
                                        .addComponent(lblWindowX)
                                        .addComponent(lblWindowY)
                                        .addComponent(lblWindowWidth)
                                        .addComponent(lblWindowHeight)
                                        .addComponent(lblEnvironmentX)
                                        .addComponent(lblEnvironmentY)
                                        .addComponent(lblEnvironmentWidth)
                                        .addComponent(lblEnvironmentHeight)
                                        .addComponent(lblActiveIE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblBehaviourValue, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblShimejiYValue)
                                                        .addComponent(lblShimejiXValue)
                                                        .addComponent(lblWindowXValue)
                                                        .addComponent(lblWindowYValue)
                                                        .addComponent(lblWindowHeightValue)
                                                        .addComponent(lblEnvironmentHeightValue)
                                                        .addComponent(lblEnvironmentWidthValue)
                                                        .addComponent(lblWindowWidthValue)
                                                        .addComponent(lblEnvironmentXValue)
                                                        .addComponent(lblEnvironmentYValue)
                                                        .addComponent(lblActiveIEValue))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblBehaviour)
                                        .addComponent(lblBehaviourValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblShimejiX)
                                        .addComponent(lblShimejiXValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblShimejiYValue)
                                        .addComponent(lblShimejiY))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblActiveIE)
                                        .addComponent(lblActiveIEValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblWindowX)
                                        .addComponent(lblWindowXValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblWindowY)
                                        .addComponent(lblWindowYValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblWindowWidth)
                                        .addComponent(lblWindowWidthValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblWindowHeight)
                                        .addComponent(lblWindowHeightValue, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEnvironmentXValue)
                                        .addComponent(lblEnvironmentX))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEnvironmentY)
                                        .addComponent(lblEnvironmentYValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEnvironmentWidth)
                                        .addComponent(lblEnvironmentWidthValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEnvironmentHeight)
                                        .addComponent(lblEnvironmentHeightValue))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void setBehaviour(String text) {
        lblBehaviourValue.setText(text);
    }

    void setShimejiX(int x) {
        lblShimejiXValue.setText(String.format("%d", x));
    }

    void setShimejiY(int y) {
        lblShimejiYValue.setText(String.format("%d", y));
    }

    void setWindowTitle(String title) {
        lblActiveIEValue.setText(title);
    }

    void setWindowX(int x) {
        lblWindowXValue.setText(String.format("%d", x));
    }

    void setWindowY(int y) {
        lblWindowYValue.setText(String.format("%d", y));
    }

    void setWindowWidth(int width) {
        lblWindowWidthValue.setText(String.format("%d", width));
    }

    void setWindowHeight(int height) {
        lblWindowHeightValue.setText(String.format("%d", height));
    }

    void setEnvironmentX(int x) {
        lblEnvironmentXValue.setText(String.format("%d", x));
    }

    void setEnvironmentY(int y) {
        lblEnvironmentYValue.setText(String.format("%d", y));
    }

    void setEnvironmentWidth(int width) {
        lblEnvironmentWidthValue.setText(String.format("%d", width));
    }

    void setEnvironmentHeight(int height) {
        lblEnvironmentHeightValue.setText(String.format("%d", height));
    }

    @Override
    public void setVisible(boolean b) {
        if (b) {
            lblBehaviour.setText(Main.getInstance().getLanguageBundle().getString("Behaviour"));
            lblShimejiX.setText(Main.getInstance().getLanguageBundle().getString("ShimejiX"));
            lblShimejiY.setText(Main.getInstance().getLanguageBundle().getString("ShimejiY"));
            lblActiveIE.setText(Main.getInstance().getLanguageBundle().getString("ActiveIE"));
            lblWindowX.setText(Main.getInstance().getLanguageBundle().getString("WindowX"));
            lblWindowY.setText(Main.getInstance().getLanguageBundle().getString("WindowY"));
            lblWindowWidth.setText(Main.getInstance().getLanguageBundle().getString("WindowWidth"));
            lblWindowHeight.setText(Main.getInstance().getLanguageBundle().getString("WindowHeight"));
            lblEnvironmentX.setText(Main.getInstance().getLanguageBundle().getString("EnvironmentX"));
            lblEnvironmentY.setText(Main.getInstance().getLanguageBundle().getString("EnvironmentY"));
            lblEnvironmentWidth.setText(Main.getInstance().getLanguageBundle().getString("EnvironmentWidth"));
            lblEnvironmentHeight.setText(Main.getInstance().getLanguageBundle().getString("EnvironmentHeight"));
        }
        super.setVisible(b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBehaviour;
    private javax.swing.JLabel lblBehaviourValue;
    private javax.swing.JLabel lblEnvironmentHeight;
    private javax.swing.JLabel lblEnvironmentHeightValue;
    private javax.swing.JLabel lblEnvironmentWidth;
    private javax.swing.JLabel lblEnvironmentWidthValue;
    private javax.swing.JLabel lblEnvironmentX;
    private javax.swing.JLabel lblEnvironmentXValue;
    private javax.swing.JLabel lblEnvironmentY;
    private javax.swing.JLabel lblEnvironmentYValue;
    private javax.swing.JLabel lblShimejiX;
    private javax.swing.JLabel lblShimejiXValue;
    private javax.swing.JLabel lblShimejiY;
    private javax.swing.JLabel lblShimejiYValue;
    private javax.swing.JLabel lblActiveIE;
    private javax.swing.JLabel lblActiveIEValue;
    private javax.swing.JLabel lblWindowHeight;
    private javax.swing.JLabel lblWindowHeightValue;
    private javax.swing.JLabel lblWindowWidth;
    private javax.swing.JLabel lblWindowWidthValue;
    private javax.swing.JLabel lblWindowX;
    private javax.swing.JLabel lblWindowXValue;
    private javax.swing.JLabel lblWindowY;
    private javax.swing.JLabel lblWindowYValue;
    // End of variables declaration//GEN-END:variables
}