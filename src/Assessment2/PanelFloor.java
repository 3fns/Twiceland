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
public class PanelFloor extends javax.swing.JPanel {

    private Model model = new Model();

    /**
     * Creates new form PanelFloor
     */
    public PanelFloor(Model currModel) {
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

        continueFloor = new javax.swing.JButton();
        returnTown = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        continueFloor.setText("Continue");
        continueFloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueFloorActionPerformed(evt);
            }
        });

        returnTown.setText("Return to Town");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("FLOOR CLEARED");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(continueFloor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(returnTown)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continueFloor)
                    .addComponent(returnTown))
                .addGap(97, 97, 97))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void continueFloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueFloorActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        
        this.getParent().add(new PanelTower(model));
        this.getParent().revalidate();
        this.getParent().repaint();
    }//GEN-LAST:event_continueFloorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueFloor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton returnTown;
    // End of variables declaration//GEN-END:variables
}
