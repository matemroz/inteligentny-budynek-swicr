package View;

import Controller.ElementyBudynku.Budynek;
import java.util.List;

public class DodajBudynek extends javax.swing.JDialog {

    public DodajBudynek(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfNazwaBudynku = new javax.swing.JTextField();
        btnDodajBudynek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dodaj budynek");

        jLabel1.setText("Nazwa:");
        jLabel1.setName("jLabel1"); // NOI18N

        tfNazwaBudynku.setName("tfNazwaBudynku"); // NOI18N

        btnDodajBudynek.setText("Dodaj");
        btnDodajBudynek.setName("btnDodajBudynek"); // NOI18N
        btnDodajBudynek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDodajBudynekMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNazwaBudynku, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnDodajBudynek)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNazwaBudynku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnDodajBudynek)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-211)/2, (screenSize.height-131)/2, 211, 131);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajBudynekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajBudynekMouseClicked
        Budynek b = new Budynek();
        b.dodajBudynek(tfNazwaBudynku.getText());
        List<Integer> lstBud = b.pobierzListeBudynkow();
       int id = 0;
        if(lstBud != null){
            id = lstBud.get(lstBud.size()-1);
        }

        (View.ProjektorPanel.getLstBudynki()).add(View.ProjektorPanel.getLstBudynki().getSize(),  tfNazwaBudynku.getText() + "#" + id);
        dispose();
    }//GEN-LAST:event_btnDodajBudynekMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DodajBudynek dialog = new DodajBudynek(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDodajBudynek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfNazwaBudynku;
    // End of variables declaration//GEN-END:variables
}
