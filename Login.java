package menu;

import com.login.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    int xMause, yMause;
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        barra = new javax.swing.JPanel();
        barrax = new javax.swing.JPanel();
        xBoton = new javax.swing.JLabel();
        SYME = new javax.swing.JLabel();
        INIC_SES = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        userTex = new javax.swing.JTextField();
        userSepa = new javax.swing.JSeparator();
        pasword = new javax.swing.JLabel();
        pasworTex = new javax.swing.JPasswordField();
        paswSepa = new javax.swing.JSeparator();
        botonEntr = new javax.swing.JPanel();
        botonTex = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/ima4.jpg"))); // NOI18N
        LOGO.setText("jLabel1");
        bg.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 0, 330, 500));

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

        barrax.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout barraxLayout = new javax.swing.GroupLayout(barrax);
        barrax.setLayout(barraxLayout);
        barraxLayout.setHorizontalGroup(
            barraxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );
        barraxLayout.setVerticalGroup(
            barraxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraxLayout.createSequentialGroup()
                .addComponent(xBoton)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addComponent(barrax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 769, Short.MAX_VALUE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(barrax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        SYME.setFont(new java.awt.Font("Roboto Mono SemiBold", 1, 14)); // NOI18N
        SYME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/ima2.png"))); // NOI18N
        SYME.setText("Automecanica");
        bg.add(SYME, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        INIC_SES.setFont(new java.awt.Font("Raleway ExtraBold", 1, 20)); // NOI18N
        INIC_SES.setText("INICIAR SESIÓN");
        bg.add(INIC_SES, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        user.setFont(new java.awt.Font("Roboto Mono Medium", 0, 14)); // NOI18N
        user.setText("USUARIO");
        bg.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        userTex.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        userTex.setForeground(new java.awt.Color(204, 204, 204));
        userTex.setText("Ingrese su nombre de usuario");
        userTex.setBorder(null);
        userTex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTexMousePressed(evt);
            }
        });
        bg.add(userTex, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 350, 30));

        userSepa.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(userSepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 300, -1));

        pasword.setFont(new java.awt.Font("Roboto Mono Medium", 0, 14)); // NOI18N
        pasword.setText("CONTRASEÑA");
        bg.add(pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        pasworTex.setForeground(new java.awt.Color(204, 204, 204));
        pasworTex.setText("***************");
        pasworTex.setBorder(null);
        pasworTex.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pasworTex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pasworTexMousePressed(evt);
            }
        });
        bg.add(pasworTex, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 290, -1));

        paswSepa.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(paswSepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 300, -1));

        botonEntr.setBackground(new java.awt.Color(175, 62, 54));
        botonEntr.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 14)); // NOI18N

        botonTex.setBackground(new java.awt.Color(175, 62, 54));
        botonTex.setFont(new java.awt.Font("Roboto Mono Medium", 0, 18)); // NOI18N
        botonTex.setForeground(new java.awt.Color(255, 255, 255));
        botonTex.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        botonTex.setText("ENTRAR");
        botonTex.setToolTipText("");
        botonTex.setBorder(null);
        botonTex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonTex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTexMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonTexMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonTexMouseExited(evt);
            }
        });
        botonTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonEntrLayout = new javax.swing.GroupLayout(botonEntr);
        botonEntr.setLayout(botonEntrLayout);
        botonEntrLayout.setHorizontalGroup(
            botonEntrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonTex, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        botonEntrLayout.setVerticalGroup(
            botonEntrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonTex, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(botonEntr, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTexActionPerformed

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        xMause = evt.getX();
        yMause = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMause, y - yMause);
    }//GEN-LAST:event_barraMouseDragged

    private void xBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBotonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xBotonMouseClicked

    private void xBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBotonMouseEntered
        barrax.setBackground(new Color(203,77,67));
        xBoton.setForeground(Color.white);
    }//GEN-LAST:event_xBotonMouseEntered

    private void xBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBotonMouseExited
        barrax.setBackground(Color.white);
        xBoton.setForeground(Color.black);
    }//GEN-LAST:event_xBotonMouseExited

    private void botonTexMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTexMouseEntered
        botonEntr.setBackground(new Color(201,71,62));
        botonTex.setBackground(new Color(201,71,62));
    }//GEN-LAST:event_botonTexMouseEntered

    private void botonTexMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTexMouseExited
        botonEntr.setBackground(new Color(175,62,54));
        botonTex.setBackground(new Color(175,62,54));
    }//GEN-LAST:event_botonTexMouseExited

    private void userTexMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTexMousePressed
        if (userTex.getText().equals("Ingrese su nombre de usuario")){
        userTex.setText("");
        userTex.setForeground(Color.black);
        }
        if (String.valueOf(pasworTex.getPassword()).isEmpty()){
        pasworTex.setText("***************");
        pasworTex.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTexMousePressed

    private void pasworTexMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasworTexMousePressed
        if (String.valueOf(pasworTex.getPassword()).equals("***************")){
        pasworTex.setText("");
        pasworTex.setForeground(Color.black);
        }
        if (userTex.getText().isEmpty()){
        userTex.setText("Ingrese su nombre de usuario");
        userTex.setForeground(Color.gray);
        }
    }//GEN-LAST:event_pasworTexMousePressed

    private void botonTexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTexMouseClicked
        String Usuario="Admin";
        String Contraseña="1234";
        String Pass=new String(pasworTex.getPassword());
        
        if(userTex.getText().equals(Usuario)&& Pass.equals(Contraseña)){
            Menu men=new Menu();
            men.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this,"Usuario / Contraseña incorrecta");
        }
    }//GEN-LAST:event_botonTexMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel INIC_SES;
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel SYME;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel barrax;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel botonEntr;
    private javax.swing.JTextField botonTex;
    private javax.swing.JSeparator paswSepa;
    private javax.swing.JPasswordField pasworTex;
    private javax.swing.JLabel pasword;
    private javax.swing.JLabel user;
    private javax.swing.JSeparator userSepa;
    private javax.swing.JTextField userTex;
    private javax.swing.JLabel xBoton;
    // End of variables declaration//GEN-END:variables
}
