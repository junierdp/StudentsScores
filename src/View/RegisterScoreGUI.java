package View;

import Controller.SubjectDAOImpl;
import Controller.ScoreDAOImpl;
import Controller.StudentDAOImpl;
import Model.Student;
import Model.Subject;
import Model.Score;
import java.util.List;
import javax.swing.JOptionPane;

public class RegisterScoreGUI extends javax.swing.JInternalFrame {

    public RegisterScoreGUI() {
        initComponents();
        cbStudentName.addItem("Select a student.");
        cbSubjectName.addItem("Select a subject.");
        showStudent();
        showSubject();
    }
    
    private void showStudent(){
        StudentDAOImpl dao = new StudentDAOImpl();
        List<Student> list = (List<Student>) dao.showAll();  
        for(int i = 0; i < list.size(); i++){
            Student s = new Student(list.get(i).getStudentID(), list.get(i).getFirstName(), list.get(i).getLastName());
                cbStudentName.addItem(s);
        }
    }
    
    private void showSubject(){
        SubjectDAOImpl dao = new SubjectDAOImpl();
        List<Subject> list = (List<Subject>) dao.showAll();  
        for(int i = 0; i < list.size(); i++){
            Subject s = new Subject(list.get(i).getSubjectID(), list.get(i).getName());
                cbSubjectName.addItem(s);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbStudentName = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbSubjectName = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtScore = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Student Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Score Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Score:");

        btnCancel.setBackground(new java.awt.Color(189, 228, 230));
        btnCancel.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnCancel.setText("Cancel");

        btnSave.setBackground(new java.awt.Color(18, 222, 129));
        btnSave.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Register Score");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbStudentName, 0, 256, Short.MAX_VALUE)
                                    .addComponent(cbSubjectName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtScore)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSave))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        btnSave.setEnabled(false);
        if(validateSelect()){
            Student st = new Student(Integer.parseInt(cbStudentName.getSelectedItem().toString().substring(0,1)));
            Subject su = new Subject(Integer.parseInt(cbSubjectName.getSelectedItem().toString().substring(0,1)));
            Score s = new Score(st,su, Integer.parseInt(txtScore.getText()));
            ScoreDAOImpl dao = new ScoreDAOImpl();
            dao.insert(s);
            
            JOptionPane.showMessageDialog(this, "Score inserted", 
                                            "Information" ,JOptionPane.INFORMATION_MESSAGE);
            clean();
        }
        else {
            JOptionPane.showMessageDialog(this, "You must fill the empty fields.", 
                                            "Error", JOptionPane.ERROR_MESSAGE);
        }
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    public boolean validateSelect(){
        return !(cbStudentName.getSelectedItem().toString().trim().equals("Select a student.") ||
                 cbSubjectName.getSelectedItem().toString().trim().equals("Select a subject.") ||
                txtScore.getText().trim().equals("") || Integer.parseInt(txtScore.getText().trim()) < 0 ||
                Integer.parseInt(txtScore.getText().trim()) > 100);
    }
    
    public void clean(){
        txtScore.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cbStudentName;
    private javax.swing.JComboBox cbSubjectName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtScore;
    // End of variables declaration//GEN-END:variables
}
