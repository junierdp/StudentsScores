package View;


import Controller.SubjectDAOImpl;
import Model.Subject;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ShowSubjectGUI extends javax.swing.JInternalFrame {

    int row;
    
    public ShowSubjectGUI() {
        initComponents();
        showSubject();
        rbID.setSelected(true);
    }
    
    public void showSubject(){
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID", "Subject Name"});
        SubjectDAOImpl dao = new SubjectDAOImpl();
        List<Subject> list = (List<Subject>) dao.showAll();
        Object[] o = new Object[model.getColumnCount()];
        for(int i = 0; i < list.size(); i++){
            o[0] = list.get(i).getSubjectID();
            o[1] = list.get(i).getName();
            model.addRow(o);
        }
        jtSubjects.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmiDelete = new javax.swing.JMenuItem();
        jmiModify = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtSubjects = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        rbID = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSubjectName = new javax.swing.JTextField();
        btnCancelM = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jmiDelete.setText("Delete");
        jmiDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDeleteActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jmiDelete);

        jmiModify.setText("Modify");
        jmiModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModifyActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jmiModify);

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(770, 449));

        jtSubjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtSubjects.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jtSubjects);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Search by");

        buttonGroup1.add(rbID);
        rbID.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        rbID.setText("ID");
        rbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Enter your search:");

        btnSearch.setBackground(new java.awt.Color(18, 222, 129));
        btnSearch.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(189, 228, 230));
        btnCancel.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Subject Name:");

        btnCancelM.setBackground(new java.awt.Color(189, 228, 230));
        btnCancelM.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnCancelM.setText("Cancel");

        btnModify.setBackground(new java.awt.Color(18, 222, 129));
        btnModify.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Subjects");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCancelM)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnModify))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(209, 209, 209))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(309, 309, 309))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rbID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelM)
                    .addComponent(btnModify))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDeleteActionPerformed
        int rowSelected = jtSubjects.getSelectedRow();
        if(rowSelected >= 0){
            int confirmJOP = JOptionPane.showConfirmDialog(null, "Are you sure that you want"
                    + " delete the subject: " + jtSubjects.getValueAt(row, 1), 
                    "Confirm",JOptionPane.YES_NO_OPTION);
            if(confirmJOP == 0){
                Subject s = new Subject(Integer.parseInt(jtSubjects.getValueAt(row, 0).toString()),
                                                jtSubjects.getValueAt(row, 1).toString());
                SubjectDAOImpl dao = new SubjectDAOImpl();
                dao.delete(s);
                JOptionPane.showMessageDialog(this, "Subject deleted", "Delete", JOptionPane.INFORMATION_MESSAGE);
                showSubject();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Select a subject.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmiDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(rbID.isSelected()){
            if(validateTxt()){
                DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(new Object[]{"ID", "Subject Name"});
                SubjectDAOImpl dao = new SubjectDAOImpl();
                List<Subject> lista = (List<Subject>) dao.search(Integer.parseInt(txtSearch.getText()));
                Object[] o = new Object[model.getColumnCount()];
                for(int i = 0; i < lista.size(); i++){
                    o[0] = lista.get(i).getSubjectID();
                    o[1] = lista.get(i).getName();
                    model.addRow(o);
                }
                jtSubjects.setModel(model);
            }
            else{
                JOptionPane.showMessageDialog(null, "Please complete the search field.", "Error", JOptionPane.ERROR_MESSAGE);
                showSubject();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a search parameter.", "Error", JOptionPane.ERROR_MESSAGE);
            showSubject();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtSearch.setText("");
        showSubject();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        if(validateM()){
            Subject s = new Subject(Integer.parseInt(jtSubjects.getValueAt(row, 0).toString()), 
                    txtSubjectName.getText());
            SubjectDAOImpl dao = new SubjectDAOImpl();
            dao.update(s);
            JOptionPane.showMessageDialog(this, "Subject Modified!");
            cleanM();
            showSubject();
        }
        else{
            JOptionPane.showMessageDialog(this, "Select a subject from the table or complete the empty files.", 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void jmiModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModifyActionPerformed
        row = jtSubjects.getSelectedRow();
        if(row >= 0){
            txtSubjectName.setText(jtSubjects.getValueAt(row, 1).toString());
        }
        else {
            JOptionPane.showMessageDialog(null, "Select a row", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmiModifyActionPerformed

    private void rbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbIDActionPerformed

     private boolean validateTxt(){
        return !(txtSearch.getText().trim().equals(""));
    }
     
     private boolean validateM() {
        return !(txtSubjectName.getText().trim().equals(""));
    }
    
    private void cleanM(){
        txtSubjectName.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancelM;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiDelete;
    private javax.swing.JMenuItem jmiModify;
    private javax.swing.JTable jtSubjects;
    private javax.swing.JRadioButton rbID;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSubjectName;
    // End of variables declaration//GEN-END:variables
}
