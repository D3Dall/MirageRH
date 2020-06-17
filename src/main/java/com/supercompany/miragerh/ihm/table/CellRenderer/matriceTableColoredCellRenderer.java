package com.supercompany.miragerh.ihm.table.CellRenderer;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Structure une classe de rendu de cellule pour la matrice de compétence
 * @author FlorianDELSOL
 */
public class matriceTableColoredCellRenderer extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
 
        Color color = (Color) value;
 
        setText("");
        setBackground(color);
 
        return this;
    }
}
