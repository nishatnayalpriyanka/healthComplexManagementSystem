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
 * @author user
 */
public class OperationDetailsPage extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public OperationDetailsPage() {
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
    String surgeonName;
    String date;
    
    public void showTable(){
        DefaultTableModel odt = (DefaultTableModel)tblOperationlDetails.getModel();
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
                surgeonName=surgeonFirstName+" "+surgeonLastName;
                date=fileS.next();
                String patient[]={ID,operationName,surgeonName,date};
                odt.addRow(patient);
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
        tblOperationlDetails = new javax.swing.JTable();
        btBack = new javax.swing.JButton();
        lblOperationDetailsMsg = new javax.swing.JLabel();
        lblOperationDetailsLogo = new javax.swing.JLabel();
        lblWelcomePageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBangladeshHealthComplexMsg.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lblBangladeshHealthComplexMsg.setText("Bangladesh Health Complex");
        getContentPane().add(lblBangladeshHealthComplexMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 0, 630, 82));

        tblOperationlDetails.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        tblOperationlDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient's Id", "Operation Name", "Surgeon's Name", "Date"
            }
        ));
        jScrollPane1.setViewportView(tblOperationlDetails);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 930, 350));

        btBack.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/back logo.png"))); // NOI18N
        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        getContentPane().add(btBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 170, 50));

        lblOperationDetailsMsg.setBackground(new java.awt.Color(255, 255, 255));
        lblOperationDetailsMsg.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lblOperationDetailsMsg.setText("Operation Details of Patients");
        lblOperationDetailsMsg.setOpaque(true);
        getContentPane().add(lblOperationDetailsMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 590, 70));

        lblOperationDetailsLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblOperationDetailsLogo.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lblOperationDetailsLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/operation details logo.png"))); // NOI18N
        lblOperationDetailsLogo.setOpaque(true);
        getContentPane().add(lblOperationDetailsLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 100, 70));

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
            java.util.logging.Logger.getLogger(OperationDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperationDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperationDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperationDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperationDetailsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBangladeshHealthComplexMsg;
    private javax.swing.JLabel lblOperationDetailsLogo;
    private javax.swing.JLabel lblOperationDetailsMsg;
    private javax.swing.JLabel lblWelcomePageBackground;
    private javax.swing.JTable tblOperationlDetails;
    // End of variables declaration//GEN-END:variables
}
