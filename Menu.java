/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu;

import menuu.*;
import java.awt.Color;
//import busqd.busqda;
import ini.inic;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import submenus.menuItem;
import java.awt.CardLayout;
import javax.swing.SwingUtilities;

/**
 *
 * @author karen
 */
public class Menu extends javax.swing.JFrame {

    int xMause, yMause;
    
    busqda panelBusq= new busqda();
    inic inicio= new inic();
    CardLayout pane;
    
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bs = new javax.swing.JPanel();
        late = new javax.swing.JPanel();
        logoAuto = new javax.swing.JLabel();
        separaLogo = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        menu = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        botonX = new javax.swing.JPanel();
        xBoton = new javax.swing.JLabel();
        cuerp = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        barraIni = new javax.swing.JPanel();
        barraIniText = new javax.swing.JLabel();
        mensaj1 = new javax.swing.JLabel();
        mensaj2 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bs.setBackground(new java.awt.Color(255, 255, 255));
        bs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bs.setPreferredSize(new java.awt.Dimension(803, 500));
        bs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        late.setBackground(new java.awt.Color(143, 29, 19));

        logoAuto.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        logoAuto.setForeground(new java.awt.Color(255, 255, 255));
        logoAuto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/ima3.jpg"))); // NOI18N
        logoAuto.setText("AUTOFAST");

        separaLogo.setForeground(new java.awt.Color(255, 255, 255));
        separaLogo.setAlignmentX(1.0F);
        separaLogo.setAlignmentY(1.0F);

        jScrollPane1.setBorder(null);

