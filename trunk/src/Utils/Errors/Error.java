/*
 * Error.java
 *
 * Created on 14 avril 2007, 18:42
 *$Id$
 */

package Utils.Errors;
import Main.*;
import javax.swing.JComponent.*;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
/**
 *
 * @author zeta
 */
public  class Error {
    
    /** Creates a new instance of Error */
    public  Error() {
    }
    
    public static void displayError(String message)
    {
    JOptionPane.showMessageDialog(null, message ,"Erreur",JOptionPane.ERROR_MESSAGE );
    }
    
    public static void tropOnglets()
    {
        displayError( "D�sol� mais vous ne pouvez pas cr�er plus d'onglets."  );

    }
    
    public static void tropAnalyse()
    {
        displayError( "D�sol� mais vous ne pouvez pas cr�er plus d'analyse." );

    }
    public static void noFiles()
    {
        displayError( "Aucun fichiers � analyser." );

    }
    
    
    
 }
