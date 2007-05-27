/*
 * Main.java
 *
 * Created on 10 avril 2007, 14:42
 *$Id$
 */

package Main;
import Ihm.windowBalder;
import Noyau.*;
import java.io.File;
/**
 * Entry point in the application used to link gui to kernel
 * @author Baldr Team
 */
public class Main {
    public static Main main;
    public static windowBalder ihm;
    public static Noyau noyau;
    public static final int MAXONGLET=10;
    public static boolean modifie=false;
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    public static void main(String args[]) {
    main=new Main();
    final String fargs[]=args;

    
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        noyau = new Noyau();
        }
    });
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        ihm = new windowBalder();
        
            if(fargs.length>0)
    {
            SaveAndRestore defLoad = new SaveAndRestore(ihm);
            
    for(String arg:fargs)
    {
    File f=new File(arg);
    if(f.exists()){defLoad.restore(f);}
    }
    }
        
        }
    });
    }
    
}