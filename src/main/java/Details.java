
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author OM NAIK
 */
public class Details extends javax.swing.JFrame {

    /**
     * Creates new form Details
     */
    Connection connect = null;

    public Details() {
        initComponents();
        connect = SQLClass.dbConnector();
    }

    public Details(String uname) {
        initComponents();
        connect = SQLClass.dbConnector();
        update(uname);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    public void update(String uname) {
        try {
            System.out.print("hi");
            String sql = "SELECT * FROM customer WHERE Username = '" + uname + "'";
            PreparedStatement pst = connect.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("Address");
                address1.setText(add1);
                String add2 = rs.getString("Name");
                name1.setText(add2);
                String add3 = rs.getString("Mobile");
                mobile1.setText(add3);
                String add4 = rs.getString("Email");
                email1.setText(add4);
                //String add5 = rs.getString("Customer");
                username1.setText(uname);

            }
            System.out.print("hiend");
        } catch (Exception e) {
            System.out.print(e);
        }
    }

   public void abd()
   {}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mobile1 = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        username1 = new javax.swing.JTextField();
        email1 = new javax.swing.JTextField();
        address1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Details");
        setMinimumSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 60, 52, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Username: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 100, 80, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Email ID :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 140, 70, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Address : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 180, 70, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Mobile :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 220, 60, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 350, 120, 30);
        getContentPane().add(mobile1);
        mobile1.setBounds(210, 230, 150, 30);
        getContentPane().add(name1);
        name1.setBounds(210, 60, 150, 30);
        getContentPane().add(username1);
        username1.setBounds(210, 100, 150, 30);
        getContentPane().add(email1);
        email1.setBounds(210, 140, 150, 30);
        getContentPane().add(address1);
        address1.setBounds(210, 180, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents
PreparedStatement pst;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String uname = username1.getText().toString();
        
        String sql = "UPDATE customer SET Name = '?', Address = '?', Email = '?' WHERE Username like '" + uname + "'";
        System.out.print(uname + sql);
        try {
            pst = connect.prepareStatement(sql);
        } catch (Exception e      System.out.print("PST");
        }

        try {)
            pst.setString(2, name1.getText().toString());
            System.out.println(name1.getText().toString());
        } catch (Exception e) {
            System.out.print("name");
        }
        try {
            pst.setString(4, address1.getText().toString());
            System.out.println(address1.getText().toString());
        } catch (Exception e) {
            System.out.print("address");
        }
        try {
            pst.setString(5, email1.getText().toString());
            System.out.println(email1.getText().toString());
        } catch (Exception e) {
            System.out.print("EMAIL");
        }
        //  pst.setString(4, mobile.getText());
        //pst.setInt(4, Integer.parseInt(mobile.getText()))
        try {
            pst.execute();
            JOptionPane.showMessageDialog(null, "Details Edited.");
            setVisible(false);
        } catch (Exception e) {
            System.out.print("INTO IT");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address1;
    private javax.swing.JTextField email1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField mobile1;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField username1;
    // End of variables declaration//GEN-END:variables
}
