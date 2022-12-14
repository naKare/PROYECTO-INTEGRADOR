/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package menu;
import java.awt.Color;
/**
 *
 * @author karen
 */
public class modifica extends javax.swing.JPanel {

    /**
     * Creates new form cotiza
     */
    public modifica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraCoti = new javax.swing.JPanel();
        barraBusqText = new javax.swing.JLabel();
        datos = new javax.swing.JPanel();
        placa = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        numTel = new javax.swing.JLabel();
        nomClien = new javax.swing.JLabel();
        placasText = new javax.swing.JTextField();
        nomClienText = new javax.swing.JTextField();
        numTelText = new javax.swing.JTextField();
        fech = new com.toedter.calendar.JDateChooser();
        SP = new javax.swing.JPanel();
        SPtext = new javax.swing.JLabel();
        SC = new javax.swing.JPanel();
        SCtext = new javax.swing.JLabel();
        SerPre = new javax.swing.JPanel();
        AfiMotr = new javax.swing.JCheckBox();
        Revere = new javax.swing.JCheckBox();
        AfinaTrans = new javax.swing.JCheckBox();
        Limpie = new javax.swing.JCheckBox();
        Cambi = new javax.swing.JCheckBox();
        Revis = new javax.swing.JCheckBox();
        Comen = new javax.swing.JLabel();
        ComenText = new javax.swing.JTextField();
        SerCorr = new javax.swing.JPanel();
        CombEm = new javax.swing.JCheckBox();
        ServSus = new javax.swing.JCheckBox();
        CambCabe = new javax.swing.JCheckBox();
        Ajus = new javax.swing.JCheckBox();
        MecaGenl = new javax.swing.JLabel();
        Estim = new javax.swing.JLabel();
        Coment = new javax.swing.JLabel();
        MecaGenlText = new javax.swing.JTextField();
        EstText = new javax.swing.JTextField();
        ComeText = new javax.swing.JTextField();
        modificar = new javax.swing.JPanel();
        modiText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        barraCoti.setBackground(new java.awt.Color(143, 29, 19));

