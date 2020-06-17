package com.supercompany.miragerh.ihm.table.TableModel;

import fr.jaschavolp.m1.jee.mirageshared.personne.collaborateur.CollaborateurVM;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Structure une classe de modèle de JTable pour les candidatures
 * @author FlorianDELSOL
 */
public class CollaborateurTableModel extends AbstractTableModel{
    
    private final String[] entete = {"Identifiant", "Identitée", "Email", "Numéro de téléphone", "Est un manager"};
    private final List<CollaborateurVM> data;

    /**
     * Créer une instance de classe CollaborateurTableModel
     * @param data ensemble d'informations sur un collaborateur
     */
    public CollaborateurTableModel(List<CollaborateurVM> data) {
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
                return data.get(rowIndex).getPrenom() + data.get(rowIndex).getNom().toUpperCase();
            case 2 :
                return data.get(rowIndex).getEmail();
            case 3 :
                return data.get(rowIndex).getNumero();
            case 4 :
                return data.get(rowIndex).getChefEquipe() != null && data.get(rowIndex).getChefEquipe().trim().length()>0 ? "Oui" : "Non";
            default: return "Problems";
        }
    }
    
}
