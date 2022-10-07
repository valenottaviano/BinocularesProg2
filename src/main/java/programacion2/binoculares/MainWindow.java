package programacion2.binoculares;
public class MainWindow extends javax.swing.JFrame {
    
    public MainWindow() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        arriba = new javax.swing.JButton();
        derecha = new javax.swing.JButton();
        abajo = new javax.swing.JButton();
        izquierda = new javax.swing.JButton();
        dialog = new javax.swing.JLabel();
        observacionesScrollPane = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        observacionesLabel = new javax.swing.JLabel();
        modeloInput = new javax.swing.JTextField();
        modeloLabel = new javax.swing.JLabel();
        distanciaFocalLabel = new javax.swing.JLabel();
        distanciaFocalInput = new javax.swing.JTextField();
        aperturaLabel = new javax.swing.JLabel();
        aperturaInput = new javax.swing.JTextField();
        configurarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Simulador de uso de BINOCULARES");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        arriba.setText("↑");
        arriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaActionPerformed(evt);
            }
        });

        derecha.setText("→");
        derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derechaActionPerformed(evt);
            }
        });

        abajo.setText("↓");
        abajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoActionPerformed(evt);
            }
        });

        izquierda.setText("←");
        izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izquierdaActionPerformed(evt);
            }
        });

        dialog.setText("<html>¡Hola! Bienvenido al simulador para observar la naturaleza.<br/>Estás en los cerros tucumanos, más específicamente en San Javier. La Sierra San Javier se ubica al oeste de la ciudad de San Miguel de Tucumán, entre los 26°38' y los 26°5' de latitud sur, y los 65°06' y 65°20' de longitud oeste.\\n\\n¡Esperamos que lo disfrutes!<br/>Para proceder, por favor ingresa el modelo de los binoculares que quieras utilizar.");
        dialog.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        dialog.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        observacionesScrollPane.setViewportView(jList1);

        observacionesLabel.setText("Observaciones");

        modeloLabel.setText("Modelo de Binocular");

        distanciaFocalLabel.setText("Distancia focal");

        aperturaLabel.setText("Apertura");

        aperturaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aperturaInputActionPerformed(evt);
            }
        });

        configurarBtn.setText("Configurar");
        configurarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configurarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dialog, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(abajo)
                                    .addComponent(arriba))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(izquierda)
                                .addGap(56, 56, 56)
                                .addComponent(derecha)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(titulo)
                                .addGap(172, 172, 172))
                            .addComponent(observacionesLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(observacionesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modeloLabel)
                                    .addComponent(modeloInput, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(distanciaFocalLabel)
                                    .addComponent(distanciaFocalInput, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aperturaLabel)
                                    .addComponent(aperturaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(configurarBtn)))))
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(observacionesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(modeloLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modeloInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(distanciaFocalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(distanciaFocalInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aperturaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aperturaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(configurarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arriba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(derecha)
                            .addComponent(izquierda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abajo)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(observacionesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(dialog, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaActionPerformed
        setDireccion("arriba");
        dialog.setText("La dirección actual es: Arriba");
    }//GEN-LAST:event_arribaActionPerformed

    private void abajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoActionPerformed
        setDireccion("abajo");
        dialog.setText("La dirección actual es: Abajo");
    }//GEN-LAST:event_abajoActionPerformed

    private void derechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derechaActionPerformed
        setDireccion("derecha");
        dialog.setText("La dirección actual es: Derecha");
    }//GEN-LAST:event_derechaActionPerformed

    private void configurarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configurarBtnActionPerformed
        setModelo(modeloInput.getText());
        setDistancia(Double.parseDouble(distanciaFocalInput.getText()));
        setApertura(Double.parseDouble(aperturaInput.getText()));
        dialog.setText(convertToMultiline("¡Excelente elección! Binoculares configurados correctamente. \n Listos para comenzar la aventura."));
    }//GEN-LAST:event_configurarBtnActionPerformed

    private void aperturaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aperturaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aperturaInputActionPerformed

    private void izquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izquierdaActionPerformed
        setDireccion("izquierda");
        dialog.setText("La dirección actual es: Izquierda");
    }//GEN-LAST:event_izquierdaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getApertura() {
        return apertura;
    }

    public void setApertura(double apertura) {
        this.apertura = apertura;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abajo;
    private javax.swing.JTextField aperturaInput;
    private javax.swing.JLabel aperturaLabel;
    private javax.swing.JButton arriba;
    private javax.swing.JButton configurarBtn;
    private javax.swing.JButton derecha;
    private javax.swing.JLabel dialog;
    private javax.swing.JTextField distanciaFocalInput;
    private javax.swing.JLabel distanciaFocalLabel;
    private javax.swing.JButton izquierda;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField modeloInput;
    private javax.swing.JLabel modeloLabel;
    private javax.swing.JLabel observacionesLabel;
    private javax.swing.JScrollPane observacionesScrollPane;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
    private String modelo = "";
    private double distancia = 0;
    private double apertura = 0;
    private String direccion = "";
    
    
    public static String convertToMultiline(String orig)
{
        return "<html>" + orig.replaceAll("\n", "<br>");
    }
}
