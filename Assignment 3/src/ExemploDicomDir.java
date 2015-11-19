import java.awt.Color;
import java.awt.Dimension;
import java.util.Vector;

import fr.apteryx.imageio.dicom.Tag;
import fr.apteryx.imageio.dicom.DataSet;

import javax.imageio.ImageIO;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import javax.swing.table.*;

public class ExemploDicomDir extends javax.swing.JFrame implements ListSelectionListener {

    /**
     * Creates new form ExemploDicomDir
     */
    Vector atributosExames, fileExames;
    DefaultListSelectionModel list;

    public ExemploDicomDir() {
        initComponents();


    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        txtPath = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableExames = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        txtPath.setText("D:\\Normais\\");
        txtPath.setName("txtPath");

        lblTitle.setText("DicomDir Path:");
        lblTitle.setName("lblPath");

        jButton1.setText("Show");
        jButton1.setName("btnShow");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        tableExames.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane2.setViewportView(tableExames);

        fileMenu.setText("File");
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setText("Save As ...");
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });

        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setText("Help");
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                                .addContainerGap()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                                        .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                                                .add(lblTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 16, Short.MAX_VALUE)
                                                                .add(txtPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 631, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                                        .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                                                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)))
                                                .addContainerGap())
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                                .add(jButton1)
                                                .add(309, 309, 309))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                                .addContainerGap()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(lblTitle)
                                        .add(txtPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 402, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            ReadDicomDir dirRead = new ReadDicomDir();

            Vector colNames = new Vector();

            colNames.addElement("Tipo Exame");
            colNames.addElement("ID");
            colNames.addElement("Data");
            colNames.addElement("Paciente");


            //tableExames.getColumnModel().getColumn(0).setHeaderValue("Tipo Exame");
            //tableExames.getColumnModel().getColumn(1).setHeaderValue("ID");
            //tableExames.getColumnModel().getColumn(2).setHeaderValue("Data");
            //tableExames.getColumnModel().getColumn(3).setHeaderValue("Paciente");

            atributosExames = new Vector();
            fileExames = new Vector();
            Vector results = null;
            try {
                results = dirRead.leDirectorio(txtPath.getText(), atributosExames);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Invalid DicomDir",
                        "Warning", JOptionPane.WARNING_MESSAGE);
            }

            TableModel tbModel = new DefaultTableModel(results, colNames) {
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };

            tableExames.setModel(tbModel);
            fileExames = dirRead.getFilesExames();

            list = new DefaultListSelectionModel();

            list.addListSelectionListener(this);
            tableExames.setSelectionModel(list);
            tableExames.validate();
            txtArea.setText("");

            this.repaint();

        } catch (Exception e) {
            System.out.println("Error in reading dicomDir.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ExemploDicomDir().setVisible(true);
                }
            });

        } catch (Exception e) {
            System.out.println("Error in the Aplication...");
        }
    }

    public void valueChanged(ListSelectionEvent e) {
        //        if(examProp.frameAtributos != null)
        //                examProp.frameAtributos.dispose();
        DefaultListSelectionModel auxiliar = (DefaultListSelectionModel) (e.getSource());
        if (auxiliar.equals(list) && !e.getValueIsAdjusting()) {
            Atributes attTemp = (Atributes) atributosExames.elementAt(e.getFirstIndex());
            txtArea.setText(attTemp.regImage.toString());
        }

        for (int i = 0; i < fileExames.size(); i++) {
            System.out.println("=== " + i + "/" + fileExames.size() + " ===");
            System.out.println(fileExames.get(i).toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTable tableExames;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables

}
