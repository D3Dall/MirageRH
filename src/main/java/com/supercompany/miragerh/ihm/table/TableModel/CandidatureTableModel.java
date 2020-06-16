/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supercompany.miragerh.ihm.table.TableModel;

import fr.jaschavolp.m1.jee.mirageshared.candidature.CandidatureVM;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Structure une classe de modèle de JTable pour les candidatures
 * @author FlorianDELSOL
 */
public class CandidatureTableModel extends AbstractTableModel{
    
    private final String[] entete = {"Identifiant", "nom de la fiche", "date de candidature", "statut de la candidature", "choix du candidat"};
    private final List<CandidatureVM> data;

    /**
     * Créer une nouvelle instance de classe CandidatureTableModel
     * @param data 
     */
    public CandidatureTableModel(List<CandidatureVM> data) {
        super();
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return entete.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return entete[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : 
                return data.get(rowIndex).getIdentifiantFichePoste();
            case 1 : 
                return data.get(rowIndex).getNomFichePoste();
            case 2 :
                return data.get(rowIndex).getDate().toString();
            case 3 :
                return data.get(rowIndex).getEtat();
            case 4 :
                return data.get(rowIndex).getChoixCandidat() == null ? "Pas de retour du candidat" : data.get(rowIndex).getChoixCandidat() ? "Retour positif du candidat" : "Retour négatif du candidat" ;
            default: return "Problems";
        }
    }
    
}
