/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supercompany.miragerh.ihm.details;


import com.supercompany.miragerh.ihm.Canvas;
import fr.jaschavolp.m1.jee.mirageshared.dmdcompetences.DmdCompetencesVM;   

/**
 * Défini une JPnale personnalisé visualisant l'ensemble des informations d'une demande de compétence
 * @author FlorianDELSOL
 */
public class DetailsDemandeDeCompetences extends javax.swing.JPanel {

    private final DmdCompetencesVM data;
    
    /**
     * Créer une nouvelle instance de DetailsDemandeDeCompetences
     * @param data Les données sur les demandes de compétences
     * @param service Le service permettant de communiquer avec le serveur
     */
    public DetailsDemandeDeCompetences(DmdCompetencesVM data){
        initComponents();
        this.data = data;
        this.actualize();
    }
    
    private void actualize() {
        if(data != null){
            this.jLabelIdentifiantData.setText(data.getIdentifiant().toString());
            
            this.jLabelDemandeurData.setText(data.getNomManager());
            
            String competences = "";
            for (int i = 0; i< data.getCompetence().size(); i++){
                competences = data.getCompetence().get(i) + (i<data.getCompetence().size()-1 ? ", " : "" );
            }
            
            this.jLabelCompetencesData.setText(competences);
            
            this.jLabelActifData.setText(data.getNomFichePoste() != null ? "En cours de recrutement" : data.getValidationCODIR() != null && data.getValidationCODIR() ? "Validée par le CODIR" : "En cours de traitement");

            this.jButtonCreerFicheDePoste.setEnabled((data.getValidationCODIR() != null && data.getValidationCODIR())  && (data.getNomFichePoste() == null || data.getNomFichePoste().trim().isEmpty()));
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
        jLabelIdentifiantTitre = new javax.swing.JLabel();
        jLabelIdentifiantData = new javax.swing.JLabel();
        jPanelDemandeur = new javax.swing.JPanel();
        jLabelDemandeurTitre = new javax.swing.JLabel();
        jLabelDemandeurData = new javax.swing.JLabel();
        jPanelCompetences = new javax.swing.JPanel();
        jLabelCompetencesTitre = new javax.swing.JLabel();
        jLabelCompetencesData = new javax.swing.JLabel();
        jPanelActif = new javax.swing.JPanel();
        jLabelActifTitre = new javax.swing.JLabel();
        jLabelActifData = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonCreerFicheDePoste = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanelIdentifiant.setBackground(new java.awt.Color(250, 250, 255));

        jLabelIdentifiantTitre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelIdentifiantTitre.setText("Identifiant :");

        jLabelIdentifiantData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelIdentifiantData.setText("identifiant");

        javax.swing.GroupLayout jPanelIdentifiantLayout = new javax.swing.GroupLayout(jPanelIdentifiant);
        jPanelIdentifiant.setLayout(jPanelIdentifiantLayout);
        jPanelIdentifiantLayout.setHorizontalGroup(
            jPanelIdentifiantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentifiantLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIdentifiantTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIdentifiantData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIdentifiantLayout.setVerticalGroup(
            jPanelIdentifiantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentifiantLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIdentifiantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentifiantTitre, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabelIdentifiantData))
                .addContainerGap())
        );

        jPanelDemandeur.setBackground(new java.awt.Color(250, 250, 255));

        jLabelDemandeurTitre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelDemandeurTitre.setText("Demandeur :");

        jLabelDemandeurData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelDemandeurData.setText("Prénom NOM");

        javax.swing.GroupLayout jPanelDemandeurLayout = new javax.swing.GroupLayout(jPanelDemandeur);
        jPanelDemandeur.setLayout(jPanelDemandeurLayout);
        jPanelDemandeurLayout.setHorizontalGroup(
            jPanelDemandeurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDemandeurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDemandeurTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDemandeurData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDemandeurLayout.setVerticalGroup(
            jPanelDemandeurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDemandeurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDemandeurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDemandeurTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDemandeurData))
                .addContainerGap())
        );

        jPanelCompetences.setBackground(new java.awt.Color(250, 250, 255));

        jLabelCompetencesTitre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCompetencesTitre.setText("Compétences :");

        jLabelCompetencesData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCompetencesData.setText("prenom.nom@mia-corporation.fr");

        javax.swing.GroupLayout jPanelCompetencesLayout = new javax.swing.GroupLayout(jPanelCompetences);
        jPanelCompetences.setLayout(jPanelCompetencesLayout);
        jPanelCompetencesLayout.setHorizontalGroup(
            jPanelCompetencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompetencesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCompetencesTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabelCompetencesData)
                .addContainerGap(463, Short.MAX_VALUE))
        );
        jPanelCompetencesLayout.setVerticalGroup(
            jPanelCompetencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompetencesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCompetencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCompetencesTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCompetencesData))
                .addContainerGap())
        );

        jPanelActif.setBackground(new java.awt.Color(250, 250, 255));

        jLabelActifTitre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelActifTitre.setText("Statut :");

        jLabelActifData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelActifData.setText("oui / non");

        javax.swing.GroupLayout jPanelActifLayout = new javax.swing.GroupLayout(jPanelActif);
        jPanelActif.setLayout(jPanelActifLayout);
        jPanelActifLayout.setHorizontalGroup(
            jPanelActifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActifLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelActifTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabelActifData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelActifLayout.setVerticalGroup(
            jPanelActifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActifLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelActifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelActifTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelActifData))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(50, 50, 98));

        jButtonCreerFicheDePoste.setBackground(new java.awt.Color(100, 100, 206));
        jButtonCreerFicheDePoste.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCreerFicheDePoste.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreerFicheDePoste.setText("Creer une fiche de poste");
        jButtonCreerFicheDePoste.setFocusable(false);
        jButtonCreerFicheDePoste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCreerFicheDePoste.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCreerFicheDePoste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreerFicheDePosteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButtonCreerFicheDePoste, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonCreerFicheDePoste)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIdentifiant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDemandeur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelCompetences, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelActif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDemandeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCompetences, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelActif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreerFicheDePosteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreerFicheDePosteActionPerformed
        Canvas.getCanvasInstance().goToCreerFicheDePoste(data.getIdentifiant());
    }//GEN-LAST:event_jButtonCreerFicheDePosteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreerFicheDePoste;
    private javax.swing.JLabel jLabelActifData;
    private javax.swing.JLabel jLabelActifTitre;
    private javax.swing.JLabel jLabelCompetencesData;
    private javax.swing.JLabel jLabelCompetencesTitre;
    private javax.swing.JLabel jLabelDemandeurData;
    private javax.swing.JLabel jLabelDemandeurTitre;
    private javax.swing.JLabel jLabelIdentifiantData;
    private javax.swing.JLabel jLabelIdentifiantTitre;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelActif;
    private javax.swing.JPanel jPanelCompetences;
    private javax.swing.JPanel jPanelDemandeur;
    private javax.swing.JPanel jPanelIdentifiant;
    // End of variables declaration//GEN-END:variables

    
}
