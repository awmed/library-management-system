package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.*;
import java.util.*;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;

public class SearchBookAdmin extends javax.swing.JFrame {

    int xx, xy;
    Connection con;
    
    public SearchBookAdmin() {
        initComponents();
        setTitle("Search Books");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        btnTitle = new javax.swing.JButton();
        btnAuthor = new javax.swing.JButton();
        btnAvailable = new javax.swing.JButton();

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/search book.png"))); // NOI18N

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Search Books");

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
                .addGap(168, 168, 168)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel35))
                            .addComponent(jLabel3))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 699, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Title", "Author", "Edition", "Published Year", "Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bookTable.setIntercellSpacing(new java.awt.Dimension(5, 5));
        bookTable.setRowHeight(25);
        bookTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        bookTable.setShowGrid(true);
        bookTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(bookTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 204, 579, 342));

        btnTitle.setText("Search By Title");
        btnTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTitleActionPerformed(evt);
            }
        });
        jPanel1.add(btnTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 142, -1, -1));

        btnAuthor.setText("Search By Author");
        btnAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthorActionPerformed(evt);
            }
        });
        jPanel1.add(btnAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        btnAvailable.setText("View All Available");
        btnAvailable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAvailableMousePressed(evt);
            }
        });
        jPanel1.add(btnAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
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

    private void btnTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTitleActionPerformed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            String title = JOptionPane.showInputDialog("Enter Book Title");
            String select = "SELECT BOOK_ID,B_TITLE AS TITLE,AUTHOR,EDITION,P_YEAR AS PUBLISHED_YEAR,AVAILABLE FROM BOOK WHERE B_TITLE='"+title+"' ";
            ResultSet rs = st.executeQuery(select);            
            boolean ifEmpty = false;
            ifEmpty = title.length()==0;
            
            if (ifEmpty==true) {
                JOptionPane.showMessageDialog(this,"Feilds Cannot Be Empty !!","WARNING",JOptionPane.WARNING_MESSAGE);
                bookTable.setModel(DbUtils.resultSetToTableModel(rs));
            }//end if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"No Match Found","ERROR",JOptionPane.ERROR_MESSAGE);
                bookTable.setModel(DbUtils.resultSetToTableModel(rs));
            }//end else if
            else {
                ResultSet rs2 = st2.executeQuery(select);
                bookTable.setModel(DbUtils.resultSetToTableModel(rs2));
            }//end else
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }//end catch
    }//GEN-LAST:event_btnTitleActionPerformed

    private void btnAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthorActionPerformed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            String author = JOptionPane.showInputDialog("Enter Author");
            String select = "SELECT BOOK_ID,B_TITLE AS TITLE,AUTHOR,EDITION,P_YEAR AS PUBLISHED_YEAR,AVAILABLE FROM BOOK WHERE AUTHOR='"+author+"' ";
            ResultSet rs = st.executeQuery(select);
            boolean ifEmpty = false;
            ifEmpty = author.length()==0;
            
            if (ifEmpty==true) {
                JOptionPane.showMessageDialog(this,"Feilds Cannot Be Empty !!","WARNING",JOptionPane.WARNING_MESSAGE);
                bookTable.setModel(DbUtils.resultSetToTableModel(rs));
            }//end if
            
            else if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"No Match Found","ERROR",JOptionPane.ERROR_MESSAGE);
                bookTable.setModel(DbUtils.resultSetToTableModel(rs));
            }//end else if
            
            else {
                ResultSet rs2 = st2.executeQuery(select);
                bookTable.setModel(DbUtils.resultSetToTableModel(rs2));
            }//end else
        }//end try
        
        catch(Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }//end catch
    }//GEN-LAST:event_btnAuthorActionPerformed

    private void btnAvailableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvailableMousePressed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();            
            Statement st2 = con.createStatement();
            String select = "SELECT BOOK_ID,B_TITLE AS TITLE,AUTHOR,EDITION,P_YEAR AS PUBLISHED_YEAR,AVAILABLE FROM BOOK WHERE AVAILABLE='YES' ";
            ResultSet rs = st.executeQuery(select);            
            
            if (rs.next()==false) {
                JOptionPane.showMessageDialog(this,"Currently No Books Available \nPlease Contact Librarian","ERROR",JOptionPane.ERROR_MESSAGE);
                bookTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else {
                ResultSet rs2 = st2.executeQuery(select);
                bookTable.setModel(DbUtils.resultSetToTableModel(rs2));
            }
        }//end try
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }//end catch
    }//GEN-LAST:event_btnAvailableMousePressed

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
            java.util.logging.Logger.getLogger(SearchBookAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBookAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBookAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBookAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBookAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JButton btnAuthor;
    private javax.swing.JButton btnAvailable;
    private javax.swing.JButton btnTitle;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}
