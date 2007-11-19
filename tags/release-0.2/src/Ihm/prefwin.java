/*
 * prefwin.java
 *
 * Created on 29 mars 2007, 11:13
 *$Id$
 */

package Ihm;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import Noyau.Noyau;
import Main.*;

/**
 *
 * @author  Baldr Team
 */
public class prefwin extends javax.swing.JFrame {
    //String editor;
    
    // C�dric: Equivalent d'un struct global en C++, je trouve pas mieux :(
    private static class opts {
        static String editor;
        static boolean expert;
        static String comparator;
        static String locale;
        static boolean preview;
    }
    private ResourceBundle msgs;
    /** Creates new form prefwin */
    public prefwin(windowBalder win) {
        msgs=win.getMsgs();
        
        initComponents();
        //TODO Work on the 2 functioning modes 
        jPanel1.setVisible(false);
    
        this.setLocationRelativeTo(this.getParent());
        this.setIconImage(Main.ihm.iconBaldr);
        this.setResizable(false);
        loadPrefs();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setTitle(msgs.getString("Preference"));
        jButton1.setText(msgs.getString("Ok"));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText(msgs.getString("Apply"));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(msgs.getString("Cancel"));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText(msgs.getString("Fav_Editor_Caption"));

        jButton5.setText(msgs.getString("Browse"));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(msgs.getString("Browse"));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setText(msgs.getString("Fav_Comparator_Caption"));

        jLabel1.setText(msgs.getString("Mode"));

        jRadioButton2.setSelected(true);
        jRadioButton2.setText(msgs.getString("Simple_Mode"));
        jRadioButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });

        jRadioButton1.setText(msgs.getString("Expert_Mode"));
        jRadioButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jRadioButton2)
                    .add(jRadioButton1))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(14, 14, 14)
                .add(jRadioButton2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "En", "Fr" }));

        jLabel4.setText(msgs.getString("Language"));

        jCheckBox1.setText(msgs.getString("Preview_files"));
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jCheckBox1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 352, Short.MAX_VALUE)
                        .add(jButton4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton1)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 298, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton5))
                            .add(jLabel2))
                        .addContainerGap(355, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 298, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton6)
                        .addContainerGap(355, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(jLabel3)
                        .addContainerGap(303, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(214, 214, 214))
                    .add(layout.createSequentialGroup()
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(446, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(14, 14, 14)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel3)
                .add(7, 7, 7)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 11, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jButton1)
                            .add(jButton3)
                            .add(jButton4))
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jCheckBox1)
                        .addContainerGap())))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
JFileChooser chooser = new JFileChooser();
        
        int res = chooser.showOpenDialog(this);
        
        switch(res) {
            case JFileChooser.APPROVE_OPTION:
                jTextField2.setText(chooser.getSelectedFile().toString());
                break;
            case JFileChooser.CANCEL_OPTION:
                break;
            case JFileChooser.ERROR_OPTION:
                break;
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        saveMods();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        if(evt.getStateChange() == evt.SELECTED){
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged
    
    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if(evt.getStateChange() == evt.SELECTED){
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        saveMods();
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser chooser = new JFileChooser();
        
        int res = chooser.showOpenDialog(this);
        
        switch(res) {
            case JFileChooser.APPROVE_OPTION:
                jTextField1.setText(chooser.getSelectedFile().toString());
                break;
            case JFileChooser.CANCEL_OPTION:
                break;
            case JFileChooser.ERROR_OPTION:
                break;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    
    private void loadPrefs(){
        if(Noyau.opts.exist("PREVIEW")){
            jCheckBox1.setSelected((Boolean)Noyau.opts.readPref("PREVIEW",false));
        }
        opts.preview = jCheckBox1.isSelected();
        
        if(Noyau.opts.exist("EDITOR")){
            jTextField1.setText(Noyau.opts.readPref("EDITOR"));
        }
        opts.editor = jTextField1.getText();
        
        if(Noyau.opts.exist("COMPARATOR")){
            jTextField2.setText(Noyau.opts.readPref("COMPARATOR"));
        }
        opts.comparator = jTextField1.getText();
        
        if(Noyau.opts.exist("EXPERT")){
            if((Boolean)Noyau.opts.readPref("EXPERT",false)){
                jRadioButton1.doClick();
                opts.expert = true;
            }else{opts.expert = false;}
        }
        
        String loc;
        int i,nbr;
        
        if(Noyau.opts.exist("LOCALE")){
            loc = Noyau.opts.readPref("LOCALE");
        }else{
            loc = Locale.getDefault().getLanguage();
        }
        
        nbr = jComboBox1.getItemCount();
        
        for(i=0;i<nbr;i++){
            if(jComboBox1.getItemAt(i).toString().toLowerCase().compareTo(loc) == 0)
                jComboBox1.setSelectedIndex(i);
        }

        opts.locale = loc;
        
    }
    
    private void saveMods(){
        if(jCheckBox1.isSelected() && !opts.preview){
            Noyau.opts.writePref("PREVIEW",true);
        }else if(!jCheckBox1.isSelected() && opts.preview){
            Noyau.opts.writePref("PREVIEW",false);
        }
        if(jTextField1.getText().compareTo(opts.editor) != 0){
            Noyau.opts.writePref("EDITOR",jTextField1.getText());
        }
        if(jTextField2.getText().compareTo(opts.comparator) != 0){
            Noyau.opts.writePref("COMPARATOR",jTextField2.getText());
        }
        
        if(jComboBox1.getSelectedItem().toString().toLowerCase().compareTo(opts.locale) != 0){
            Noyau.opts.writePref("LOCALE",jComboBox1.getSelectedItem().toString().toLowerCase());
        }
        
        if(jRadioButton1.isSelected() && !opts.expert){
            Noyau.opts.writePref("EXPERT",true);
        }
        if(jRadioButton2.isSelected() && opts.expert){
            Noyau.opts.writePref("EXPERT",false);
        }
        Noyau.opts.flush();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    
}
