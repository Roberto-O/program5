/* StageFrame.java
 *
 * Starting point for CSC 220 program 5.
 * Spring, 2017.
 *
 * This is a simple, self-explanatory video game. Characters move around in a 
 * stage, visiting pre-selected points; every time the player successfully clicks
 * on a character, the point at which the character was at will no longer be visited.
 * Once the last point is removed, the character disappears.  The player wins the game when all
 * the characters disappear.
 *
 * When the game is stopped orpaused, a player can click on a character to add a 
 * point for the payer to visit.
 * K. Weber
 * weberk@mountunion.edu
 * April 13-14, 2017.
 *
 */
package csc220.program5;

import csc220.drawing.Camera;
import csc220.list.List;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

/**
 *
 * @author weberk
 */
public class StageFrame extends javax.swing.JFrame {
       
    private final List<GameCharacter> characters;
    private final Camera camera;
    GameCharacter chosenCharacter;
    boolean gameOver;

    public StageFrame() {
        initComponents();
        characters = new List<>();
       // characters.add(new csc220.program5.sample.RoundHead(10, 30, 50, 1000));
       // characters.add(new csc220.program5.chasees.BlockHead(10, 60, 60, 60, 200));
        characters.add(new csc220.program5.chasees.MarioHead(70, 100, 60, 60, 1500));
        camera = new Camera();
        chosenCharacter = null;
        gameOver = false;
    }
    
    //  The main JPanel i the frame is built from this class.
    private class StagePanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            boolean anyVisible = false;
            for (GameCharacter c: characters) {
                if (c.isVisible()) {
                    c.draw(g);
                    anyVisible = true;
                }
            }
            if (!anyVisible) {
                selectLabel.setText("You WIN!!!");
                gameOver = true;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stagePanel = new StagePanel();
        startPauseButton = new javax.swing.JButton();
        selectLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        stagePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stagePanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout stagePanelLayout = new javax.swing.GroupLayout(stagePanel);
        stagePanel.setLayout(stagePanelLayout);
        stagePanelLayout.setHorizontalGroup(
            stagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        stagePanelLayout.setVerticalGroup(
            stagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        startPauseButton.setText("Start");
        startPauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startPauseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(startPauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 205, Short.MAX_VALUE))
            .addComponent(stagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startPauseButton)
                    .addComponent(selectLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startPauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startPauseButtonActionPerformed
        if (gameOver) 
             return;
        if (startPauseButton.getText().equals("Pause")) {
            startPauseButton.setText("Restart");
            camera.cut();
            for (GameCharacter c: characters) {
                c.stopAnimation();
            }
       } else {
            startPauseButton.setText("Pause");
            camera.roll(stagePanel);           
            for (GameCharacter c: characters) {
                c.startAnimation();
            }
       }
      
    }//GEN-LAST:event_startPauseButtonActionPerformed

    private void stagePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stagePanelMouseClicked
        if (gameOver)
            return;
        if (chosenCharacter != null) {
            chosenCharacter.add(evt.getPoint());
            chosenCharacter = null;
            selectLabel.setText("");
            return;
        }
        for (GameCharacter c: characters) {
            if (c.contains(evt.getPoint())) {
               if (startPauseButton.getText().equals("Pause")) {
                    c.clickAction();
               } else {
                    selectLabel.setText("Choose point for character to visit");
                    chosenCharacter = c;
            
               }
               return;
            }
        }
    }//GEN-LAST:event_stagePanelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new StageFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel selectLabel;
    private javax.swing.JPanel stagePanel;
    private javax.swing.JButton startPauseButton;
    // End of variables declaration//GEN-END:variables
}
