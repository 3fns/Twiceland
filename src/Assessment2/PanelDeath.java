/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment2;

/**
 *
 * @author GGPC
 */
public class PanelDeath extends javax.swing.JPanel {
    
    private Model model = new Model();

    /**
     * Creates new form PanelDeath
     */
    public PanelDeath(Model currModel) {
        model = currModel;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diedLabel = new javax.swing.JLabel();
        deathButton = new javax.swing.JButton();
        banner = new javax.swing.JLabel();

        setBackground(new java.awt.Color(252, 200, 155));

        diedLabel.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        diedLabel.setForeground(new java.awt.Color(153, 0, 0));
        diedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diedLabel.setText("YOU DIED");

        deathButton.setBackground(new java.awt.Color(255, 95, 162));
        deathButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deathButton.setForeground(new java.awt.Color(255, 255, 255));
        deathButton.setText("Return to town");
        deathButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        deathButton.setFocusable(false);
        deathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deathButtonActionPerformed(evt);
            }
        });

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assessment2/assets/banner.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deathButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(diedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner)
                .addGap(117, 117, 117)
                .addComponent(diedLabel)
                .addGap(120, 120, 120)
                .addComponent(deathButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deathButtonActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        
        this.getParent().add(new PanelTown(model));
        this.getParent().revalidate();
        this.getParent().repaint();
    }//GEN-LAST:event_deathButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JButton deathButton;
    private javax.swing.JLabel diedLabel;
    // End of variables declaration//GEN-END:variables
}
