package View;

import Controller.ElementyBudynku.Budynek;
import Controller.ElementyBudynku.Pietro;
import Controller.ElementyBudynku.Pokoj;
import Model.DAO.MsBudynekDAO;
import Model.Utils.DatabaseUtils;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class ProjektorPanel extends javax.swing.JDialog {

    public ProjektorPanel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        modelLstBudynki = new DefaultListModel();
        Budynek b = new Budynek();
       
        List<Integer> lstBud = b.pobierzListeBudynkow();
        Iterator<Integer> itBud = lstBud.iterator();
        while (itBud.hasNext()) {
            int index = itBud.next();
            modelLstBudynki.addElement(Controller.Utils.Formater.formatujID(index, new Budynek(index).getNazwa()));
        }

        modelLstPietra = new DefaultListModel();
        modelLstPokoje = new DefaultListModel();
        initComponents();
    }

    public static DefaultListModel getLstBudynki() {
        return modelLstBudynki;
    }

    public static DefaultListModel getLstPietra() {
        return modelLstPietra;
    }

    public static DefaultListModel getLstPokoje() {
        return modelLstPokoje;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstBudynki = new javax.swing.JList(modelLstBudynki);
        btnDodajBudynek = new javax.swing.JButton();
        btnEdytujBudynek = new javax.swing.JButton();
        btnUsunBudynek = new javax.swing.JButton();
        btnUsunPietro = new javax.swing.JButton();
        btnEdytujPietro = new javax.swing.JButton();
        btnDodajPietro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPietra = new javax.swing.JList(modelLstPietra);
        jLabel2 = new javax.swing.JLabel();
        btnUsunPokoj = new javax.swing.JButton();
        btnEdytujPokoj = new javax.swing.JButton();
        btnDodajPokoj = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstPokoje = new javax.swing.JList(modelLstPokoje);
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Projektor");
        setResizable(false);

        jLabel1.setText("Budynki:");
        jLabel1.setName("jLabel1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        lstBudynki.setName("lstBudynki"); // NOI18N
        lstBudynki.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstBudynkiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstBudynki);

        btnDodajBudynek.setText("Dodaj");
        btnDodajBudynek.setActionCommand("btnDodajBudynek");
        btnDodajBudynek.setName("btnDodajBudynek"); // NOI18N
        btnDodajBudynek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDodajBudynekMouseClicked(evt);
            }
        });

        btnEdytujBudynek.setText("Edytuj");
        btnEdytujBudynek.setName("btnEdytujBudynek"); // NOI18N
        btnEdytujBudynek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEdytujBudynekMouseClicked(evt);
            }
        });

        btnUsunBudynek.setText("Usuń");
        btnUsunBudynek.setName("btnUsunBudynek"); // NOI18N
        btnUsunBudynek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsunBudynekMouseClicked(evt);
            }
        });

        btnUsunPietro.setText("Usuń");
        btnUsunPietro.setName("btnUsunPietro"); // NOI18N
        btnUsunPietro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsunPietroMouseClicked(evt);
            }
        });

        btnEdytujPietro.setText("Edytuj");
        btnEdytujPietro.setName("btnEdytujPietro"); // NOI18N
        btnEdytujPietro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEdytujPietroMouseClicked(evt);
            }
        });

        btnDodajPietro.setText("Dodaj");
        btnDodajPietro.setName("btnDodajPietro"); // NOI18N
        btnDodajPietro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDodajPietroMouseClicked(evt);
            }
        });

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        lstPietra.setName("lstPietra"); // NOI18N
        lstPietra.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPietraValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstPietra);

        jLabel2.setText("Piętra:");
        jLabel2.setName("jLabel2"); // NOI18N

        btnUsunPokoj.setText("Usuń");
        btnUsunPokoj.setName("btnUsunPokoj"); // NOI18N
        btnUsunPokoj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsunPokojMouseClicked(evt);
            }
        });

        btnEdytujPokoj.setText("Edytuj");
        btnEdytujPokoj.setName("btnEdytujPokoj"); // NOI18N
        btnEdytujPokoj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEdytujPokojMouseClicked(evt);
            }
        });

        btnDodajPokoj.setText("Dodaj");
        btnDodajPokoj.setName("btnDodajPokoj"); // NOI18N
        btnDodajPokoj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDodajPokojMouseClicked(evt);
            }
        });

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        lstPokoje.setName("lstPokoje"); // NOI18N
        jScrollPane3.setViewportView(lstPokoje);

        jLabel3.setText("Pokoje:");
        jLabel3.setName("jLabel3"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsunBudynek)
                            .addComponent(btnEdytujBudynek)
                            .addComponent(btnDodajBudynek)))
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsunPietro)
                            .addComponent(btnEdytujPietro)
                            .addComponent(btnDodajPietro)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsunPokoj)
                            .addComponent(btnEdytujPokoj)
                            .addComponent(btnDodajPokoj)))
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnDodajPokoj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdytujPokoj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUsunPokoj))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnDodajPietro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdytujPietro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUsunPietro))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnDodajBudynek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdytujBudynek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUsunBudynek))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-630)/2, (screenSize.height-392)/2, 630, 392);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajBudynekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajBudynekMouseClicked
        DodajBudynek dodajBudynek = new DodajBudynek(new JFrame(), true);
        dodajBudynek.setVisible(true);
    }//GEN-LAST:event_btnDodajBudynekMouseClicked

    private void btnEdytujBudynekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdytujBudynekMouseClicked
        if (lstBudynki.getSelectedValue() != null) {
            String s = lstBudynki.getSelectedValue().toString();
            int index = lstBudynki.getSelectedIndex();
            EdytujBudynek edytujBudynek = new EdytujBudynek(new JFrame(), true, s, index);
            edytujBudynek.setVisible(true);
        }
    }//GEN-LAST:event_btnEdytujBudynekMouseClicked

    private void btnUsunBudynekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsunBudynekMouseClicked
    if (lstBudynki.getSelectedValue() != null){
        String s = lstBudynki.getSelectedValue().toString();
        int index = lstBudynki.getSelectedIndex();
        int id = Integer.parseInt(s.split("#")[1]);
        boolean usun = new MsBudynekDAO().usun(id);
        modelLstBudynki.remove(index);
        lstBudynki.clearSelection();
         
    }
    }//GEN-LAST:event_btnUsunBudynekMouseClicked

    private void btnDodajPietroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajPietroMouseClicked
        DodajPietro dodajPietro = new DodajPietro(new JFrame(), true,
                Integer.parseInt(lstBudynki.getSelectedValue().toString().split("#")[1]));
        dodajPietro.setVisible(true);
    }//GEN-LAST:event_btnDodajPietroMouseClicked

    private void btnEdytujPietroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdytujPietroMouseClicked

        if (lstPietra.getSelectedValue() != null) {
            String s = lstPietra.getSelectedValue().toString();
            int index = lstPietra.getSelectedIndex();
            EdytujPietro edytujPietro = new EdytujPietro(new JFrame(), true, s, index);
            edytujPietro.setVisible(true);
        }
    }//GEN-LAST:event_btnEdytujPietroMouseClicked

    private void btnUsunPietroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsunPietroMouseClicked
           if (lstPietra.getSelectedValue() != null){
        String s = lstPietra.getSelectedValue().toString();
        int index = lstPietra.getSelectedIndex();
        int id = Integer.parseInt(s.split("#")[1]);
        DatabaseUtils.deleteCommand("Pietro", "idPietra='" + id + "'");
        modelLstPietra.remove(index);
        lstPietra.clearSelection();
        }
    }//GEN-LAST:event_btnUsunPietroMouseClicked

    private void btnDodajPokojMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajPokojMouseClicked
        DodajPokoj dodajPokoj = new DodajPokoj(new JFrame(), true,
                Integer.parseInt(lstPietra.getSelectedValue().toString().split("#")[1]));
        dodajPokoj.setVisible(true);
    }//GEN-LAST:event_btnDodajPokojMouseClicked

    private void btnUsunPokojMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsunPokojMouseClicked
        if (lstPokoje.getSelectedValue() != null){
        String s = lstPokoje.getSelectedValue().toString();
        int index = lstPokoje.getSelectedIndex();
        int id = Integer.parseInt(s.split("#")[1]);
        DatabaseUtils.deleteCommand("Pokoj", "idPokoju='" + id + "'");
        modelLstPokoje.remove(index);
        //lstPokoje.clearSelection();
        }
    }//GEN-LAST:event_btnUsunPokojMouseClicked

    private void lstBudynkiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstBudynkiValueChanged

        lstPietra.clearSelection();
        modelLstPietra.removeAllElements();
        lstPokoje.clearSelection();
        modelLstPokoje.removeAllElements();

        
        if( lstBudynki.isSelectionEmpty() == false){
            String s = lstBudynki.getSelectedValue().toString();
            int idBudynku = Integer.parseInt(s.split("#")[1]);
            Budynek b = new Budynek();
            List<Integer> lp = b.pobierzListePieter(idBudynku);
            Iterator<Integer> itBud = lp.iterator();
            while (itBud.hasNext()) {
                int index = itBud.next();
                modelLstPietra.addElement(Controller.Utils.Formater.formatujID(index, new Pietro(index).pobierzNazwe()));
            }
        }
    }//GEN-LAST:event_lstBudynkiValueChanged

    private void lstPietraValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPietraValueChanged
        int idBudynku = 0;
        int idPietra = 0;
        lstPokoje.clearSelection();
        modelLstPokoje.removeAllElements();
        if (lstBudynki.isSelectionEmpty() == false) {
            String sBudynek = lstBudynki.getSelectedValue().toString();
            idBudynku = Integer.parseInt(sBudynek.split("#")[1]);
        }
        if (lstPietra.isSelectionEmpty() == false) {
            String sPietro = lstPietra.getSelectedValue().toString();
            idPietra = Integer.parseInt(sPietro.split("#")[1]);
        }

        Pietro p = new Pietro(idPietra);

        List<Pokoj> lp = p.wylistujPokoje();
        Iterator<Pokoj> itBud = lp.iterator();
        while (itBud.hasNext()) {
            Pokoj pok = itBud.next();
            int idPokoju = pok.getIdPokoju();
            String nazwaPokoju = pok.getNazwa();
            modelLstPokoje.addElement(Controller.Utils.Formater.formatujID(idPokoju, nazwaPokoju));
        }
    }//GEN-LAST:event_lstPietraValueChanged

    private void btnEdytujPokojMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdytujPokojMouseClicked
        if (lstPokoje.getSelectedValue() != null) {
            String s = lstPokoje.getSelectedValue().toString();
            int index = lstPokoje.getSelectedIndex();
            EdytujPokoj edytujPokoj = new EdytujPokoj(new JFrame(), true, s, index);
            edytujPokoj.setVisible(true);
        }
    }//GEN-LAST:event_btnEdytujPokojMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                ProjektorPanel dialog = new ProjektorPanel(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDodajPietro;
    private javax.swing.JButton btnDodajPokoj;
    private javax.swing.JButton btnEdytujBudynek;
    private javax.swing.JButton btnEdytujPietro;
    private javax.swing.JButton btnEdytujPokoj;
    private javax.swing.JButton btnUsunBudynek;
    private javax.swing.JButton btnUsunPietro;
    private javax.swing.JButton btnUsunPokoj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private static javax.swing.JList lstBudynki;
    private javax.swing.JList lstPietra;
    private javax.swing.JList lstPokoje;
    // End of variables declaration//GEN-END:variables
    private static DefaultListModel modelLstBudynki;
    private static DefaultListModel modelLstPietra;
    private static DefaultListModel modelLstPokoje;
}
