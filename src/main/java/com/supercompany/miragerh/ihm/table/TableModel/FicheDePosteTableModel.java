/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supercompany.miragerh.ihm.table.TableModel;

import fr.jaschavolp.m1.jee.mirageshared.fichedeposte.FichePosteVM;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Structure une classe de modèle de JTable pour les fiches de poste
 * @author FlorianDELSOL
 */
public class FicheDePosteTableModel extends AbstractTableModel{
    
    private final String[] entete = {"Identifiant", "nom", "statut", "date de mise en ligne", "compétences"};
    private final List<FichePosteVM> data;

    /**
     * Créer une nouvelle instance de FicheDePosteTableModel
     * @param data La liste de fiche de poste
     */
    public FicheDePosteTableModel(List<FichePosteVM> data) {
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
                return data.get(rowIndex).getIdentifiant();
            case 1 : 
                return data.get(rowIndex).getNom();
            case 2 :
                return data.get(rowIndex).getStatut();
            case 3 :
                return data.get(rowIndex).getDate();
            case 4 :
                String txt = "";
                for(int i = 0; i<data.get(rowIndex).getCompetences().size(); i++){
                    txt += data.get(rowIndex).getCompetences().get(i) + (i<data.get(rowIndex).getCompetences().size()-1 ? ", " : "");
                }
                return txt;
            default: return "Problems";
        }
    }
    
}
