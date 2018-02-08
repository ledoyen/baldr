/*
 * PreviewTab.java
 *
 * Created on 4 septembre 2007, 11:25
 */

package Ihm;

import java.util.ResourceBundle;

/**
 * @author nezetic
 */
public class PreviewTab extends javax.swing.JPanel {
    private int tabnum;
    private ResourceBundle msgs;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UIdnum;
    private javax.swing.JLabel UIdnum_desc;
    private javax.swing.JLabel UIfiles;
    private javax.swing.JLabel UIfiles_desc;
    private javax.swing.JLabel UIfnum;
    private javax.swing.JTextPane UIsum;
    private javax.swing.JLabel UIsum_desc;
    private javax.swing.JScrollPane UIsum_scroll;

    /**
     * Creates new form PreviewTab
     */
    public PreviewTab(int tabnum, ResourceBundle msgs) {
        this.msgs = msgs;
        this.tabnum = tabnum;

        initComponents();
    }

    public void setSumm(String desc) {
        UIsum.setText(desc);
    }

    public void setFiles(int num, String files) {
        UIfiles.setText(files);
        UIfnum.setText("" + num);
    }

    public void setDirs(int num) {
        UIdnum.setText("" + num);
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        UIsum_desc = new javax.swing.JLabel();
        UIfiles_desc = new javax.swing.JLabel();
        UIfiles = new javax.swing.JLabel();
        UIfnum = new javax.swing.JLabel();
        UIdnum = new javax.swing.JLabel();
        UIdnum_desc = new javax.swing.JLabel();
        UIsum_scroll = new javax.swing.JScrollPane();
        UIsum = new javax.swing.JTextPane();

        UIsum_desc.setText(msgs.getString("Report"));

        UIfiles_desc.setText(msgs.getString("Files_c"));

        UIfiles.setText("jLabel1");

        UIfnum.setText("jLabel1");

        UIdnum.setText("jLabel1");

        UIdnum_desc.setText(msgs.getString("Directories_c"));

        UIsum.setEditable(false);
        UIsum_scroll.setViewportView(UIsum);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, UIsum_scroll, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, UIfiles, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, UIsum_desc)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                            .add(UIdnum)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(UIdnum_desc)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(UIfnum)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(UIfiles_desc)))
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(UIdnum)
                        .add(UIdnum_desc)
                        .add(UIfnum)
                        .add(UIfiles_desc))
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                    .add(UIfiles, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                    .add(UIsum_desc)
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                    .add(UIsum_scroll, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // End of variables declaration//GEN-END:variables

}
