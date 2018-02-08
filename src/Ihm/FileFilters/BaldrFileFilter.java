/*
 * BaldrFileFilter.java
 *
 * Created on 19 mai 2007, 18:01
 *$Id$
 */

package Ihm.FileFilters;

import Utils.Extension;

import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.util.ResourceBundle;

/**
 * Class describing the filefilter wich accepts uncompressed baldr files
 *
 * @author zeta
 */
public class BaldrFileFilter extends FileFilter {
    private ResourceBundle msgs;

    /**
     * Creates a new instance of BaldrFileFilter
     */
    public BaldrFileFilter() {
        msgs = ResourceBundle.getBundle("i18n/Balder");
    }

    /**
     * Whether the file is acceptable
     */
    public boolean accept(File f) {
        if (f.isDirectory()) return true;
        String ext = Extension.getExtension(f);
        return ext != null && ext.equalsIgnoreCase(Extension.baldr);
//        return f!=null && (f.isDirectory() || Extension.getExtension(f).equalsIgnoreCase(Extension.baldr));

    }

    /**
     * Description for the filechooser
     */
    public String getDescription() {
        return msgs.getString("FT_BALDR") + " (." + Extension.baldr + ")";
    }

}
