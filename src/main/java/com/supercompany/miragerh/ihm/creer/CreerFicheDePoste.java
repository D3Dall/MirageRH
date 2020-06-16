/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supercompany.miragerh.ihm.creer;

import com.supercompany.miragerh.ihm.popup.ConfirmationPopUp;
import com.supercompany.miragerh.ihm.popup.ErrorPopUp;
import fr.jaschavolp.m1.jee.mirageshared.fichedeposte.CreateFichePosteVM;
import fr.jaschavolp.m1.jee.mirageshared.presentationentreprise.PresentationEntrepriseVM;
import fr.jaschavolp.m1.jee.mirageshared.shared.services.ServicesRHRemote;
import java.util.List;

/**
 *
 * @author FlorianDELSOL
 */
public class CreerFicheDePoste extends javax.swing.JPanel {
    
    private int identifiantDemandeDeCompetence;
    
    private ServicesRHRemote service;
    
    private List<PresentationEntrepriseVM> presentation;

    /**
     * Creates new form RecruterCandidat
     */
    public CreerFicheDePoste(int identifiantDemandeDeCompetence, ServicesRHRemote service, List<PresentationEntrepriseVM> presentation) {
        initComponents();
        this.identifiantDemandeDeCompetence = identifiantDemandeDeCompetence;
        this.service = service;
        
        presentation.forEach((vm) -> {
            jComboBox1.addItem(vm.getIdentifiant() + "- " + vm.getNom());
        });
        
        if(presentation.isEmpty()){
            jRadioButtonPresentationExistante.setEnabled(false);
            jRadioButtonPresentationExistante.setSelected(false);
            jRadioButtonNouvellePresentation.setSelected(true);
            jComboBox1.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelIdentifiant = new javax.swing.JPanel();
        jLabelDateFinRecrutement = new javax.swing.JLabel();
        jPanelIdentifiant1 = new javax.swing.JPanel();
        jLabelDateFinRecrutement1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanelIdentifiant2 = new javax.swing.JPanel();
        jLabelDateFinRecrutement2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonPresentationExistante = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jRadioButtonNouvellePresentation = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jButtonValider = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanelIdentifiant.setBackground(new java.awt.Color(250, 250, 255));

        jLabelDateFinRecrutement.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelDateFinRecrutement.setText("Nom de la fiche : ");

        jPanelIdentifiant1.setBackground(new java.awt.Color(250, 250, 255));

        jLabelDateFinRecrutement1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelDateFinRecrutement1.setText("Présentation du poste :");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanelIdentifiant1Layout = new javax.swing.GroupLayout(jPanelIdentifiant1);
        jPanelIdentifiant1.setLayout(jPanelIdentifiant1Layout);
        jPanelIdentifiant1Layout.setHorizontalGroup(
            jPanelIdentifiant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentifiant1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIdentifiant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIdentifiant1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanelIdentifiant1Layout.createSequentialGroup()
                        .addComponent(jLabelDateFinRecrutement1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                        .addGap(294, 294, 294))))
        );
        jPanelIdentifiant1Layout.setVerticalGroup(
            jPanelIdentifiant1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentifiant1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDateFinRecrutement1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelIdentifiant2.setBackground(new java.awt.Color(250, 250, 255));

        jLabelDateFinRecrutement2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelDateFinRecrutement2.setText("Présentation de l'entreprise :");

        jRadioButtonPresentationExistante.setSelected(true);
        jRadioButtonPresentationExistante.setText("Présentation existante");
        jRadioButtonPresentationExistante.setToolTipText("");
        jRadioButtonPresentationExistante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPresentationExistanteActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButtonPresentationExistante, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jRadioButtonPresentationExistante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jRadioButtonNouvellePresentation.setText("Nouvelle présentation");
        jRadioButtonNouvellePresentation.setToolTipText("");
        jRadioButtonNouvellePresentation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNouvellePresentationActionPerformed(evt);
            }
        });

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Présentation");
        jScrollPane3.setViewportView(jTextArea3);

        jTextField2.setText("Nom de la nouvelle présentation");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRadioButtonNouvellePresentation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jTextField2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jRadioButtonNouvellePresentation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelIdentifiant2Layout = new javax.swing.GroupLayout(jPanelIdentifiant2);
        jPanelIdentifiant2.setLayout(jPanelIdentifiant2Layout);
        jPanelIdentifiant2Layout.setHorizontalGroup(
            jPanelIdentifiant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentifiant2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIdentifiant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIdentifiant2Layout.createSequentialGroup()
                        .addComponent(jLabelDateFinRecrutement2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                        .addGap(294, 294, 294))
                    .addGroup(jPanelIdentifiant2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanelIdentifiant2Layout.setVerticalGroup(
            jPanelIdentifiant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentifiant2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDateFinRecrutement2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelIdentifiant2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIdentifiantLayout = new javax.swing.GroupLayout(jPanelIdentifiant);
        jPanelIdentifiant.setLayout(jPanelIdentifiantLayout);
        jPanelIdentifiantLayout.setHorizontalGroup(
            jPanelIdentifiantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentifiantLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIdentifiantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIdentifiantLayout.createSequentialGroup()
                        .addComponent(jLabelDateFinRecrutement, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1)
                        .addGap(320, 320, 320))
                    .addComponent(jPanelIdentifiant1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelIdentifiant2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelIdentifiantLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(297, 297, 297))
        );
        jPanelIdentifiantLayout.setVerticalGroup(
            jPanelIdentifiantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentifiantLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIdentifiantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDateFinRecrutement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelIdentifiant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelIdentifiant2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonValider)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIdentifiant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIdentifiant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        CreateFichePosteVM vm = null;
        if(jTextField1.getText().trim().length()==0 || jTextField1.getText().trim().length() ==0){
            ErrorPopUp popUp = new ErrorPopUp("Veuillez entrer un nom de fiche et une description du poste");
            return;
        }
        if(jRadioButtonPresentationExistante.isSelected()){
            vm = new CreateFichePosteVM(identifiantDemandeDeCompetence, jTextField1.getText(), jTextArea1.getText(), false, Integer.parseInt(((String)jComboBox1.getSelectedItem()).split("-")[0]) , null, null);
        }else if(jRadioButtonNouvellePresentation.isSelected()){
            if(jTextArea3.getText().trim().length()==0 || jTextField2.getText().trim().length()==0){
                ErrorPopUp popUp = new ErrorPopUp("Veuillez entrer un nouveau nom et une nouvelle présentation d'entreprise");
                return;
            }
            vm = new CreateFichePosteVM(identifiantDemandeDeCompetence, jTextField1.getText(), jTextArea1.getText(), true, -1, jTextField2.getText(), jTextArea3.getText());
        }else{
            return;
        }
        service.creerUneFicheDePoste(vm);
        ConfirmationPopUp confPopUp = new ConfirmationPopUp("La fiche de poste a bien été envoyée");
    }//GEN-LAST:event_jButtonValiderActionPerformed

    private void jRadioButtonPresentationExistanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPresentationExistanteActionPerformed
        jRadioButtonNouvellePresentation.setSelected(false);
        jTextArea3.setEnabled(false);
        jRadioButtonPresentationExistante.setSelected(true);
        jComboBox1.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonPresentationExistanteActionPerformed

    private void jRadioButtonNouvellePresentationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNouvellePresentationActionPerformed
        jRadioButtonNouvellePresentation.setSelected(true);
        jTextArea3.setEnabled(true);
        jRadioButtonPresentationExistante.setSelected(false);
        jComboBox1.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonNouvellePresentationActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonValider;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelDateFinRecrutement;
    private javax.swing.JLabel jLabelDateFinRecrutement1;
    private javax.swing.JLabel jLabelDateFinRecrutement2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelIdentifiant;
    private javax.swing.JPanel jPanelIdentifiant1;
    private javax.swing.JPanel jPanelIdentifiant2;
    private javax.swing.JRadioButton jRadioButtonNouvellePresentation;
    private javax.swing.JRadioButton jRadioButtonPresentationExistante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}