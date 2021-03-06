/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GGPC
 */
public class PanelTower extends javax.swing.JPanel {

    private List<EntityEnemy> monsterList = new ArrayList<>();
    private Model model = new Model();

    /**
     * Creates new form PanelTower
     */
    public PanelTower(Model currModel) {
        model = currModel;
        monsterList = model.createMonsters();

        initComponents();

        monsterLabel1.setVisible(false);
        monsterLabel2.setVisible(false);
        monsterLabel3.setVisible(false);
        monsterLevel1.setVisible(false);
        monsterLevel2.setVisible(false);
        monsterLevel3.setVisible(false);
        monsterHP1.setVisible(false);
        monsterHP2.setVisible(false);
        monsterHP3.setVisible(false);
        monsterSelect1.setVisible(false);
        monsterSelect2.setVisible(false);
        monsterSelect3.setVisible(false);

        // UI depending on how many monsters appear in tower
        for (int i = 0; i < monsterList.size(); i++) {
            if (i == 0) {
                monsterLabel1.setText(monsterList.get(i).getMobType());
                monsterLevel1.setText("Level: " + monsterList.get(i).getLevel());
                monsterHP1.setText("Health: " + monsterList.get(i).getStats().get("Vitality"));
                monsterLabel1.setVisible(true);
                monsterLevel1.setVisible(true);
                monsterHP1.setVisible(true);
            } else if (i == 1) {
                monsterLabel2.setText(monsterList.get(i).getMobType());
                monsterLevel2.setText("Level: " + monsterList.get(i).getLevel());
                monsterHP2.setText("Health: " + monsterList.get(i).getStats().get("Vitality"));
                monsterLabel2.setVisible(true);
                monsterLevel2.setVisible(true);
                monsterHP2.setVisible(true);
            } else {
                monsterLabel3.setText(monsterList.get(i).getMobType());
                monsterLevel3.setText("Level: " + monsterList.get(i).getLevel());
                monsterHP3.setText("Health: " + monsterList.get(i).getStats().get("Vitality"));
                monsterLabel3.setVisible(true);
                monsterLevel3.setVisible(true);
                monsterHP3.setVisible(true);
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

        jLabel3 = new javax.swing.JLabel();
        charName = new javax.swing.JLabel();
        charHP = new javax.swing.JLabel();
        charTwiceStones = new javax.swing.JLabel();
        monsterLabel1 = new javax.swing.JLabel();
        actionAttack = new javax.swing.JButton();
        actionDef = new javax.swing.JButton();
        actionHeal = new javax.swing.JButton();
        monsterLabel2 = new javax.swing.JLabel();
        monsterLabel3 = new javax.swing.JLabel();
        battleLogHeaderLabel = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        monsterLevel1 = new javax.swing.JLabel();
        monsterHP1 = new javax.swing.JLabel();
        monsterLevel2 = new javax.swing.JLabel();
        monsterLevel3 = new javax.swing.JLabel();
        monsterHP2 = new javax.swing.JLabel();
        monsterHP3 = new javax.swing.JLabel();
        monsterSelect1 = new javax.swing.JButton();
        monsterSelect2 = new javax.swing.JButton();
        monsterSelect3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        battleLog = new javax.swing.JTextArea();

        jLabel3.setText("jLabel3");

        setBackground(new java.awt.Color(252, 200, 155));

        charName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        charName.setForeground(new java.awt.Color(255, 255, 255));
        charName.setText("Character Name: " + model.player.getCharName());

        charHP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        charHP.setForeground(new java.awt.Color(255, 255, 255));
        charHP.setText("HP: " + model.currentHP);

        charTwiceStones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        charTwiceStones.setForeground(new java.awt.Color(255, 255, 255));
        charTwiceStones.setText("Twice Stones: " + model.player.getExp());

        monsterLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        monsterLabel1.setForeground(new java.awt.Color(255, 255, 255));
        monsterLabel1.setText("Monster");

        actionAttack.setBackground(new java.awt.Color(255, 95, 162));
        actionAttack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actionAttack.setForeground(new java.awt.Color(255, 255, 255));
        actionAttack.setText("Attack");
        actionAttack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        actionAttack.setFocusable(false);
        actionAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionAttackActionPerformed(evt);
            }
        });