        barraBusqText.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 30)); // NOI18N
        barraBusqText.setForeground(new java.awt.Color(255, 255, 255));
        barraBusqText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        barraBusqText.setText("M O D I F I C A C I O N");
        barraBusqText.setToolTipText("");

        javax.swing.GroupLayout barraCotiLayout = new javax.swing.GroupLayout(barraCoti);
        barraCoti.setLayout(barraCotiLayout);
        barraCotiLayout.setHorizontalGroup(
            barraCotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraCotiLayout.createSequentialGroup()
                .addComponent(barraBusqText, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        barraCotiLayout.setVerticalGroup(
            barraCotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraBusqText, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        datos.setBackground(new java.awt.Color(255, 255, 255));

        placa.setFont(new java.awt.Font("Roboto Mono Medium", 0, 14)); // NOI18N
        placa.setText("Placa:");

        fecha.setFont(new java.awt.Font("Roboto Mono Medium", 0, 14)); // NOI18N
        fecha.setText("Fecha:");

        numTel.setFont(new java.awt.Font("Roboto Mono Medium", 0, 14)); // NOI18N
        numTel.setText("N??mero Telef??nico:");

        nomClien.setFont(new java.awt.Font("Roboto Mono Medium", 0, 14)); // NOI18N
        nomClien.setText("Nombre del cliente:");

        placasText.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        placasText.setForeground(new java.awt.Color(204, 204, 204));
        placasText.setText(" Ingrese las placas");
        placasText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        placasText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placasTextMousePressed(evt);
            }
        });
        placasText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placasTextActionPerformed(evt);
            }
        });

        nomClienText.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        nomClienText.setForeground(new java.awt.Color(204, 204, 204));
        nomClienText.setText(" Ingrese el nombre del cliente");
        nomClienText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        nomClienText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nomClienTextMousePressed(evt);
            }
        });

        numTelText.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        numTelText.setForeground(new java.awt.Color(204, 204, 204));
        numTelText.setText(" Ingrese el n??mero telef??nico");
        numTelText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        numTelText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                numTelTextMousePressed(evt);
            }
        });

        fech.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout datosLayout = new javax.swing.GroupLayout(datos);
        datos.setLayout(datosLayout);
        datosLayout.setHorizontalGroup(
            datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosLayout.createSequentialGroup()
                        .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placasText, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fech, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datosLayout.createSequentialGroup()
                        .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomClien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomClienText, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numTelText, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        datosLayout.setVerticalGroup(
            datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placa)
                    .addComponent(fecha)
                    .addComponent(placasText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomClien)
                    .addComponent(nomClienText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numTel)
                    .addComponent(numTelText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SP.setBackground(new java.awt.Color(153, 153, 153));

        SPtext.setFont(new java.awt.Font("Raleway ExtraBold", 1, 18)); // NOI18N
        SPtext.setForeground(new java.awt.Color(255, 255, 255));
        SPtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SPtext.setText("Servicios Preventivos");

        javax.swing.GroupLayout SPLayout = new javax.swing.GroupLayout(SP);
        SP.setLayout(SPLayout);
        SPLayout.setHorizontalGroup(
            SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SPtext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SPLayout.setVerticalGroup(
            SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SPtext, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        SC.setBackground(new java.awt.Color(153, 153, 153));

        SCtext.setFont(new java.awt.Font("Raleway ExtraBold", 1, 18)); // NOI18N
        SCtext.setForeground(new java.awt.Color(255, 255, 255));
        SCtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SCtext.setText("Servicios Correctivos");

        javax.swing.GroupLayout SCLayout = new javax.swing.GroupLayout(SC);
        SC.setLayout(SCLayout);
        SCLayout.setHorizontalGroup(
            SCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SCtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SCLayout.setVerticalGroup(
            SCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SCtext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        AfiMotr.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        AfiMotr.setText("Afinaci??n de motor\t ");

        Revere.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        Revere.setText("Reverencio de puntos de seguridad ");

        AfinaTrans.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        AfinaTrans.setText("Afinaciones de transmisi??n");

        Limpie.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        Limpie.setText("Limpieza, lubricaci??n y cambio de frenos");

        Cambi.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        Cambi.setText("Cambio de l??quidos ");

        Revis.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        Revis.setText("Revisi??n y cambio de embrague");

        Comen.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        Comen.setText("Comentarios:");

        ComenText.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        ComenText.setForeground(new java.awt.Color(204, 204, 204));
        ComenText.setText("Agregue sus comentarios");
        ComenText.setSelectionEnd(18);
        ComenText.setSelectionStart(18);
        ComenText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ComenTextMousePressed(evt);
            }
        });

        javax.swing.GroupLayout SerPreLayout = new javax.swing.GroupLayout(SerPre);
        SerPre.setLayout(SerPreLayout);
        SerPreLayout.setHorizontalGroup(
            SerPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SerPreLayout.createSequentialGroup()
                .addGroup(SerPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SerPreLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(SerPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SerPreLayout.createSequentialGroup()
                                .addGroup(SerPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AfiMotr, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Limpie, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AfinaTrans, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(SerPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cambi)
                                    .addComponent(Revis)
                                    .addComponent(Revere)))
                            .addComponent(ComenText, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SerPreLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Comen)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SerPreLayout.setVerticalGroup(
            SerPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SerPreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SerPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AfiMotr)
                    .addComponent(Revis))
                .addGap(3, 3, 3)
                .addGroup(SerPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AfinaTrans)
                    .addComponent(Cambi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SerPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limpie)
                    .addComponent(Revere))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Comen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ComenText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CombEm.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        CombEm.setText("Cambio de embrague");

        ServSus.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        ServSus.setText("Servicios de suspensi??n");

        CambCabe.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        CambCabe.setText("Cambio de junto de cabeza de motor");

        Ajus.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        Ajus.setText("Ajuste completo de motor");

        MecaGenl.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        MecaGenl.setText("Mec??nica general:");

        Estim.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        Estim.setText("Estimado:");

        Coment.setFont(new java.awt.Font("Roboto Mono", 0, 10)); // NOI18N
        Coment.setText("Comentarios:");

        MecaGenlText.setForeground(new java.awt.Color(204, 204, 204));

        EstText.setForeground(new java.awt.Color(204, 204, 204));

        ComeText.setForeground(new java.awt.Color(204, 204, 204));
        ComeText.setText("Agregue sus comentarios");
        ComeText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ComeTextMousePressed(evt);
            }
        });

        modificar.setBackground(new java.awt.Color(166, 166, 166));
        modificar.setForeground(new java.awt.Color(255, 255, 255));

        modiText.setBackground(new java.awt.Color(166, 166, 166));
        modiText.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        modiText.setForeground(new java.awt.Color(255, 255, 255));
        modiText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modiText.setText("MODIFICAR");
        modiText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modiTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modiTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout modificarLayout = new javax.swing.GroupLayout(modificar);
        modificar.setLayout(modificarLayout);
        modificarLayout.setHorizontalGroup(
            modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modiText, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        modificarLayout.setVerticalGroup(
            modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modiText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout SerCorrLayout = new javax.swing.GroupLayout(SerCorr);
        SerCorr.setLayout(SerCorrLayout);
        SerCorrLayout.setHorizontalGroup(
            SerCorrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SerCorrLayout.createSequentialGroup()
                .addGroup(SerCorrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SerCorrLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(SerCorrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CombEm)
                            .addComponent(CambCabe)))
                    .addGroup(SerCorrLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(SerCorrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Estim)
                            .addComponent(MecaGenl)
                            .addComponent(EstText, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MecaGenlText, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(SerCorrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SerCorrLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(SerCorrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SerCorrLayout.createSequentialGroup()
                                .addGroup(SerCorrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ajus)
                                    .addComponent(ServSus))
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SerCorrLayout.createSequentialGroup()
                                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))
                    .addGroup(SerCorrLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(SerCorrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComeText, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Coment))
                        .addContainerGap())))
        );
        SerCorrLayout.setVerticalGroup(
            SerCorrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SerCorrLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SerCorrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CombEm)
                    .addComponent(Ajus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SerCorrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ServSus)
                    .addComponent(CambCabe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SerCorrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SerCorrLayout.createSequentialGroup()
                        .addGroup(SerCorrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MecaGenl)
                            .addComponent(Coment))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SerCorrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MecaGenlText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(Estim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EstText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraCoti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SerPre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SerCorr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barraCoti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SerPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(SC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SerCorr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void placasTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placasTextMousePressed
        if (placasText.getText().equals(" Ingrese las placas")){
            placasText.setText(" ");
            placasText.setForeground(Color.black);
        }
    }//GEN-LAST:event_placasTextMousePressed

    private void nomClienTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomClienTextMousePressed
        if (nomClienText.getText().equals(" Ingrese el nombre del cliente")){
            nomClienText.setText(" ");
            nomClienText.setForeground(Color.black);
        }
    }//GEN-LAST:event_nomClienTextMousePressed

    private void numTelTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numTelTextMousePressed
        if (numTelText.getText().equals(" Ingrese el n??mero telef??nico")){
            numTelText.setText(" ");
            numTelText.setForeground(Color.black);
        }
    }//GEN-LAST:event_numTelTextMousePressed

    private void modiTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modiTextMouseEntered
        modiText.setBackground(new Color(240,240,240));
        modificar.setBackground(new Color(240,240,240));
        modiText.setForeground(Color.black);
    }//GEN-LAST:event_modiTextMouseEntered

    private void modiTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modiTextMouseExited
        modiText.setBackground(new Color(166,166,166));
        modificar.setBackground(new Color(166,166,166));
        modiText.setForeground(Color.white);
    }//GEN-LAST:event_modiTextMouseExited

    private void placasTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placasTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placasTextActionPerformed

    private void ComenTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComenTextMousePressed
        if (ComenText.getText().equals("Agregue sus comentarios")){
            ComenText.setText(" ");
            ComenText.setForeground(Color.black);
        }
    }//GEN-LAST:event_ComenTextMousePressed

    private void ComeTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComeTextMousePressed
        if (ComeText.getText().equals("Agregue sus comentarios")){
            ComeText.setText(" ");
            ComeText.setForeground(Color.black);
        }
    }//GEN-LAST:event_ComeTextMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AfiMotr;
    private javax.swing.JCheckBox AfinaTrans;
    private javax.swing.JCheckBox Ajus;
    private javax.swing.JCheckBox CambCabe;
    private javax.swing.JCheckBox Cambi;
    private javax.swing.JCheckBox CombEm;
    private javax.swing.JTextField ComeText;
    private javax.swing.JLabel Comen;
    private javax.swing.JTextField ComenText;
    private javax.swing.JLabel Coment;
    private javax.swing.JTextField EstText;
    private javax.swing.JLabel Estim;
    private javax.swing.JCheckBox Limpie;
    private javax.swing.JLabel MecaGenl;
    private javax.swing.JTextField MecaGenlText;
    private javax.swing.JCheckBox Revere;
    private javax.swing.JCheckBox Revis;
    private javax.swing.JPanel SC;
    private javax.swing.JLabel SCtext;
    private javax.swing.JPanel SP;
    private javax.swing.JLabel SPtext;
    private javax.swing.JPanel SerCorr;
    private javax.swing.JPanel SerPre;
    private javax.swing.JCheckBox ServSus;
    private javax.swing.JLabel barraBusqText;
    private javax.swing.JPanel barraCoti;
    private javax.swing.JPanel datos;
    private com.toedter.calendar.JDateChooser fech;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel modiText;
    private javax.swing.JPanel modificar;
    private javax.swing.JLabel nomClien;
    private javax.swing.JTextField nomClienText;
    private javax.swing.JLabel numTel;
    private javax.swing.JTextField numTelText;
    private javax.swing.JLabel placa;
    private javax.swing.JTextField placasText;
    // End of variables declaration//GEN-END:variables
}
