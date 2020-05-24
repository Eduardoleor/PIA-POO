/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import db.ConnectionService;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author eduardoleal
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        System.out.printf("Init View Menu \n");
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
        titulo_registro = new javax.swing.JLabel();
        subtitulo_registro = new javax.swing.JLabel();
        apellido_paterno = new rojeru_san.RSMTextFull();
        nombre = new rojeru_san.RSMTextFull();
        calificacion = new rojeru_san.RSMTextFull();
        apellido_materno = new rojeru_san.RSMTextFull();
        matricula = new rojeru_san.RSMTextFull();
        boton_registro = new rojeru_san.RSButtonRiple();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_matricula = new rojeru_san.RSMTextFull();
        boton_buscar = new rojeru_san.RSButtonRiple();

        setBackground(new java.awt.Color(55, 71, 79));

        jPanel1.setBackground(new java.awt.Color(16, 32, 39));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_registro.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        titulo_registro.setForeground(new java.awt.Color(255, 255, 255));
        titulo_registro.setText("Agregar un nuevo estudiante");
        jPanel1.add(titulo_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        subtitulo_registro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        subtitulo_registro.setForeground(new java.awt.Color(255, 255, 255));
        subtitulo_registro.setText("Ingresa todos los datos");
        jPanel1.add(subtitulo_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        apellido_paterno.setBackground(jPanel1.getBackground());
        apellido_paterno.setForeground(new java.awt.Color(255, 255, 255));
        apellido_paterno.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        apellido_paterno.setBotonColor(new java.awt.Color(204, 0, 51));
        apellido_paterno.setCaretColor(new java.awt.Color(255, 255, 255));
        apellido_paterno.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        apellido_paterno.setModoMaterial(true);
        apellido_paterno.setNextFocusableComponent(apellido_materno);
        apellido_paterno.setPlaceholder("Apellido Paterno");
        apellido_paterno.setSoloLetras(true);
        apellido_paterno.setxDarkIcon(true);
        jPanel1.add(apellido_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 40));

        nombre.setBackground(jPanel1.getBackground());
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        nombre.setBotonColor(new java.awt.Color(204, 0, 51));
        nombre.setCaretColor(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nombre.setModoMaterial(true);
        nombre.setNextFocusableComponent(apellido_paterno);
        nombre.setPlaceholder("Nombre");
        nombre.setSoloLetras(true);
        nombre.setxDarkIcon(true);
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 40));

        calificacion.setBackground(jPanel1.getBackground());
        calificacion.setForeground(new java.awt.Color(255, 255, 255));
        calificacion.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        calificacion.setBotonColor(new java.awt.Color(204, 0, 51));
        calificacion.setCaretColor(new java.awt.Color(255, 255, 255));
        calificacion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        calificacion.setModoMaterial(true);
        calificacion.setPlaceholder("Calificación");
        calificacion.setSoloNumeros(true);
        calificacion.setxDarkIcon(true);
        calificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calificacionKeyPressed(evt);
            }
        });
        jPanel1.add(calificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 40));

        apellido_materno.setBackground(jPanel1.getBackground());
        apellido_materno.setForeground(new java.awt.Color(255, 255, 255));
        apellido_materno.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        apellido_materno.setBotonColor(new java.awt.Color(204, 0, 51));
        apellido_materno.setCaretColor(new java.awt.Color(255, 255, 255));
        apellido_materno.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        apellido_materno.setNextFocusableComponent(calificacion);
        apellido_materno.setPlaceholder("Apellido Materno");
        apellido_materno.setSoloLetras(true);
        apellido_materno.setxDarkIcon(true);
        jPanel1.add(apellido_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 40));

        matricula.setBackground(jPanel1.getBackground());
        matricula.setForeground(new java.awt.Color(255, 255, 255));
        matricula.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        matricula.setBotonColor(new java.awt.Color(204, 0, 51));
        matricula.setCaretColor(new java.awt.Color(255, 255, 255));
        matricula.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        matricula.setModoMaterial(true);
        matricula.setName(""); // NOI18N
        matricula.setNextFocusableComponent(nombre);
        matricula.setPlaceholder("Matricula");
        matricula.setSoloNumeros(true);
        matricula.setxDarkIcon(true);
        matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                matriculaKeyTyped(evt);
            }
        });
        jPanel1.add(matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 40));

        boton_registro.setBackground(new java.awt.Color(38, 50, 56));
        boton_registro.setBorder(null);
        boton_registro.setText("Registrar!");
        boton_registro.setColorHover(new java.awt.Color(38, 50, 56));
        boton_registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_registro.setFocusPainted(false);
        boton_registro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registroAction(evt);
            }
        });
        jPanel1.add(boton_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Obtén la información de un estudiante");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Si no cuenta con una matricula, puedes registrarte para obtenerlo.");

        id_matricula.setBackground(getBackground());
        id_matricula.setForeground(new java.awt.Color(255, 255, 255));
        id_matricula.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        id_matricula.setBotonColor(new java.awt.Color(204, 0, 51));
        id_matricula.setCaretColor(new java.awt.Color(255, 255, 255));
        id_matricula.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        id_matricula.setPlaceholder("Matricula");
        id_matricula.setSoloNumeros(true);
        id_matricula.setxDarkIcon(true);
        id_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_matriculaActionPerformed(evt);
            }
        });
        id_matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_matriculaKeyTyped(evt);
            }
        });

        boton_buscar.setBackground(new java.awt.Color(38, 50, 56));
        boton_buscar.setBorder(null);
        boton_buscar.setColorHover(new java.awt.Color(38, 50, 56));
        boton_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_buscar.setFocusPainted(false);
        boton_buscar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton_buscar.setLabel("Buscar estudiante");
        boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton_buscarAction(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_matricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(boton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(id_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(boton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        boton_buscar.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void botton_buscarAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton_buscarAction
        if(id_matricula.getText().equals("")){
             showMessageDialog(null, "Debes ingresar una matricula.");
        }else{
            if(id_matricula.getText().toString().length() < 7){
                showMessageDialog(null, "Tu matricula debe ser correcta y debe contener al menos 7 carácteres.");
            }else{
                   //get data
                    String textMatricula = id_matricula.getText();
                    
                    ConnectionService connection = new ConnectionService();
                    connection.findValues(textMatricula);
            }
           id_matricula.setText("");
        }
    }//GEN-LAST:event_botton_buscarAction

    private void boton_registroAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registroAction
        
        //Get data from fields
        String textMatricula = matricula.getText();
        String textNombre = nombre.getText();
        String textApellidoPaterno = apellido_paterno.getText();
        String textApellidoMaterno = apellido_materno.getText();
        String textCalificacion = calificacion.getText();   
       
        if(areAllNotEmpty(textMatricula, textNombre, textApellidoPaterno, textApellidoMaterno,textCalificacion))
        {
            //Connection for packae
            ConnectionService connection = new ConnectionService();
            connection.setValues(textMatricula, textNombre, textApellidoPaterno, textApellidoMaterno, textCalificacion);

            matricula.setText(null);
            nombre.setText(null);
            apellido_paterno.setText(null);
            apellido_materno.setText(null);
            calificacion.setText(null);
        }else{
            showMessageDialog(null, "Debes ingresar todos los datos.");
        }
              
    }//GEN-LAST:event_boton_registroAction

    private void calificacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calificacionKeyPressed
         if(calificacion.getText().length() == 3)
        {
            calificacion.setText(calificacion.getText().substring(0, 2));
        }
    }//GEN-LAST:event_calificacionKeyPressed

    private void matriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matriculaKeyTyped
        // TODO add your handling code here:
         if (matricula.getText().length() == 7 ) // limit textfield to 3 characters
            evt.consume(); 
    }//GEN-LAST:event_matriculaKeyTyped

    private void id_matriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_matriculaKeyTyped
        // TODO add your handling code here:
        if (id_matricula.getText().length() == 7 ) // limit textfield to 3 characters
            evt.consume(); 
    }//GEN-LAST:event_id_matriculaKeyTyped

    private void id_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_matriculaActionPerformed
           if(id_matricula.getText().equals("")){
             showMessageDialog(null, "Debes ingresar una matricula.");
        }else{
            if(id_matricula.getText().toString().length() < 7){
                showMessageDialog(null, "Tu matricula debe ser correcta y debe contener al menos 7 carácteres.");
            }else{
                   //get data
                    String textMatricula = id_matricula.getText();
                    
                    ConnectionService connection = new ConnectionService();
                    connection.findValues(textMatricula);
            }
           id_matricula.setText("");
        }
    }//GEN-LAST:event_id_matriculaActionPerformed

    public static boolean areAllNotEmpty(String... texts)
    {
        for(String s : texts) if(s == null || "".equals(s)) return false;
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSMTextFull apellido_materno;
    private rojeru_san.RSMTextFull apellido_paterno;
    private rojeru_san.RSButtonRiple boton_buscar;
    private rojeru_san.RSButtonRiple boton_registro;
    private rojeru_san.RSMTextFull calificacion;
    private rojeru_san.RSMTextFull id_matricula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.RSMTextFull matricula;
    private rojeru_san.RSMTextFull nombre;
    private javax.swing.JLabel subtitulo_registro;
    private javax.swing.JLabel titulo_registro;
    // End of variables declaration//GEN-END:variables

}