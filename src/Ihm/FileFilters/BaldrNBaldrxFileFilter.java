/*
 * BaldrNBaldrxFileFilter.java
 *
 * Created on 20 mai 2007, 17:44
 *$Id$
 */

package Ihm.FileFilters;

import Utils.Extension;

import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.util.ResourceBundle;

/**
 * Class describing the filefilter which accepts compressed or uncomressed baldr files
 *
 * @author zeta
 */
public class BaldrNBaldrxFileFilter extends FileFilter {
    private ResourceBundle msgs;

    /**
     * Creates a new instance of BaldrNBaldrxFileFilter
     */
    public BaldrNBaldrxFileFilter() {
        msgs = ResourceBundle.getBundle("i18n/Balder");
    }

    /**
     * Whether the file is acceptable
     */
    public boolean accept(File f) {
        if (f.isDirectory()) return true;
        String ext = Extension.getExtension(f);
        return ext != null && (ext.equalsIgnoreCase(Extension.baldr) || ext.equalsIgnoreCase(Extension.baldrx));
    }

    /**
     * Description for the filechooser
     */

    public String getDescription() {
        return msgs.getString("FT_BALDR_ALL") + " (." + Extension.baldr + ", ." + Extension.baldrx + ")";
    }

}
