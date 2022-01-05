
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
public class Booking_Window extends javax.swing.JFrame {

    Connection connect = null;

    /**
     * Creates new form Booking_Window
     */
    public Booking_Window() {
        initComponents();
        connect = SQLClass.dbConnector();
    }

    public Booking_Window(String UID) {
        initComponents();
        connect = SQLClass.dbConnector();
        uid.setText(UID);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TDate = new com.toedter.calendar.JDateChooser();
        uid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        FDate = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SuperStorage.com");
        setBackground(new java.awt.Color(255, 51, 51));
        setMinimumSize(new java.awt.Dimension(450, 480));
        setPreferredSize(new java.awt.Dimension(450, 480));
        getContentPane().setLayout(null);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Premium" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(190, 150, 170, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Till :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 300, 80, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Plan :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 150, 80, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("From :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 250, 80, 30);

        TDate.setDateFormatString("yyyy-MM-dd");
        TDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TDateMouseEntered(evt);
            }
        });
        getContentPane().add(TDate);
        TDate.setBounds(190, 300, 190, 30);

        uid.setEditable(false);
        uid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(uid);
        uid.setBounds(190, 200, 170, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Book Now!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 370, 110, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("ID :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 200, 80, 30);

        FDate.setDateFormatString("yyyy-MM-dd");
        FDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FDateMouseEntered(evt);
            }
        });
        getContentPane().add(FDate);
        FDate.setBounds(190, 250, 190, 30);

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));
        jPanel1.setLayout(null);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\OM NAIK\\Desktop\\Superstorage1.png")); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 170, 80);

        jLabel5.setFont(new java.awt.Font("Basketball", 0, 32)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Booking Page");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 0, 240, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 80);

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 450, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a = jComboBox1.getSelectedIndex();
        String sql = "";
        if (a == 0) {
            sql = "INSERT INTO BookingA (CID, FDate, TDate) VALUES (?,?,?)";
        } else if (a == 1) {
            sql = "INSERT INTO BookingB (CID, FDate, TDate) VALUES (?,?,?)";
        }
        PreparedStatement pst;
        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            pst = connect.prepareStatement(sql);
            pst.setString(1, uid.getText());
            pst.setString(2, df.format(FDate.getDate()));
            pst.setString(3, df.format(TDate.getDate()));
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Booking Successful.");
            
            String sql2 = "UPDATE unitsA SET CID = '" + uid.getText() + "', Status = 'Occupied', From = '" + df.format(FDate.getDate()) + "', Till = '" + df.format(TDate.getDate()) + "' WHERE Status = 'Vacant' ORDER BY ID LIMIT 1";

            pst = connect.prepareStatement(sql2);
            pst.execute();
            pst.close();

            setVisible(false);
            dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void TDateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TDateMouseEntered


    }//GEN-LAST:event_TDateMouseEntered

    private void FDateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FDateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_FDateMouseEntered

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Booking_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FDate;
    private com.toedter.calendar.JDateChooser TDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField uid;
    // End of variables declaration//GEN-END:variables
}
