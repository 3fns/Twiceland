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
public class PanelTown extends javax.swing.JPanel {
    
    private Model model = new Model();

    
    /**
     * Creates new form PanelTown
     */
    
     public PanelTown(Model currModel) {                       
        model = currModel;         
        
        initComponents(); 
        
        welcome.setText("Welcome, " + model.player.getCharName());
    }
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actionTower = new javax.swing.JButton();
        actionRest = new javax.swing.JButton();
        actionRetire = new javax.swing.JButton();
        actionExit = new javax.swing.JButton();
        actionTwiceStones = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(252, 200, 155));

        actionTower.setBackground(new java.awt.Color(255, 95, 162));
        actionTower.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actionTower.setForeground(new java.awt.Color(255, 255, 255));
        actionTower.setText("Go Tower");
        actionTower.setToolTipText("");
        actionTower.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        actionTower.setFocusPainted(false);
        actionTower.setMinimumSize(new java.awt.Dimension(59, 19));
        actionTower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionTowerActionPerformed(evt);
            }
        });

        actionRest.setBackground(new java.awt.Color(255, 95, 162));
        actionRest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actionRest.setForeground(new java.awt.Color(255, 255, 255));
        actionRest.setText("Rest");
        actionRest.setToolTipText("");
        actionRest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        actionRest.setMinimumSize(new java.awt.Dimension(28, 19));
        actionRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionRestActionPerformed(evt);
            }
        });

        actionRetire.setBackground(new java.awt.Color(255, 95, 162));
        actionRetire.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actionRetire.setForeground(new java.awt.Color(255, 255, 255));
        actionRetire.setText("Retire");
        actionRetire.setToolTipText("");
        actionRetire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        actionRetire.setMinimumSize(new java.awt.Dimension(36, 19));
        actionRetire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionRetireActionPerformed(evt);
            }
        });

        actionExit.setBackground(new java.awt.Color(255, 95, 162));
        actionExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actionExit.setForeground(new java.awt.Color(255, 255, 255));
        actionExit.setText("Exit");
        actionExit.setToolTipText("");
        actionExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        actionExit.setMinimumSize(new java.awt.Dimension(24, 19));
        actionExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionExitActionPerformed(evt);
            }
        });

        actionTwiceStones.setBackground(new java.awt.Color(255, 95, 162));
        actionTwiceStones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actionTwiceStones.setForeground(new java.awt.Color(255, 255, 255));
        actionTwiceStones.setText("Use Twice Stones");
        actionTwiceStones.setToolTipText("");
        actionTwiceStones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        actionTwiceStones.setMinimumSize(new java.awt.Dimension(103, 19));
        actionTwiceStones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionTwiceStonesActionPerformed(evt);
            }
        });

        welcome.setBackground(new java.awt.Color(255, 255, 255));
        welcome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("Welcome, ");
        welcome.setFocusable(false);
        welcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assessment2/assets/banner.PNG"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assessment2/assets/town.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actionRest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actionRetire, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actionExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actionTwiceStones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actionTower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(actionTower, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionTwiceStones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionRest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionRetire, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        getAccessibleContext().setAccessibleParent(welcome);
    }// </editor-fold>//GEN-END:initComponents

    private void actionTwiceStonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionTwiceStonesActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        
        this.getParent().add(new PanelTwiceStones(model));
        this.getParent().revalidate();
        this.getParent().repaint();
    }//GEN-LAST:event_actionTwiceStonesActionPerformed

    private void actionTowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionTowerActionPerformed
        // TODO add your handling code here:
        
        
        this.setVisible(false);
        
        this.getParent().add(new PanelTower(model));
        this.getParent().revalidate();
        this.getParent().repaint();
    }//GEN-LAST:event_actionTowerActionPerformed

    private void actionRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionRestActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        
        this.getParent().add(new PanelRest(model));
        this.getParent().revalidate();
        this.getParent().repaint();
    }//GEN-LAST:event_actionRestActionPerformed

    private void actionRetireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionRetireActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        
        this.getParent().add(new PanelRetire(model));
        this.getParent().revalidate();
        this.getParent().repaint();
    }//GEN-LAST:event_actionRetireActionPerformed

    private void actionExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionExitActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_actionExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionExit;
    private javax.swing.JButton actionRest;
    private javax.swing.JButton actionRetire;
    private javax.swing.JButton actionTower;
    private javax.swing.JButton actionTwiceStones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
