package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JOptionPane;
import java.sql.*;

public class ReserveBook extends javax.swing.JFrame {
    
    int xx, xy;
    Connection con;
    PreparedStatement pst;
    
    public ReserveBook() {
        initComponents();
        setTitle("Reserve Books");
        setResizable(false);
        centerWindow(this);
        con = SqlCon.connect();
    }

    private void centerWindow (Window w) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width-w.getWidth())/2, (d.height-w.getHeight())/2);
    }//end centerWindow
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMemId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtBookId = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtAvailable = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnVerify = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnReserve = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/reservation.png"))); // NOI18N

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Reserve Books");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu)
                .addGap(146, 146, 146)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(lblExit)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMenu)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel35))
                            .addComponent(jLabel3))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 181, -1, -1));

        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 273, -1, -1));
        jPanel1.add(txtMemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 190, -1));

        txtName.setEditable(false);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 222, 190, -1));

        txtAddress.setEditable(false);
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 268, 190, -1));

        jLabel6.setText("Book ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 353, -1, -1));

        jLabel7.setText("Title");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 399, -1, -1));

        jLabel8.setText("Member ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 135, -1, -1));

        jLabel9.setText("Author");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 445, -1, -1));

        jLabel10.setText("Available");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 491, -1, -1));

        jLabel11.setText("Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 537, -1, -1));

        txtBookId.setEditable(false);
        jPanel1.add(txtBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 348, 190, -1));

        txtTitle.setEditable(false);
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 394, 190, -1));

        txtAuthor.setEditable(false);
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 190, -1));

        txtAvailable.setEditable(false);
        jPanel1.add(txtAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 486, 190, -1));

        txtDate.setEditable(false);
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 532, 190, -1));

        jLabel17.setText("Name");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 227, -1, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/search.png"))); // NOI18N
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSearchMousePressed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Verify");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Search");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, 30));

        btnVerify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/verify.png"))); // NOI18N
        btnVerify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVerifyMousePressed(evt);
            }
        });
        jPanel1.add(btnVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, -1, -1));

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/icons8-clear_search.png"))); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClearMousePressed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, -1, -1));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Reserve Book");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 640, 90, 30));

        btnReserve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/reserve book.png"))); // NOI18N
        btnReserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReserveMousePressed(evt);
            }
        });
        jPanel1.add(btnReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Clear All");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, 90, 30));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 176, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        // TODO add your handling code here:
        lblExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblExitMousePressed

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        // TODO add your handling code here:
        lblExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseEntered
        // TODO add your handling code here:
        lblMenu.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblMenuMouseEntered

    private void lblMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseExited
        // TODO add your handling code here:
        lblMenu.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblMenuMouseExited

    private void lblMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMousePressed
        // TODO add your handling code here:
        new MemHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMenuMousePressed

    private void btnVerifyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerifyMousePressed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            String ID = txtMemId.getText();
            String Pass = txtPass.getText();
            boolean ifUserEmpty, ifPassEmpty = false;
            ifUserEmpty = ID.length()==0;
            ifPassEmpty = Pass.length()==0;
            
            String sqluser = "SELECT MEM_ID FROM MEMBER WHERE MEM_ID='"+ID+"' "; 
            String sqlselect = "SELECT * FROM MEMBER WHERE MEM_ID='"+ID+"' AND PASSWORD='"+Pass+"' ";
            
            ResultSet user = st.executeQuery(sqluser);
            ResultSet rs = st2.executeQuery(sqlselect);
            
            if (ifUserEmpty==true) {
                JOptionPane.showMessageDialog(this,"Member ID Cannot Be Empty","Error",JOptionPane.ERROR_MESSAGE);
            }//end if
            
            else if (ifPassEmpty==true) {
                JOptionPane.showMessageDialog(this,"Password Cannot Be Empty","Error",JOptionPane.ERROR_MESSAGE);
            }//end else if
            
            else if (user.next()==false) {
                JOptionPane.showMessageDialog(this,"Invalid Member ID","ERROR",JOptionPane.ERROR_MESSAGE);
                txtPass.setText("");
                txtName.setText("");
                txtAddress.setText("");
            }//end else if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"Invalid Password","ERROR",JOptionPane.ERROR_MESSAGE);
                txtPass.setText("");
                txtName.setText("");
                txtAddress.setText("");
            }//end else if
                    
            else {
            txtName.setText(rs.getString("M_NAME"));
            txtAddress.setText(rs.getString("ADDRESS"));
            }//end else
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }//end catch
    }//GEN-LAST:event_btnVerifyMousePressed

    private void btnSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMousePressed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            
            String ID = JOptionPane.showInputDialog("Enter Book ID");
            
            //String ID = txtBookId.getText(); 
            boolean ifEmpty = false;
            ifEmpty = ID.length()==0;
            
            String book = "SELECT B_TITLE,AUTHOR,AVAILABLE FROM BOOK WHERE BOOK_ID='"+ID+"' ";
            String date = "SELECT NOW() AS TODAY";
            
            ResultSet rs = st.executeQuery(book);
            ResultSet rs2 = st2.executeQuery(date);
            rs2.next();
            
            if (ifEmpty==true) {
                JOptionPane.showMessageDialog(this,"Book ID Cannnot Be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
                txtBookId.setText("");
                txtTitle.setText("");
                txtAuthor.setText("");
                txtAvailable.setText("");
                txtDate.setText("");
            }//end if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"Invalid Book ID","ERROR",JOptionPane.ERROR_MESSAGE);
                txtBookId.setText("");
                txtTitle.setText("");
                txtAuthor.setText("");
                txtAvailable.setText("");
                txtDate.setText("");
            }//end else if
            
            else {
                txtBookId.setText(ID);
                txtTitle.setText(rs.getString("B_TITLE"));
                txtAuthor.setText(rs.getString("AUTHOR"));
                txtAvailable.setText(rs.getString("AVAILABLE"));
                txtDate.setText(rs2.getString("TODAY"));
            }//end else
            
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }//end catch
    }//GEN-LAST:event_btnSearchMousePressed

    private void btnClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMousePressed
        // TODO add your handling code here:
        txtMemId.setText("");
        txtPass.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtBookId.setText("");
        txtTitle.setText("");
        txtAuthor.setText("");
        txtAvailable.setText("");
        txtDate.setText("");
    }//GEN-LAST:event_btnClearMousePressed

    private void btnReserveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReserveMousePressed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            Statement st3 = con.createStatement();
            
            String ID = txtMemId.getText();
            String Pass = txtPass.getText();            
            String book = txtBookId.getText();
                        
            String sqluser = "SELECT MEM_ID AND PASSWORD FROM MEMBER WHERE MEM_ID='"+ID+"' AND PASSWORD='"+Pass+"' ";
            String available = "SELECT AVAILABLE FROM BOOK WHERE BOOK_ID='"+book+"' AND AVAILABLE='YES' ";
            String select = "SELECT BOOK_ID FROM RESERVATION WHERE BOOK_ID='"+book+"' ";
                        
            ResultSet rs = st.executeQuery(sqluser);                     
            ResultSet rs2 = st2.executeQuery(available);
            ResultSet rs3 = st3.executeQuery(select);            
                                    
            boolean ifVerifyEmpty = false;
            boolean ifBookEmpty = false;
                                    
            ifVerifyEmpty = txtMemId.getText().length()==0 || txtPass.getText().length()==0 || txtName.getText().length()==0 || txtAddress.getText().length()==0;
            ifBookEmpty = txtBookId.getText().length()==0 || txtTitle.getText().length()==0 || txtAuthor.getText().length()==0;                  
            
            
            if (ifVerifyEmpty==true) {
                JOptionPane.showMessageDialog(this,"Please Verify Your Details","WARNING",JOptionPane.WARNING_MESSAGE);
            }//end if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"Member ID And Password Doesn't Match \nPlease Verify Your Details","WARNING",JOptionPane.WARNING_MESSAGE);
            }//end else if
            
            else if (ifBookEmpty==true) {
                JOptionPane.showMessageDialog(this,"Click Search \nAnd Enter A Valid Book ID","WARNING",JOptionPane.WARNING_MESSAGE);
            }//end elses if
                        
            else if (rs2.next()==false) {
                JOptionPane.showMessageDialog(this,"Selected Book Is Currently Not Available \nPlease Reserve A Different Book","WARNING",JOptionPane.WARNING_MESSAGE);
            }//else if

            else if (rs3.next()==true) {
                JOptionPane.showMessageDialog(this,"Selected Book Is Already Reserved \nPlease Reserve A Different Book","WARNING",JOptionPane.WARNING_MESSAGE);
            }//end else if                               
                        
            else {
                int dialogResult = JOptionPane.showConfirmDialog(this,"Reserve Book ID - '"+book+"'","Reserve",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if (dialogResult==0) {  
                    String insert = "INSERT INTO RESERVATION (MEM_ID,BOOK_ID,DATE_RES) VALUES (?,?,?)";                    
                    pst = con.prepareStatement(insert);
                    pst.setString(1,txtMemId.getText());
                    pst.setString(2,txtBookId.getText());
                    pst.setString(3,txtDate.getText());
                    pst.execute();

                    JOptionPane.showMessageDialog(this,"Book Reserved");
                    txtMemId.setText("");
                    txtPass.setText("");
                    txtName.setText("");
                    txtAddress.setText("");
                    txtBookId.setText("");
                    txtTitle.setText("");
                    txtAuthor.setText("");
                    txtAvailable.setText("");
                    txtDate.setText("");
                }//end if
                else {
                    txtMemId.setText("");
                    txtPass.setText("");
                    txtName.setText("");
                    txtAddress.setText("");
                    txtBookId.setText("");
                    txtTitle.setText("");
                    txtAuthor.setText("");
                    txtAvailable.setText("");
                    txtDate.setText("");
                }//end else
            }//end else
           
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }//end catch
    }//GEN-LAST:event_btnReserveMousePressed

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
            java.util.logging.Logger.getLogger(ReserveBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReserveBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReserveBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReserveBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReserveBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnReserve;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JLabel btnVerify;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtAvailable;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtMemId;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
