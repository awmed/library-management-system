package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.*;
import javax.swing.JOptionPane;

public class ModBook extends javax.swing.JFrame {

    int xx, xy;
    Connection con;
    PreparedStatement pst;
    
    public ModBook() {
        initComponents();
        setTitle("Modify Books");
        setResizable(false);
        centerWindow(this);
        con=SqlCon.connect();
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
        jLabel35 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        txtBook = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        cmbYes = new javax.swing.JComboBox<>();
        cmbEdition = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cmbYear = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        btnSearch = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

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
        jLabel35.setText("Modify Books");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/update book.png"))); // NOI18N

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
                .addGap(133, 133, 133)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
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
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 100));

        jLabel15.setText("Edition");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, 20));

        jLabel17.setText("Book Title");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 20));

        jLabel18.setText("Author");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, 20));

        jLabel19.setText("Available");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, 20));
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 250, -1));
        jPanel1.add(txtBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 250, -1));
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 250, -1));

        cmbYes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "YES", "NO" }));
        jPanel1.add(cmbYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 100, -1));

        cmbEdition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "First Edition", "Second Edition", "Third Edition", "Fourth Edition", "Fifth Edition" }));
        jPanel1.add(cmbEdition, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 230, -1));

        jLabel20.setText("Book ID");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 20));

        jLabel24.setText("Published Year");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, 20));

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));
        jPanel1.add(cmbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 140, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Update");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 50, 20));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/delete.png"))); // NOI18N
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteMousePressed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 50, -1));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/update.png"))); // NOI18N
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateMousePressed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/icons8-clear_search.png"))); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClearMousePressed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/search.png"))); // NOI18N
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSearchMousePressed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Clear All");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 60, 20));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Search");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 510, 50, 20));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Delete");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMousePressed
        // TODO add your handling code here:
        txtBook.setText("");
        txtTitle.setText("");
        txtAuthor.setText("");
        cmbEdition.setSelectedItem("----");
        cmbYear.setSelectedItem("----");
        cmbYes.setSelectedItem("----");
    }//GEN-LAST:event_btnClearMousePressed

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

    private void btnSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMousePressed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();
            String ID = txtBook.getText();
            String select = "SELECT * FROM BOOK WHERE BOOK_ID='"+ID+"' ";
            ResultSet rs = st.executeQuery(select);
            boolean ifIDEmpty = false;
            ifIDEmpty = ID.length()==0;
            
            if (ifIDEmpty==true) {
                JOptionPane.showMessageDialog(this,"Book ID Cannot Be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
            }//end if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"Invalid Book ID", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtTitle.setText("");
                txtAuthor.setText("");
                cmbEdition.setSelectedItem("----");
                cmbYear.setSelectedItem("----");
                cmbYes.setSelectedItem("----");
            }//end else if
            
            else {
                String book = rs.getString("book_id");
                String title = rs.getString("b_title");
                String author = rs.getString("author");
                String edition = rs.getString("edition");
                String year = rs.getString("p_year");
                String yes = rs.getString("available");
                
                txtBook.setText(book);
                txtTitle.setText(title);
                txtAuthor.setText(author);
                cmbEdition.setSelectedItem(edition);
                cmbYear.setSelectedItem(year);
                cmbYes.setSelectedItem(yes);
            }//end else
            
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_btnSearchMousePressed

    private void btnDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMousePressed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();
            String ID = txtBook.getText();
            String select = "SELECT * FROM BOOK WHERE BOOK_ID='"+ID+"' ";
            ResultSet rs = st.executeQuery(select);
            boolean ifIDEmpty = false;
            ifIDEmpty = ID.length()==0;
            
            if (ifIDEmpty==true) {
                JOptionPane.showMessageDialog(this,"Book ID Cannot Be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
            }//end if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"Invalid Book ID", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtTitle.setText("");
                txtAuthor.setText("");
                cmbEdition.setSelectedItem("----");
                cmbYear.setSelectedItem("----");
                cmbYes.setSelectedItem("----");
            }//end else if
            
            else {
                String book = rs.getString("book_id");
                String title = rs.getString("b_title");
                String author = rs.getString("author");
                String edition = rs.getString("edition");
                String year = rs.getString("p_year");
                String yes = rs.getString("available");
                
                txtBook.setText(book);
                txtTitle.setText(title);
                txtAuthor.setText(author);
                cmbEdition.setSelectedItem(edition);
                cmbYear.setSelectedItem(year);
                cmbYes.setSelectedItem(yes);
                
                int dialogResult = JOptionPane.showConfirmDialog(this,"Delete Book ID - '"+ID+"' ??","Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (dialogResult==0) {
                    String delete = "DELETE FROM BOOK WHERE BOOK_ID='"+ID+"' ";
                    st.execute(delete);
                    
                    JOptionPane.showMessageDialog(this,"Book ID - '"+ID+"' Deleted !!","Book Deleted", JOptionPane.INFORMATION_MESSAGE);
                    txtBook.setText("");
                    txtTitle.setText("");
                    txtAuthor.setText("");
                    cmbEdition.setSelectedItem("----");
                    cmbYear.setSelectedItem("----");
                    cmbYes.setSelectedItem("----");
                }//end if
                else {
                    txtBook.setText("");
                    txtTitle.setText("");
                    txtAuthor.setText("");
                    cmbEdition.setSelectedItem("----");
                    cmbYear.setSelectedItem("----");
                    cmbYes.setSelectedItem("----");
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
            String ID = txtBook.getText();            
            String select = "SELECT * FROM BOOK WHERE BOOK_ID='"+ID+"' ";
            ResultSet rs = st.executeQuery(select);
            boolean ifEmpty = false;
            boolean ifIDEmpty = false;
            ifIDEmpty = ID.length()==0;
            ifEmpty = txtBook.getText().length()==0 || txtTitle.getText().length()==0 || txtAuthor.getText().length()==0 || cmbEdition.getSelectedItem()=="----" || cmbYear.getSelectedItem()=="----" || cmbYes.getSelectedItem()=="----";
            
            if (ifIDEmpty==true) {
                JOptionPane.showMessageDialog(this,"Book ID Cannot Be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
            }//end if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"Invalid Book ID", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtTitle.setText("");
                txtAuthor.setText("");
                cmbEdition.setSelectedItem("----");
                cmbYear.setSelectedItem("----");
                cmbYes.setSelectedItem("----");
            }//end else if
            
            else if (ifEmpty==true) {
                JOptionPane.showMessageDialog(this,"Book Details Cannot Be Empty","ERROR", JOptionPane.ERROR_MESSAGE);
            }//end else if
            
            else {
                int dialogResult = JOptionPane.showConfirmDialog(this, "Update Book ID - '"+ID+"' ","Update",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (dialogResult==0) {
                    String edition = (String)cmbEdition.getSelectedItem();
                    String year = (String)cmbYear.getSelectedItem();
                    String yes = (String)cmbYes.getSelectedItem();
                    
                    String update = "UPDATE BOOK SET B_TITLE=?,AUTHOR=?,EDITION=?,P_YEAR=?,AVAILABLE=? WHERE BOOK_ID='"+ID+"' ";
                    pst = con.prepareStatement(update);
                    pst.setString(1,txtTitle.getText());
                    pst.setString(2,txtAuthor.getText());
                    pst.setString(3,edition);
                    pst.setString(4,year);
                    pst.setString(5,yes);
                    pst.execute();
                    
                    JOptionPane.showMessageDialog(this,"Book ID - '"+ID+"' Details Updated !!","Book Updated", JOptionPane.INFORMATION_MESSAGE);
                    txtBook.setText("");
                    txtTitle.setText("");
                    txtAuthor.setText("");
                    cmbEdition.setSelectedItem("----");
                    cmbYear.setSelectedItem("----");
                    cmbYes.setSelectedItem("----");
                }//end if
                else {
                    txtBook.setText("");
                    txtTitle.setText("");
                    txtAuthor.setText("");
                    cmbEdition.setSelectedItem("----");
                    cmbYear.setSelectedItem("----");
                    cmbYes.setSelectedItem("----");
                }//end else
            }//end else
                        
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }//end catch
    }//GEN-LAST:event_btnUpdateMousePressed

    
    
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
            java.util.logging.Logger.getLogger(ModBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JLabel btnUpdate;
    private javax.swing.JComboBox<String> cmbEdition;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JComboBox<String> cmbYes;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBook;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
