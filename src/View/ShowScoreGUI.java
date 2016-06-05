package View;


import Controller.ScoreDAOImpl;
import Model.Score;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ShowScoreGUI extends javax.swing.JInternalFrame {
    
    int row;
    
    public ShowScoreGUI() {
        initComponents();
        showScore();
    }

    private void showScore(){
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID", "First Name", "Last Name", "Enrollment", "Subject", "Score"});
        ScoreDAOImpl dao = new ScoreDAOImpl();
        List<Score> list = (List<Score>) dao.showAll();
        Object[] o = new Object[model.getColumnCount()];
        for(int i = 0; i < list.size(); i++){
            o[0] = list.get(i).getScoreID();
            o[1] = list.get(i).getStudentID().getFirstName();
            o[2] = list.get(i).getStudentID().getLastName();
            o[3] = list.get(i).getStudentID().getEnrollment();
            o[4] = list.get(i).getSubjectID().getName();
            o[5] = list.get(i).getScore();
            model.addRow(o);
        }
        jtScores.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmiDelete = new javax.swing.JMenuItem();
        jmiModify = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtScores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        rbEnrollment = new javax.swing.JRadioButton();
        rbScore = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtScore = new javax.swing.JTextField();
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
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(770, 449));

        jtScores.setModel(new javax.swing.table.DefaultTableModel(
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
        jtScores.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jtScores);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Search by:");

        buttonGroup1.add(rbEnrollment);
        rbEnrollment.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        rbEnrollment.setText("Enrollment");

        buttonGroup1.add(rbScore);
        rbScore.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        rbScore.setText("Score");

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
        jLabel3.setText("Score:");

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
        jLabel4.setText("Students Scores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbScore, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModify))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(307, 307, 307))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(306, 306, 306))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rbEnrollment)
                    .addComponent(rbScore))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearch)
                        .addComponent(btnCancel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModify)
                    .addComponent(btnCancelM))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDeleteActionPerformed
        int rowSelected = jtScores.getSelectedRow();
        if(rowSelected >= 0){
            int confirmJOP = JOptionPane.showConfirmDialog(null, "Are you sure that you want"
                    + " delete the score of this student: " + jtScores.getValueAt(row, 3), 
                    "Confirm",JOptionPane.YES_NO_OPTION);
            if(confirmJOP == 0){
                Score s = new Score(Integer.parseInt(txtScore.getText()));
                ScoreDAOImpl dao = new ScoreDAOImpl();
                dao.delete(s);
                JOptionPane.showMessageDialog(this, "Score deletes", "Delete", JOptionPane.INFORMATION_MESSAGE);
                showScore();
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
                model.setColumnIdentifiers(new Object[]{"ID", "First Name", "Last Name", "Enrollment", "Subject", "Score"});
                ScoreDAOImpl dao = new ScoreDAOImpl();
                List<Score> list = (List<Score>) dao.searchForEnrollment(txtSearch.getText());
                Object[] o = new Object[model.getColumnCount()];
                for(int i = 0; i < list.size(); i++){
                    o[0] = list.get(i).getScoreID();
                    o[1] = list.get(i).getStudentID().getFirstName();
                    o[2] = list.get(i).getStudentID().getLastName();
                    o[3] = list.get(i).getStudentID().getEnrollment();
                    o[4] = list.get(i).getSubjectID().getName();
                    o[5] = list.get(i).getScore();
                    model.addRow(o);
                }
                jtScores.setModel(model);
            }
            else{
                JOptionPane.showMessageDialog(null, "Please complete the search field.", "Error", JOptionPane.ERROR_MESSAGE);
                showScore();
            }
        }
        else if(rbScore.isSelected()){
            if(validateTxt()){
                DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(new Object[]{"ID", "First Name", "Last Name", "Enrollment", "Subject", "Score"});
                ScoreDAOImpl dao = new ScoreDAOImpl();
                List<Score> list = (List<Score>) dao.search(Integer.parseInt(txtSearch.getText()));
                Object[] o = new Object[model.getColumnCount()];
                for(int i = 0; i < list.size(); i++){
                    o[0] = list.get(i).getScoreID();
                    o[1] = list.get(i).getStudentID().getFirstName();
                    o[2] = list.get(i).getStudentID().getLastName();
                    o[3] = list.get(i).getStudentID().getEnrollment();
                    o[4] = list.get(i).getSubjectID().getName();
                    o[5] = list.get(i).getScore();
                    model.addRow(o);
                }
                jtScores.setModel(model);
            }
            else{
                JOptionPane.showMessageDialog(null, "Please complete the search field.", "Error", JOptionPane.ERROR_MESSAGE);
                showScore();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a search parameter.", "Error", JOptionPane.ERROR_MESSAGE);
            showScore();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtSearch.setText("");
        showScore();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jmiModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModifyActionPerformed
        row = jtScores.getSelectedRow();
        if(row >= 0){
            txtScore.setText(jtScores.getValueAt(row, 5).toString());
        }
        else {
            JOptionPane.showMessageDialog(null, "Select a row.", "Error", JOptionPane.ERROR_MESSAGE);
        }    }//GEN-LAST:event_jmiModifyActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        if(validateM()){
            Score s = new Score(Integer.parseInt(jtScores.getValueAt(row, 0).toString()), 
                    Integer.parseInt(txtScore.getText()));
            ScoreDAOImpl dao = new ScoreDAOImpl();
            dao.update(s);
            JOptionPane.showMessageDialog(this, "Score modified!");
            cleanM();
            showScore();
        }
        else{
            JOptionPane.showMessageDialog(this, "Select a score from the table or complete the empty files.", 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private boolean validateTxt(){
        return !(txtSearch.getText().trim().equals(""));
    }
    private boolean validateM() {
        return !(txtScore.getText().trim().equals(""));
    }
    
    private void cleanM(){
        txtScore.setText("");
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
    private javax.swing.JTable jtScores;
    private javax.swing.JRadioButton rbEnrollment;
    private javax.swing.JRadioButton rbScore;
    private javax.swing.JTextField txtScore;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
