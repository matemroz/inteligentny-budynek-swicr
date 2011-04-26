package View;

import Controller.ElementyBudynku.Alarm;
import Controller.ElementyBudynku.AnalizatorGazow;
import Controller.ElementyBudynku.CzujnikRuchu;
import Controller.ElementyBudynku.CzujnikTemperatury;
import Controller.ElementyBudynku.Gniazdko;
import Controller.ElementyBudynku.Klimatyzator;
import Controller.ElementyBudynku.PunktGrzewczy;
import Controller.ElementyBudynku.PunktSwietlny;
import Controller.ElementyBudynku.Urzadzenie;
import Controller.ElementyBudynku.ZraszaczPrzeciwpozarowy;

public class DodajUrzadzenie extends javax.swing.JDialog {

    public DodajUrzadzenie(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDodajUrzadzenie = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbTypUrzadzenia = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnDodajUrzadzenie.setText("Dodaj urządzenie");
        btnDodajUrzadzenie.setName("btnDodajUrzadzenie"); // NOI18N
        btnDodajUrzadzenie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDodajUrzadzenieMouseClicked(evt);
            }
        });

        jLabel1.setText("Typ urządzenia:");
        jLabel1.setName("jLabel1"); // NOI18N

        cbTypUrzadzenia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "wybierz...", "Alarm", "Analizator gazów", "Czujnik ruchu", "Czujnik temperatury", "Gniazdko", "Klimatyzator", "Punkt grzewczy", "Punkt świetlny", "Zraszacz przeciwpożarowy" }));
        cbTypUrzadzenia.setName("cbTypUrzadzenia"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTypUrzadzenia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnDodajUrzadzenie)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbTypUrzadzenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnDodajUrzadzenie)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-267)/2, (screenSize.height-118)/2, 267, 118);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajUrzadzenieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajUrzadzenieMouseClicked
        if (!cbTypUrzadzenia.getSelectedItem().equals(null) || !cbTypUrzadzenia.getSelectedItem().toString().equals("wybierz...")) {
            String typUrzadzenia = cbTypUrzadzenia.getSelectedItem().toString();

            int idUrzadzenia = 0;
            int idPokoju = View.UrzadzeniaPanel.getIdPokoju();

            if (typUrzadzenia.equals("Alarm")) {
                idUrzadzenia = (new Alarm(idPokoju)).getIdUrzadzenia();
            }
            if (typUrzadzenia.equals("Analizator gazów")) {
                idUrzadzenia = new AnalizatorGazow(idPokoju).getIdUrzadzenia();
            }
            if (typUrzadzenia.equals("Czujnik ruchu")) {
                idUrzadzenia = new CzujnikRuchu(idPokoju).getIdUrzadzenia();
            }
            if (typUrzadzenia.equals("Czujnik temperatury")) {
                idUrzadzenia = new CzujnikTemperatury(idPokoju).getIdUrzadzenia();
            }
            if (typUrzadzenia.equals("Gniazdko")) {
                idUrzadzenia = new Gniazdko(idPokoju).getIdUrzadzenia();
            }
            if (typUrzadzenia.equals("Klimatyzator")) {
                idUrzadzenia = new Klimatyzator(idPokoju).getIdUrzadzenia();
                new Urzadzenie(idUrzadzenia).ustawPoziomPracy(1);
            }
            if (typUrzadzenia.equals("Punkt grzewczy")) {
                idUrzadzenia = new PunktGrzewczy(idPokoju).getIdUrzadzenia();
                new Urzadzenie(idUrzadzenia).ustawPoziomPracy(1);
            }
            if (typUrzadzenia.equals("Punkt świetlny")) {
                idUrzadzenia = new PunktSwietlny(idPokoju).getIdUrzadzenia();
                new Urzadzenie(idUrzadzenia).ustawPoziomPracy(1);
            }
            if (typUrzadzenia.equals("Zraszacz przeciwpożarowy")) {
                idUrzadzenia = new ZraszaczPrzeciwpozarowy(idPokoju).getIdUrzadzenia();
            }

            View.UrzadzeniaPanel.getLstUrzadzenia().addElement(typUrzadzenia + "#" + idUrzadzenia);
            dispose();
        }
    }//GEN-LAST:event_btnDodajUrzadzenieMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DodajUrzadzenie dialog = new DodajUrzadzenie(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDodajUrzadzenie;
    private javax.swing.JComboBox cbTypUrzadzenia;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
