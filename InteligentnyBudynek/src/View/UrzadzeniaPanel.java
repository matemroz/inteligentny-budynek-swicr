package View;

import Controller.ElementyBudynku.Urzadzenie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class UrzadzeniaPanel extends javax.swing.JDialog {

    public UrzadzeniaPanel(java.awt.Frame parent, boolean modal, List<Integer> urzadzenia, int idPokoju) {
        super(parent, modal);

        modelLstUrzadzenia = new DefaultListModel();
        this.urzadzenia = urzadzenia;
        Iterator it = urzadzenia.iterator();
        while (it.hasNext()) {
            int idUrzadzenia = (Integer) it.next();
            String nazwaUrzadzenia = (new Urzadzenie(idUrzadzenia)).pobierzNazwa();
            if (nazwaUrzadzenia.equals("Alarm") || nazwaUrzadzenia.equals("Analizator gazów") || nazwaUrzadzenia.equals("Czujnik ruchu")
                   || nazwaUrzadzenia.equals("Czujnik temperatury") || nazwaUrzadzenia.equals("Gniazdko") || nazwaUrzadzenia.equals("Klimatyzator")
                   || nazwaUrzadzenia.equals("Punkt grzewczy") || nazwaUrzadzenia.equals("Punkt świetlny") || nazwaUrzadzenia.equals("Zraszacz przeciwpożarowy")) {
                modelLstUrzadzenia.addElement((new Urzadzenie(idUrzadzenia)).pobierzNazwa() + "#" + idUrzadzenia);
            }
        }

        this.idPokoju = idPokoju;
        initComponents();
        btnWlacz.setEnabled(false);
        btnWylacz.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstUrzadzenia = new javax.swing.JList(modelLstUrzadzenia);
        jLabel1 = new javax.swing.JLabel();
        btnWlacz = new javax.swing.JButton();
        btnWylacz = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lStanPracy = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dda = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnUstawPlan = new javax.swing.JButton();
        btnUsunPlan = new javax.swing.JButton();
        btnUstawMoc = new javax.swing.JButton();
        btnDodajUrzadzenie = new javax.swing.JButton();
        btnUsunUrzadzenie = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbPoziomPracy = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lPoborGazu = new javax.swing.JLabel();
        lTemperatura = new javax.swing.JLabel();
        lMoc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Panel urządzeń");

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        lstUrzadzenia.setName("lstUrzadzenia"); // NOI18N
        lstUrzadzenia.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstUrzadzeniaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstUrzadzenia);

        jLabel1.setText("Lista urządzeń:");
        jLabel1.setName("jLabel1"); // NOI18N

        btnWlacz.setText("Włącz");
        btnWlacz.setName("btnWlacz"); // NOI18N
        btnWlacz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWlaczMouseClicked(evt);
            }
        });

        btnWylacz.setText("Wyłącz");
        btnWylacz.setName("btnWylacz"); // NOI18N
        btnWylacz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWylaczMouseClicked(evt);
            }
        });

        jLabel2.setText("Stan:");
        jLabel2.setName("jLabel2"); // NOI18N

        lStanPracy.setFont(new java.awt.Font("Tahoma", 1, 11));
        lStanPracy.setText("<stan pracy>");
        lStanPracy.setName("lStanPracy"); // NOI18N

        jSeparator1.setName("jSeparator1"); // NOI18N

        jLabel4.setText("Praca urządzenia:");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText("Parametry urządzenia:");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText("Moc:");
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel7.setText("Pobór gazu:");
        jLabel7.setName("jLabel7"); // NOI18N

        dda.setText("W");
        dda.setName("dda"); // NOI18N

        jLabel9.setText("m3");
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel10.setText("Plan pracy urządzenia:");
        jLabel10.setName("jLabel10"); // NOI18N

        jSeparator2.setName("jSeparator2"); // NOI18N

        jLabel11.setText("Data włączenia:");
        jLabel11.setName("jLabel11"); // NOI18N

        jLabel12.setText("Data wyłączenia:");
        jLabel12.setName("jLabel12"); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<rok>" }));
        jComboBox1.setName("jComboBox1"); // NOI18N

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<miesiąc>" }));
        jComboBox2.setName("jComboBox2"); // NOI18N

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<dzień>" }));
        jComboBox3.setName("jComboBox3"); // NOI18N

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<rok>" }));
        jComboBox4.setName("jComboBox4"); // NOI18N

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<miesiąc>" }));
        jComboBox5.setName("jComboBox5"); // NOI18N

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<dzień>" }));
        jComboBox6.setName("jComboBox6"); // NOI18N

        jTextField3.setName("jTextField3"); // NOI18N

        jTextField4.setName("jTextField4"); // NOI18N

        jLabel13.setText("HH:MM:SS");
        jLabel13.setName("jLabel13"); // NOI18N

        jLabel14.setText("HH:MM:SS");
        jLabel14.setName("jLabel14"); // NOI18N

        btnUstawPlan.setText("Ustaw plan");
        btnUstawPlan.setName("btnUstawPlan"); // NOI18N

        btnUsunPlan.setText("Usuń plan");
        btnUsunPlan.setName("btnUsunPlan"); // NOI18N

        btnUstawMoc.setText("ustaw");
        btnUstawMoc.setEnabled(false);
        btnUstawMoc.setName("btnUstawMoc"); // NOI18N
        btnUstawMoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUstawMocMouseClicked(evt);
            }
        });

        btnDodajUrzadzenie.setText("Dodaj urządzenie");
        btnDodajUrzadzenie.setName("btnDodajUrzadzenie"); // NOI18N
        btnDodajUrzadzenie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDodajUrzadzenieMouseClicked(evt);
            }
        });

        btnUsunUrzadzenie.setText("Usuń urządzenie");
        btnUsunUrzadzenie.setName("btnUsunUrzadzenie"); // NOI18N

        jLabel3.setText("Poziom pracy:");
        jLabel3.setName("jLabel3"); // NOI18N

        cbPoziomPracy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbPoziomPracy.setEnabled(false);
        cbPoziomPracy.setName("cbPoziomPracy"); // NOI18N

        jLabel15.setText("Temperatura:");
        jLabel15.setName("jLabel15"); // NOI18N

        jLabel16.setText("C");
        jLabel16.setName("jLabel16"); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel17.setText("(wskazuje również moc z jaką pracuje podłączone do gniazdka urządzenie)");
        jLabel17.setName("jLabel17"); // NOI18N

        lPoborGazu.setFont(new java.awt.Font("Tahoma", 1, 11));
        lPoborGazu.setText("0");
        lPoborGazu.setName("lPoborGazu"); // NOI18N

        lTemperatura.setFont(new java.awt.Font("Tahoma", 1, 11));
        lTemperatura.setText("0");
        lTemperatura.setName("lTemperatura"); // NOI18N

        lMoc.setFont(new java.awt.Font("Tahoma", 1, 11));
        lMoc.setText("0");
        lMoc.setName("lMoc"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUsunUrzadzenie, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(btnDodajUrzadzenie, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(262, 262, 262))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(384, 384, 384))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField4))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel13)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(272, 272, 272)
                                    .addComponent(btnUstawPlan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnUsunPlan)))
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnWlacz)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnWylacz))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lStanPracy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbPoziomPracy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lTemperatura)
                                            .addComponent(lPoborGazu)
                                            .addComponent(lMoc))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUstawMoc)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(dda)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel17))
                                            .addComponent(jLabel9))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbPoziomPracy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUstawMoc))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(lMoc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(lPoborGazu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(lTemperatura)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dda)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)))
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addComponent(btnDodajUrzadzenie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUsunUrzadzenie)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnUsunPlan)
                                    .addComponent(btnUstawPlan))
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lStanPracy))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWlacz)
                    .addComponent(btnWylacz))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-727)/2, (screenSize.height-455)/2, 727, 455);
    }// </editor-fold>//GEN-END:initComponents

    private void lstUrzadzeniaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstUrzadzeniaValueChanged
        Urzadzenie u = new Urzadzenie(Integer.parseInt(lstUrzadzenia.getSelectedValue().toString().split("#")[1]));
        String nazwaUrzadzenia = lstUrzadzenia.getSelectedValue().toString().split("#")[0];

        int id = Integer.parseInt(lstUrzadzenia.getSelectedValue().toString().split("#")[1]);

        boolean pr = new Urzadzenie(id).czyPracuje();

        if (pr) {
            lStanPracy.setText("Pracuje");
            btnWlacz.setEnabled(false);
            btnWylacz.setEnabled(true);
        }
        if (!pr) {
            lStanPracy.setText("Nie pracuje");
            btnWlacz.setEnabled(true);
            btnWylacz.setEnabled(false);
        }

        cbPoziomPracy.setEnabled(false);
        btnUstawMoc.setEnabled(false);

        if (nazwaUrzadzenia.equals("Klimatyzator") || nazwaUrzadzenia.equals("Punkt grzewczy") || nazwaUrzadzenia.equals("Punkt świetlny")) {
            cbPoziomPracy.setEnabled(true);
            btnUstawMoc.setEnabled(true);
            if ((new Urzadzenie(id).pobierzPoziomPracy()) > 0) {
                cbPoziomPracy.setSelectedIndex((new Urzadzenie(id).pobierzPoziomPracy() - 1));
            }
        }

        double mocUrzadzenia = 0.0;
        if (u != null) {
            mocUrzadzenia = u.pobierzMocUrzadzenia();
        }

        lMoc.setText(Double.toString(mocUrzadzenia));

        double poborGazuUrzadzenia = 0.0;
        if (u != null) {
            poborGazuUrzadzenia = u.pobierzPoborGazuUrzadzenia();
        }
        lPoborGazu.setText(Double.toString(poborGazuUrzadzenia));
    }//GEN-LAST:event_lstUrzadzeniaValueChanged

    private void btnDodajUrzadzenieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajUrzadzenieMouseClicked
        dodajUrzadzenie = new DodajUrzadzenie(new JFrame(), true);
        dodajUrzadzenie.setVisible(true);
    }//GEN-LAST:event_btnDodajUrzadzenieMouseClicked

    private void btnUstawMocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUstawMocMouseClicked
        if (!lstUrzadzenia.isSelectionEmpty()) {
            String nazwaUrzadzenia = lstUrzadzenia.getSelectedValue().toString();
            int id = Integer.parseInt(nazwaUrzadzenia.split("#")[1]);
            int poziomPracy = Integer.parseInt(cbPoziomPracy.getSelectedItem().toString());
            new Urzadzenie(id).ustawPoziomPracy(poziomPracy);
        }
}//GEN-LAST:event_btnUstawMocMouseClicked

    private void btnWlaczMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWlaczMouseClicked
        if (!lstUrzadzenia.isSelectionEmpty()) {
            String nazwaUrzadzenia = lstUrzadzenia.getSelectedValue().toString();
            int id = Integer.parseInt(nazwaUrzadzenia.split("#")[1]);
            new Urzadzenie(id).wlacz();
            boolean pr = new Urzadzenie(id).czyPracuje();

            if (pr == true) {
                lStanPracy.setText("Pracuje");
            }
            if (pr == false) {
                lStanPracy.setText("Nie pracuje");
            }
            btnWlacz.setEnabled(false);
            btnWylacz.setEnabled(true);
            System.err.println(" WŁĄCZENIE URZADZENIA");
        }
    }//GEN-LAST:event_btnWlaczMouseClicked

    private void btnWylaczMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWylaczMouseClicked
        if (!lstUrzadzenia.isSelectionEmpty()) {
            String nazwaUrzadzenia = lstUrzadzenia.getSelectedValue().toString();
            int id = Integer.parseInt(nazwaUrzadzenia.split("#")[1]);
            new Urzadzenie(id).wylacz();
            boolean pr = new Urzadzenie(id).czyPracuje();

            if (pr == true) {
                lStanPracy.setText("Pracuje");
            }
            if (pr == false) {
                lStanPracy.setText("Nie pracuje");
            }

            btnWlacz.setEnabled(true);
            btnWylacz.setEnabled(false);
            System.err.println("WyŁĄCZENIEM URZADZENIA");
        }
    }//GEN-LAST:event_btnWylaczMouseClicked

    public static DefaultListModel getLstUrzadzenia() {
        return modelLstUrzadzenia;
    }

    public static int getIdPokoju() {
        return idPokoju;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                UrzadzeniaPanel dialog = new UrzadzeniaPanel(new javax.swing.JFrame(), true, new ArrayList<Integer>(), idPokoju);
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
    private javax.swing.JButton btnUstawMoc;
    private javax.swing.JButton btnUstawPlan;
    private javax.swing.JButton btnUsunPlan;
    private javax.swing.JButton btnUsunUrzadzenie;
    private javax.swing.JButton btnWlacz;
    private javax.swing.JButton btnWylacz;
    private javax.swing.JComboBox cbPoziomPracy;
    private javax.swing.JLabel dda;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lMoc;
    private javax.swing.JLabel lPoborGazu;
    private javax.swing.JLabel lStanPracy;
    private javax.swing.JLabel lTemperatura;
    private javax.swing.JList lstUrzadzenia;
    // End of variables declaration//GEN-END:variables
    private List<Integer> urzadzenia;
    private static DefaultListModel modelLstUrzadzenia;
    private static int idPokoju;
    private DodajUrzadzenie dodajUrzadzenie;
}
