/*
 * SaveAndRestore.java
 *
 * Created on 14 mai 2007, 11:00
 *$Id$
 */

package Noyau;


import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Class which handle the saving and restoring tasks of the componnets of the application which are savable
 *
 * @author zeta
 * @see Savable
 */
public class SaveAndRestore {
    /**
     * uncompressed filetype format constant
     */
    public static final int BALDR = 1;
    /**
     * compressed filetype format constant
     */
    public static final int BALDRX = 2;
    private Savable obj;

    /**
     * Creates a new instance of SaveAndRestore
     */
    public SaveAndRestore(Savable object) {
        obj = object;
    }

    /**
     * escape's string to write well-formed xml
     *
     * @param str string to excape
     * @return escaped string
     */
    public static String escape(String str) {
        return str.replace("&", "&amp;").replace("<", "&lt;");

    }

    /**
     * Restore the application from a file at the specified format
     *
     * @param f      file from which to load
     * @param format Format (either BALDR or BALDRX)
     */
    public void restore(File f, int format) {
        int i;

        try {
            FileInputStream file = new FileInputStream(f);
            InputStream st = file;
            if (format == BALDRX) {

                st = new GZIPInputStream(st);

            }
            //TODO gerer charset
            BufferedReader in = new BufferedReader(new InputStreamReader(st));
            DOMParser parser = new DOMParser();

            parser.parse(new InputSource(in));
            Document doc = parser.getDocument();
            for (i = 0; i < doc.getChildNodes().getLength(); i++) {
                obj.fromDom(doc.getChildNodes().item(i));
            }
        } catch (FileNotFoundException ex) {
            //TODO lever d'erreur
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (SAXException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Restore the application from a file try to gess the format
     *
     * @param f file from which to load
     */
    public void restore(File f) {
        if (Utils.Extension.getExtension(f) != null && Utils.Extension.getExtension(f).equalsIgnoreCase(Utils.Extension.baldrx)) {
            restore(f, BALDRX);
        } else {
            restore(f, BALDR);
        }


    }

    /**
     * Save the object in the specified file in the selected format
     *
     * @param f      file to save into
     * @param format file format (either BALDR or BALDRX)
     */

    public void save(File f, int format) {
        if (obj == null) {
            Utils.Errors.Error.nothingToSave();
        } else {
            StringBuffer str;

            str = new StringBuffer();
            str.append("<?xml version=\"1.0\" ?>\n");

            str.append(obj.toXml());
            try {
                FileOutputStream file = new FileOutputStream(f);
                OutputStream st = file;
                if (format == BALDRX) {

                    st = new GZIPOutputStream(st);

                }
                //TODO gerer charset
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(st));

                out.write(str.toString());
                out.close();
                st.close();
            } catch (FileNotFoundException ex) {
                //TODO lever d'erreur
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }
}
