package com.supercompany.miragerh.ihm.details;

import com.supercompany.miragerh.ihm.Canvas;
import fr.jaschavolp.m1.jee.mirageshared.personne.collaborateur.CollaborateurVM;

/**
 * Défini une JPanel personnalisé pour montrer les données d'un collaborateur
 * @author FlorianDELSOL
 */
public class DetailsCollaborateur extends javax.swing.JPanel {
    
    private CollaborateurVM data;

    /**
     * Creates une nouvelle instance
     * @param data Les données concernant le collaborateur
     */
    public DetailsCollaborateur(CollaborateurVM data) {
        initComponents();
        this.data = data;
        actualize();
    }
    
    private void actualize(){
        if(data != null){
            jLabelIdentifiantData.setText(data.getIdentifiant().toString());
            jLabelEmailData.setText(data.getEmail());
            jLabelIdentiteeData.setText(data.getPrenom() + data.getNom().toUpperCase());
            jLabelTelephoneData.setText(data.getNumero());
            
            String txt = "";
            for(int i = 0; i<data.getEquipe().size(); i++){
                txt += data.getEquipe().get(i) + (i<data.getEquipe().size()-1 ? ", ":"");
            }
            jLabelEquipesData.setText(txt);
            
            txt = "";
            for(int i = 0; i<data.getCompetence().size(); i++){
                txt += data.getCompetence().get(i) + (i<data.getCompetence().size()-1 ? ", ":"");
            }
            jLabelEquipesData.setText(txt);
            jLabelCompetenceData1.setText(data.getDateDebutContrat() + (data.getDateFinContrat() != null ? " date de fin prévu pour le " + data.getDateFinContrat() : "") );
            jButtonMettreFinContrat.setEnabled(data.getDateFinContrat() == null);
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
        jPanelIdentitee = new javax.swing.JPanel();
        jLabelIdentiteeTitre = new javax.swing.JLabel();
        jLabelIdentiteeData = new javax.swing.JLabel();
        jPanelEmail = new javax.swing.JPanel();
        jLabelEmailTitre = new javax.swing.JLabel();
        jLabelEmailData = new javax.swing.JLabel();
        jPanelTelephone = new javax.swing.JPanel();
        jLabelTelephoneTitre = new javax.swing.JLabel();
        jLabelTelephoneData = new javax.swing.JLabel();
        jPanelCompetences = new javax.swing.JPanel();
        jLabelCompetencesTitre = new javax.swing.JLabel();
        jLabelCompetenceData = new javax.swing.JLabel();
        jPanelEquipes = new javax.swing.JPanel();
        jLabelEquipeTitre = new javax.swing.JLabel();
        jLabelEquipesData = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonMettreFinContrat = new javax.swing.JButton();
        jPanelCompetences1 = new javax.swing.JPanel();
        jLabelCompetencesTitre1 = new javax.swing.JLabel();
        jLabelCompetenceData1 = new javax.swing.JLabel();

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
                .addComponent(jLabelIdentifiantTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelIdentifiantData)
                .addContainerGap(678, Short.MAX_VALUE))
        );
        jPanelIdentifiantLayout.setVerticalGroup(
            jPanelIdentifiantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentifiantLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIdentifiantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentifiantTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelIdentifiantData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelIdentitee.setBackground(new java.awt.Color(250, 250, 255));

        jLabelIdentiteeTitre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelIdentiteeTitre.setText("Identité :");

        jLabelIdentiteeData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelIdentiteeData.setText("Prénom NOM");

        javax.swing.GroupLayout jPanelIdentiteeLayout = new javax.swing.GroupLayout(jPanelIdentitee);
        jPanelIdentitee.setLayout(jPanelIdentiteeLayout);
        jPanelIdentiteeLayout.setHorizontalGroup(
            jPanelIdentiteeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentiteeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIdentiteeTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelIdentiteeData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIdentiteeLayout.setVerticalGroup(
            jPanelIdentiteeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentiteeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIdentiteeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentiteeTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelIdentiteeData))
                .addContainerGap())
        );

        jPanelEmail.setBackground(new java.awt.Color(250, 250, 255));

        jLabelEmailTitre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelEmailTitre.setText("E-mail :");

        jLabelEmailData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelEmailData.setText("prenom.nom@mia-corporation.fr");

        javax.swing.GroupLayout jPanelEmailLayout = new javax.swing.GroupLayout(jPanelEmail);
        jPanelEmail.setLayout(jPanelEmailLayout);
        jPanelEmailLayout.setHorizontalGroup(
            jPanelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEmailTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmailData)
                .addContainerGap(498, Short.MAX_VALUE))
        );
        jPanelEmailLayout.setVerticalGroup(
            jPanelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmailTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmailData))
                .addContainerGap())
        );

        jPanelTelephone.setBackground(new java.awt.Color(250, 250, 255));

        jLabelTelephoneTitre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelTelephoneTitre.setText("Téléphone :");

        jLabelTelephoneData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelTelephoneData.setText("06 67 45 89 23");

        javax.swing.GroupLayout jPanelTelephoneLayout = new javax.swing.GroupLayout(jPanelTelephone);
        jPanelTelephone.setLayout(jPanelTelephoneLayout);
        jPanelTelephoneLayout.setHorizontalGroup(
            jPanelTelephoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelephoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTelephoneTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTelephoneData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTelephoneLayout.setVerticalGroup(
            jPanelTelephoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelephoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTelephoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelephoneTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTelephoneData))
                .addContainerGap())
        );

        jPanelCompetences.setBackground(new java.awt.Color(250, 250, 255));

        jLabelCompetencesTitre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCompetencesTitre.setText("Compétences :");

        jLabelCompetenceData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCompetenceData.setText("liste des compétences");
        jLabelCompetenceData.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelCompetencesLayout = new javax.swing.GroupLayout(jPanelCompetences);
        jPanelCompetences.setLayout(jPanelCompetencesLayout);
        jPanelCompetencesLayout.setHorizontalGroup(
            jPanelCompetencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompetencesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCompetencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCompetencesLayout.createSequentialGroup()
                        .addComponent(jLabelCompetencesTitre)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelCompetenceData, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCompetencesLayout.setVerticalGroup(
            jPanelCompetencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompetencesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCompetencesTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCompetenceData, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelEquipes.setBackground(new java.awt.Color(250, 250, 255));

        jLabelEquipeTitre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelEquipeTitre.setText("Equipes :");

        jLabelEquipesData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelEquipesData.setText("liste des équipes auxquelles il appartient");
        jLabelEquipesData.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelEquipesLayout = new javax.swing.GroupLayout(jPanelEquipes);
        jPanelEquipes.setLayout(jPanelEquipesLayout);
        jPanelEquipesLayout.setHorizontalGroup(
            jPanelEquipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEquipesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEquipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEquipesLayout.createSequentialGroup()
                        .addComponent(jLabelEquipeTitre)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelEquipesLayout.createSequentialGroup()
                        .addComponent(jLabelEquipesData, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                        .addGap(176, 176, 176))))
        );
        jPanelEquipesLayout.setVerticalGroup(
            jPanelEquipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEquipesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEquipeTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEquipesData, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(50, 50, 98));

        jButtonMettreFinContrat.setBackground(new java.awt.Color(50, 50, 98));
        jButtonMettreFinContrat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonMettreFinContrat.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMettreFinContrat.setText("Mettre fin au contrat");
        jButtonMettreFinContrat.setFocusable(false);
        jButtonMettreFinContrat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMettreFinContrat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonMettreFinContrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMettreFinContratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButtonMettreFinContrat)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonMettreFinContrat))
        );

        jPanelCompetences1.setBackground(new java.awt.Color(250, 250, 255));

        jLabelCompetencesTitre1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCompetencesTitre1.setText("Date de début de contrat :");

        jLabelCompetenceData1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCompetenceData1.setText("date");
        jLabelCompetenceData1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelCompetences1Layout = new javax.swing.GroupLayout(jPanelCompetences1);
        jPanelCompetences1.setLayout(jPanelCompetences1Layout);
        jPanelCompetences1Layout.setHorizontalGroup(
            jPanelCompetences1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompetences1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCompetences1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCompetenceData1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelCompetences1Layout.createSequentialGroup()
                        .addComponent(jLabelCompetencesTitre1)
                        .addGap(0, 647, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelCompetences1Layout.setVerticalGroup(
            jPanelCompetences1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompetences1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCompetencesTitre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCompetenceData1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIdentifiant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelIdentitee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelCompetences, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelEquipes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelCompetences1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelIdentitee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCompetences1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCompetences, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelEquipes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMettreFinContratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMettreFinContratActionPerformed
        // TODO add your handling code here:
        Canvas.getCanvasInstance().goToMettreFinContrat(data.getIdentifiant());
    }//GEN-LAST:event_jButtonMettreFinContratActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMettreFinContrat;
    private javax.swing.JLabel jLabelCompetenceData;
    private javax.swing.JLabel jLabelCompetenceData1;
    private javax.swing.JLabel jLabelCompetencesTitre;
    private javax.swing.JLabel jLabelCompetencesTitre1;
    private javax.swing.JLabel jLabelEmailData;
    private javax.swing.JLabel jLabelEmailTitre;
    private javax.swing.JLabel jLabelEquipeTitre;
    private javax.swing.JLabel jLabelEquipesData;
    private javax.swing.JLabel jLabelIdentifiantData;
    private javax.swing.JLabel jLabelIdentifiantTitre;
    private javax.swing.JLabel jLabelIdentiteeData;
    private javax.swing.JLabel jLabelIdentiteeTitre;
    private javax.swing.JLabel jLabelTelephoneData;
    private javax.swing.JLabel jLabelTelephoneTitre;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCompetences;
    private javax.swing.JPanel jPanelCompetences1;
    private javax.swing.JPanel jPanelEmail;
    private javax.swing.JPanel jPanelEquipes;
    private javax.swing.JPanel jPanelIdentifiant;
    private javax.swing.JPanel jPanelIdentitee;
    private javax.swing.JPanel jPanelTelephone;
    // End of variables declaration//GEN-END:variables
}
