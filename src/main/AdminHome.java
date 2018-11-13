package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.*;

public class AdminHome extends javax.swing.JFrame {

    int xx,xy;
        
    public AdminHome() {
        initComponents();
        setTitle("Main Menu - Admin");
        setResizable(false);
        centerWindow(this);           
    }
    
    public AdminHome(String user) {
        initComponents();
        setTitle("Main Menu - Admin");
        setResizable(false);
        centerWindow(this);
        lblUsername.setText("Welcome "+user);    
    }
        
    public void setColor (JPanel panel) {
        panel.setBackground(new Color(238,238,238));
    }
    
    public void resetColor (JPanel panel) {
        panel.setBackground(new Color(255,255,255));
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
        lblLog = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnAddBook = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnModBook = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSearchBook = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnViewBorrow = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btnReserve = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btnBorrow = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btnOverDue = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btnFine = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btnHelp = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
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

        lblLog.setBackground(new java.awt.Color(255, 255, 255));
        lblLog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLog.setForeground(new java.awt.Color(255, 255, 255));
        lblLog.setText("LOGOUT");
        lblLog.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblLogMouseMoved(evt);
            }
        });
        lblLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLogMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogMouseExited(evt);
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

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/library white.png"))); // NOI18N

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("LIBRARY MANAGEMENT SYSTEM");

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Read With Us");

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Main Menu - Admin");

        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)))
                .addComponent(lblLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExit)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLog, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 170));

        btnAddBook.setBackground(new java.awt.Color(255, 255, 255));
        btnAddBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
        btnAddBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddBookMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddBookMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddBookMouseEntered(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/add book.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Add Books");

        javax.swing.GroupLayout btnAddBookLayout = new javax.swing.GroupLayout(btnAddBook);
        btnAddBook.setLayout(btnAddBookLayout);
        btnAddBookLayout.setHorizontalGroup(
            btnAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddBookLayout.createSequentialGroup()
                .addGroup(btnAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnAddBookLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(btnAddBookLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        btnAddBookLayout.setVerticalGroup(
            btnAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddBookLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(btnAddBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 120, 110));

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
        btnRegister.setToolTipText("");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegisterMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegisterMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegisterMouseEntered(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/add member.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Register Member");

        javax.swing.GroupLayout btnRegisterLayout = new javax.swing.GroupLayout(btnRegister);
        btnRegister.setLayout(btnRegisterLayout);
        btnRegisterLayout.setHorizontalGroup(
            btnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegisterLayout.createSequentialGroup()
                .addGroup(btnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnRegisterLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3))
                    .addGroup(btnRegisterLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnRegisterLayout.setVerticalGroup(
            btnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegisterLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, 110));

        btnModBook.setBackground(new java.awt.Color(255, 255, 255));
        btnModBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
        btnModBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModBookMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModBookMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModBookMouseEntered(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/update book.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Modify Books");

        javax.swing.GroupLayout btnModBookLayout = new javax.swing.GroupLayout(btnModBook);
        btnModBook.setLayout(btnModBookLayout);
        btnModBookLayout.setHorizontalGroup(
            btnModBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModBookLayout.createSequentialGroup()
                .addGroup(btnModBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnModBookLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5))
                    .addGroup(btnModBookLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        btnModBookLayout.setVerticalGroup(
            btnModBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModBookLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(btnModBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 120, 110));

        btnSearchBook.setBackground(new java.awt.Color(255, 255, 255));
        btnSearchBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
        btnSearchBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSearchBookMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchBookMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchBookMouseEntered(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/search book.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Search Books");

        javax.swing.GroupLayout btnSearchBookLayout = new javax.swing.GroupLayout(btnSearchBook);
        btnSearchBook.setLayout(btnSearchBookLayout);
        btnSearchBookLayout.setHorizontalGroup(
            btnSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSearchBookLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSearchBookLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(17, 17, 17))
        );
        btnSearchBookLayout.setVerticalGroup(
            btnSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSearchBookLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(btnSearchBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 120, 110));

        btnViewBorrow.setBackground(new java.awt.Color(255, 255, 255));
        btnViewBorrow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
        btnViewBorrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnViewBorrowMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewBorrowMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewBorrowMouseEntered(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/borrowed books.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("View Borrowed");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Books");

        javax.swing.GroupLayout btnViewBorrowLayout = new javax.swing.GroupLayout(btnViewBorrow);
        btnViewBorrow.setLayout(btnViewBorrowLayout);
        btnViewBorrowLayout.setHorizontalGroup(
            btnViewBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnViewBorrowLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(39, 39, 39))
            .addGroup(btnViewBorrowLayout.createSequentialGroup()
                .addGroup(btnViewBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnViewBorrowLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel15))
                    .addGroup(btnViewBorrowLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel16)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        btnViewBorrowLayout.setVerticalGroup(
            btnViewBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnViewBorrowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnViewBorrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 120, 110));

        btnReserve.setBackground(new java.awt.Color(255, 255, 255));
        btnReserve.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
        btnReserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReserveMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReserveMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReserveMouseEntered(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/reservation.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Check Reseved ");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Books");

        javax.swing.GroupLayout btnReserveLayout = new javax.swing.GroupLayout(btnReserve);
        btnReserve.setLayout(btnReserveLayout);
        btnReserveLayout.setHorizontalGroup(
            btnReserveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReserveLayout.createSequentialGroup()
                .addGroup(btnReserveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnReserveLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel13))
                    .addGroup(btnReserveLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel14))
                    .addGroup(btnReserveLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel23)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        btnReserveLayout.setVerticalGroup(
            btnReserveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReserveLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel13)
                .addGap(2, 2, 2)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jPanel1.add(btnReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 120, 110));

        btnReturn.setBackground(new java.awt.Color(255, 255, 255));
        btnReturn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReturnMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReturnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReturnMouseEntered(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/return book.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Return Book");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Process");

        javax.swing.GroupLayout btnReturnLayout = new javax.swing.GroupLayout(btnReturn);
        btnReturn.setLayout(btnReturnLayout);
        btnReturnLayout.setHorizontalGroup(
            btnReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReturnLayout.createSequentialGroup()
                .addGroup(btnReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnReturnLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel17))
                    .addGroup(btnReturnLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel18))
                    .addGroup(btnReturnLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel34)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btnReturnLayout.setVerticalGroup(
            btnReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReturnLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel17)
                .addGap(3, 3, 3)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 120, 110));

        btnBorrow.setBackground(new java.awt.Color(255, 255, 255));
        btnBorrow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
        btnBorrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBorrowMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrowMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBorrowMouseEntered(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/borrow book.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Borrow Book");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Process");

        javax.swing.GroupLayout btnBorrowLayout = new javax.swing.GroupLayout(btnBorrow);
        btnBorrow.setLayout(btnBorrowLayout);
        btnBorrowLayout.setHorizontalGroup(
            btnBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBorrowLayout.createSequentialGroup()
                .addGroup(btnBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnBorrowLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel11))
                    .addGroup(btnBorrowLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12))
                    .addGroup(btnBorrowLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel32)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btnBorrowLayout.setVerticalGroup(
            btnBorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBorrowLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addGap(4, 4, 4)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(btnBorrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 120, 110));

        btnOverDue.setBackground(new java.awt.Color(255, 255, 255));
        btnOverDue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
        btnOverDue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOverDueMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOverDueMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOverDueMouseEntered(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/overdue.png"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Check Overdue");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Books");

        javax.swing.GroupLayout btnOverDueLayout = new javax.swing.GroupLayout(btnOverDue);
        btnOverDue.setLayout(btnOverDueLayout);
        btnOverDueLayout.setHorizontalGroup(
            btnOverDueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnOverDueLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(13, 13, 13))
            .addGroup(btnOverDueLayout.createSequentialGroup()
                .addGroup(btnOverDueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnOverDueLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel26))
                    .addGroup(btnOverDueLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel29)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnOverDueLayout.setVerticalGroup(
            btnOverDueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOverDueLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel26)
                .addGap(1, 1, 1)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnOverDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 120, 110));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Books");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, -1, 20));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Process");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        btnFine.setBackground(new java.awt.Color(255, 255, 255));
        btnFine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
        btnFine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFineMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFineMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFineMouseEntered(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/view fine.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("View");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Fine Payments");

        javax.swing.GroupLayout btnFineLayout = new javax.swing.GroupLayout(btnFine);
        btnFine.setLayout(btnFineLayout);
        btnFineLayout.setHorizontalGroup(
            btnFineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFineLayout.createSequentialGroup()
                .addGroup(btnFineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnFineLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel19))
                    .addGroup(btnFineLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel31))
                    .addGroup(btnFineLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel20)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        btnFineLayout.setVerticalGroup(
            btnFineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFineLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel19)
                .addGap(3, 3, 3)
                .addComponent(jLabel20)
                .addGap(3, 3, 3)
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnFine, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 120, 110));

        btnHelp.setBackground(new java.awt.Color(255, 255, 255));
        btnHelp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
        btnHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHelpMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHelpMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHelpMouseEntered(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icons/help.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Help");

        javax.swing.GroupLayout btnHelpLayout = new javax.swing.GroupLayout(btnHelp);
        btnHelp.setLayout(btnHelpLayout);
        btnHelpLayout.setHorizontalGroup(
            btnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHelpLayout.createSequentialGroup()
                .addGroup(btnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnHelpLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9))
                    .addGroup(btnHelpLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel10)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        btnHelpLayout.setVerticalGroup(
            btnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHelpLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(btnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 120, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblExitMousePressed

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        // TODO add your handling code here:
        lblExit.setForeground(Color.BLACK);
               
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        // TODO add your handling code here:
        lblExit.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblLogMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogMouseMoved
        // TODO add your handling code here:
        lblLog.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblLogMouseMoved

    private void lblLogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogMouseExited
        // TODO add your handling code here:
        lblLog.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblLogMouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
        // TODO add your handling code here:
        setColor(btnRegister);
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        // TODO add your handling code here:
        resetColor(btnRegister);
    }//GEN-LAST:event_btnRegisterMouseExited

    private void btnAddBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBookMouseEntered
        // TODO add your handling code here:
        setColor(btnAddBook);
    }//GEN-LAST:event_btnAddBookMouseEntered

    private void btnAddBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBookMouseExited
        // TODO add your handling code here:
        resetColor(btnAddBook);
    }//GEN-LAST:event_btnAddBookMouseExited

    private void btnModBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModBookMouseEntered
        // TODO add your handling code here:
        setColor(btnModBook);
    }//GEN-LAST:event_btnModBookMouseEntered

    private void btnModBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModBookMouseExited
        // TODO add your handling code here:
        resetColor(btnModBook);
    }//GEN-LAST:event_btnModBookMouseExited

    private void btnSearchBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchBookMouseEntered
        // TODO add your handling code here:
        setColor(btnSearchBook);
    }//GEN-LAST:event_btnSearchBookMouseEntered

    private void btnSearchBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchBookMouseExited
        // TODO add your handling code here:
        resetColor(btnSearchBook);
    }//GEN-LAST:event_btnSearchBookMouseExited

    private void btnReserveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReserveMouseEntered
        // TODO add your handling code here:
        setColor(btnReserve);
    }//GEN-LAST:event_btnReserveMouseEntered

    private void btnReserveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReserveMouseExited
        // TODO add your handling code here:
        resetColor(btnReserve);
    }//GEN-LAST:event_btnReserveMouseExited

    private void btnBorrowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrowMouseEntered
        // TODO add your handling code here:
        setColor(btnBorrow);
    }//GEN-LAST:event_btnBorrowMouseEntered

    private void btnBorrowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrowMouseExited
        // TODO add your handling code here:
        resetColor(btnBorrow);
    }//GEN-LAST:event_btnBorrowMouseExited

    private void btnViewBorrowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewBorrowMouseEntered
        // TODO add your handling code here:
        setColor(btnViewBorrow);
    }//GEN-LAST:event_btnViewBorrowMouseEntered

    private void btnViewBorrowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewBorrowMouseExited
        // TODO add your handling code here:
        resetColor(btnViewBorrow);
    }//GEN-LAST:event_btnViewBorrowMouseExited

    private void btnReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseEntered
        // TODO add your handling code here:
        setColor(btnReturn);
    }//GEN-LAST:event_btnReturnMouseEntered

    private void btnReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseExited
        // TODO add your handling code here:
        resetColor(btnReturn);
    }//GEN-LAST:event_btnReturnMouseExited

    private void btnOverDueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOverDueMouseEntered
        // TODO add your handling code here:
        setColor(btnOverDue);
    }//GEN-LAST:event_btnOverDueMouseEntered

    private void btnOverDueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOverDueMouseExited
        // TODO add your handling code here:
        resetColor(btnOverDue);
    }//GEN-LAST:event_btnOverDueMouseExited

    private void btnFineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFineMouseEntered
        // TODO add your handling code here:
        setColor(btnFine);
    }//GEN-LAST:event_btnFineMouseEntered

    private void btnFineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFineMouseExited
        // TODO add your handling code here:
        resetColor(btnFine);
    }//GEN-LAST:event_btnFineMouseExited

    private void btnHelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseEntered
        // TODO add your handling code here:
        setColor(btnHelp);
    }//GEN-LAST:event_btnHelpMouseEntered

    private void btnHelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseExited
        // TODO add your handling code here:
        resetColor(btnHelp);
    }//GEN-LAST:event_btnHelpMouseExited

    private void lblLogMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogMousePressed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblLogMousePressed

    private void btnRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMousePressed
        // TODO add your handling code here:
        new RegMember().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegisterMousePressed

    private void btnAddBookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBookMousePressed
        // TODO add your handling code here:
        new AddBook().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddBookMousePressed

    private void btnModBookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModBookMousePressed
        // TODO add your handling code here:
        new ModBook().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModBookMousePressed

    private void btnSearchBookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchBookMousePressed
        // TODO add your handling code here:
        new SearchBookAdmin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSearchBookMousePressed

    private void btnReserveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReserveMousePressed
        // TODO add your handling code here:
        new CheckReserved().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReserveMousePressed

    private void btnBorrowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrowMousePressed
        // TODO add your handling code here:
        new BorrowBook().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBorrowMousePressed

    private void btnViewBorrowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewBorrowMousePressed
        // TODO add your handling code here:
        new ViewBorrow().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewBorrowMousePressed

    private void btnReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMousePressed
        // TODO add your handling code here:
        new ReturnBook().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnMousePressed

    private void btnFineMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFineMousePressed
        // TODO add your handling code here:
        new ViewFine().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFineMousePressed

    private void btnOverDueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOverDueMousePressed
        // TODO add your handling code here:
        new CheckDue().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnOverDueMousePressed

    private void btnHelpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMousePressed
        // TODO add your handling code here:
        new HelpAdmin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHelpMousePressed

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAddBook;
    private javax.swing.JPanel btnBorrow;
    private javax.swing.JPanel btnFine;
    private javax.swing.JPanel btnHelp;
    private javax.swing.JPanel btnModBook;
    private javax.swing.JPanel btnOverDue;
    private javax.swing.JPanel btnRegister;
    private javax.swing.JPanel btnReserve;
    private javax.swing.JPanel btnReturn;
    private javax.swing.JPanel btnSearchBook;
    private javax.swing.JPanel btnViewBorrow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblLog;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables

    
}
