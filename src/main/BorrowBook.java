package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.*;
import javax.swing.JOptionPane;

public class BorrowBook extends javax.swing.JFrame {

    int xx,xy;
    Connection con;
    PreparedStatement pst;
    
    public BorrowBook() {
        initComponents();
        setTitle("Borrow Book Process");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMemberId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtBookId = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtAvailable = new javax.swing.JTextField();
        txtDateBorrow = new javax.swing.JTextField();
        txtDateDue = new javax.swing.JTextField();
        btnBook = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCount = new javax.swing.JTextField();
        btnBorrow = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        btnMember = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/borrow book.png"))); // NOI18N

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Borrow Book Process");

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
                .addGap(14, 14, 14)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
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
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel35)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        jLabel1.setText("Member ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 135, -1, -1));

        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 181, -1, -1));

        jLabel5.setText("Book ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 293, -1, -1));

        jLabel6.setText("Title");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 339, -1, -1));

        jLabel7.setText("Author");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 385, -1, -1));

        jLabel8.setText("Available");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 431, -1, -1));

        jLabel9.setText("Date Borrowed");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 477, -1, -1));

        jLabel10.setText("Date Due");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 523, -1, -1));
        jPanel1.add(txtMemberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 223, -1));

        txtName.setEditable(false);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 176, 223, -1));
        jPanel1.add(txtBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 288, 223, -1));

        txtTitle.setEditable(false);
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 334, 223, -1));

        txtAuthor.setEditable(false);
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 223, -1));

        txtAvailable.setEditable(false);
        jPanel1.add(txtAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 426, 223, -1));

        txtDateBorrow.setEditable(false);
        jPanel1.add(txtDateBorrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 472, 223, -1));

        txtDateDue.setEditable(false);
        jPanel1.add(txtDateDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 518, 223, -1));

        btnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/search.png"))); // NOI18N
        btnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBookMousePressed(evt);
            }
        });
        jPanel1.add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, -1, -1));

        jLabel12.setText("Book Count");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 227, -1, -1));

        txtCount.setEditable(false);
        jPanel1.add(txtCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 222, 223, -1));

        btnBorrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/borrow.png"))); // NOI18N
        btnBorrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBorrowMousePressed(evt);
            }
        });
        jPanel1.add(btnBorrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, -1, -1));

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/icons8-clear_search.png"))); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClearMousePressed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, -1, -1));

        btnMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/search.png"))); // NOI18N
        btnMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMemberMousePressed(evt);
            }
        });
        jPanel1.add(btnMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Clear All");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, 60, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Search");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 60, 20));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Search");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, 20));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Borrow Book");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 640, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMousePressed
        // TODO add your handling code here:
        new AdminHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMenuMousePressed

    private void lblMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseExited
        // TODO add your handling code here:
        lblMenu.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblMenuMouseExited

    private void lblMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseEntered
        // TODO add your handling code here:
        lblMenu.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblMenuMouseEntered

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

    private void btnMemberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberMousePressed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();
            String ID = txtMemberId.getText();
            String select = "SELECT M_NAME,BOOK_COUNT FROM MEMBER WHERE MEM_ID='"+ID+"' ";
            ResultSet rs = st.executeQuery(select);
            boolean ifUserEmpty = false;
            ifUserEmpty = ID.length()==0;
            
            if (ifUserEmpty==true) {
                JOptionPane.showMessageDialog(this,"Member ID Cannot Be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
            }//end if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"Invalid Member ID","ERROR",JOptionPane.ERROR_MESSAGE);
                txtName.setText("");
                txtCount.setText("");
            }//end else if
            
            else {
                txtName.setText(rs.getString("m_name"));
                txtCount.setText(rs.getString("book_count"));
            }//end else
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }//end catch
    }//GEN-LAST:event_btnMemberMousePressed

    private void btnBookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookMousePressed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            Statement st3 = con.createStatement();
            String book = txtBookId.getText();
            
            boolean ifBookEmpty = false;
            ifBookEmpty = book.length()==0;
            
            String select = "SELECT * FROM BOOK WHERE BOOK_ID='"+book+"' ";
            String date = "SELECT NOW() AS TODAY";
            String duedate = "SELECT DATE_ADD(NOW(),INTERVAL 14 DAY) AS DUE";
            
            ResultSet rs = st.executeQuery(select);
            ResultSet rs2 = st2.executeQuery(date);
            rs2.next();
            ResultSet rs3 = st3.executeQuery(duedate);
            rs3.next();
            
            
            if (ifBookEmpty==true) {
                JOptionPane.showMessageDialog(this,"Book ID Cannot Be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
                txtTitle.setText("");
                txtAuthor.setText("");
                txtAvailable.setText("");
                txtDateBorrow.setText("");
                txtDateDue.setText("");
            }//end if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"Invalid Book ID","ERROR",JOptionPane.ERROR_MESSAGE);
                txtTitle.setText("");
                txtAuthor.setText("");
                txtAvailable.setText("");
                txtDateBorrow.setText("");
                txtDateDue.setText("");
            }//end else if
            
            else {
                txtTitle.setText(rs.getString("B_TITLE"));
                txtAuthor.setText(rs.getString("AUTHOR"));
                txtAvailable.setText(rs.getString("AVAILABLE"));
                txtDateBorrow.setText(rs2.getString("TODAY"));
                txtDateDue.setText(rs3.getString("DUE"));
            }
            
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }//end catch
    }//GEN-LAST:event_btnBookMousePressed

    private void btnClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMousePressed
        // TODO add your handling code here:
        txtMemberId.setText("");
        txtName.setText("");
        txtCount.setText("");
        txtBookId.setText("");
        txtTitle.setText("");
        txtAuthor.setText("");
        txtAvailable.setText("");
        txtDateBorrow.setText("");
        txtDateDue.setText("");
    }//GEN-LAST:event_btnClearMousePressed

    private void btnBorrowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrowMousePressed
        // TODO add your handling code here:        
        try {
            Statement st = con.createStatement();           
            
            String ID = txtMemberId.getText();
            String book = txtBookId.getText();
            String no = txtAvailable.getText();
            
            boolean ifUserEmpty, ifBookEmpty, IfUserDetailsEmpty, IfBookDetailsEmpty, ifAvailable = false;            
            ifUserEmpty = ID.length()==0;
            ifBookEmpty = book.length()==0;
            IfUserDetailsEmpty = txtName.getText().length()==0 || txtCount.getText().length()==0;
            IfBookDetailsEmpty = txtTitle.getText().length()==0 || txtAuthor.getText().length()==0 || txtAvailable.getText().length()==0 || txtDateBorrow.getText().length()==0 || txtDateDue.getText().length()==0 ;
            ifAvailable = no.equalsIgnoreCase("NO");
            
            if (ifUserEmpty==true) {
                JOptionPane.showMessageDialog(this,"Member ID Cannot Be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
            }//end if
            
            else if (ifBookEmpty==true) {
                JOptionPane.showMessageDialog(this,"Book ID Cannot Be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
            }//end else if
            
            else if (IfUserDetailsEmpty==true) {
                JOptionPane.showMessageDialog(this,"Member Details Cannot Be Empty \nInput A Valid ID And Click Search","WARNING",JOptionPane.WARNING_MESSAGE);
            }//end else if            
            
            else if (IfBookDetailsEmpty==true) {
                JOptionPane.showMessageDialog(this,"Book Details Cannot Be Empty \nInput A Valid ID And Click Search","WARNING",JOptionPane.WARNING_MESSAGE);
            }//end else if  
            
            else if (ifAvailable==true) {
                JOptionPane.showMessageDialog(this,"Selected Book Is Currently Not Available \nPlease Borrow A Different Book","WARNING",JOptionPane.WARNING_MESSAGE);
                txtTitle.setText("");
                txtAuthor.setText("");
                txtAvailable.setText("");
                txtDateBorrow.setText("");
                txtDateDue.setText("");
            }
            
            else {
                int count = Integer.parseInt(txtCount.getText());                  
                
                if (count>=2) {
                    JOptionPane.showMessageDialog(this,"Book Borrowing Not Allowed \nLimit Exceeded !!","WARNING",JOptionPane.WARNING_MESSAGE);
                }//end if  
                
                else {
                    int dialogResult = JOptionPane.showConfirmDialog(this,"Borrow Book ID - '"+book+"' To \nMember ID - '"+ID+"' ??","Borrow",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);               
                    if (dialogResult==0) {
                    String insert = "INSERT INTO BORROW (MEM_ID,BOOK_ID,DATE_BORROWED,DATE_DUE) VALUES (?,?,?,?)";
                    pst = con.prepareStatement(insert);
                    pst.setString(1,txtMemberId.getText());
                    pst.setString(2,txtBookId.getText());
                    pst.setString(3,txtDateBorrow.getText());
                    pst.setString(4,txtDateDue.getText());
                    pst.execute();

                    //update member book count
                    String bookcount = "UPDATE MEMBER SET BOOK_COUNT=BOOK_COUNT+1 WHERE MEM_ID='"+ID+"' ";
                    st.execute(bookcount);

                    //update book avaiable
                    String available = "UPDATE BOOK SET AVAILABLE='NO' WHERE BOOK_ID='"+book+"' ";            
                    st.execute(available);

                    JOptionPane.showMessageDialog(this,"Book Borrowing Added to Database");
                    txtMemberId.setText("");
                    txtName.setText("");
                    txtCount.setText("");
                    txtBookId.setText("");
                    txtTitle.setText("");
                    txtAuthor.setText("");
                    txtAvailable.setText("");
                    txtDateBorrow.setText("");
                    txtDateDue.setText("");
                    }//end if

                    else {
                        txtMemberId.setText("");
                        txtName.setText("");
                        txtCount.setText("");
                        txtBookId.setText("");
                        txtTitle.setText("");
                        txtAuthor.setText("");
                        txtAvailable.setText("");
                        txtDateBorrow.setText("");
                        txtDateDue.setText("");
                    }//end else
                    
                }//end else           
            }//end else
        }//end try
                
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }//end catch
    }//GEN-LAST:event_btnBorrowMousePressed

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
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBook;
    private javax.swing.JLabel btnBorrow;
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnMember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtAvailable;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtCount;
    private javax.swing.JTextField txtDateBorrow;
    private javax.swing.JTextField txtDateDue;
    private javax.swing.JTextField txtMemberId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
