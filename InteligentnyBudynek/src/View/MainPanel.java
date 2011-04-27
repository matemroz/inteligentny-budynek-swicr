package View;

import Controller.ElementyBudynku.Budynek;
import Controller.ElementyBudynku.Pietro;
import Controller.ElementyBudynku.Pokoj;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.util.*;

public class MainPanel extends javax.swing.JFrame {

    public MainPanel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        int n = JOptionPane.showConfirmDialog(this, "Czy wczytać dane przykładowe?", "Dane demo", JOptionPane.YES_NO_OPTION);
        initComponents();
        Budynek b = new Budynek();
        List<Integer> lstBud = b.pobierzListeBudynkow();
        Iterator<Integer> itBud = lstBud.iterator();
        while (itBud.hasNext()) {
            int index = itBud.next();
            cbListaBudynkow.addItem(Controller.Utils.Formater.formatujID(index, new Budynek(index).getNazwa()));
        }

        // utworzPokoje(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        btnProjektuj = new javax.swing.JButton();
        btnKoszty = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cbListaBudynkow = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbListaPieter = new javax.swing.JComboBox();
        rightPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mItZamknij = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mItProjektuj = new javax.swing.JMenuItem();
        mItKoszty = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inteligentny budynek");
        setBackground(new java.awt.Color(255, 255, 204));
        setName("mainframe"); // NOI18N
        setResizable(false);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(MainPanel.class);
        leftPanel.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        leftPanel.setName("leftPanel"); // NOI18N

