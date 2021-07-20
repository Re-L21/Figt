import figt.PlayerStats;
import figt.EnemyStats;
import java.awt.Color;
import java.util.*;
import javax.swing.JOptionPane;

public class Fight extends javax.swing.JFrame 
{
    PlayerStats pStats = new PlayerStats();
    EnemyStats eStats = new EnemyStats();
    Random random = new Random();
    MainMenu mainmenu = new MainMenu();
    
    int randomResult,rewardResult;
    int goodReward = 300;
    int badReward = 80;
    
    public Fight() 
    {
        initComponents();
        InitCom();
    }

    public void InitCom()
    {
        playerHpBar.setValue(pStats.playerHP);
        playerHpBar.setStringPainted(true);
        
        EnemyHpBar.setValue(eStats.enemyHP);
        EnemyHpBar.setStringPainted(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        playerHpBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        atkBtn = new javax.swing.JButton();
        abilityBtn = new javax.swing.JButton();
        counterBtn = new javax.swing.JButton();
        retreatBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        EnemyHpBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 150));

        playerHpBar.setPreferredSize(new java.awt.Dimension(200, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Player");

        atkBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        atkBtn.setText("Attack");
        atkBtn.setPreferredSize(new java.awt.Dimension(130, 40));
        atkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atkBtnActionPerformed(evt);
            }
        });

        abilityBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        abilityBtn.setText("Ability");
        abilityBtn.setPreferredSize(new java.awt.Dimension(130, 40));
        abilityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abilityBtnActionPerformed(evt);
            }
        });

        counterBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        counterBtn.setText("Counter");
        counterBtn.setPreferredSize(new java.awt.Dimension(130, 40));
        counterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counterBtnActionPerformed(evt);
            }
        });

        retreatBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        retreatBtn.setText("Retreat");
        retreatBtn.setPreferredSize(new java.awt.Dimension(130, 40));
        retreatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retreatBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(playerHpBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(counterBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(abilityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(retreatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(atkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abilityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(counterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(retreatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerHpBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(650, 150));

        EnemyHpBar.setPreferredSize(new java.awt.Dimension(200, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Enemy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(EnemyHpBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EnemyHpBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    public void Action(int randomIndexEnemy, String playerAction)
    {
        if (randomIndexEnemy == 0 && playerAction == "atk")
            DrawResult();
        else if(randomIndexEnemy == 1 && playerAction == "atk")
            DamageEnemy();
        else if(randomIndexEnemy == 2 && playerAction == "atk")
            DamagePlayer();
        else if (randomIndexEnemy == 0 && playerAction == "ability")
            DamagePlayer();
        else if(randomIndexEnemy == 1 && playerAction == "ability")
            DrawResult();
        else if(randomIndexEnemy == 2 && playerAction == "ability")
            DamageEnemy();
        else if (randomIndexEnemy == 0 && playerAction == "counter")
            DamageEnemy();
        else if(randomIndexEnemy == 1 && playerAction == "counter")
            DamagePlayer();
        else if(randomIndexEnemy == 2 && playerAction == "counter")
            DrawResult();
        else
            SendMsgResult("Error while doing action");
        
        
    }
    
    public void DamagePlayer()
    {
        pStats.playerHP -= (eStats.enemyAtk - pStats.playerDef);
        InitCom();
        if (pStats.playerHP <= 0) 
        {
            SendMsgResult("YOU LOST!!!");
            SendReward("lost");
        }
        else
            SendMsgResult("enemy deal " + (eStats.enemyAtk - pStats.playerDef) +" To you!!!.");
    }
    
    public void DamageEnemy()
    {
        eStats.enemyHP -= (pStats.playerAtk - eStats.enemyDef);
        InitCom();
        if (eStats.enemyHP <= 0) 
        {
            SendMsgResult("YOU WON!!!");
            SendReward("won");
        }
        else
            SendMsgResult("You deal " + (pStats.playerAtk - eStats.enemyDef) +" To the enemy!!!.");
    }
    
    public void DrawResult()
    {
        SendMsgResult("IT'S A DRAW!!!!");
    }
    
    public void SendMsgResult(String msg)
    {
        JOptionPane.showMessageDialog(this, msg);
    }
    
    public void SendReward(String battleResult)
    {
        if (battleResult == "won") 
        {
            rewardResult = random.nextInt(goodReward);
            pStats.playerMoney += rewardResult;
            JOptionPane.showMessageDialog(this, "Congratulations!!! You won the battle! \n money got from the battle $" + rewardResult);
            mainmenu.setVisible(true);
            this.dispose();
        }
        else {
            rewardResult = random.nextInt(badReward);
            pStats.playerMoney += rewardResult;
            JOptionPane.showMessageDialog(this, "You lost the battle! \n money got from the battle $" + rewardResult);
            mainmenu.setVisible(true);
            this.dispose();
        }
    }
    
    public void Retreat()
    {
        mainmenu.setVisible(true);
        this.dispose();
    }
    
    private void atkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atkBtnActionPerformed
        
        Action(random.nextInt(3),"atk");

    }//GEN-LAST:event_atkBtnActionPerformed

    private void abilityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abilityBtnActionPerformed
        // TODO add your handling code here:
        Action(random.nextInt(3),"ability");
    }//GEN-LAST:event_abilityBtnActionPerformed

    private void counterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_counterBtnActionPerformed
        // TODO add your handling code here:
        Action(random.nextInt(3),"counter");
    }//GEN-LAST:event_counterBtnActionPerformed

    private void retreatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retreatBtnActionPerformed
        // TODO add your handling code here:
        Retreat();
    }//GEN-LAST:event_retreatBtnActionPerformed

    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Fight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Fight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar EnemyHpBar;
    private javax.swing.JButton abilityBtn;
    private javax.swing.JButton atkBtn;
    private javax.swing.JButton counterBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar playerHpBar;
    private javax.swing.JButton retreatBtn;
    // End of variables declaration//GEN-END:variables
}
