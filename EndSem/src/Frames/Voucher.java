/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import static Frames.LedgerAccounts.rev;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.model;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author shivam
 */
public class Voucher extends javax.swing.JFrame {

    /**
     * Creates new form Voucher
     */
    public Voucher() {
        initComponents();
        String username = new Login().user;
        try {
        
        Class.forName("java.sql.DriverManager");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jvp","root","bhulgaya123");
        System.out.println("Connection is created successfully");
        Statement stmt = (Statement) con.createStatement();
        String query = "select acc_name from accounts where username = '"+username+"'";
        System.out.println("Fetching items from database: jvp; table: transactions");
        ResultSet rs=stmt.executeQuery(query);
        System.out.println("Record fetched successfully.");
        
        for(;;)
        {
            if(rs.next())
            {
                String item = rs.getString(1);
                jComboBox1.addItem(item);
            }
            else{
                break;
            }
        }
        
        jComboBox1.setSelectedItem("");
        AutoCompleteDecorator.decorate(jComboBox1);
        
        
    }   catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panel1 = new java.awt.Panel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(23, 35, 51));

        jLabel3.setText("Voucher");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addContainerGap(786, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jComboBox1.setSelectedItem("Select Bill Number");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        panel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 64, 300, -1));

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Exit");
        jLabel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        panel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 110, 32));

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
        panel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 518, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill_no", "Date", "Debit", "Credit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 137, 833, 190));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Refresh");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 60, 114, 31));

        jComboBox2.setSelectedItem("Select Bill to Clear");
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        panel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 200, -1));
        panel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 108, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Enter Cheque Number :");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Amount :");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));
        panel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 108, -1));

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Generate Bill");
        jLabel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        panel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 540, 140, 32));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit" }));
        jComboBox3.setSelectedItem("Select Payment Type");
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        panel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 200, -1));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        this.setVisible(false);
        try {
            new Main().setVisible(true);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Voucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        String acc = (String) jComboBox1.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row = model.getRowCount();
        model = (DefaultTableModel) jTable1.getModel();
        int rowcount = model.getRowCount();
        for(int i= rowcount-1; i>=0; i--)
        {
            model.removeRow(i);
        }
        row =0;
        String username = new Login().user;
        try {
        Class.forName("java.sql.DriverManager");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jvp","root","bhulgaya123");
        System.out.println("Connection is created successfully");
        Statement stmt = (Statement) con.createStatement();
        String query = "select count(*) from transactions WHERE username = '"+username+"' and acc_name = '"+acc +"'";
        System.out.println("Counting records from database: jvp, table: transactions");
        ResultSet rs=stmt.executeQuery(query);
        System.out.println("Record count fetched successfully.");
        int total_records =0;
        if(rs.next())
        {
            total_records = rs.getInt(1);
        }
        query = "select * from transactions WHERE username = '"+username+"' and acc_name = '"+acc +"'";
        System.out.println("Fetching records from database: jvp, table: transactions");
        rs=stmt.executeQuery(query);
        System.out.println("Records fetched successfully.");
        
        for(;;)
        {
            if(rs.next())
            {
                String bill_no = rs.getString("bill_no");
                Date date = rs.getDate("date");
                float debit = rs.getFloat("debit");
                float credit = rs.getFloat("credit");
                row++;
                model.addRow(new Object[] {bill_no,date,debit,credit});
            }
            else
            {
                break;
            }
        }
        query = "select bill_no from transactions where username = '"+username+"'";
        System.out.println("Fetching items from database: jvp; table: transactions");
        rs=stmt.executeQuery(query);
        System.out.println("Record fetched successfully.");
        
        for(;;)
        {
            if(rs.next())
            {
                String item = rs.getString(1);
                jComboBox2.addItem(item);
            }
            else{
                break;
            }
        }
        
        jComboBox1.setSelectedItem("");
        AutoCompleteDecorator.decorate(jComboBox1);
        
        
        
    }
        catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Voucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Voucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        int row = model.getRowCount();
//        model = (DefaultTableModel) jTable1.getModel();
//        String bill_no = jTextField1.getText();
//        int bill_no_int = Integer.parseInt(jTextField1.getText().substring(2));
//        String username = new Login().user;
//        float bill_amount = 0;
//        float debit = 0;
//        float credit = 0;
//        String query ="";
//        String date = "";
//        String due_date = "";
//        Statement stmt = null;
//        try {
//            Class.forName("java.sql.DriverManager");
//            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jvp", "root", "bhulgaya123");
//            stmt = (Statement) con.createStatement();
//        } catch (SQLException ex) { 
//            java.util.logging.Logger.getLogger(Voucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Voucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        String acc_name = (String) jComboBox1.getSelectedItem();
//        String type = "purchase";
//        int i = 0;
//        while (i < row) {
//            int s_no = Integer.parseInt(model.getValueAt(i, 0).toString());
//            int item_id = Integer.parseInt(model.getValueAt(i, 1).toString().substring(2));
//            String item_name = (String) model.getValueAt(i, 2);
//            int pcs = (int) model.getValueAt(i, 3);
//            quantity = Float.parseFloat(String.valueOf(model.getValueAt(i, 4)));
//            net_rate = Float.parseFloat(String.valueOf(model.getValueAt(i, 5)));
//            rate = Float.parseFloat(String.valueOf(model.getValueAt(i, 6)));
//            amount = Float.parseFloat(String.valueOf(model.getValueAt(i, 7)));
//            discount = Float.parseFloat(String.valueOf(model.getValueAt(i, 8)));
//            discount_perc = Float.parseFloat(String.valueOf(model.getValueAt(i, 9)));
//            taxable = Float.parseFloat(String.valueOf(model.getValueAt(i, 10)));
//            gst_perc = Float.parseFloat(String.valueOf(model.getValueAt(i, 11)));
//            gst = Float.parseFloat(String.valueOf(model.getValueAt(i, 12)));
//
//            subtotal += taxable;
//            discount_total += discount;
//            gst_total += gst;
//            bill_amount = Float.parseFloat(jTextField12.getText());
//            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
//            date = rev(jTextField2.getText());
//            due_date = rev(jTextField3.getText());
//            String status="";
//            if(jComboBox2.getSelectedItem()=="Cash")
//            {
//                status="cleared";
//            }
//            else if(jComboBox2.getSelectedItem()=="Credit")
//            {
//                status="pending";
//            }
//            try {
//                query = "INSERT INTO bill VALUES('" + bill_no_int + "','" + s_no + "','" + item_id + "','" + item_name + "','" + pcs + "','" + quantity + "','" + net_rate + "','" + rate + "','" + amount + "','" + discount + "','" + discount_perc + "','" + taxable + "','" + gst_perc + "','" + gst + "','" + acc_name + "','" + username + "','" + type + "','" + date + "','" + bill_amount + "','" + due_date + "','" + status + "');";
//                stmt.executeUpdate(query);
//
//                query = "select * from stocks where item_name = '"+ item_name +"' and username = '"+ username +"' ";
//                ResultSet rs1 = stmt.executeQuery(query);
//                int quantity_db =0;
//                if(rs1.next())
//                {
//                    quantity_db = rs1.getInt("quantity");
//                }
//
//                query = "UPDATE stocks SET quantity = '"+ (quantity_db + pcs) +"' where item_name = '"+ item_name +"' and username = '"+ username +"' ";
//                stmt.executeUpdate(query);
//            } catch (SQLException ex) {
//                Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            i++;
//        }
//        float credit=0;
//        int cheque_number=0;
//        try {
//            if(jComboBox2.getSelectedItem().equals("Cash"))
//            {
//                query = "INSERT INTO transactions VALUES('" + bill_no + "','" + date + "','" + credit + "','" + bill_amount + "','" + acc_name + "','" + username + "');";
//                stmt.executeUpdate(query);
//                query = "INSERT INTO transactions VALUES('" + bill_no + "','" + date + "','" + bill_amount + "','" + credit + "','" + acc_name + "','" + username + "');";
//                stmt.executeUpdate(query);
//                query = "INSERT INTO voucher VALUES('" + bill_no + "','" + date + "','" + "Cash" + "','" + bill_amount + "','" + "" + type + "','" + username + "','" + "" +cheque_number+ "');";
//                stmt.executeUpdate(query);
//
//            }
//            else if(jComboBox2.getSelectedItem().equals("Credit"))
//            {
//                query = "INSERT INTO transactions VALUES('" + bill_no + "','" + date + "','" + credit + "','" + bill_amount + "','" + acc_name + "','" + username + "');";
//                stmt.executeUpdate(query);
//            }
//
//            String acc = (String) jComboBox1.getSelectedItem();
//            query = "SELECT sum(debit),sum(credit) FROM transactions where username = '" + username + "' and acc_name = '" + acc + "'";
//            ResultSet rs1 = stmt.executeQuery(query);
//
//            if(rs1.next())
//            {
//                debit=rs1.getFloat(1);
//                float credit1=rs1.getFloat(2);
//                float balance=Math.abs(debit-credit1);
//                jTextField4.setText("" +balance);
//            }
//            JOptionPane.showMessageDialog(this,"Bill Generated");
//            this.setVisible(false);
//            new Main().setVisible(true);
//
//        } catch (SQLException ex) {
//            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }//GEN-LAST:event_jLabel18MouseClicked

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

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
            java.util.logging.Logger.getLogger(Voucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voucher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
