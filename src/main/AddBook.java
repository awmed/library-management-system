package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.sql.*;
import javax.swing.JOptionPane;

public class AddBook extends javax.swing.JFrame {

    int xx, xy;
    Connection con;
    PreparedStatement pst;
    
    public AddBook() {
        initComponents();
        setTitle("Add Books");
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
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        txtBook = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        cmbYear = new javax.swing.JComboBox<>();
        cmbEdition = new javax.swing.JComboBox<>();
        btnClear = new javax.swing.JLabel();
        btnAdd = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

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
        jLabel35.setText("Add Books");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/add book.png"))); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblExit)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(jLabel35)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMenu))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel35))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        jLabel15.setText("Edition");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, 20));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Clear All");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, 20));

        jLabel17.setText("Book Title");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 20));

        jLabel18.setText("Author");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, 20));

        jLabel19.setText("Published Year");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, 20));
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 250, -1));
        jPanel1.add(txtBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 250, -1));
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 250, -1));

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));
        jPanel1.add(cmbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 180, -1));

        cmbEdition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "First Edition", "Second Edition", "Third Edition", "Fourth Edition", "Fifth Edition" }));
        jPanel1.add(cmbEdition, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 230, -1));

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/icons8-clear_search.png"))); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClearMousePressed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons_ui/add.png"))); // NOI18N
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddMousePressed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel20.setText("Book ID");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 20));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Add");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMousePressed
        // TODO add your handling code here:
        try {
            Statement st = con.createStatement();
            String ID = txtBook.getText();            
            String select = "SELECT * FROM BOOK WHERE BOOK_ID='"+ID+"' ";
            ResultSet rs = st.executeQuery(select);
            boolean ifEmpty = false;
            ifEmpty = txtBook.getText().length()==0 || txtTitle.getText().length()==0 || txtAuthor.getText().length()==0 || cmbEdition.getSelectedItem()=="----" || cmbYear.getSelectedItem()=="----";
                                    
            if (ifEmpty==true) {
                JOptionPane.showMessageDialog(this,"Book Details Cannot Be Empty","ERROR", JOptionPane.ERROR_MESSAGE);
            }//end if
            
            else if (rs.next()==true) {
                JOptionPane.showMessageDialog(this,"Book ID Already Exist !!","WARNING",JOptionPane.WARNING_MESSAGE);
                txtBook.setText("");
            }// end else if
            
            else {
                int dialogResult = JOptionPane.showConfirmDialog(this,"Add New Book - '"+ID+"' ","Add", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (dialogResult==0) {
                    String edition = (String)cmbEdition.getSelectedItem();
                    String year = (String)cmbYear.getSelectedItem();

                    String insert = "INSERT INTO BOOK VALUES (?,?,?,?,?,?)";
                    pst = con.prepareStatement(insert);
                    pst.setString(1,txtBook.getText());
                    pst.setString(2,txtTitle.getText());
                    pst.setString(3,txtAuthor.getText());
                    pst.setString(4,edition);
                    pst.setString(5,year);
                    pst.setString(6,"YES");
                    pst.execute();

                    JOptionPane.showMessageDialog(this,"Book ID '"+ID+"' Added");
                    txtBook.setText("");
                    txtTitle.setText("");
                    txtAuthor.setText("");
                    cmbEdition.setSelectedItem("----");
                    cmbYear.setSelectedItem("----");
                }//end if
                else {
                    txtBook.setText("");
                    txtTitle.setText("");
                    txtAuthor.setText("");
                    cmbEdition.setSelectedItem("----");
                    cmbYear.setSelectedItem("----");
                }//end else
            }
        }//end try
        
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, e);
            
        }//end catch
    }//GEN-LAST:event_btnAddMousePressed

    private void btnClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMousePressed
        // TODO add your handling code here:
        txtBook.setText("");
        txtTitle.setText("");
        txtAuthor.setText("");
        cmbEdition.setSelectedItem("----");
        cmbYear.setSelectedItem("----");
    }//GEN-LAST:event_btnClearMousePressed

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnClear;
    private javax.swing.JComboBox<String> cmbEdition;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
