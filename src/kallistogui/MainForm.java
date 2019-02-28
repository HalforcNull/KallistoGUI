package kallistogui;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author runan.yao
 */

public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        initSelfCode();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileListPanel = new javax.swing.JPanel();
        pSourceFile = new javax.swing.JScrollPane();
        listSourceFile = new javax.swing.JList<>();
        pTreatment = new javax.swing.JScrollPane();
        listTreatmentGroup = new javax.swing.JList<>();
        pControlGroup = new javax.swing.JScrollPane();
        listControlGroup = new javax.swing.JList<>();
        pSeqFileManage = new javax.swing.JPanel();
        btnChooseDataFiles = new javax.swing.JButton();
        cbDoubleEnd = new javax.swing.JCheckBox();
        pIndex = new javax.swing.JPanel();
        ddlSpecies = new javax.swing.JComboBox<>();
        cbHaveIndexFile = new javax.swing.JCheckBox();
        btAddIndexFile = new javax.swing.JButton();
        cbHaveSpeiceAnnotationFile = new javax.swing.JCheckBox();
        pOtherParms = new javax.swing.JPanel();
        btStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileListPanel.setName(""); // NOI18N

        listSourceFile.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listSourceFile.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listSourceFile.setDragEnabled(true);
        listSourceFile.setDropMode(javax.swing.DropMode.INSERT);
        pSourceFile.setViewportView(listSourceFile);
        listSourceFile.getAccessibleContext().setAccessibleParent(fileListPanel);

        listTreatmentGroup.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listTreatmentGroup.setDragEnabled(true);
        listTreatmentGroup.setDropMode(javax.swing.DropMode.INSERT);
        pTreatment.setViewportView(listTreatmentGroup);

        listControlGroup.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listControlGroup.setDragEnabled(true);
        listControlGroup.setDropMode(javax.swing.DropMode.INSERT);
        pControlGroup.setViewportView(listControlGroup);

        javax.swing.GroupLayout fileListPanelLayout = new javax.swing.GroupLayout(fileListPanel);
        fileListPanel.setLayout(fileListPanelLayout);
        fileListPanelLayout.setHorizontalGroup(
            fileListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fileListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pSourceFile, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                .addComponent(pTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(fileListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fileListPanelLayout.createSequentialGroup()
                    .addGap(242, 242, 242)
                    .addComponent(pControlGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(243, Short.MAX_VALUE)))
        );
        fileListPanelLayout.setVerticalGroup(
            fileListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fileListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fileListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pTreatment, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(pSourceFile))
                .addContainerGap())
            .addGroup(fileListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fileListPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pControlGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        btnChooseDataFiles.setText("Add file");
        btnChooseDataFiles.setToolTipText("Adding new sequence file");
        btnChooseDataFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseDataFilesActionPerformed(evt);
            }
        });

        cbDoubleEnd.setText("Double end");
        cbDoubleEnd.setToolTipText("Check if your sequence data is double end");

        javax.swing.GroupLayout pSeqFileManageLayout = new javax.swing.GroupLayout(pSeqFileManage);
        pSeqFileManage.setLayout(pSeqFileManageLayout);
        pSeqFileManageLayout.setHorizontalGroup(
            pSeqFileManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSeqFileManageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnChooseDataFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbDoubleEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pSeqFileManageLayout.setVerticalGroup(
            pSeqFileManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSeqFileManageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSeqFileManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChooseDataFiles)
                    .addComponent(cbDoubleEnd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ddlSpecies.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbHaveIndexFile.setText("I Have An Index");

        btAddIndexFile.setText("Add Index File");
        btAddIndexFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddIndexFileActionPerformed(evt);
            }
        });

        cbHaveSpeiceAnnotationFile.setText("I have the annotation");

        javax.swing.GroupLayout pIndexLayout = new javax.swing.GroupLayout(pIndex);
        pIndex.setLayout(pIndexLayout);
        pIndexLayout.setHorizontalGroup(
            pIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIndexLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbHaveSpeiceAnnotationFile, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHaveIndexFile, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddlSpecies, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pIndexLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btAddIndexFile))
        );
        pIndexLayout.setVerticalGroup(
            pIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pIndexLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbHaveIndexFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbHaveSpeiceAnnotationFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ddlSpecies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAddIndexFile))
        );

        btStart.setText("Start Analysis");
        btStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pOtherParmsLayout = new javax.swing.GroupLayout(pOtherParms);
        pOtherParms.setLayout(pOtherParmsLayout);
        pOtherParmsLayout.setHorizontalGroup(
            pOtherParmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pOtherParmsLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(btStart)
                .addGap(21, 21, 21))
        );
        pOtherParmsLayout.setVerticalGroup(
            pOtherParmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pOtherParmsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btStart))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fileListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pSeqFileManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(pIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(pOtherParms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fileListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pSeqFileManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pIndex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pOtherParms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    final JFileChooser FChooser = new JFileChooser();
    
    private void btnChooseDataFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseDataFilesActionPerformed
        int returnVal = FChooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            var model = (DefaultListModel) this.listSourceFile.getModel();
            File[] selectedFiles = FChooser.getSelectedFiles();
            for(int i = 0; i < selectedFiles.length; i++){
                var f = selectedFiles[i];
                model.addElement(new FileListItem(f.getName(),f.getAbsolutePath()));
            }
        }
    }//GEN-LAST:event_btnChooseDataFilesActionPerformed

    private void btAddIndexFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddIndexFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAddIndexFileActionPerformed

    private void btStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStartActionPerformed
        // TODO add your handling code here:
        if(this.cbHaveIndexFile != true){
            
        }
    }//GEN-LAST:event_btStartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddIndexFile;
    private javax.swing.JButton btStart;
    private javax.swing.JButton btnChooseDataFiles;
    private javax.swing.JCheckBox cbDoubleEnd;
    private javax.swing.JCheckBox cbHaveIndexFile;
    private javax.swing.JCheckBox cbHaveSpeiceAnnotationFile;
    private javax.swing.JComboBox<String> ddlSpecies;
    private javax.swing.JPanel fileListPanel;
    private javax.swing.JList<FileListItem> listControlGroup;
    private javax.swing.JList<FileListItem> listSourceFile;
    private javax.swing.JList<FileListItem> listTreatmentGroup;
    private javax.swing.JScrollPane pControlGroup;
    private javax.swing.JPanel pIndex;
    private javax.swing.JPanel pOtherParms;
    private javax.swing.JPanel pSeqFileManage;
    private javax.swing.JScrollPane pSourceFile;
    private javax.swing.JScrollPane pTreatment;
    // End of variables declaration//GEN-END:variables

    private void initSelfCode() {
        this.listSourceFile.setTransferHandler(new FileListTransferHandler());
        this.listControlGroup.setTransferHandler(new FileListTransferHandler());
        this.listTreatmentGroup.setTransferHandler(new FileListTransferHandler());
       
        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement(new FileListItem("abs","bbs"));
        listModel.addElement(new FileListItem("abs2","bbs2"));        
        this.listSourceFile.setModel(listModel);

        this.listControlGroup.setModel(new DefaultListModel());
        this.listTreatmentGroup.setModel(new DefaultListModel());
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Sequence File", ".fa", ".fastq");
        FChooser.setFileFilter(filter);
        FChooser.setMultiSelectionEnabled(true);
        FChooser.setToolTipText("Add sequnce files");
        FChooser.setDialogTitle("Choose File");
    }
}
