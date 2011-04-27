/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DrzwiPanel.java
 *
 * Created on 2011-04-23, 17:37:47
 */
package View;

import Controller.ElementyBudynku.Urzadzenie;
import Model.DAO.MsUrzadzenieDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author matemroz
 */
public class DrzwiPanel extends javax.swing.JDialog {

    /** Creates new form DrzwiPanel */
    public DrzwiPanel(java.awt.Frame parent, boolean modal, List<Integer> urzadzenia, int idPokoju) {

        super(parent, modal);
        modelLstDrzwi = new DefaultListModel();
        this.urzadzenia = urzadzenia;
        this.idPokoju = idPokoju;

        for (int i = 0; i < urzadzenia.size(); i++) {
            String nazwaUrzadzenia = (new Urzadzenie(urzadzenia.get(i))).pobierzNazwa();
            if (nazwaUrzadzenia.equals("Drzwi")) {
                modelLstDrzwi.addElement(nazwaUrzadzenia + "#" + urzadzenia.get(i));
            }
        }
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstDrzwi = new javax.swing.JList(modelLstDrzwi);
        jLabel1 = new javax.swing.JLabel();
        btnOtworz = new javax.swing.JButton();
        btnZamknij = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lStan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnUsun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        lstDrzwi.setName("lstDrzwi"); // NOI18N
        lstDrzwi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstDrzwiMouseClicked(evt);
            }
        });
        lstDrzwi.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDrzwiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstDrzwi);

        jLabel1.setText("Lista drzwi:");
        jLabel1.setName("jLabel1"); // NOI18N

        btnOtworz.setText("Otwórz");
        btnOtworz.setName("btnOtworz"); // NOI18N
        btnOtworz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOtworzMouseClicked(evt);
            }
        });

        btnZamknij.setText("Zamknij");
        btnZamknij.setName("btnZamknij"); // NOI18N
        btnZamknij.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnZamknijMouseClicked(evt);
            }
        });

        jLabel2.setText("Stan:");
        jLabel2.setName("jLabel2"); // NOI18N

        lStan.setFont(new java.awt.Font("Tahoma", 1, 11));
        lStan.setText("...");
        lStan.setName("lStan"); // NOI18N

        jLabel4.setText("Obsługa drzwi");
        jLabel4.setName("jLabel4"); // NOI18N

        jSeparator1.setName("jSeparator1"); // NOI18N

        jLabel5.setText("Zarządzanie drzwiami:");
        jLabel5.setName("jLabel5"); // NOI18N

        btnDodaj.setText("Dodaj");
        btnDodaj.setName("btnDodaj"); // NOI18N
        btnDodaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDodajMouseClicked(evt);
            }
        });

        btnUsun.setText("Usuń");
        btnUsun.setName("btnUsun"); // NOI18N
        btnUsun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsunMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addGap(18, 18, 18)
                                .addComponent(btnUsun))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnOtworz)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnZamknij))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lStan))
                                .addComponent(jLabel5))))
                    .addComponent(jLabel1))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnUsun))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOtworz)
                            .addComponent(btnZamknij))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lStan)
                            .addComponent(jLabel2))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-336)/2, (screenSize.height-338)/2, 336, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void lstDrzwiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstDrzwiMouseClicked
    }//GEN-LAST:event_lstDrzwiMouseClicked

    private void btnDodajMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajMouseClicked
        int idUrzadzenia = (new Urzadzenie()).dodaj(idPokoju);
        new Urzadzenie(idUrzadzenia).ustawNazwa("Drzwi");
        (new MsUrzadzenieDAO()).ustawStan(idUrzadzenia, "Zamknięte");
        modelLstDrzwi.addElement("Drzwi" + "#" + idUrzadzenia);
    }//GEN-LAST:event_btnDodajMouseClicked

    private void btnUsunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsunMouseClicked
        String selected = lstDrzwi.getSelectedValue().toString();
        int id = Integer.parseInt(selected.split("#")[1]);
        (new Urzadzenie()).usun(id);
        modelLstDrzwi.removeElement(lstDrzwi.getSelectedValue());
    }//GEN-LAST:event_btnUsunMouseClicked

    private void btnOtworzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOtworzMouseClicked
        if (lstDrzwi.getSelectedValue() != null) {
            String selected = lstDrzwi.getSelectedValue().toString();
            int id = Integer.parseInt(selected.split("#")[1]);
            (new MsUrzadzenieDAO()).ustawStan(id, "Otwarte");
            lStan.setText("Otwarte");
        }
    }//GEN-LAST:event_btnOtworzMouseClicked

    private void btnZamknijMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZamknijMouseClicked
        if (lstDrzwi.getSelectedValue() != null) {
            String selected = lstDrzwi.getSelectedValue().toString();
            int id = Integer.parseInt(selected.split("#")[1]);
            (new MsUrzadzenieDAO()).ustawStan(id, "Zamknięte");
            lStan.setText("Zamknięte");
        }
    }//GEN-LAST:event_btnZamknijMouseClicked

    private void lstDrzwiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDrzwiValueChanged
        if (lstDrzwi.getSelectedValue() != null) {
            String selected = lstDrzwi.getSelectedValue().toString();
            int id = Integer.parseInt(selected.split("#")[1]);
            String stan = (new MsUrzadzenieDAO()).pobierzStan(id);
            lStan.setText(stan);
        }
    }//GEN-LAST:event_lstDrzwiValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DrzwiPanel dialog = new DrzwiPanel(new javax.swing.JFrame(), true, new ArrayList<Integer>(), 0);
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
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnOtworz;
    private javax.swing.JButton btnUsun;
    private javax.swing.JButton btnZamknij;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lStan;
    private javax.swing.JList lstDrzwi;
    // End of variables declaration//GEN-END:variables
    private DefaultListModel modelLstDrzwi;
    private List<Integer> urzadzenia;
    private int idPokoju;
}
