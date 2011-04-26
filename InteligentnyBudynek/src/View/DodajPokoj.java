package View;

import Controller.ElementyBudynku.Pietro;

public class DodajPokoj extends javax.swing.JDialog {

    /** Creates new form DodajPokoj */
    public DodajPokoj(java.awt.Frame parent, boolean modal, int idPietra) {
        super(parent, modal);
        initComponents();
        this.idPietra = idPietra;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfNazwaPokoju = new javax.swing.JTextField();
        btnDodajPokoj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dodaj pokój");

        jLabel1.setText("Nazwa:");
        jLabel1.setName("jLabel1"); // NOI18N

        tfNazwaPokoju.setName("tfNazwaPokoju"); // NOI18N

        btnDodajPokoj.setText("Dodaj");
        btnDodajPokoj.setName("btnDodajPokoj"); // NOI18N
        btnDodajPokoj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDodajPokojMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDodajPokoj)
                    .addComponent(tfNazwaPokoju, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNazwaPokoju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDodajPokoj)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-184)/2, (screenSize.height-110)/2, 184, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajPokojMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajPokojMouseClicked
        Pietro p = new Pietro(idPietra);
        int id = p.dodajPokoj(tfNazwaPokoju.getText(), idPietra);
        (View.ProjektorPanel.getLstPokoje()).add(View.ProjektorPanel.getLstPokoje().getSize(), tfNazwaPokoju.getText() + "#" + id);
        dispose();
    }//GEN-LAST:event_btnDodajPokojMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DodajPokoj dialog = new DodajPokoj(new javax.swing.JFrame(), true, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajPokoj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfNazwaPokoju;
    // End of variables declaration//GEN-END:variables
    private int idPietra;
}
