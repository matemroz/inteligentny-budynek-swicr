/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * KosztyView.java
 *
 * Created on 2011-04-06, 00:51:06
 */

package View.budynek;

import Controller.Utils.Konwerter;
import Model.DAO.MsGazPradDAO;
import Model.DAO.MsPokojDAO;
import Model.DAO.MsUrzadzenieDAO;
import Model.Utils.ConnectionManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

/**
 *
 * @author beniu
 */
public class KosztyView extends javax.swing.JDialog {

    /** Creates new form KosztyView */
    public KosztyView() throws SQLException {
        super();
        ConnectionManager.getDatabaseConnection();
        initList();
        initComponents();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaUrzadzen = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("Koszty");
        jLabel1.setName("jLabelKoszty"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jListaUrzadzen.setModel(listModel);
        jListaUrzadzen.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListaUrzadzen.setName("jListaUrzadzen"); // NOI18N
        jListaUrzadzen.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListaUrzadzenValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListaUrzadzen);

        jLabel2.setText("Czas pracy:");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText("Koszt:");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText("00:00:00");
        jLabel4.setName("jLabel4"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListaUrzadzenValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListaUrzadzenValueChanged
            int selected = jListaUrzadzen.getSelectedIndex();
            double prad = (new MsGazPradDAO()).pobierzCenePradu();
            MsUrzadzenieDAO dao = new MsUrzadzenieDAO();
            int idUrzadzenia = (Integer) list.get(selected);
            int czas = dao.pobierzCzasPracy(idUrzadzenia);//czas pracy
            double moc = dao.pobierzMoc(idUrzadzenia);//moc
            jLabel4.setText(Konwerter.czasSekNaGodz(czas));//wyswietlanie czasu
            double kwh = czas*moc/3600;//TODO: dla kWh dzielenie przez 3,600,000
            jLabel5.setText(kwh*prad+" zł");//wyswietlanie mocy
    }//GEN-LAST:event_jListaUrzadzenValueChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KosztyView dialog;
                try {
                    dialog = new KosztyView();
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                            try {
                                ConnectionManager.disconnectFromDatabase();
                                System.exit(0);
                            } catch (SQLException ex) {
                                Logger.getLogger(KosztyView.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
                });
                dialog.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(KosztyView.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
    }

    private void initList() throws SQLException{//wczytywanie nazw urzadzen z bazy danych do listy
        //ConnectionManager.getDatabaseConnection();
        listModel = new DefaultListModel();

        int idPokoju = 1;//TODO: dla wszystkich pokojów
        int n;
        list = (new MsPokojDAO()).wylistujUrzadzenia(idPokoju);
        n = list.size();
        String nazwaUrzadzenia;
        for (int i = 0; i < n; i++) {
            nazwaUrzadzenia = (new MsUrzadzenieDAO()).pobierzNazwa((Integer)list.get(i));
            listModel.addElement(nazwaUrzadzenia);
        }

        //ConnectionManager.disconnectFromDatabase();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jListaUrzadzen;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private DefaultListModel listModel;
    List list;
}
