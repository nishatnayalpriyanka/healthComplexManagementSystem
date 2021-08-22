/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthComplex;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class MedicalRecordsPage extends javax.swing.JFrame {

    /**
     * Creates new form MedicalRecordsPage
     */
    public MedicalRecordsPage() {
        initComponents();
         lblWelcomePageBackground.setFocusable(true);
    }
    
   //personal details
    String ID;
    String patientFirstName;
    String patientLastName;
    String age;
    String gender;
    String phoneNo;
    String email;
    //medical records
    String problem;
    String doctorFirstName;
    String doctorLastName;
    String doctorName;
    String medicine;
    String wardNo;
    //payment details
    String doctorFess;
    String medicineCost;
    String wardCost;
    String operationCost;
    String paidAmount;
    String totalCost;
    String dueAmount;
    //operation details
    String operationName;
    String surgeonFirstName;
    String surgeonLastName;
    String date;
    
    public void showTable(){
        DefaultTableModel mdt = (DefaultTableModel)tblMedicalRecord.getModel();
        try{
            File file = new File("Patient.txt");
            Scanner fileS = new Scanner(file);
            while(fileS.hasNext()){
                //personal details
                ID=fileS.next();
                patientFirstName=fileS.next();
                patientLastName=fileS.next();
                age=fileS.next();
                gender=fileS.next();
                phoneNo=fileS.next();
                email=fileS.next();        
                //medical records
                problem=fileS.next();
                doctorFirstName=fileS.next();
                doctorLastName=fileS.next();
                doctorName=doctorFirstName+" "+doctorLastName;
                medicine=fileS.next();
                wardNo=fileS.next();
                //payment details
                doctorFess=fileS.next();
                medicineCost=fileS.next();        
                wardCost=fileS.next();
                operationCost=fileS.next();
                paidAmount=fileS.next();
                totalCost=fileS.next();        
                dueAmount=fileS.next();
                //operation details
                operationName=fileS.next();
                surgeonFirstName=fileS.next();
                surgeonLastName=fileS.next();  
                date=fileS.next();
                String patient[]={ID,problem,doctorName,medicine,wardNo};
                mdt.addRow(patient);
            }
            fileS.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"No information added yet...","Error",JOptionPane.ERROR_MESSAGE);
            setVisible(false);
            MenuPage m = new MenuPage();        
            m.setVisible(true);
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

        lblBangladeshHealthComplexMsg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicalRecord = new javax.swing.JTable();
        btBack = new javax.swing.JButton();
        lblPersonaInformationMsg = new javax.swing.JLabel();
        lblMedicalDetailsLogo = new javax.swing.JLabel();
        lblWelcomePageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBangladeshHealthComplexMsg.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lblBangladeshHealthComplexMsg.setText("Bangladesh Health Complex");
        getContentPane().add(lblBangladeshHealthComplexMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 630, 100));

        tblMedicalRecord.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblMedicalRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient's Id", "Problem", "Doctors Name", "Medicine", "Ward No"
            }
        ));
        jScrollPane1.setViewportView(tblMedicalRecord);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 930, 340));

        btBack.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/back logo.png"))); // NOI18N
        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        getContentPane().add(btBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, 170, 50));

        lblPersonaInformationMsg.setBackground(new java.awt.Color(255, 255, 255));
        lblPersonaInformationMsg.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lblPersonaInformationMsg.setText("Medical Details of Patients");
        lblPersonaInformationMsg.setOpaque(true);
        getContentPane().add(lblPersonaInformationMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 540, 70));

        lblMedicalDetailsLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblMedicalDetailsLogo.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lblMedicalDetailsLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/medical records logo.png"))); // NOI18N
        lblMedicalDetailsLogo.setOpaque(true);
        getContentPane().add(lblMedicalDetailsLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, 70));

        lblWelcomePageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/Background2.jpg"))); // NOI18N
        lblWelcomePageBackground.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblWelcomePageBackgroundFocusGained(evt);
            }
        });
        getContentPane().add(lblWelcomePageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        setVisible(false);
        MenuPage m = new MenuPage();
        m.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    private void lblWelcomePageBackgroundFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblWelcomePageBackgroundFocusGained
        showTable();
    }//GEN-LAST:event_lblWelcomePageBackgroundFocusGained

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
            java.util.logging.Logger.getLogger(MedicalRecordsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicalRecordsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicalRecordsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicalRecordsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicalRecordsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBangladeshHealthComplexMsg;
    private javax.swing.JLabel lblMedicalDetailsLogo;
    private javax.swing.JLabel lblPersonaInformationMsg;
    private javax.swing.JLabel lblWelcomePageBackground;
    private javax.swing.JTable tblMedicalRecord;
    // End of variables declaration//GEN-END:variables
}
