
package boletin29;


public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public Principal() {
        initComponents();
      this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        btcerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JpBienbenido = new javax.swing.JPanel();
        JbCerrarCession = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        btcerrar.setText("Cerrar sesion");
        btcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcerrarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        JpBienbenido.setBackground(new java.awt.Color(204, 204, 255));
        JpBienbenido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JpBienbenido.setName(""); // NOI18N

        JbCerrarCession.setBackground(new java.awt.Color(204, 204, 204));
        JbCerrarCession.setText("Cerrar sesion");
        JbCerrarCession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCerrarCessionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("¡Bienvenido!");

        javax.swing.GroupLayout JpBienbenidoLayout = new javax.swing.GroupLayout(JpBienbenido);
        JpBienbenido.setLayout(JpBienbenidoLayout);
        JpBienbenidoLayout.setHorizontalGroup(
            JpBienbenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpBienbenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(JpBienbenidoLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(JbCerrarCession, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpBienbenidoLayout.setVerticalGroup(
            JpBienbenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpBienbenidoLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(JbCerrarCession, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(168, 168, 168))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JpBienbenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpBienbenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcerrarActionPerformed
      
        
    }//GEN-LAST:event_btcerrarActionPerformed

    private void JbCerrarCessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCerrarCessionActionPerformed
      /*   Ventana1 ventana = new Ventana1();
        ventana.show();
        this.dispose();*/
    }//GEN-LAST:event_JbCerrarCessionActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbCerrarCession;
    private javax.swing.JPanel JpBienbenido;
    public javax.swing.JButton btcerrar;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
