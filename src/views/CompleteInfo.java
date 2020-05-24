/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import static javax.swing.JOptionPane.showMessageDialog;
import db.ConnectionService;

/**
 *
 * @author eduardoleal
 */
public class CompleteInfo extends javax.swing.JPanel {

    private String matr;

    /**
     * Creates new form CompleteInfo
     */
    
    public CompleteInfo(String matricula) {
        initComponents();
        matr = matricula;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        carrera = new rojeru_san.RSMTextFull();
        jLabel2 = new javax.swing.JLabel();
        calificacion = new rojeru_san.RSMTextFull();
        boton_continuar = new rojeru_san.RSButtonRiple();

        jPanel1.setBackground(new java.awt.Color(55, 71, 79));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Completa tu información");

        carrera.setForeground(new java.awt.Color(255, 255, 255));
        carrera.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        carrera.setBotonColor(new java.awt.Color(255, 255, 255));
        carrera.setCaretColor(new java.awt.Color(255, 255, 255));
        carrera.setColorTransparente(true);
        carrera.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        carrera.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        carrera.setModoMaterial(true);
        carrera.setNextFocusableComponent(calificacion);
        carrera.setPlaceholder("Ingresa tu carrera");
        carrera.setSelectedTextColor(getBackground());
        carrera.setSelectionColor(new java.awt.Color(102, 102, 102));
        carrera.setSoloLetras(true);
        carrera.setxDarkIcon(true);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Para continúar es necesario completar tu pérfil.");

        calificacion.setForeground(new java.awt.Color(255, 255, 255));
        calificacion.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        calificacion.setBotonColor(new java.awt.Color(255, 255, 255));
        calificacion.setCaretColor(new java.awt.Color(255, 255, 255));
        calificacion.setColorTransparente(true);
        calificacion.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        calificacion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        calificacion.setModoMaterial(true);
        calificacion.setPlaceholder("Ingresa tu calificación ");
        calificacion.setSoloNumeros(true);
        calificacion.setxDarkIcon(true);
        calificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calificacionKeyPressed(evt);
            }
        });

        boton_continuar.setBackground(new java.awt.Color(38, 50, 56));
        boton_continuar.setBorder(null);
        boton_continuar.setText("Continúar");
        boton_continuar.setActionCommand("Continúar");
        boton_continuar.setColorHover(new java.awt.Color(38, 50, 56));
        boton_continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_continuar.setFocusPainted(false);
        boton_continuar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_continuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(136, 136, 136)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(boton_continuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void calificacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calificacionKeyPressed
        // TODO add your handling code here:
         if(calificacion.getText().length() == 3)
        {
            calificacion.setText(calificacion.getText().substring(0, 2));
        }
    }//GEN-LAST:event_calificacionKeyPressed

    private void boton_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_continuarActionPerformed
        if(calificacion.getText().isEmpty()){
            showMessageDialog(null, "Ingresa tu calificación.");
        }
        if(carrera.getText().isEmpty()){
            showMessageDialog(null, "Ingresa tu carrera.");
        }
         String textCarrera = carrera.getText();
         String textCali = calificacion.getText();

         ConnectionService connection = new ConnectionService();
         connection.updateValues(textCarrera, textCali, matr);
    }//GEN-LAST:event_boton_continuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple boton_continuar;
    private rojeru_san.RSMTextFull calificacion;
    private rojeru_san.RSMTextFull carrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}