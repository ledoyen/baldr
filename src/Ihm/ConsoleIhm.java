/*
 * ConsoleIhm.java
 *
 * Created on 23 septembre 2007, 16:20
 *$Id$
 */

package Ihm;

import Noyau.DefaultTask;
import Noyau.Task;

import java.io.File;
import java.util.ArrayList;

/**
 * @author zeta
 */
public class ConsoleIhm {
    private ArrayList<File> files;
    private Task task;

    /**
     * Creates a new instance of ConsoleIhm
     */
    public ConsoleIhm() {
        files = new ArrayList<File>();
        task = new DefaultTask();
    }

    public void addFile(File f) {
        files.add(f);
    }

    public void go() {
        File[] fil = files.toArray(new File[1]);
        task.setFiles(fil);
        task.start();
    }

}
