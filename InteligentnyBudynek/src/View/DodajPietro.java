package View;

import Controller.ElementyBudynku.Pietro;

public class DodajPietro extends javax.swing.JDialog {

    /** Creates new form DodajPietro */
    public DodajPietro(java.awt.Frame parent, boolean modal, int idBudynku) {
        super(parent, modal);
        initComponents();
        this.idBudynku = idBudynku;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfNazwaPietra = new javax.swing.JTextField();
        btnDodajPietro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dodaj piętro");

        jLabel1.setText("Nazwa: ");
        jLabel1.setName("jLabel1"); // NOI18N

        tfNazwaPietra.setName("tfNazwaPietra"); // NOI18N

        btnDodajPietro.setText("Dodaj");
        btnDodajPietro.setName("btnDodajPietro"); // NOI18N
        btnDodajPietro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDodajPietroMouseClicked(evt);
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
                    .addComponent(btnDodajPietro)
                    .addComponent(tfNazwaPietra, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNazwaPietra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDodajPietro)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-185)/2, (screenSize.height-105)/2, 185, 105);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajPietroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajPietroMouseClicked
        Pietro p = new Pietro();
        int id = p.dodajPietro(tfNazwaPietra.getText(), idBudynku);
        (View.ProjektorPanel.getLstPietra()).add(View.ProjektorPanel.getLstPietra().getSize(), tfNazwaPietra.getText() + "#" + id);
        dispose();
    }//GEN-LAST:event_btnDodajPietroMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DodajPietro dialog = new DodajPietro(new javax.swing.JFrame(), true, 0);
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
    private javax.swing.JButton btnDodajPietro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfNazwaPietra;
    // End of variables declaration//GEN-END:variables
    private int idBudynku;
}
