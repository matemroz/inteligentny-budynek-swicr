/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EdytujPokoj.java
 *
 * Created on 2011-04-23, 19:32:32
 */

package View;

import Controller.ElementyBudynku.Budynek;
import Model.Utils.DatabaseUtils;

/**
 *
 * @author matemroz
 */
public class EdytujPokoj extends javax.swing.JDialog {

    /** Creates new form EdytujPokoj */
    public EdytujPokoj(java.awt.Frame parent, boolean modal, String s, int idListy) {
        super(parent, modal);
        initComponents();
        this.s = s;
        tfNazwaPokoju.setText(s.split("#")[0]);
        this.index = Integer.parseInt(s.split("#")[1]);
        this.idListy = idListy;
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
        btnEdytujPokoj = new javax.swing.JButton();
        tfNazwaPokoju = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edytuj pokój");

        jLabel1.setText("Nazwa:");
        jLabel1.setName("jLabel1"); // NOI18N

        btnEdytujPokoj.setText("Edytuj");
        btnEdytujPokoj.setName("btnEdytujPokoj"); // NOI18N
        btnEdytujPokoj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEdytujPokojMouseClicked(evt);
            }
        });

        tfNazwaPokoju.setName("tfNazwaPokoju"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdytujPokoj)
                    .addComponent(tfNazwaPokoju, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNazwaPokoju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdytujPokoj)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-186)/2, (screenSize.height-105)/2, 186, 105);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEdytujPokojMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdytujPokojMouseClicked
        if (!tfNazwaPokoju.getText().equals(s)) {
            DatabaseUtils.updateCommand("Pokoj", "nazwa", "'" + tfNazwaPokoju.getText() + "'", "idPokoju = '" + index + "'");
            (View.ProjektorPanel.getLstPokoje()).set(idListy, tfNazwaPokoju.getText()+"#"+index);
            dispose();

        }
    }//GEN-LAST:event_btnEdytujPokojMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EdytujPokoj dialog = new EdytujPokoj(new javax.swing.JFrame(), true, new String(), 0);
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
    private javax.swing.JButton btnEdytujPokoj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfNazwaPokoju;
    // End of variables declaration//GEN-END:variables
    private String s;
    private int index;
    private int idListy;

}