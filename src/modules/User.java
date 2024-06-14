package modules;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import net.proteanit.sql.DbUtils;


import utils.DBConnection;

public class User extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    String t;

    private javax.swing.JTextArea address;
    public javax.swing.JButton adduser;
    public static javax.swing.JComboBox<String> day;
    public javax.swing.JButton deleteuser;
    public static javax.swing.JTextField id;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JComboBox<String> month;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField salary;
    public javax.swing.JButton updateuser;
    private javax.swing.JTable users;
    public static javax.swing.JComboBox<String> year;

    public User() {
        initComponents();
        con = DBConnection.connect();
        refresh();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        month = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        deleteuser = new javax.swing.JButton();
        adduser = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        updateuser = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        users = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Form");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("User Form");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(398, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(392, 392, 392)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addContainerGap(24, Short.MAX_VALUE)));

        jPanel1.add(jPanel2, new AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Details",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("DOB : ");
        jPanel3.add(jLabel3, new AbsoluteConstraints(16, 113, -1, -1));

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day : ", "1", "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
                "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(day, new AbsoluteConstraints(151, 110, -1, -1));
        jPanel3.add(phone, new AbsoluteConstraints(151, 243, 188, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Phone : ");
        jPanel3.add(jLabel5, new AbsoluteConstraints(16, 246, -1, -1));

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel3.add(jScrollPane1, new AbsoluteConstraints(151, 148, 188, 72));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("User_Name : ");
        jPanel3.add(jLabel2, new AbsoluteConstraints(16, 72, -1, -1));
        jPanel3.add(name, new AbsoluteConstraints(151, 69, 188, -1));
        jPanel3.add(salary, new AbsoluteConstraints(151, 291, 188, -1));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Month : ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel3.add(month, new AbsoluteConstraints(211, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Address : ");
        jPanel3.add(jLabel4, new AbsoluteConstraints(16, 160, -1, -1));

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year : ", "1970", "1971", "1972", "1973",
                "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986",
                "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
                "2000", "2001", "2002", "2003", "2004", "2005", "2006", " " }));
        jPanel3.add(year, new AbsoluteConstraints(282, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Salary : ");
        jPanel3.add(jLabel6, new AbsoluteConstraints(16, 294, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Password : ");
        jPanel3.add(jLabel7, new AbsoluteConstraints(16, 341, -1, -1));
        jPanel3.add(password, new AbsoluteConstraints(151, 338, 188, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("User_Id : ");
        jPanel3.add(jLabel8, new AbsoluteConstraints(16, 31, -1, -1));
        jPanel3.add(id, new AbsoluteConstraints(151, 28, 188, -1));

        jPanel1.add(jPanel3, new AbsoluteConstraints(24, 91, 406, 390));
        jPanel1.add(jSeparator1, new AbsoluteConstraints(20, 490, 406, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteuser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteuser.setText("Delete User");
        deleteuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteuserActionPerformed(evt);
            }
        });
        jPanel4.add(deleteuser, new AbsoluteConstraints(220, 13, -1, -1));

        adduser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        adduser.setText("Add User");
        adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adduserActionPerformed(evt);
            }
        });
        jPanel4.add(adduser, new AbsoluteConstraints(12, 13, 89, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new AbsoluteConstraints(10, 50, 90, -1));

        updateuser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateuser.setText("Update User");
        updateuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateuserActionPerformed(evt);
            }
        });
        jPanel4.add(updateuser, new AbsoluteConstraints(107, 13, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Cancel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new AbsoluteConstraints(325, 13, -1, -1));

        jPanel1.add(jPanel4, new AbsoluteConstraints(20, 510, 406, 80));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Users Table",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        users.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        users.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null }
                },
                new String[] {
                        "      ID", "      NAME", "    DOB", "ADDRESS", "    PHONE", "SALARY"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(users);
        if (users.getColumnModel().getColumnCount() > 0) {
            users.getColumnModel().getColumn(0).setResizable(false);
            users.getColumnModel().getColumn(1).setResizable(false);
            users.getColumnModel().getColumn(2).setResizable(false);
            users.getColumnModel().getColumn(3).setResizable(false);
            users.getColumnModel().getColumn(4).setResizable(false);
            users.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap()));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                .addContainerGap()));

        jPanel1.add(jPanel5, new AbsoluteConstraints(436, 91, 467, -1));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("(1-) User_Password Should be at least 6 Charcters");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("(2-) User_ID is Non-Adjustable , thanks");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Notes : ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel11))
                                .addContainerGap(141, Short.MAX_VALUE)));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addContainerGap()));

        jPanel1.add(jPanel6, new AbsoluteConstraints(440, 510, 460, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE));

        setSize(new java.awt.Dimension(929, 652));
        setLocationRelativeTo(null);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        id.setText("");
        password.setText("");
        name.setText("");
        address.setText("");
        phone.setText("");
        salary.setText("");
        day.setSelectedIndex(0);
        month.setSelectedIndex(0);
        year.setSelectedIndex(0);
    }

    private void adduserActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_adduserActionPerformed
        if (id.getText().equals("") || name.getText().equals("") || day.getSelectedIndex() == 0 ||
                month.getSelectedIndex() == 0 || year.getSelectedIndex() == 0 || address.getText().equals("") ||
                phone.getText().equals("") || password.getText().equals("") ||
                salary.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete Your Information", "Missing Information", 2);
        } else if (!checkid()) {
            if (password.getText().length() < 6) {
                JOptionPane.showMessageDialog(null, "User_Password Should be at least 6 Characters", "Wrong Operation",
                        2);
            } else {
                String sql = "insert into users (ID,NAME,DOB,ADDRESS,PHONE,SALARY,PASSWORD) values ('" + id.getText()
                        + "','" + name.getText() + "' , '" + day.getSelectedItem() + "-" + month.getSelectedItem() + "-"
                        + year.getSelectedItem() + "' ,'" + address.getText() + "' ,'" + phone.getText() + "' ,'"
                        + salary.getText() + "' ,'" + password.getText() + "')";
                try {
                    pre = con.prepareStatement(sql);
                    pre.execute();
                    JOptionPane.showMessageDialog(null, "User has been Added Successfully", "Success", 1);
                    clear();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
                }
                refresh();
            }
        } else {
            JOptionPane.showMessageDialog(null, "User is Already inserted", "Wrong Operation", 2);
        }
    }// GEN-LAST:event_adduserActionPerformed

    private void deleteuserActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteuserActionPerformed
        if (id.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter ID You Want to delete", "Missing Information", 2);
        } else if (checkid()) {
            String sql = "delete from users where ID='" + id.getText() + "' ";
            try {
                int check = JOptionPane.showConfirmDialog(null, "Are You Sure From Deleting This User");
                if (check == 0) {
                    pre = con.prepareStatement(sql);
                    pre.execute();
                    JOptionPane.showMessageDialog(null, "User has been Deleted Successfully", "Success", 1);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
            }
            refresh();
        } else {
            JOptionPane.showMessageDialog(null, "User is not Found", "Wrong Operation", 2);
        }
    }

    private void updateuserActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateuserActionPerformed
        if (id.getText().equals("") || name.getText().equals("") || day.getSelectedIndex() == 0 ||
                month.getSelectedIndex() == 0 || year.getSelectedIndex() == 0 || address.getText().equals("") ||
                phone.getText().equals("") || salary.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete Your Information", "Missing Information", 2);
        } else {
            String sql = "update users set NAME='" + name.getText() + "' ,ADDRESS='" + address.getText() + "' ,PHONE='"
                    + phone.getText() + "' ,SALARY='" + salary.getText() + "' where ID='" + id.getText() + "' ";
            try {
                pre = con.prepareStatement(sql);
                pre.execute();
                JOptionPane.showMessageDialog(null, "User has been added Successfully", "Success", 1);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
            }
            refresh();
        }
    }

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_usersMouseClicked
        int row = users.getSelectedRow();
        t = users.getModel().getValueAt(row, 0).toString();
        String sql = "select * from users where ID='" + t + "' ";
        try {
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            if (res.next()) {
                String Id = res.getString("ID");
                id.setText(Id);

                String Name = res.getString("NAME");
                name.setText(Name);

                String Day = res.getString("DOB").split("-")[0];
                day.setSelectedItem(Day);
                String Month = res.getString("DOB").split("-")[1];
                month.setSelectedItem(Month);
                String Year = res.getString("DOB").split("-")[2];
                year.setSelectedItem(Year);

                String Address = res.getString("ADDRESS");
                address.setText(Address);

                String Phone = res.getString("PHONE");
                phone.setText(Phone);

                String Salary = res.getString("SALARY");
                salary.setText(Salary);

                String Password = res.getString("PASSWORD");
                password.setText(Password);
                password.setEchoChar('*');
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    private boolean checkid() {
        boolean check = false;
        String sql = "select ID from users where ID='" + id.getText() + "' ";
        try {
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            if (res.next()) {
                check = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
        return check;
    }

    private void refresh() {
        String sql = "select ID,NAME,DOB,ADDRESS,PHONE,SALARY from users";
        try {
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            users.setModel(DbUtils.resultSetToTableModel(res));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }

    private void clear() {
        id.setText("");
        name.setText("");
        address.setText("");
        phone.setText("");
        salary.setText("");
        password.setText("");
        day.setSelectedIndex(0);
        month.setSelectedIndex(0);
        year.setSelectedIndex(0);
    }

}