        actionDef.setBackground(new java.awt.Color(255, 95, 162));
        actionDef.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actionDef.setForeground(new java.awt.Color(255, 255, 255));
        actionDef.setText("Defend");
        actionDef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        actionDef.setFocusable(false);
        actionDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionDefActionPerformed(evt);
            }
        });

        actionHeal.setBackground(new java.awt.Color(255, 95, 162));
        actionHeal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actionHeal.setForeground(new java.awt.Color(255, 255, 255));
        actionHeal.setText("Heal");
        actionHeal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        actionHeal.setFocusable(false);
        actionHeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionHealActionPerformed(evt);
            }
        });

        monsterLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        monsterLabel2.setForeground(new java.awt.Color(255, 255, 255));
        monsterLabel2.setText("Monster");

        monsterLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        monsterLabel3.setForeground(new java.awt.Color(255, 255, 255));
        monsterLabel3.setText("Monster");

        battleLogHeaderLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        battleLogHeaderLabel.setForeground(new java.awt.Color(255, 255, 255));
        battleLogHeaderLabel.setText("Battle Log:");

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assessment2/assets/banner.PNG"))); // NOI18N

        monsterLevel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        monsterLevel1.setForeground(new java.awt.Color(255, 255, 255));
        monsterLevel1.setText("Level");

        monsterHP1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        monsterHP1.setForeground(new java.awt.Color(255, 255, 255));
        monsterHP1.setText("HP");

        monsterLevel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        monsterLevel2.setForeground(new java.awt.Color(255, 255, 255));
        monsterLevel2.setText("Level");

        monsterLevel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        monsterLevel3.setForeground(new java.awt.Color(255, 255, 255));
        monsterLevel3.setText("Level");

        monsterHP2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        monsterHP2.setForeground(new java.awt.Color(255, 255, 255));
        monsterHP2.setText("HP");

        monsterHP3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        monsterHP3.setForeground(new java.awt.Color(255, 255, 255));
        monsterHP3.setText("HP");

        monsterSelect1.setBackground(new java.awt.Color(255, 95, 162));
        monsterSelect1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        monsterSelect1.setForeground(new java.awt.Color(255, 255, 255));
        monsterSelect1.setText("Select");
        monsterSelect1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        monsterSelect1.setFocusable(false);
        monsterSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monsterSelect1ActionPerformed(evt);
            }
        });

        monsterSelect2.setBackground(new java.awt.Color(255, 95, 162));
        monsterSelect2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        monsterSelect2.setForeground(new java.awt.Color(255, 255, 255));
        monsterSelect2.setText("Select");
        monsterSelect2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        monsterSelect2.setFocusable(false);
        monsterSelect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monsterSelect2ActionPerformed(evt);
            }
        });

        monsterSelect3.setBackground(new java.awt.Color(255, 95, 162));
        monsterSelect3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        monsterSelect3.setForeground(new java.awt.Color(255, 255, 255));
        monsterSelect3.setText("Select");
        monsterSelect3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        monsterSelect3.setFocusable(false);
        monsterSelect3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monsterSelect3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Floor " + model.stageNum);

        battleLog.setEditable(false);
        battleLog.setBackground(new java.awt.Color(255, 95, 162));
        battleLog.setColumns(20);
        battleLog.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        battleLog.setForeground(new java.awt.Color(255, 255, 255));
        battleLog.setRows(8);
        battleLog.setTabSize(4);
        battleLog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        battleLog.setFocusable(false);
        battleLog.setMaximumSize(new java.awt.Dimension(15, 4));
        battleLog.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(battleLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(monsterLevel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(monsterHP1)
                                            .addGap(14, 14, 14)))
                                    .addComponent(monsterLabel1)
                                    .addComponent(monsterSelect1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(monsterHP2)
                                    .addComponent(monsterLevel2)
                                    .addComponent(monsterLabel2)
                                    .addComponent(monsterSelect2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(monsterLevel3)
                                    .addComponent(monsterLabel3)
                                    .addComponent(monsterHP3)
                                    .addComponent(monsterSelect3)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(actionHeal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(actionAttack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(actionDef, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(charTwiceStones, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(charHP, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(charName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(battleLogHeaderLabel)
                        .addGap(64, 64, 64))))
            .addComponent(banner)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monsterLabel1)
                    .addComponent(monsterLabel3)
                    .addComponent(monsterLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monsterLevel1)
                    .addComponent(monsterLevel2)
                    .addComponent(monsterLevel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monsterHP1)
                    .addComponent(monsterHP2)
                    .addComponent(monsterHP3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monsterSelect3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(monsterSelect1)
                        .addComponent(monsterSelect2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(charName)
                    .addComponent(battleLogHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(charHP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(charTwiceStones)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(actionDef, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(actionAttack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addComponent(actionHeal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // button for player action to defend
    private void actionDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionDefActionPerformed
        model.characterDefend();
        battleLog.append(model.player.getCharName() + " defended " + model.def + "\n");

        if (!model.monsterAction()) {
            charHP.setText(Integer.toString(model.currentHP));
            battleLog.append("Monsters attacked!\n" + model.player.getCharName() + " has " + model.currentHP + " HP remaining.\n");
        } else {
            this.setVisible(false);

            this.getParent().add(new PanelDeath(model));
            this.getParent().revalidate();
            this.getParent().repaint();
        }

    }//GEN-LAST:event_actionDefActionPerformed

    // button for player action to heal
    private void actionHealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionHealActionPerformed
        model.characterHeal();
        battleLog.append(model.player.getCharName() + " healed for " + model.heal + " HP\n");

        if (!model.monsterAction()) {
            charHP.setText(Integer.toString(model.currentHP));
            battleLog.append("Monsters attacked!\n" + model.player.getCharName() + " has " + model.currentHP + " HP remaining.\n");
        } else {
            this.setVisible(false);

            this.getParent().add(new PanelDeath(model));
            this.getParent().revalidate();
            this.getParent().repaint();
        }
    }//GEN-LAST:event_actionHealActionPerformed

    // button for player action to attack
    private void actionAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionAttackActionPerformed

        for (int i = 0; i < monsterList.size(); i++) {
            if (i == 0) {
                monsterSelect1.setVisible(true);
            } else if (i == 1) {
                monsterSelect2.setVisible(true);
            } else {
                monsterSelect3.setVisible(true);
            }
        }
    }//GEN-LAST:event_actionAttackActionPerformed

    // button for player to select monster 1 after clicking attack
    private void monsterSelect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monsterSelect1ActionPerformed
        // TODO add your handling code here:
        
        
        // when monster has been slain
        if (model.characterAttack(0)) {
            monsterHP1.setText("Health: 0");
            battleLog.append(model.player.getCharName() + " attacked " + model.monsterList.get(0).getCharName() + " for " + model.playerAttack + " damage\n");
            battleLog.append(model.monsterList.get(0).getCharName() + " has been slain!\n" + model.player.getCharName() + " obtained " + model.monsterList.get(0).getExp() + " Twicestones!\n");
            monsterSelect1.setEnabled(false);
        } else {
            monsterHP1.setText("Health: " + monsterList.get(0).getStats().get("Vitality"));
            battleLog.append(model.player.getCharName() + " attacked " + model.monsterList.get(0).getCharName() + " for " + model.playerAttack + " damage\n");
        }                
        
        

        charTwiceStones.setText("Twice Stones: " + model.player.getExp());

        monsterSelect1.setVisible(false);
        monsterSelect2.setVisible(false);
        monsterSelect3.setVisible(false);       

        // action after clearing the floor and defeating all monsters or action if floor is not cleared
        if (model.isCleared()) {
            this.setVisible(false);

            this.getParent().add(new PanelFloor(model));
            this.getParent().revalidate();
            this.getParent().repaint();
        } else {
            if (!model.monsterAction()) {
                charHP.setText("HP: " + Integer.toString(model.currentHP));
                battleLog.append("Monsters attacked!\n" + model.player.getCharName() + " has " + model.currentHP + " HP remaining.\n");
            } else {
                this.setVisible(false);

                this.getParent().add(new PanelDeath(model));
                this.getParent().revalidate();
                this.getParent().repaint();
            }
        }
    }//GEN-LAST:event_monsterSelect1ActionPerformed

    // button for player to select monster 2 after clicking attack
    private void monsterSelect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monsterSelect2ActionPerformed
        // TODO add your handling code here:                        
        
        
        // when monster has been slain
        if (model.characterAttack(1)) {
            monsterHP2.setText("Health: 0");
            battleLog.append(model.player.getCharName() + " attacked " + model.monsterList.get(1).getCharName() + " for " + model.playerAttack + " damage\n");
            battleLog.append(model.monsterList.get(1).getCharName() + " has been slain!\n" + model.player.getCharName() + " obtained " + model.monsterList.get(1).getExp() + " Twicestones!\n");
            monsterSelect2.setEnabled(false);
        } else {
            monsterHP2.setText("Health: " + monsterList.get(1).getStats().get("Vitality"));
            battleLog.append(model.player.getCharName() + " attacked " + model.monsterList.get(1).getCharName() + " for " + model.playerAttack + " damage\n");
        }

        charTwiceStones.setText("Twice Stones: " + model.player.getExp());

        monsterSelect1.setVisible(false);
        monsterSelect2.setVisible(false);
        monsterSelect3.setVisible(false);

        // action after clearing the floor and defeating all monsters or action if floor is not cleared
        if (model.isCleared()) {
            this.setVisible(false);

            this.getParent().add(new PanelFloor(model));
            this.getParent().revalidate();
            this.getParent().repaint();
        } else {
            if (!model.monsterAction()) {
                charHP.setText("HP: " + Integer.toString(model.currentHP));
                battleLog.append("Monsters attacked!\n" + model.player.getCharName() + " has " + model.currentHP + " HP remaining.\n");
            } else {
                this.setVisible(false);

                this.getParent().add(new PanelDeath(model));
                this.getParent().revalidate();
                this.getParent().repaint();
            }
        }
    }//GEN-LAST:event_monsterSelect2ActionPerformed

    // button for player to select monster 3 after clicking attack
    private void monsterSelect3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monsterSelect3ActionPerformed
        // TODO add your handling code here:
        
        
        // when monster has been slain
        if (model.characterAttack(2)) {
            monsterHP3.setText("Health: 0");
            battleLog.append(model.player.getCharName() + " attacked " + model.monsterList.get(2).getCharName() + " for " + model.playerAttack + " damage\n");
            battleLog.append(model.monsterList.get(2).getCharName() + " has been slain!\n" + model.player.getCharName() + " obtained " + model.monsterList.get(2).getExp() + " Twicestones!\n");
            monsterSelect3.setEnabled(false);
        } else {
            monsterHP3.setText("Health: " + monsterList.get(2).getStats().get("Vitality"));
            battleLog.append(model.player.getCharName() + " attacked " + model.monsterList.get(2).getCharName() + " for " + model.playerAttack + " damage\n");
        }

        charTwiceStones.setText("Twice Stones: " + model.player.getExp());

        monsterSelect1.setVisible(false);
        monsterSelect2.setVisible(false);
        monsterSelect3.setVisible(false);       

        // action after clearing the floor and defeating all monsters or action if floor is not cleared
        if (model.isCleared()) {
            this.setVisible(false);

            this.getParent().add(new PanelFloor(model));
            this.getParent().revalidate();
            this.getParent().repaint();
        } else {
            if (!model.monsterAction()) {
                charHP.setText("HP: " + Integer.toString(model.currentHP));
                battleLog.append("Monsters attacked!\n" + model.player.getCharName() + " has " + model.currentHP + " HP remaining.\n");
            } else {
                this.setVisible(false);

                this.getParent().add(new PanelDeath(model));
                this.getParent().revalidate();
                this.getParent().repaint();
            }
        }
    }//GEN-LAST:event_monsterSelect3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionAttack;
    private javax.swing.JButton actionDef;
    private javax.swing.JButton actionHeal;
    private javax.swing.JLabel banner;
    private javax.swing.JTextArea battleLog;
    private javax.swing.JLabel battleLogHeaderLabel;
    private javax.swing.JLabel charHP;
    private javax.swing.JLabel charName;
    private javax.swing.JLabel charTwiceStones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel monsterHP1;
    private javax.swing.JLabel monsterHP2;
    private javax.swing.JLabel monsterHP3;
    private javax.swing.JLabel monsterLabel1;
    private javax.swing.JLabel monsterLabel2;
    private javax.swing.JLabel monsterLabel3;
    private javax.swing.JLabel monsterLevel1;
    private javax.swing.JLabel monsterLevel2;
    private javax.swing.JLabel monsterLevel3;
    private javax.swing.JButton monsterSelect1;
    private javax.swing.JButton monsterSelect2;
    private javax.swing.JButton monsterSelect3;
    // End of variables declaration//GEN-END:variables
}
