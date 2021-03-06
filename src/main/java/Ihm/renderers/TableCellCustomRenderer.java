/*
 * TableCellCustomRenderer.java
 *
 * Created on 12 mai 2007, 16:33
 *$Id$
 */

package Ihm.renderers;

import Ihm.TableCell;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

/**
 * Cell Renderer for the Table
 *
 * @author zeta
 * @see TableCellRenderer
 */
public class TableCellCustomRenderer implements TableCellRenderer {
    private TableCellRenderer rend;
    private double min;
    private double max;

    /**
     * Creates a new instance of TableCellCustomRenderer
     */
    public TableCellCustomRenderer(double min, double max) {
        this.min = min;
        this.max = max;
        rend = new DefaultTableCellRenderer();
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel reu = (JLabel) rend.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (column != 0) {
            if (value != null) {
                //TODO : ajouter une pref pour le multiplier
                float v = ((TableCell) value).v;
                reu.setText(v * 10 + "e-1");
                //TODO ajout pref pour couleur
                if (!isSelected) {
                    if (v != 0) {

                        reu.setBackground(Color.getHSBColor((float) (0.37 * (((((TableCell) value).done ? 0 : v) - min) / (max - min))), 0.5F, 1));

                    } else {
                        reu.setBackground(Color.WHITE);

                    }
                } else {
                    if (v != 0) {
                        reu.setBackground(Color.getHSBColor((float) (0.37 * (((((TableCell) value).done ? 0 : v) - min) / (max - min))), 0.5F, 0.75F));

                    } else {
                        reu.setBackground(Color.WHITE);

                    }


                }
                if (v == 0) {
                    reu.setToolTipText("O par definition");
                    reu.setText("");
                } else {
                    reu.setToolTipText(Float.toString(v));
                }
            }
        } else {

            if (value != null) {
                reu.setToolTipText(value.toString());
            }
        }
        return reu;
    }


}
