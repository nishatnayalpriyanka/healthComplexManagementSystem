/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthComplex;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MenuPage extends javax.swing.JFrame {

    /**
     * Creates new form MenuPage
     */
    public MenuPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   /* */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBangladeshHealthComplexMsg = new javax.swing.JLabel();
        btLogOut = new javax.swing.JButton();
        btManageInformation = new javax.swing.JButton();
        btPersonalInformation = new javax.swing.JButton();
        btMedicalRecord = new javax.swing.JButton();
        btOperationDetails = new javax.swing.JButton();
        btPaymentDetails = new javax.swing.JButton();
        lblWelcomePageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBangladeshHealthComplexMsg.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lblBangladeshHealthComplexMsg.setText("Bangladesh Health Complex");
        getContentPane().add(lblBangladeshHealthComplexMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 600, 100));

        btLogOut.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/log out logo.jpg"))); // NOI18N
        btLogOut.setText("Log Out ");
        btLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 460, 70));

        btManageInformation.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btManageInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/manage Information logo.png"))); // NOI18N
        btManageInformation.setText("Manage Information");
        btManageInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManageInformationActionPerformed(evt);
            }
        });
        getContentPane().add(btManageInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 460, 70));

        btPersonalInformation.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btPersonalInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/personal information logo.png"))); // NOI18N
        btPersonalInformation.setText("Personal Informtion");
        btPersonalInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPersonalInformationActionPerformed(evt);
            }
        });
        getContentPane().add(btPersonalInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 460, 70));

        btMedicalRecord.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btMedicalRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/medical records logo.png"))); // NOI18N
        btMedicalRecord.setText("Medical Records");
        btMedicalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedicalRecordActionPerformed(evt);
            }
        });
        getContentPane().add(btMedicalRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 460, 70));

        btOperationDetails.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btOperationDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/operation details logo.png"))); // NOI18N
        btOperationDetails.setText("Operation Details");
        btOperationDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOperationDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btOperationDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 460, 70));

        btPaymentDetails.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btPaymentDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/payment details logo.png"))); // NOI18N
        btPaymentDetails.setText("Payment Details");
        btPaymentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPaymentDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btPaymentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 460, 70));

        lblWelcomePageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/Background2.jpg"))); // NOI18N
        getContentPane().add(lblWelcomePageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogOutActionPerformed
        int option=JOptionPane.showConfirmDialog(null,"Are you sure ? ","Log Out",JOptionPane.YES_NO_OPTION);
        if(option==0){
            JOptionPane.showMessageDialog(this,"Logging Out..."," ",JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
            LogInPage l = new LogInPage();
            l.setVisible(true);
        }
    }//GEN-LAST:event_btLogOutActionPerformed

    private void btManageInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManageInformationActionPerformed
        setVisible(false);
        ManageInformationPage m=new ManageInformationPage();
        m.setVisible(true);
    }//GEN-LAST:event_btManageInformationActionPerformed

    private void btPersonalInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPersonalInformationActionPerformed
        setVisible(false);
        PersonalInfrmationPage p=new PersonalInfrmationPage();
        p.setVisible(true);
    }//GEN-LAST:event_btPersonalInformationActionPerformed

    private void btMedicalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedicalRecordActionPerformed
        setVisible(false);
        MedicalRecordsPage m=new MedicalRecordsPage();
        m.setVisible(true);
    }//GEN-LAST:event_btMedicalRecordActionPerformed

    private void btOperationDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOperationDetailsActionPerformed
        setVisible(false);
        OperationDetailsPage o=new OperationDetailsPage();
        o.setVisible(true);
    }//GEN-LAST:event_btOperationDetailsActionPerformed

    private void btPaymentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPaymentDetailsActionPerformed
        setVisible(false);
        PaymentDetailsPage p=new PaymentDetailsPage();
        p.setVisible(true);
    }//GEN-LAST:event_btPaymentDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogOut;
    private javax.swing.JButton btManageInformation;
    private javax.swing.JButton btMedicalRecord;
    private javax.swing.JButton btOperationDetails;
    private javax.swing.JButton btPaymentDetails;
    private javax.swing.JButton btPersonalInformation;
    private javax.swing.JLabel lblBangladeshHealthComplexMsg;
    private javax.swing.JLabel lblWelcomePageBackground;
    // End of variables declaration//GEN-END:variables
}
