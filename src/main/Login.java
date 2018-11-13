package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    int xx, xy;
    Connection con;
               
    public Login() {
        initComponents();
        setTitle("Login");
        jPanel2.setBackground(new Color(0,0,0,180));
        setResizable(false);
        centerWindow(this);
        con=SqlCon.connect();                        
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUserAdmin = new javax.swing.JTextField();
        txtPassAdmin = new javax.swing.JPasswordField();
        btnAdmin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUserMem = new javax.swing.JTextField();
        txtPassMem = new javax.swing.JPasswordField();
        btnMember = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Optima", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/library login.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblExit.setBackground(new java.awt.Color(255, 255, 255));
        lblExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setText("EXIT");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblExitMousePressed(evt);
            }
        });
        jPanel2.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 6, -1, 20));

        jLabel8.setFont(new java.awt.Font("Optima", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LIBRARY MANAGEMENT SYSTEM");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Optima", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LOGIN");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 180));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 33, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 76, -1, -1));
        jPanel3.add(txtUserAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 28, 185, -1));
        jPanel3.add(txtPassAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 71, 185, -1));

        btnAdmin.setText("Login");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 115, -1, -1));

        jTabbedPane1.addTab("Admin Login", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Member ID");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 33, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 76, -1, -1));
        jPanel4.add(txtUserMem, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 28, 185, -1));
        jPanel4.add(txtPassMem, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 71, 185, -1));

        btnMember.setText("Login");
        btnMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberActionPerformed(evt);
            }
        });
        jPanel4.add(btnMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 115, -1, -1));

        jTabbedPane1.addTab("Member Login", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 340, 210));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/books.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void centerWindow (Window w) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width-w.getWidth())/2, (d.height-w.getHeight())/2);
    }//end centerWindow
    
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void lblExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblExitMousePressed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:        
        try {            
            Statement st1 = con.createStatement();
            Statement st2 = con.createStatement();
            String username = txtUserAdmin.getText();
            String password = txtPassAdmin.getText();
            boolean ifUserEmpty = false;
            boolean ifPassEmpty = false;
            ifUserEmpty = txtUserAdmin.getText().length()==0;
            ifPassEmpty = txtPassAdmin.getText().length()==0;                       
            
            String sqluser="SELECT USERNAME FROM LIBRARIAN WHERE USERNAME='"+username+"' ";
            String sqlselect="SELECT USERNAME AND PASSWORD FROM LIBRARIAN WHERE USERNAME='"+username+"' AND PASSWORD='"+password+"' ";
            
            ResultSet user = st1.executeQuery(sqluser);
            ResultSet rs = st2.executeQuery(sqlselect);
                        
            if (ifUserEmpty==true) {
                JOptionPane.showMessageDialog(this,"Username Cannot Be Empty","Error",JOptionPane.ERROR_MESSAGE);
            }//end if
            
            else if (ifPassEmpty==true) {
                JOptionPane.showMessageDialog(this,"Password Cannot Be Empty","Error",JOptionPane.ERROR_MESSAGE);
            }//end else if
                        
            else if (user.next()==false) {                
                JOptionPane.showMessageDialog(this,"Invalid Username","ERROR",JOptionPane.ERROR_MESSAGE);
            }//end else if
            
            else if (rs.next()==false){
                JOptionPane.showMessageDialog(this,"Invalid Password","ERROR",JOptionPane.ERROR_MESSAGE);                           
            }//end else if           
                        
            else {                
                new AdminHome(username).setVisible(true);
                this.setVisible(false);                
            }//end else
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }//end catch
        
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        // TODO add your handling code here:
        try {
            Statement st1 = con.createStatement();
            Statement st2 = con.createStatement();
            String username = txtUserMem.getText();
            String password = txtPassMem.getText();
            boolean ifUserEmpty = false;
            boolean ifPassEmpty = false;
            ifUserEmpty = txtUserMem.getText().length()==0;
            ifPassEmpty = txtPassMem.getText().length()==0;
            
            String sqluser="SELECT MEM_ID FROM MEMBER WHERE MEM_ID='"+username+"' ";
            String sqlselect="SELECT * FROM MEMBER WHERE MEM_ID='"+username+"' AND PASSWORD='"+password+"' ";
            
            ResultSet user = st1.executeQuery(sqluser);
            ResultSet rs = st2.executeQuery(sqlselect);
                        
            if (ifUserEmpty==true) {
                JOptionPane.showMessageDialog(this,"Member ID Cannot Be Empty","Error",JOptionPane.ERROR_MESSAGE);
            }//end if
            
            else if (ifPassEmpty==true) {
                JOptionPane.showMessageDialog(this,"Password Cannot Be Empty","Error",JOptionPane.ERROR_MESSAGE);
            }//end else if
            
            else if (user.next()==false) {                
                JOptionPane.showMessageDialog(this,"Invalid Member ID","ERROR",JOptionPane.ERROR_MESSAGE);
            }//end else if
            
            else if (rs.next()==false){
                JOptionPane.showMessageDialog(this,"Invalid Password","ERROR",JOptionPane.ERROR_MESSAGE);                           
            }//end else if
            
            else {
                String name = rs.getString("M_NAME");                
                new MemHome(name).setVisible(true);
                this.setVisible(false);   
            }//end else            
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }//end catch
    }//GEN-LAST:event_btnMemberActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Mac".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
                else if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnMember;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblExit;
    private javax.swing.JPasswordField txtPassAdmin;
    private javax.swing.JPasswordField txtPassMem;
    private javax.swing.JTextField txtUserAdmin;
    private javax.swing.JTextField txtUserMem;
    // End of variables declaration//GEN-END:variables
}
