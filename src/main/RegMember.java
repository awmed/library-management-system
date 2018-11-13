package main;

import java.sql.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegMember extends javax.swing.JFrame {

    int xx, xy;
    Connection con;
    PreparedStatement pst;
    
    public RegMember() {
        initComponents();
        setTitle("Register Member");
        setResizable(false);
        centerWindow(this);
        con=SqlCon.connect();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAdd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNic = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        btnRegister = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();
        btnSearch = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

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

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Register Member");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/add member.png"))); // NOI18N

        lblExit.setBackground(new java.awt.Color(255, 255, 255));
        lblExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setText("EXIT");
        lblExit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblExitMouseMoved(evt);
            }
        });
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblExitMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        lblMenu.setBackground(new java.awt.Color(255, 255, 255));
        lblMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setText("MENU");
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMenuMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMenu)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblExit)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35)
                        .addContainerGap(202, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMenu))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel35)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 210, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 194, 210, -1));

        jLabel2.setText("Full Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 197, -1, 20));
        jPanel1.add(txtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 238, 210, -1));

        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 238, -1, 20));
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 282, 210, -1));

        jLabel5.setText("E-Mail");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 285, -1, 20));
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 326, 210, -1));

        jLabel6.setText("Phone");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 329, -1, 20));
        jPanel1.add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 210, -1));

        jLabel7.setText("Nic Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 373, -1, 20));

        jLabel8.setText("Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 417, -1, 20));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 414, 210, -1));

        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/add.png"))); // NOI18N
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegisterMousePressed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/update.png"))); // NOI18N
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateMousePressed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/delete.png"))); // NOI18N
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteMousePressed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/search.png"))); // NOI18N
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSearchMousePressed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 482, -1, -1));

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/icons8-clear_search.png"))); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClearMousePressed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 482, -1, -1));

        jLabel15.setText("Member ID");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 20));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Register");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, 20));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Update");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 302, -1, 20));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Delete");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 407, -1, 20));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Search");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 537, -1, 20));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Clear All");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 538, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void centerWindow (Window w) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width-w.getWidth())/2, (d.height-w.getHeight())/2);
    }//end centerWindow
    
    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        // TODO add your handling code here:
        lblExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblExitMousePressed

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        // TODO add your handling code here:
        lblExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMousePressed
        // TODO add your handling code here:
        new AdminHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMenuMousePressed

    private void lblMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseEntered
        // TODO add your handling code here:
        lblMenu.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblMenuMouseEntered

    private void lblMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseExited
        // TODO add your handling code here:
        lblMenu.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblMenuMouseExited

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

    private void btnRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMousePressed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();
            String ID = txtId.getText();
            String select = "SELECT MEM_ID FROM MEMBER WHERE MEM_ID='"+ID+"' ";
            ResultSet rs = st.executeQuery(select);
            boolean ifEmpty = false;
            ifEmpty = txtId.getText().length()==0 || txtName.getText().length()==0 || txtAdd.getText().length()==0 || txtMail.getText().length()==0 || txtPhone.getText().length()==0 || txtNic.getText().length()==0 ||txtPass.getText().length()==0;
                  
                       
            if (ifEmpty==true) {
                JOptionPane.showMessageDialog(this,"Member Details Cannot Be Empty","Error",JOptionPane.ERROR_MESSAGE);
            }//end if
            
            else if (rs.next()==true) {
                JOptionPane.showMessageDialog(this,"Member ID Already Exist !!","WARNING",JOptionPane.WARNING_MESSAGE);
                txtId.setText("");
            }//end else if        
                    
            else {
                
                int dialogResult = JOptionPane.showConfirmDialog(this,"Register New Member - '"+ID+"' ","Register", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (dialogResult==0) {
                String insert = "INSERT INTO MEMBER VALUES (?,?,?,?,?,?,?,?)";    
                pst = con.prepareStatement(insert);

                pst.setString(1,txtId.getText());
                pst.setString(2,txtName.getText());
                pst.setString(3,txtAdd.getText());
                pst.setString(4,txtMail.getText());
                pst.setString(5,txtPhone.getText());
                pst.setString(6,txtNic.getText());
                pst.setString(7,txtPass.getText());
                pst.setString(8,("0"));
                pst.execute();

                JOptionPane.showMessageDialog(this,"Member ID '"+ID+"' Registered");
                txtId.setText("");
                txtName.setText("");
                txtAdd.setText("");
                txtMail.setText("");
                txtPhone.setText("");
                txtNic.setText("");
                txtPass.setText("");
                }//end if
                else {                
                txtId.setText("");
                txtName.setText("");
                txtAdd.setText("");
                txtMail.setText("");
                txtPhone.setText("");
                txtNic.setText("");
                txtPass.setText("");
                }//end else                
            }//end else
            
        }//ent try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }//end catch
    }//GEN-LAST:event_btnRegisterMousePressed

    private void btnClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMousePressed
        // TODO add your handling code here:
        txtId.setText("");
        txtName.setText("");
        txtAdd.setText("");
        txtMail.setText("");
        txtPhone.setText("");
        txtNic.setText("");
        txtPass.setText("");
    }//GEN-LAST:event_btnClearMousePressed

    private void btnSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMousePressed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();
            String ID = txtId.getText();
            String select = "SELECT * FROM MEMBER WHERE MEM_ID='"+ID+"' ";
            ResultSet rs = st.executeQuery(select);
            boolean ifUserEmpty = false;
            ifUserEmpty = ID.length()==0;
            
            if (ifUserEmpty==true) {
                JOptionPane.showMessageDialog(this,"Member ID Cannot Be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
            }//end if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"Invalid Member ID", "ERROR", JOptionPane.ERROR_MESSAGE);
                
                txtName.setText("");
                txtAdd.setText("");
                txtMail.setText("");
                txtPhone.setText("");
                txtNic.setText("");
                txtPass.setText("");
            }//end else if
            
            else {
                String name = rs.getString("m_name");
                String add = rs.getString("address");
                String mail = rs.getString("email");
                String phone = rs.getString("phone");
                String nic = rs.getString("nic_no");
                String pass = rs.getString("password");
                
                txtName.setText(name);
                txtAdd.setText(add);
                txtMail.setText(mail);
                txtPhone.setText(phone);
                txtNic.setText(nic);
                txtPass.setText(pass);
            }//end else
                    
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }//end catch
    }//GEN-LAST:event_btnSearchMousePressed

    private void btnDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMousePressed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();
            String ID = txtId.getText();
            String select = "SELECT * FROM MEMBER WHERE MEM_ID='"+ID+"' ";
            ResultSet rs = st.executeQuery(select);
            boolean ifUserEmpty = false;
            ifUserEmpty = ID.length()==0;
            
            if (ifUserEmpty==true) {
                JOptionPane.showMessageDialog(this,"Member ID Cannot Be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
            }//end if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"Invalid Member ID", "ERROR", JOptionPane.ERROR_MESSAGE);
                
                txtName.setText("");
                txtAdd.setText("");
                txtMail.setText("");
                txtPhone.setText("");
                txtNic.setText("");
                txtPass.setText("");
            }//end if
            
            else {
                String name = rs.getString("m_name");
                String add = rs.getString("address");
                String mail = rs.getString("email");
                String phone = rs.getString("phone");
                String nic = rs.getString("nic_no");
                String pass = rs.getString("password");
                
                txtName.setText(name);
                txtAdd.setText(add);
                txtMail.setText(mail);
                txtPhone.setText(phone);
                txtNic.setText(nic);
                txtPass.setText(pass);
                
                int dialogResult = JOptionPane.showConfirmDialog(this,"Delete Member - '"+ID+"' ??","Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (dialogResult==0) {
                    String delete = "DELETE FROM MEMBER WHERE MEM_ID='"+ID+"' ";
                    st.execute(delete);
                    
                    JOptionPane.showMessageDialog(this,"Member ID - '"+ID+"' Deleted !!", "Member Deleted", JOptionPane.INFORMATION_MESSAGE);
                    txtId.setText("");
                    txtName.setText("");
                    txtAdd.setText("");
                    txtMail.setText("");
                    txtPhone.setText("");
                    txtNic.setText("");
                    txtPass.setText("");
                }//end if
                else {                
                txtId.setText("");
                txtName.setText("");
                txtAdd.setText("");
                txtMail.setText("");
                txtPhone.setText("");
                txtNic.setText("");
                txtPass.setText("");
                }//end else
            }//end else
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }//end catch
    }//GEN-LAST:event_btnDeleteMousePressed

    private void btnUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMousePressed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();
            String ID = txtId.getText();
            String select = "SELECT * FROM MEMBER WHERE MEM_ID='"+ID+"' ";
            ResultSet rs = st.executeQuery(select);
            boolean ifUserEmpty = false;
            boolean ifEmpty = false;
            ifUserEmpty = ID.length()==0;
            ifEmpty = txtName.getText().length()==0 || txtAdd.getText().length()==0 || txtMail.getText().length()==0 || txtPhone.getText().length()==0 || txtNic.getText().length()==0 ||txtPass.getText().length()==0;
            
            if (ifUserEmpty==true) {
                JOptionPane.showMessageDialog(this,"Member ID Cannot Be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
            }//end if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"Invalid Member ID", "ERROR", JOptionPane.ERROR_MESSAGE);
                
                txtName.setText("");
                txtAdd.setText("");
                txtMail.setText("");
                txtPhone.setText("");
                txtNic.setText("");
                txtPass.setText("");
            }//end else if                       
            
            else if (ifEmpty==true) {
                JOptionPane.showMessageDialog(this,"Member Details Cannot Be Empty","Error",JOptionPane.ERROR_MESSAGE);
            }//end else if
            
            else {                                
                int dialogResult = JOptionPane.showConfirmDialog(this,"Update Details of Member - '"+ID+"' ??","Update", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                          
                if (dialogResult==0) {          
                
                    String update = "UPDATE MEMBER SET M_NAME=?,ADDRESS=?,EMAIL=?,PHONE=?,NIC_NO=?,PASSWORD=? WHERE MEM_ID='"+ID+"' ";
                    pst = con.prepareStatement(update);
                    pst.setString(1,txtName.getText());
                    pst.setString(2,txtAdd.getText());
                    pst.setString(3,txtMail.getText());
                    pst.setString(4,txtPhone.getText());
                    pst.setString(5,txtNic.getText());
                    pst.setString(6,txtPass.getText());
                    pst.execute();
                    
                    JOptionPane.showMessageDialog(this,"Member ID - '"+ID+"' Details Updated !!", "Member Updated", JOptionPane.INFORMATION_MESSAGE);
                    txtId.setText("");
                    txtName.setText("");
                    txtAdd.setText("");
                    txtMail.setText("");
                    txtPhone.setText("");
                    txtNic.setText("");
                    txtPass.setText("");
                }//end if
                
                else {                
                txtId.setText("");
                txtName.setText("");
                txtAdd.setText("");
                txtMail.setText("");
                txtPhone.setText("");
                txtNic.setText("");
                txtPass.setText("");
                }//end else
                
            }//end else
            
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }//end catch
    }//GEN-LAST:event_btnUpdateMousePressed

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
            java.util.logging.Logger.getLogger(RegMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel btnRegister;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JLabel btnUpdate;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNic;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