        menu.setBackground(new java.awt.Color(143, 29, 19));
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });
        menu.setLayout(new javax.swing.BoxLayout(menu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menu);

        javax.swing.GroupLayout lateLayout = new javax.swing.GroupLayout(late);
        late.setLayout(lateLayout);
        lateLayout.setHorizontalGroup(
            lateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoAuto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lateLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(separaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addComponent(jScrollPane1)
        );
        lateLayout.setVerticalGroup(
            lateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lateLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(logoAuto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bs.add(late, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 570));

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        botonX.setBackground(new java.awt.Color(255, 255, 255));

        xBoton.setFont(new java.awt.Font("Roboto Mono Medium", 0, 20)); // NOI18N
        xBoton.setForeground(new java.awt.Color(153, 0, 51));
        xBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xBoton.setText("x");
        xBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout botonXLayout = new javax.swing.GroupLayout(botonX);
        botonX.setLayout(botonXLayout);
        botonXLayout.setHorizontalGroup(
            botonXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonXLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(xBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botonXLayout.setVerticalGroup(
            botonXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonXLayout.createSequentialGroup()
                .addComponent(xBoton)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addContainerGap(770, Short.MAX_VALUE)
                .addComponent(botonX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        bs.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        cuerp.setBackground(new java.awt.Color(255, 255, 255));
        cuerp.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        barraIni.setBackground(new java.awt.Color(143, 29, 19));

        barraIniText.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 30)); // NOI18N
        barraIniText.setForeground(new java.awt.Color(255, 255, 255));
        barraIniText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        barraIniText.setText("I N I C I O");
        barraIniText.setToolTipText("");

        mensaj1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        mensaj1.setForeground(new java.awt.Color(255, 255, 255));
        mensaj1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mensaj1.setText("Administración/Control/Automotriz");

        mensaj2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        mensaj2.setForeground(new java.awt.Color(255, 255, 255));
        mensaj2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mensaj2.setText("Presupuesto Mecánico");

        javax.swing.GroupLayout barraIniLayout = new javax.swing.GroupLayout(barraIni);
        barraIni.setLayout(barraIniLayout);
        barraIniLayout.setHorizontalGroup(
            barraIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraIniLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(barraIniText, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraIniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensaj2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(mensaj1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraIniLayout.setVerticalGroup(
            barraIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraIniLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(barraIniText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(barraIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mensaj1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mensaj2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ini/auto.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(barraIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(icon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barraIni, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(icon)
                .addGap(0, 147, Short.MAX_VALUE))
        );

        cuerp.add(jPanel1, "card2");

        bs.add(cuerp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 590, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void execute() {
        ImageIcon iconAyud = new ImageIcon(getClass().getResource("/menu/ayud.png"));
        ImageIcon iconBusq = new ImageIcon(getClass().getResource("/menu/busq.png"));
        ImageIcon iconCoti = new ImageIcon(getClass().getResource("/menu/coti.png"));
        ImageIcon iconIni= new ImageIcon(getClass().getResource("/menu/ini.png"));
        //ImageIcon iconElim= new ImageIcon(getClass().getResource("/menu/elim.png"));
        //ImageIcon iconModi = new ImageIcon(getClass().getResource("/menu/modi.png"));
        ImageIcon iconTrabR = new ImageIcon(getClass().getResource("/menu/trabR.png"));
  
        //menuItem menuModi = new menuItem(iconModi, "  MODIFICAR", null);
        //menuItem menuElim = new menuItem(iconElim, "  ELIMINAR", null);

        menuItem menuIni = new menuItem(iconIni, "INICIO", new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent eve) {
                /*cuerp.add(inicio,"busqueda");
                pane.show(cuerp,"busqueda");
                cuerp.revalidate();
                SwingUtilities.updateComponentTreeUI(bs);
                bs.repaint();*/
                cuerp.removeAll();
                cuerp.add(new inic());
                cuerp.revalidate();
                cuerp.repaint();
            }
        });
        menuItem menuCoti = new menuItem(iconCoti, "COTIZACIONES", new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                cuerp.removeAll();
                cuerp.add(new cotiza());
                cuerp.revalidate();
                cuerp.repaint();
            }
        });
        
        menuItem menuBusq = new menuItem(iconBusq, "  BUSCAR", new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                cuerp.removeAll();
                cuerp.add(new busqda());
                cuerp.revalidate();
                cuerp.repaint();
            }
        });
        menuItem menuTrabR = new menuItem(iconTrabR, "TRABAJOS REALIZADOS", null, menuBusq);
        
        menuItem menuAyud = new menuItem(iconAyud, "AYUDA", new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                cuerp.removeAll();
                cuerp.add(new Help());             
                cuerp.revalidate();
                cuerp.repaint();
            }
        });
        addMenu(menuIni,menuCoti, menuTrabR, menuAyud);
    }
    private void addMenu(menuItem... submenus) {
        for (int i = 0; i < submenus.length; i++) {
            menu.add(submenus[i]);
            ArrayList<menuItem> subMenu = submenus[i].getSubMenu();
            for (menuItem m : subMenu) {
                addMenu(m);
            }
        }
        menu.revalidate();
    }
    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        xMause = evt.getX();
        yMause = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMause, y - yMause);
    }//GEN-LAST:event_barraMouseDragged

    private void xBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBotonMouseExited
        botonX.setBackground(Color.white);
        xBoton.setForeground(Color.black);
    }//GEN-LAST:event_xBotonMouseExited

    private void xBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBotonMouseEntered
        botonX.setBackground(new Color(203,77,67));
        xBoton.setForeground(Color.white);
    }//GEN-LAST:event_xBotonMouseEntered

    private void xBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBotonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xBotonMouseClicked

    private void menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseEntered
        menu.setBackground(new Color(175,62,54));
        jScrollPane1.setBackground(new Color(175,62,54));
    }//GEN-LAST:event_menuMouseEntered

    private void menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseExited
        menu.setBackground(new Color(155,43,32));
        jScrollPane1.setBackground(new Color(155,43,32));
    }//GEN-LAST:event_menuMouseExited

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra;
    private javax.swing.JPanel barraIni;
    private javax.swing.JLabel barraIniText;
    private javax.swing.JPanel botonX;
    private javax.swing.JPanel bs;
    private javax.swing.JPanel cuerp;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel late;
    private javax.swing.JLabel logoAuto;
    private javax.swing.JLabel mensaj1;
    private javax.swing.JLabel mensaj2;
    private javax.swing.JPanel menu;
    private javax.swing.JSeparator separaLogo;
    private javax.swing.JLabel xBoton;
    // End of variables declaration//GEN-END:variables
}
