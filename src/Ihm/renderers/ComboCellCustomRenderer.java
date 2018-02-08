/*
 * ComboCellCustomRenderer.java
 *
 * Created on 10 mai 2007, 15:33
 *$Id$
 */

package Ihm.renderers;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * CellRenderer for the combobox
 *
 * @author zeta
 * @see ListCellRenderer
 */
public class ComboCellCustomRenderer implements ListCellRenderer {

    /**
     * Creates a new instance of ComboCellCustomRenderer
     */
    private ListCellRenderer rend;

    public ComboCellCustomRenderer() {
        rend = new DefaultListCellRenderer();
    }

    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel reu = (JLabel) rend.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        String tmp = value.toString();
        if (tmp.lastIndexOf(File.separator) != -1) {
            reu.setText(tmp.substring(tmp.lastIndexOf(File.separator) + 1));
        }

        return reu;
    }


}
