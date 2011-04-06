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
    public KosztyView(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initList();
        initComponents();
        
        //jListaUrzadzen = new JList(listModel);
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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

        jTextField1.setName("jTFCzas"); // NOI18N

        jTextField2.setName("jTFKoszt"); // NOI18N

        jLabel2.setText("Czas pracy:");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText("Koszt:");
        jLabel3.setName("jLabel3"); // NOI18N

        jButton1.setText("OK");
        jButton1.setName("jButtonOK"); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addContainerGap())
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
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.out.println("aaa");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jListaUrzadzenValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListaUrzadzenValueChanged
        int selected = jListaUrzadzen.getSelectedIndex();
        //TODO:liczenie kosztów

        int czas = (new MsUrzadzenieDAO()).pobierzCzasPracy((Integer)list.get(selected));
        System.out.println();
    }//GEN-LAST:event_jListaUrzadzenValueChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KosztyView dialog;
                try {
                    dialog = new KosztyView(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
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
        ConnectionManager.getDatabaseConnection();
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

        ConnectionManager.disconnectFromDatabase();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jListaUrzadzen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private DefaultListModel listModel;
    List list;
}
