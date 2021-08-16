package Vista;

import Controller.VehiculoControladora;
import controller.Controladora;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import javax.swing.JOptionPane;
import modelo.Vehiculo;
import org.json.simple.JSONArray;

public class CG3EliminarVehiculo extends javax.swing.JFrame {
    
    VehiculoControladora control; 
    JSONArray jsonVehiculos = new JSONArray(), jsonClientes  = new JSONArray(), jsonUsuarios = new JSONArray(), jsonVentas = new JSONArray(); 

    
       public CG3EliminarVehiculo() {
        initComponents();
        control = new VehiculoControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");         
    }
   public CG3EliminarVehiculo(JSONArray jsonClientes,JSONArray jsonVehiculos, JSONArray jsonUsuarios, JSONArray jsonVentas) {
        initComponents();
        control = new VehiculoControladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        this.jsonClientes = jsonClientes; 
        this.jsonVehiculos = jsonVehiculos;
        this.jsonUsuarios = jsonUsuarios;
        this.jsonVentas = jsonVentas;
        jPanel1.setVisible(false);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModificar1 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        btnACEPTAR = new javax.swing.JButton();
        Bienvenida2 = new javax.swing.JLabel();
        placa = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        btnSalir2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        actuales = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        txtMarca1 = new javax.swing.JTextField();
        ano = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        paisManufactura = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        modelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        tipoMotor = new javax.swing.JLabel();
        txtTmotor = new javax.swing.JTextField();
        numeroDeSerieMotor = new javax.swing.JLabel();
        txtNSM = new javax.swing.JTextField();
        numeroDeSerieChasis = new javax.swing.JLabel();
        txtNSC = new javax.swing.JTextField();
        kilometraje = new javax.swing.JLabel();
        txtKilometraje = new javax.swing.JTextField();
        color = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        btnEliminarS = new javax.swing.JButton();
        fondo1 = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificar1.setBackground(new java.awt.Color(153, 153, 153));
        btnModificar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarCarroMINI48.png"))); // NOI18N
        btnModificar1.setBorderPainted(false);
        btnModificar1.setContentAreaFilled(false);
        btnModificar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar1.setFocusPainted(false);
        btnModificar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 120, 130));

        btnModificar.setBackground(new java.awt.Color(153, 153, 153));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificarCarroPequeno72.png"))); // NOI18N
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setFocusPainted(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificarCarroGrande96px.png"))); // NOI18N
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificarCarroGrande96px.png"))); // NOI18N
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 120, 130));

        btnInicio.setBackground(new java.awt.Color(153, 153, 153));
        btnInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CasitaPequena.png"))); // NOI18N
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CasitaGrand.png"))); // NOI18N
        btnInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CasitaGrand.png"))); // NOI18N
        btnInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, 110));

        btnAgregar1.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarCarroPequeno72.png"))); // NOI18N
        btnAgregar1.setBorderPainted(false);
        btnAgregar1.setContentAreaFilled(false);
        btnAgregar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar1.setFocusPainted(false);
        btnAgregar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarCarroGrande96PX.png"))); // NOI18N
        btnAgregar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarCarroGrande96PX.png"))); // NOI18N
        btnAgregar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 130));

        btnACEPTAR.setBackground(new java.awt.Color(153, 153, 153));
        btnACEPTAR.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnACEPTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkGrandore.png"))); // NOI18N
        btnACEPTAR.setBorderPainted(false);
        btnACEPTAR.setContentAreaFilled(false);
        btnACEPTAR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnACEPTAR.setFocusPainted(false);
        btnACEPTAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnACEPTAR.setName(""); // NOI18N
        btnACEPTAR.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkpequeno.png"))); // NOI18N
        btnACEPTAR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkpequeno.png"))); // NOI18N
        btnACEPTAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACEPTARActionPerformed(evt);
            }
        });
        getContentPane().add(btnACEPTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 90, 80));

        Bienvenida2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Bienvenida2.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida2.setText("Vehiculo a eliminar:");
        getContentPane().add(Bienvenida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 370, 50));

        placa.setForeground(new java.awt.Color(255, 255, 255));
        placa.setText("Placa:");
        getContentPane().add(placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));
        getContentPane().add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 150, -1));

        btnSalir2.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Pequena.png"))); // NOI18N
        btnSalir2.setBorderPainted(false);
        btnSalir2.setContentAreaFilled(false);
        btnSalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir2.setFocusPainted(false);
        btnSalir2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 780, 90, 80));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        actuales.setForeground(new java.awt.Color(255, 255, 255));
        actuales.setText("Del vehiculo:");
        jPanel1.add(actuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 100, 40));

        marca.setForeground(new java.awt.Color(255, 255, 255));
        marca.setText("Marca:");
        jPanel1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 50, 40));

        txtMarca1.setForeground(new java.awt.Color(0, 0, 0));
        txtMarca1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtMarca1.setEnabled(false);
        jPanel1.add(txtMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 80, -1));

        ano.setForeground(new java.awt.Color(255, 255, 255));
        ano.setText("Ano: ");
        jPanel1.add(ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtAno.setForeground(new java.awt.Color(0, 0, 0));
        txtAno.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtAno.setEnabled(false);
        jPanel1.add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 80, -1));

        paisManufactura.setForeground(new java.awt.Color(255, 255, 255));
        paisManufactura.setText("Pais/Manufactura:");
        jPanel1.add(paisManufactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtPais.setForeground(new java.awt.Color(0, 0, 0));
        txtPais.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPais.setEnabled(false);
        jPanel1.add(txtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 80, -1));

        modelo.setForeground(new java.awt.Color(255, 255, 255));
        modelo.setText("Modelo:");
        jPanel1.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtModelo.setForeground(new java.awt.Color(0, 0, 0));
        txtModelo.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtModelo.setEnabled(false);
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 150, -1));

        tipoMotor.setForeground(new java.awt.Color(255, 255, 255));
        tipoMotor.setText("Tipo motor:");
        jPanel1.add(tipoMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtTmotor.setForeground(new java.awt.Color(0, 0, 0));
        txtTmotor.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtTmotor.setEnabled(false);
        jPanel1.add(txtTmotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 150, -1));

        numeroDeSerieMotor.setForeground(new java.awt.Color(255, 255, 255));
        numeroDeSerieMotor.setText("N/S Motor:");
        jPanel1.add(numeroDeSerieMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, 40));

        txtNSM.setForeground(new java.awt.Color(0, 0, 0));
        txtNSM.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtNSM.setEnabled(false);
        jPanel1.add(txtNSM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 100, -1));

        numeroDeSerieChasis.setForeground(new java.awt.Color(255, 255, 255));
        numeroDeSerieChasis.setText("N/S Chasis:");
        jPanel1.add(numeroDeSerieChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 100, 40));

        txtNSC.setForeground(new java.awt.Color(0, 0, 0));
        txtNSC.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtNSC.setEnabled(false);
        jPanel1.add(txtNSC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 100, -1));

        kilometraje.setForeground(new java.awt.Color(255, 255, 255));
        kilometraje.setText("Kilometraje");
        jPanel1.add(kilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 100, 40));

        txtKilometraje.setForeground(new java.awt.Color(0, 0, 0));
        txtKilometraje.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtKilometraje.setEnabled(false);
        jPanel1.add(txtKilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 150, -1));

        color.setForeground(new java.awt.Color(255, 255, 255));
        color.setText("Color:");
        jPanel1.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 100, 40));

        txtColor.setForeground(new java.awt.Color(0, 0, 0));
        txtColor.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtColor.setEnabled(false);
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 150, -1));

        btnEliminarS.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btEliminar58px.png"))); // NOI18N
        btnEliminarS.setBorderPainted(false);
        btnEliminarS.setContentAreaFilled(false);
        btnEliminarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarS.setFocusPainted(false);
        btnEliminarS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarS.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btEliminar72px.png"))); // NOI18N
        btnEliminarS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btEliminar72px.png"))); // NOI18N
        btnEliminarS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 140, 130));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        jPanel1.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -220, 610, 880));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 460, 510));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMaderoso.jpg"))); // NOI18N
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -10, 660, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        C0GestionarVehiculos atras = new C0GestionarVehiculos(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
        atras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed

            CG1AgregarVehiculo adelante = new CG1AgregarVehiculo(jsonClientes,jsonVehiculos, jsonUsuarios,jsonVentas); 
            adelante.setVisible(true);
           this.dispose();  
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (control.hayAlguien(jsonVehiculos)){
            CG2ModificarVehiculo adelante = new  CG2ModificarVehiculo(jsonClientes,jsonVehiculos,jsonUsuarios,jsonVentas); 
            adelante.setVisible(true);
            this.dispose();          

         }else{
             JOptionPane.showMessageDialog(null, "No hay vehiculos en el sistema.");
         }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void btnACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACEPTARActionPerformed
          if (!txtPlaca.getText().equals("") ){
            Boolean bandera = control.verificarPlacaVehiculoJson(jsonVehiculos, txtPlaca.getText()); 
            if (bandera){
                btnACEPTAR.setVisible(false);
                jPanel1.setVisible(true);
                Vehiculo vehiculoJson = control.crearVehiculoDelJson(jsonVehiculos, txtPlaca.getText());             
                txtMarca1.setText(vehiculoJson.getMarca());
                txtAno.setText(String.valueOf(vehiculoJson.getAno()));
                txtPais.setText(vehiculoJson.getPaismanufactura());
                txtModelo.setText(vehiculoJson.getModelo());
                txtTmotor.setText(vehiculoJson.getTipoMotor());
                txtNSM.setText(String.valueOf(vehiculoJson.getNumSerieMotor()));
                txtNSC.setText(String.valueOf(vehiculoJson.getNumSerieChasis()));
                txtKilometraje.setText(String.valueOf(vehiculoJson.getKilometraje()));
                txtColor.setText(vehiculoJson.getColor()); 
            }else{
                JOptionPane.showMessageDialog(null, "La placa no esta en el sistema.");
                btnACEPTAR.setVisible(true);
                txtPlaca.setText("");
            }    
        }else{            
            JOptionPane.showMessageDialog(null, "Rellene el campo de la cedula, por favor.");
        }
    }//GEN-LAST:event_btnACEPTARActionPerformed

    private void btnEliminarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSActionPerformed
        
        if (!txtMarca1.getText().equals("") && !txtAno.getText().equals("") && !txtPais.getText().equals("") && !txtModelo.getText().equals("") && !txtTmotor.getText().equals("") && !txtNSM.getText().equals("") && !txtNSC.getText().equals("") && !txtKilometraje.getText().equals("") && !txtColor.getText().equals("")){
            int respuesta= JOptionPane.showConfirmDialog(null,"Seguro desea eliminar el vehiculo de placa = "+ txtPlaca.getText() + "?","Eliminar",JOptionPane.YES_NO_OPTION);
            if (respuesta==0){
  
                jsonVehiculos = control.eliminarVehiculoDelJson(jsonVehiculos, txtPlaca.getText()); 
                JOptionPane.showMessageDialog(null, "Se ha eliminado el vehiculo de placa "+ txtPlaca.getText() + " con exito.");
                btnACEPTAR.setVisible(true);                
                txtPlaca.setText("");
                txtMarca1.setText("");
                txtAno.setText("");
                txtPais.setText("");
                txtModelo.setText("");
                txtTmotor.setText("");
                txtNSM.setText("");
                txtNSC.setText("");
                txtKilometraje.setText("");
                txtColor.setText(""); 
                jPanel1.setVisible(false);
                txtPlaca.setEnabled(true);
        //ACA ACTUALIZA EL ARCHIVO
                  StringWriter out1 = new StringWriter(); 
                  try {
                        jsonVehiculos.writeJSONString(out1);                     
                  } catch (IOException e) {
                        e.printStackTrace(); 
                  }  
                  String archivoVehiculos = out1.toString();
                  try{
                        FileWriter file = new FileWriter("src/Archivos/2myJSONVehiculos.json");
                        file.write(archivoVehiculos);
                        file.flush();
                        file.close();	
                  }catch(Exception ex){
                        System.out.println("Error: "+ex.toString());
                  }
        //ACA ACTUALIZA EL ARCHIVO                
            }
        }else{        
            JOptionPane.showMessageDialog(null, "Rellenelos campos, por favor.");
        }       
    }//GEN-LAST:event_btnEliminarSActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir2ActionPerformed

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
            java.util.logging.Logger.getLogger(CG3EliminarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CG3EliminarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CG3EliminarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CG3EliminarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CG3EliminarVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida2;
    private javax.swing.JLabel actuales;
    private javax.swing.JLabel ano;
    private javax.swing.JButton btnACEPTAR;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnEliminarS;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel color;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kilometraje;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel modelo;
    private javax.swing.JLabel numeroDeSerieChasis;
    private javax.swing.JLabel numeroDeSerieMotor;
    private javax.swing.JLabel paisManufactura;
    private javax.swing.JLabel placa;
    private javax.swing.JLabel tipoMotor;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtKilometraje;
    private javax.swing.JTextField txtMarca1;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNSC;
    private javax.swing.JTextField txtNSM;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTmotor;
    // End of variables declaration//GEN-END:variables
}