        btnProjektuj.setText("Projektuj");
        btnProjektuj.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProjektuj.setName("btnProjektuj"); // NOI18N
        btnProjektuj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProjektujMouseClicked(evt);
            }
        });

        btnKoszty.setText("Koszty urządzeń");
        btnKoszty.setName("btnKoszty"); // NOI18N
        btnKoszty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKosztyMouseClicked(evt);
            }
        });

        jLabel1.setText("Budynek:");
        jLabel1.setName("jLabel1"); // NOI18N

        jSeparator1.setName("jSeparator1"); // NOI18N

        cbListaBudynkow.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "wybierz..." }));
        cbListaBudynkow.setName("cbBudynek"); // NOI18N
        cbListaBudynkow.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbListaBudynkowItemStateChanged(evt);
            }
        });

        jLabel2.setText("Piętro:");
        jLabel2.setName("jLabel2"); // NOI18N

        cbListaPieter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "wybierz..." }));
        cbListaPieter.setName("cbPietro"); // NOI18N
        cbListaPieter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbListaPieterItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProjektuj, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbListaPieter, 0, 108, Short.MAX_VALUE)
                            .addComponent(cbListaBudynkow, 0, 108, Short.MAX_VALUE)))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnKoszty, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnProjektuj, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKoszty, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbListaBudynkow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbListaPieter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        rightPanel.setBackground(new java.awt.Color(153, 153, 153));
        rightPanel.setName("rightPanel"); // NOI18N

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu1.setText("Plik");
        jMenu1.setName("jMenu1"); // NOI18N

        mItZamknij.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mItZamknij.setText("Zamknij program");
        mItZamknij.setName("mItZamknij"); // NOI18N
        mItZamknij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItZamknijActionPerformed(evt);
            }
        });
        jMenu1.add(mItZamknij);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Narzędzia");
        jMenu2.setName("jMenu2"); // NOI18N

        mItProjektuj.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mItProjektuj.setText("Projektuj");
        mItProjektuj.setName("mItProjektuj"); // NOI18N
        mItProjektuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItProjektujActionPerformed(evt);
            }
        });
        jMenu2.add(mItProjektuj);

        mItKoszty.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        mItKoszty.setText("Koszty urządzeń");
        mItKoszty.setName("mItKoszty"); // NOI18N
        mItKoszty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItKosztyActionPerformed(evt);
            }
        });
        jMenu2.add(mItKoszty);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1008)/2, (screenSize.height-584)/2, 1008, 584);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProjektujMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProjektujMouseClicked
        projektorPanel = new ProjektorPanel(this, true);
        projektorPanel.setVisible(true);
    }//GEN-LAST:event_btnProjektujMouseClicked

    private void btnKosztyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKosztyMouseClicked
        if (cbListaPieter.getSelectedItem().toString()=="wybierz...") {
            return;
        }
        try {
            selectedPietro = new Pietro(Integer.parseInt(cbListaPieter.getSelectedItem().toString().split("#")[1]));
            kosztyView = new KosztyPanel(this, true, selectedPietro.wylistujPokoje());
            kosztyView.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnKosztyMouseClicked

    private void mItProjektujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItProjektujActionPerformed
        projektorPanel = new ProjektorPanel(this, true);
        projektorPanel.setVisible(true);
    }//GEN-LAST:event_mItProjektujActionPerformed

    private void mItKosztyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItKosztyActionPerformed
        if (cbListaPieter.getSelectedItem().toString()=="wybierz...") {
            return;
        }
        try {
            selectedPietro = new Pietro(Integer.parseInt(cbListaPieter.getSelectedItem().toString().split("#")[1]));
            kosztyView = new KosztyPanel(this, true, selectedPietro.wylistujPokoje());
            kosztyView.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mItKosztyActionPerformed

    private void mItZamknijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItZamknijActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mItZamknijActionPerformed

    private void cbListaPieterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbListaPieterItemStateChanged
        if (!cbListaPieter.getSelectedItem().toString().equals("wybierz...")) {
            selectedPietro = new Pietro(Integer.parseInt(cbListaPieter.getSelectedItem().toString().split("#")[1]));
            utworzPokoje(selectedPietro.wylistujPokoje());
        }
}//GEN-LAST:event_cbListaPieterItemStateChanged

    private void cbListaBudynkowItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbListaBudynkowItemStateChanged

        //if (cbListaPieter.getItemCount() > 1) {
        //for (int i = 1; i < cbListaPieter.getItemCount(); i++){
        cbListaPieter.removeItem(0);
        //}
        //}
        if (cbListaBudynkow.getSelectedItem() != null) {
            String wybranyBudynek = cbListaBudynkow.getSelectedItem().toString();
            if (!wybranyBudynek.equals("wybierz...")) {
                Budynek b = new Budynek();
                Iterator<Integer> itBud = b.pobierzListePieter(Integer.parseInt(wybranyBudynek.split("#")[1])).iterator();
                while (itBud.hasNext()) {
                    int index = itBud.next();
                    cbListaPieter.addItem(Controller.Utils.Formater.formatujID(index, new Pietro(index).pobierzNazwe()));
                }
            }
            rightPanel.removeAll();
            rightPanel.revalidate();
            rightPanel.repaint();
        }

}//GEN-LAST:event_cbListaBudynkowItemStateChanged

    private void utworzPokoje(List<Pokoj> pokoje) {
        int size = pokoje.size();

        if (pokoje != null) {
            size = pokoje.size();
        }
        if (size == 1) {
            PokojPanel pp = new PokojPanel();
            pp.setLocation(20, 20);
            int width = 785;
            int height = 489;
            pp.setSize(width, height);
            rightPanel.add(pp);

            final Pokoj p = pokoje.get(0);
            final int idPokoju = p.getIdPokoju();
            String nazwaPokoju = p.getNazwa() + "#" + idPokoju;
            JLabel lNazwaPokoju = new JLabel(nazwaPokoju);
            lNazwaPokoju.setLocation(0, 0);
            lNazwaPokoju.setSize(150, 20);
            pp.add(lNazwaPokoju);

            JButton btnUrzadzenia = new JButton("Urzadzenia");
            btnUrzadzenia.setSize(150, 40);
            btnUrzadzenia.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp.add(btnUrzadzenia);


            btnUrzadzenia.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    up.setVisible(true);
                }
            });

            JButton btnOkna = new JButton("Okna");
            btnOkna.setSize(150, 40);
            btnOkna.setLocation(width / 2 - 150 / 2, 5);
            pp.add(btnOkna);
            btnOkna.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi = new JButton("Drzwi");
            btnDrzwi.setSize(150, 40);
            btnDrzwi.setLocation(width / 2 - 150 / 2, height - 45);
            pp.add(btnDrzwi);
            btnDrzwi.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });

        }

        if (size == 2) {
            PokojPanel pp = new PokojPanel();
            pp.setLocation(20, 20);
            int width = 781 / 2;
            int height = 489;
            pp.setSize(width, height);
            rightPanel.add(pp);

            final Pokoj p = pokoje.get(0);
            final int idPokoju = p.getIdPokoju();
            String nazwaPokoju = p.getNazwa() + "#" + idPokoju;
            JLabel lNazwaPokoju = new JLabel(nazwaPokoju);
            lNazwaPokoju.setLocation(0, 0);
            lNazwaPokoju.setSize(150, 20);
            pp.add(lNazwaPokoju);


            JButton btnUrzadzenia = new JButton("Urzadzenia");
            btnUrzadzenia.setSize(150, 40);
            btnUrzadzenia.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp.add(btnUrzadzenia);
            btnUrzadzenia.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    up.setVisible(true);
                }
            });

            JButton btnOkna = new JButton("Okna");
            btnOkna.setSize(150, 40);
            btnOkna.setLocation(width / 2 - 150 / 2, 5);
            pp.add(btnOkna);
            btnOkna.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi = new JButton("Drzwi");
            btnDrzwi.setSize(150, 40);
            btnDrzwi.setLocation(width / 2 - 150 / 2, height - 45);
            pp.add(btnDrzwi);
            pp.add(btnDrzwi);
            btnDrzwi.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });

            PokojPanel pp1 = new PokojPanel();
            pp1.setLocation(421, 20);
            width = 370;
            height = 489;
            pp1.setSize(width, height);
            rightPanel.add(pp1);


            final Pokoj p1 = pokoje.get(1);
            final int idPokoju1 = p1.getIdPokoju();
            String nazwaPokoju1 = p1.getNazwa() + "#" + idPokoju1;
            JLabel lNazwaPokoju1 = new JLabel(nazwaPokoju1);
            lNazwaPokoju1.setLocation(0, 0);
            lNazwaPokoju1.setSize(150, 20);
            pp1.add(lNazwaPokoju1);


            JButton btnUrzadzenia1 = new JButton("Urzadzenia");
            btnUrzadzenia1.setSize(150, 40);
            btnUrzadzenia1.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp1.add(btnUrzadzenia1);
            btnUrzadzenia1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p1.wylistujUrzadzenia(), idPokoju1);
                    up.setVisible(true);
                }
            });

            JButton btnOkna1 = new JButton("Okna");
            btnOkna1.setSize(150, 40);
            btnOkna1.setLocation(width / 2 - 150 / 2, 5);
            pp1.add(btnOkna1);
            btnOkna1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi1 = new JButton("Drzwi");
            btnDrzwi1.setSize(150, 40);
            btnDrzwi1.setLocation(width / 2 - 150 / 2, height - 45);
            pp1.add(btnDrzwi1);
            btnDrzwi1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });
        }


        if (size == 3) {
            PokojPanel pp = new PokojPanel();
            pp.setLocation(20, 20);
            int width = 781 / 2;
            int height = 489 / 2 - 10;
            pp.setSize(width, height);
            rightPanel.add(pp);

            final Pokoj p = pokoje.get(0);
            final int idPokoju = p.getIdPokoju();
            String nazwaPokoju = p.getNazwa() + "#" + idPokoju;
            JLabel lNazwaPokoju = new JLabel(nazwaPokoju);
            lNazwaPokoju.setLocation(0, 0);
            lNazwaPokoju.setSize(150, 20);
            pp.add(lNazwaPokoju);

            JButton btnUrzadzenia = new JButton("Urzadzenia");
            btnUrzadzenia.setSize(150, 40);
            btnUrzadzenia.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp.add(btnUrzadzenia);
            btnUrzadzenia.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    up.setVisible(true);
                }
            });

            JButton btnOkna = new JButton("Okna");
            btnOkna.setSize(150, 40);
            btnOkna.setLocation(width / 2 - 150 / 2, 5);
            pp.add(btnOkna);
            btnOkna.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi = new JButton("Drzwi");
            btnDrzwi.setSize(150, 40);
            btnDrzwi.setLocation(width / 2 - 150 / 2, height - 45);
            pp.add(btnDrzwi);
            pp.add(btnDrzwi);
            btnDrzwi.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });

            PokojPanel pp1 = new PokojPanel();
            pp1.setLocation(421, 20);
            width = 781 / 2;
            height = 489 / 2 - 10;
            pp1.setSize(width, height);
            rightPanel.add(pp1);

            final Pokoj p1 = pokoje.get(1);
            final int idPokoju1 = p1.getIdPokoju();
            String nazwaPokoju1 = p1.getNazwa() + "#" + idPokoju1;
            JLabel lNazwaPokoju1 = new JLabel(nazwaPokoju1);
            lNazwaPokoju1.setLocation(0, 0);
            lNazwaPokoju1.setSize(150, 20);
            pp1.add(lNazwaPokoju1);


            JButton btnUrzadzenia1 = new JButton("Urzadzenia");
            btnUrzadzenia1.setSize(150, 40);
            btnUrzadzenia1.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp1.add(btnUrzadzenia1);
            btnUrzadzenia1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p1.wylistujUrzadzenia(), idPokoju1);
                    up.setVisible(true);
                }
            });

            JButton btnOkna1 = new JButton("Okna");
            btnOkna1.setSize(150, 40);
            btnOkna1.setLocation(width / 2 - 150 / 2, 5);
            pp1.add(btnOkna1);
            btnOkna1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi1 = new JButton("Drzwi");
            btnDrzwi1.setSize(150, 40);
            btnDrzwi1.setLocation(width / 2 - 150 / 2, height - 45);
            pp1.add(btnDrzwi1);
            btnDrzwi1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });

            PokojPanel pp2 = new PokojPanel();
            pp2.setLocation(20, 489 / 2 + 30);
            width = 781;
            height = 489 / 2 - 10;
            pp2.setSize(width, height);
            rightPanel.add(pp2);

            final Pokoj p2 = pokoje.get(2);
            final int idPokoju2 = p2.getIdPokoju();
            String nazwaPokoju2 = p2.getNazwa() + "#" + idPokoju2;
            JLabel lNazwaPokoju2 = new JLabel(nazwaPokoju2);
            lNazwaPokoju2.setLocation(0, 0);
            lNazwaPokoju2.setSize(150, 20);
            pp2.add(lNazwaPokoju2);


            JButton btnUrzadzenia2 = new JButton("Urzadzenia");
            btnUrzadzenia2.setSize(150, 40);
            btnUrzadzenia2.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp2.add(btnUrzadzenia2);
            btnUrzadzenia2.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p2.wylistujUrzadzenia(), idPokoju2);
                    up.setVisible(true);
                }
            });

            JButton btnOkna2 = new JButton("Okna");
            btnOkna2.setSize(150, 40);
            btnOkna2.setLocation(width / 2 - 150 / 2, 5);
            pp2.add(btnOkna2);
            btnOkna2.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi2 = new JButton("Drzwi");
            btnDrzwi2.setSize(150, 40);
            btnDrzwi2.setLocation(width / 2 - 150 / 2, height - 45);
            pp2.add(btnDrzwi2);
            btnDrzwi2.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });
        }
        if (size == 4) {

            PokojPanel pp = new PokojPanel();
            pp.setLocation(20, 20);
            int width = 781 / 2;
            int height = 489 / 2 - 10;
            pp.setSize(width, height);
            rightPanel.add(pp);


            final Pokoj p = pokoje.get(0);
            final int idPokoju = p.getIdPokoju();
            String nazwaPokoju = p.getNazwa() + "#" + idPokoju;
            JLabel lNazwaPokoju = new JLabel(nazwaPokoju);
            lNazwaPokoju.setLocation(0, 0);
            lNazwaPokoju.setSize(150, 20);
            pp.add(lNazwaPokoju);

            JButton btnUrzadzenia = new JButton("Urzadzenia");
            btnUrzadzenia.setSize(150, 40);
            btnUrzadzenia.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp.add(btnUrzadzenia);
            btnUrzadzenia.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    up.setVisible(true);
                }
            });

            JButton btnOkna = new JButton("Okna");
            btnOkna.setSize(150, 40);
            btnOkna.setLocation(width / 2 - 150 / 2, 5);
            pp.add(btnOkna);
            btnOkna.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi = new JButton("Drzwi");
            btnDrzwi.setSize(150, 40);
            btnDrzwi.setLocation(width / 2 - 150 / 2, height - 45);
            pp.add(btnDrzwi);
            pp.add(btnDrzwi);
            btnDrzwi.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });

            PokojPanel pp1 = new PokojPanel();
            pp1.setLocation(421, 20);
            width = 781 / 2;
            height = 489 / 2 - 10;
            pp1.setSize(width, height);
            rightPanel.add(pp1);

            final Pokoj p1 = pokoje.get(1);
            final int idPokoju1 = p1.getIdPokoju();
            String nazwaPokoju1 = p1.getNazwa() + "#" + idPokoju1;
            JLabel lNazwaPokoju1 = new JLabel(nazwaPokoju1);
            lNazwaPokoju1.setLocation(0, 0);
            lNazwaPokoju1.setSize(150, 20);
            pp1.add(lNazwaPokoju1);


            JButton btnUrzadzenia1 = new JButton("Urzadzenia");
            btnUrzadzenia1.setSize(150, 40);
            btnUrzadzenia1.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp1.add(btnUrzadzenia1);
            btnUrzadzenia1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p1.wylistujUrzadzenia(), idPokoju1);
                    up.setVisible(true);
                }
            });

            JButton btnOkna1 = new JButton("Okna");
            btnOkna1.setSize(150, 40);
            btnOkna1.setLocation(width / 2 - 150 / 2, 5);
            pp1.add(btnOkna1);
            btnOkna1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi1 = new JButton("Drzwi");
            btnDrzwi1.setSize(150, 40);
            btnDrzwi1.setLocation(width / 2 - 150 / 2, height - 45);
            pp1.add(btnDrzwi1);
            btnDrzwi1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });

            PokojPanel pp2 = new PokojPanel();
            pp2.setLocation(20, 489 / 2 + 30);
            width = 781 / 2;
            height = 489 / 2 - 10;
            pp2.setSize(width, height);
            rightPanel.add(pp2);


            final Pokoj p2 = pokoje.get(2);
            final int idPokoju2 = p2.getIdPokoju();
            String nazwaPokoju2 = p2.getNazwa() + "#" + idPokoju2;
            JLabel lNazwaPokoju2 = new JLabel(nazwaPokoju2);
            lNazwaPokoju2.setLocation(0, 0);
            lNazwaPokoju2.setSize(150, 20);
            pp2.add(lNazwaPokoju2);

            JButton btnUrzadzenia2 = new JButton("Urzadzenia");
            btnUrzadzenia2.setSize(150, 40);
            btnUrzadzenia2.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp2.add(btnUrzadzenia2);
            btnUrzadzenia2.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p2.wylistujUrzadzenia(), idPokoju2);
                    up.setVisible(true);
                }
            });

            JButton btnOkna2 = new JButton("Okna");
            btnOkna2.setSize(150, 40);
            btnOkna2.setLocation(width / 2 - 150 / 2, 5);
            pp2.add(btnOkna2);
            btnOkna2.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi2 = new JButton("Drzwi");
            btnDrzwi2.setSize(150, 40);
            btnDrzwi2.setLocation(width / 2 - 150 / 2, height - 45);
            pp2.add(btnDrzwi2);
            btnDrzwi2.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });


            PokojPanel pp3 = new PokojPanel();
            pp3.setLocation(421, 489 / 2 + 30);
            width = 781 / 2;
            height = 489 / 2 - 10;
            pp3.setSize(width, height);
            rightPanel.add(pp3);

            final Pokoj p3 = pokoje.get(3);
            final int idPokoju3 = p3.getIdPokoju();
            String nazwaPokoju3 = p3.getNazwa() + "#" + idPokoju3;
            JLabel lNazwaPokoju3 = new JLabel(nazwaPokoju3);
            lNazwaPokoju3.setLocation(0, 0);
            lNazwaPokoju3.setSize(150, 20);
            pp3.add(lNazwaPokoju3);



            JButton btnUrzadzenia3 = new JButton("Urzadzenia");
            btnUrzadzenia3.setSize(150, 40);
            btnUrzadzenia3.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp3.add(btnUrzadzenia3);
            btnUrzadzenia3.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p3.wylistujUrzadzenia(), idPokoju3);
                    up.setVisible(true);
                }
            });

            JButton btnOkna3 = new JButton("Okna");
            btnOkna3.setSize(150, 40);
            btnOkna3.setLocation(width / 2 - 150 / 2, 5);
            pp3.add(btnOkna3);
            btnOkna3.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi3 = new JButton("Drzwi");
            btnDrzwi3.setSize(150, 40);
            btnDrzwi3.setLocation(width / 2 - 150 / 2, height - 45);
            pp3.add(btnDrzwi3);
            btnDrzwi3.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });

        }
        if (size == 5) {

            PokojPanel pp = new PokojPanel();
            pp.setLocation(20, 20);
            int width = 781 / 3;
            int height = 489 / 2 - 10;
            pp.setSize(width, height);
            rightPanel.add(pp);

            final Pokoj p = pokoje.get(0);
            final int idPokoju = p.getIdPokoju();
            String nazwaPokoju = p.getNazwa() + "#" + idPokoju;
            JLabel lNazwaPokoju = new JLabel(nazwaPokoju);
            lNazwaPokoju.setLocation(0, 0);
            lNazwaPokoju.setSize(150, 20);
            pp.add(lNazwaPokoju);


            JButton btnUrzadzenia = new JButton("Urzadzenia");
            btnUrzadzenia.setSize(150, 40);
            btnUrzadzenia.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp.add(btnUrzadzenia);
            btnUrzadzenia.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    up.setVisible(true);
                }
            });

            JButton btnOkna = new JButton("Okna");
            btnOkna.setSize(150, 40);
            btnOkna.setLocation(width / 2 - 150 / 2, 30);
            pp.add(btnOkna);
            btnOkna.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi = new JButton("Drzwi");
            btnDrzwi.setSize(150, 40);
            btnDrzwi.setLocation(width / 2 - 150 / 2, height - 45);
            pp.add(btnDrzwi);
            pp.add(btnDrzwi);
            btnDrzwi.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });

            PokojPanel pp1 = new PokojPanel();
            pp1.setLocation(300, 20);
            width = 781 / 3;
            height = 489 / 2 - 10;
            pp1.setSize(width, height);
            rightPanel.add(pp1);


            final Pokoj p1 = pokoje.get(1);
            final int idPokoju1 = p1.getIdPokoju();
            String nazwaPokoju1 = p1.getNazwa() + "#" + idPokoju1;
            JLabel lNazwaPokoju1 = new JLabel(nazwaPokoju1);
            lNazwaPokoju1.setLocation(0, 0);
            lNazwaPokoju1.setSize(150, 20);
            pp1.add(lNazwaPokoju1);


            JButton btnUrzadzenia1 = new JButton("Urzadzenia");
            btnUrzadzenia1.setSize(150, 40);
            btnUrzadzenia1.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp1.add(btnUrzadzenia1);
            btnUrzadzenia1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p1.wylistujUrzadzenia(), idPokoju1);
                    up.setVisible(true);
                }
            });

            JButton btnOkna1 = new JButton("Okna");
            btnOkna1.setSize(150, 40);
            btnOkna1.setLocation(width / 2 - 150 / 2, 30);
            pp1.add(btnOkna1);
            btnOkna1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi1 = new JButton("Drzwi");
            btnDrzwi1.setSize(150, 40);
            btnDrzwi1.setLocation(width / 2 - 150 / 2, height - 45);
            pp1.add(btnDrzwi1);
            btnDrzwi1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });

            PokojPanel pp2 = new PokojPanel();
            pp2.setLocation(580, 20);
            width = 781 / 3;
            height = 489 / 2 - 10;
            pp2.setSize(width, height);
            rightPanel.add(pp2);

            final Pokoj p2 = pokoje.get(2);
            final int idPokoju2 = p2.getIdPokoju();
            String nazwaPokoju2 = p2.getNazwa() + "#" + idPokoju2;
            JLabel lNazwaPokoju2 = new JLabel(nazwaPokoju2);
            lNazwaPokoju2.setLocation(0, 0);
            lNazwaPokoju2.setSize(150, 20);
            pp2.add(lNazwaPokoju2);


            JButton btnUrzadzenia2 = new JButton("Urzadzenia");
            btnUrzadzenia2.setSize(150, 40);
            btnUrzadzenia2.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp2.add(btnUrzadzenia2);
            btnUrzadzenia2.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p2.wylistujUrzadzenia(), idPokoju2);
                    up.setVisible(true);
                }
            });

            JButton btnOkna2 = new JButton("Okna");
            btnOkna2.setSize(150, 40);
            btnOkna2.setLocation(width / 2 - 150 / 2, 30);
            pp2.add(btnOkna2);
            btnOkna2.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi2 = new JButton("Drzwi");
            btnDrzwi2.setSize(150, 40);
            btnDrzwi2.setLocation(width / 2 - 150 / 2, height - 45);
            pp2.add(btnDrzwi2);
            btnDrzwi2.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });


            PokojPanel pp3 = new PokojPanel();
            pp3.setLocation(20, 489 / 2 + 30);
            width = 781 / 2;
            height = 489 / 2 - 10;
            pp3.setSize(width, height);
            rightPanel.add(pp3);

            final Pokoj p3 = pokoje.get(3);
            final int idPokoju3 = p3.getIdPokoju();
            String nazwaPokoju3 = p3.getNazwa() + "#" + idPokoju3;
            JLabel lNazwaPokoju3 = new JLabel(nazwaPokoju3);
            lNazwaPokoju3.setLocation(0, 0);
            lNazwaPokoju3.setSize(150, 20);
            pp3.add(lNazwaPokoju3);

            JButton btnUrzadzenia3 = new JButton("Urzadzenia");
            btnUrzadzenia3.setSize(150, 40);
            btnUrzadzenia3.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp3.add(btnUrzadzenia3);
            btnUrzadzenia3.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p3.wylistujUrzadzenia(), idPokoju3);
                    up.setVisible(true);
                }
            });

            JButton btnOkna3 = new JButton("Okna");
            btnOkna3.setSize(150, 40);
            btnOkna3.setLocation(width / 2 - 150 / 2, 30);
            pp3.add(btnOkna3);
            btnOkna3.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi3 = new JButton("Drzwi");
            btnDrzwi3.setSize(150, 40);
            btnDrzwi3.setLocation(width / 2 - 150 / 2, height - 45);
            pp3.add(btnDrzwi3);
            btnDrzwi3.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });


            PokojPanel pp4 = new PokojPanel();
            pp4.setLocation(421, 489 / 2 + 30);
            width = 781 / 2;
            height = 489 / 2 - 10;
            pp4.setSize(width, height);
            rightPanel.add(pp4);

            final Pokoj p4 = pokoje.get(4);
            final int idPokoju4 = p4.getIdPokoju();
            String nazwaPokoju4 = p4.getNazwa() + "#" + idPokoju4;
            JLabel lNazwaPokoju4 = new JLabel(nazwaPokoju4);
            lNazwaPokoju4.setLocation(0, 0);
            lNazwaPokoju4.setSize(150, 20);
            pp4.add(lNazwaPokoju4);

            JButton btnUrzadzenia4 = new JButton("Urzadzenia");
            btnUrzadzenia4.setSize(150, 40);
            btnUrzadzenia4.setLocation(width / 2 - 150 / 2, height / 2 - 20);
            pp4.add(btnUrzadzenia4);
            btnUrzadzenia4.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    UrzadzeniaPanel up = new UrzadzeniaPanel(new JFrame(), true, p4.wylistujUrzadzenia(), idPokoju4);
                    up.setVisible(true);
                }
            });

            JButton btnOkna4 = new JButton("Okna");
            btnOkna4.setSize(150, 40);
            btnOkna4.setLocation(width / 2 - 150 / 2, 30);
            pp4.add(btnOkna4);
            btnOkna4.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    OknaPanel op = new OknaPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    op.setVisible(true);
                }
            });

            JButton btnDrzwi4 = new JButton("Drzwi");
            btnDrzwi4.setSize(150, 40);
            btnDrzwi4.setLocation(width / 2 - 150 / 2, height - 45);
            pp4.add(btnDrzwi4);
            btnDrzwi4.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    DrzwiPanel dp = new DrzwiPanel(new JFrame(), true, p.wylistujUrzadzenia(), idPokoju);
                    dp.setVisible(true);
                }
            });

        }
        if (size == 6) {
        }

        rightPanel.revalidate();
        rightPanel.repaint();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainPanel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKoszty;
    private javax.swing.JButton btnProjektuj;
    private javax.swing.JComboBox cbListaBudynkow;
    private javax.swing.JComboBox cbListaPieter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JMenuItem mItKoszty;
    private javax.swing.JMenuItem mItProjektuj;
    private javax.swing.JMenuItem mItZamknij;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
    private JDialog kosztyPanel;
    private JDialog planowaniePanel;
    private JDialog projektorPanel;
    private static Pietro selectedPietro;
    private KosztyPanel kosztyView;
}
