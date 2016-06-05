package View;


import Controller.StudentDAOImpl;
import Model.Student;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ShowStudentGUI extends javax.swing.JInternalFrame {

    ResultSet rs;
    int row;
    
    public ShowStudentGUI() {
        initComponents();
        showStudents();
    }
    
    public void showStudents(){
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID", "First Name", "Last Name", "Enrollment"});
        StudentDAOImpl dao = new StudentDAOImpl();
        List<Student> list = (List<Student>) dao.showAll();
        Object[] o = new Object[model.getColumnCount()];
        for(int i = 0; i < list.size(); i++){
            o[0] = list.get(i).getStudentID();
            o[1] = list.get(i).getFirstName();
            o[2] = list.get(i).getLastName();
            o[3] = list.get(i).getEnrollment();
            model.addRow(o);
        }
        jtStudents.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmiDelete = new javax.swing.JMenuItem();
        jmiModify = new javax.swing.JMenuItem();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtStudents = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        rbID = new javax.swing.JRadioButton();
        rbEnrollment = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        btnCancelM = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

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
        setResizable(true);

        jtStudents.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jtStudents.setModel(new javax.swing.table.DefaultTableModel(
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
        jtStudents.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jtStudents);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Search by:");

        buttonGroup2.add(rbID);
        rbID.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        rbID.setText("ID");

        buttonGroup2.add(rbEnrollment);
        rbEnrollment.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        rbEnrollment.setText("Enrollment");

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
        jLabel3.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Last Name:");

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("Students Registered");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbID, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModify))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFirstName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rbID)
                    .addComponent(rbEnrollment))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelM)
                    .addComponent(btnModify))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDeleteActionPerformed
        int rowSelected = jtStudents.getSelectedRow();
        if(rowSelected >= 0){
            int confirmJOP = JOptionPane.showConfirmDialog(null, "Are you sure that you want"
                    + " to delete the student: " + jtStudents.getValueAt(rowSelected, 3), 
                    "Confirm",JOptionPane.YES_NO_OPTION);
            if(confirmJOP == 0){
                Student s = new Student(Integer.parseInt(jtStudents.getValueAt(rowSelected, 0).toString()),
                        jtStudents.getValueAt(rowSelected, 1).toString(), jtStudents.getValueAt(rowSelected, 2).toString(),
                        jtStudents.getValueAt(rowSelected, 3).toString());
                StudentDAOImpl dao = new StudentDAOImpl();
                dao.delete(s);
                JOptionPane.showMessageDialog(this, "Student deleted,", "Delete", JOptionPane.INFORMATION_MESSAGE);
                showStudents();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Select a student.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmiDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(rbEnrollment.isSelected()){
            if(validateTxt()){
                DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(new Object[]{"ID", "First Name", "Last Name", "Enrollment"});
                StudentDAOImpl dao = new StudentDAOImpl();
                List<Student> list = (List<Student>) dao.searchForEnrollment(txtSearch.getText());
                Object[] o = new Object[model.getColumnCount()];
                for(int i = 0; i < list.size(); i++){
                    o[0] = list.get(i).getStudentID();
                    o[1] = list.get(i).getFirstName();
                    o[2] = list.get(i).getLastName();
                    o[3] = list.get(i).getEnrollment();
                    model.addRow(o);
                }
                jtStudents.setModel(model);
            }
            else{
                JOptionPane.showMessageDialog(null, "Please complete the search field.", "Error", JOptionPane.ERROR_MESSAGE);
                showStudents();
            }
        }
        else if(rbID.isSelected()){
            if(validateTxt()){
                DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(new Object[]{"ID", "First Name", "Last Name", "Enrollment"});
                StudentDAOImpl dao = new StudentDAOImpl();
                List<Student> list = (List<Student>) dao.search(Integer.parseInt(txtSearch.getText()));
                Object[] o = new Object[model.getColumnCount()];
                for(int i = 0; i < list.size(); i++){
                    o[0] = list.get(i).getStudentID();
                    o[1] = list.get(i).getFirstName();
                    o[2] = list.get(i).getLastName();
                    o[3] = list.get(i).getEnrollment();
                    model.addRow(o);
                }
                jtStudents.setModel(model);
            }
            else{
                JOptionPane.showMessageDialog(null, "Please complete the search field.", "Error", JOptionPane.ERROR_MESSAGE);
                showStudents();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a search parameter.", "Error", JOptionPane.ERROR_MESSAGE);
            showStudents();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtSearch.setText("");
        showStudents();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jmiModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModifyActionPerformed
        row = jtStudents.getSelectedRow();
        if(row >= 0){
            txtFirstName.setText(jtStudents.getValueAt(row, 1).toString());
            txtLastName.setText(jtStudents.getValueAt(row, 2).toString());
        }
        else {
            JOptionPane.showMessageDialog(null, "Select a row", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmiModifyActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        if(validateM()){
            Student e = new Student(Integer.parseInt(jtStudents.getValueAt(row, 0).toString()), 
                    txtFirstName.getText(), txtLastName.getText());
            StudentDAOImpl dao = new StudentDAOImpl();
            dao.update(e);
            JOptionPane.showMessageDialog(this, "Student modified.!");
            cleanM();
            showStudents();
        }
        else{
            JOptionPane.showMessageDialog(this, "Select a student from the table or complete the empty files.", 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private boolean validateTxt(){
        return !(txtSearch.getText().trim().equals(""));
    }
    
    private boolean validateM() {
        return !(txtFirstName.getText().trim().equals("")
                || txtLastName.getText().trim().equals(""));
    }
    
    private void cleanM(){
        txtFirstName.setText("");
        txtLastName.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancelM;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiDelete;
    private javax.swing.JMenuItem jmiModify;
    private javax.swing.JTable jtStudents;
    private javax.swing.JRadioButton rbEnrollment;
    private javax.swing.JRadioButton rbID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
