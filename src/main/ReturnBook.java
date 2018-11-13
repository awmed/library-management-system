package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.*;
import javax.swing.JOptionPane;

public class ReturnBook extends javax.swing.JFrame {

    int xx,xy;
    int elapsed, fine;    
    Connection con;
    PreparedStatement pst;
    
    public ReturnBook() {
        initComponents();
        setTitle("Return Book");
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
        txtBookId = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMemberId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtCount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDateDue = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDateReturn = new javax.swing.JTextField();
        txtElapsed = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtFine = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        btnSearch = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/return book.png"))); // NOI18N

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Return Book Process");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
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
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(txtBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 145, 223, -1));

        txtTitle.setEditable(false);
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 191, 223, -1));

        txtAuthor.setEditable(false);
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 237, 223, -1));

        jLabel7.setText("Author");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 242, -1, -1));

        jLabel6.setText("Title");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 196, -1, -1));

        jLabel5.setText("Book ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 150, -1, -1));

        txtMemberId.setEditable(false);
        jPanel1.add(txtMemberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 283, 223, -1));

        txtName.setEditable(false);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 329, 223, -1));

        txtCount.setEditable(false);
        jPanel1.add(txtCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 375, 223, -1));

        jLabel12.setText("Book Count");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 380, -1, -1));

        jLabel2.setText("Member Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 334, -1, -1));

        jLabel1.setText("Member ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 288, -1, -1));

        txtDateDue.setEditable(false);
        jPanel1.add(txtDateDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 421, 223, -1));

        jLabel10.setText("Date Due");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 426, -1, -1));

        jLabel11.setText("Return Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 492, -1, -1));

        txtDateReturn.setEditable(false);
        jPanel1.add(txtDateReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 487, 223, -1));

        txtElapsed.setEditable(false);
        jPanel1.add(txtElapsed, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 533, 223, -1));

        jLabel13.setText("Days Elapsed");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 538, -1, -1));

        txtFine.setEditable(false);
        jPanel1.add(txtFine, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 579, 223, -1));

        jLabel14.setText("Fine (Rs.)");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 584, -1, -1));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/update.png"))); // NOI18N
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateMousePressed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 60, -1));

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/icons8-clear_search.png"))); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClearMousePressed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, -1, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/search.png"))); // NOI18N
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSearchMousePressed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Clear All");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 60, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Update");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMousePressed
        // TODO add your handling code here:        
        try {
            Statement st = con.createStatement();            
            String ID = txtMemberId.getText();
            String book = txtBookId.getText();
            Boolean ifBookEmpty, ifUserEmpty = true;
            ifBookEmpty = book.length()==0;
            ifUserEmpty = ID.length()==0;
            
            String select = "SELECT * FROM BORROW WHERE BOOK_ID='"+book+"' ";
            ResultSet rs = st.executeQuery(select);
            
            if (ifBookEmpty==true) {
                JOptionPane.showMessageDialog(this,"BOOK ID CANNOT BE EMPTY","ERROR",JOptionPane.ERROR_MESSAGE);
                txtBookId.setText("");
                txtTitle.setText("");
                txtAuthor.setText("");
                txtMemberId.setText("");
                txtName.setText("");
                txtCount.setText("");
                txtDateDue.setText("");
                txtDateReturn.setText("");
                txtElapsed.setText("");
                txtFine.setText("");
            }//end if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"INVALID BOOK ID","ERROR",JOptionPane.ERROR_MESSAGE);
                txtBookId.setText("");
                txtTitle.setText("");
                txtAuthor.setText("");
                txtMemberId.setText("");
                txtName.setText("");
                txtCount.setText("");
                txtDateDue.setText("");
                txtDateReturn.setText("");
                txtElapsed.setText("");
                txtFine.setText("");
            }//end else if
            
            else if (ifUserEmpty==true) {
                JOptionPane.showMessageDialog(this,"Details Cannot Be Empty \nPlease Check The Records !!","WARNING",JOptionPane.WARNING_MESSAGE);
                txtBookId.setText("");
                txtTitle.setText("");
                txtAuthor.setText("");
                txtMemberId.setText("");
                txtName.setText("");
                txtCount.setText("");
                txtDateDue.setText("");
                txtDateReturn.setText("");
                txtElapsed.setText("");
                txtFine.setText("");
            }//end else if
            
            else {
                int diloagResult = JOptionPane.showConfirmDialog(this,"Update Borrowing Records \nRelated to Book ID - '"+book+"' ","Update",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if (diloagResult==0) {
                    //update customer bookcount
                    String bookcount = "UPDATE MEMBER SET BOOK_COUNT=BOOK_COUNT-1 WHERE MEM_ID='"+ID+"' ";
                    st.execute(bookcount);

                    //update book avaiable
                    String available = "UPDATE BOOK SET AVAILABLE='YES' WHERE BOOK_ID='"+book+"' ";            
                    st.execute(available);

                    //record fines to database
                    if (elapsed>0) {
                        String fines = "INSERT INTO FINES (MEM_ID,BOOK_ID,DATE_FINED,AMOUNT) VALUES (?,?,?,?)";
                        pst = con.prepareStatement(fines);
                        pst.setString(1,ID);
                        pst.setString(2,book);
                        pst.setString(3,txtDateReturn.getText());
                        pst.setString(4,txtFine.getText());
                        pst.execute();
                    }

                    //delete borrow record
                    String delete = "DELETE FROM BORROW WHERE BOOK_ID='"+book+"' ";
                    st.execute(delete);

                    JOptionPane.showMessageDialog(this,"Record Updated");
                    txtBookId.setText("");
                    txtTitle.setText("");
                    txtAuthor.setText("");
                    txtMemberId.setText("");
                    txtName.setText("");
                    txtCount.setText("");
                    txtDateDue.setText("");
                    txtDateReturn.setText("");
                    txtElapsed.setText("");
                    txtFine.setText("");
                }//end if
                else {
                    txtBookId.setText("");
                    txtTitle.setText("");
                    txtAuthor.setText("");
                    txtMemberId.setText("");
                    txtName.setText("");
                    txtCount.setText("");
                    txtDateDue.setText("");
                    txtDateReturn.setText("");
                    txtElapsed.setText("");
                    txtFine.setText("");
                }//end else
            }//end else
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }//end catch
    }//GEN-LAST:event_btnUpdateMousePressed

    private void btnClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMousePressed
        // TODO add your handling code here:
        txtBookId.setText("");
        txtTitle.setText("");
        txtAuthor.setText("");
        txtMemberId.setText("");
        txtName.setText("");
        txtCount.setText("");
        txtDateDue.setText("");
        txtDateReturn.setText("");
        txtElapsed.setText("");
        txtFine.setText("");  
    }//GEN-LAST:event_btnClearMousePressed

    private void btnSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMousePressed
        // TODO add your handling code here:
        try {
            txtFine.setText(""); 
            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            Statement st3 = con.createStatement();
            
            String ID = txtBookId.getText();            
            
            String select = "SELECT MEM_ID,BOOK_ID,DATE_DUE,DATEDIFF(NOW(), DATE_DUE) AS ELAPSED FROM BORROW WHERE BOOK_ID='"+ID+"' ";
                        
            ResultSet rs = st.executeQuery(select);
            boolean ifIDEmpty = false;
            ifIDEmpty = ID.length()==0;
            
            if (ifIDEmpty==true) {
                JOptionPane.showMessageDialog(this,"Book ID Cannot Be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
            }//end if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"RECORDS RELARED TO BOOK ID - '"+ID+"' \nNOT FOUND !!","ERROR",JOptionPane.ERROR_MESSAGE);
                txtBookId.setText("");
                txtTitle.setText("");
                txtAuthor.setText("");
                txtMemberId.setText("");
                txtName.setText("");
                txtCount.setText("");
                txtDateDue.setText("");
                txtDateReturn.setText("");
                txtElapsed.setText("");
                txtFine.setText(""); 
            }//end else if
            
            else {               
                
                String memberid = rs.getString("MEM_ID");
                String e = rs.getString("ELAPSED");
                elapsed = Integer.parseInt(e);
                
                txtMemberId.setText(memberid);                               
                txtDateDue.setText(rs.getString("DATE_DUE"));                
                txtElapsed.setText(e);
                
                if (elapsed>0) {                    
                    fine = elapsed * 5;
                    txtFine.setText(String.valueOf(fine));
                }                
                
                String book = "SELECT B_TITLE,AUTHOR FROM BOOK WHERE BOOK_ID='"+ID+"' ";
                ResultSet rs2 = st2.executeQuery(book);
                rs2.next();
                
                txtTitle.setText(rs2.getString("B_TITLE"));
                txtAuthor.setText(rs2.getString("AUTHOR"));
                
                String member = "SELECT M_NAME,BOOK_COUNT FROM MEMBER WHERE MEM_ID='"+memberid+"' ";               
                
                ResultSet rs3 = st3.executeQuery(member);
                rs3.next();                            
                              
                txtName.setText(rs3.getString("M_NAME"));
                txtCount.setText(rs3.getString("BOOK_COUNT"));                                
                
                String date = "SELECT NOW() AS TODAY";
                rs = st.executeQuery(date);
                rs.next();
                txtDateReturn.setText(rs.getString("TODAY"));
            }//end else
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }//end catch
    }//GEN-LAST:event_btnSearchMousePressed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JLabel btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtCount;
    private javax.swing.JTextField txtDateDue;
    private javax.swing.JTextField txtDateReturn;
    private javax.swing.JTextField txtElapsed;
    private javax.swing.JTextField txtFine;
    private javax.swing.JTextField txtMemberId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
