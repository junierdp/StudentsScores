package View;

public class MainStudentsScoresGUI extends javax.swing.JFrame {

    public MainStudentsScoresGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiRegisterStudent = new javax.swing.JMenuItem();
        jmiShowStudents = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpDesktopLayout = new javax.swing.GroupLayout(jdpDesktop);
        jdpDesktop.setLayout(jdpDesktopLayout);
        jdpDesktopLayout.setHorizontalGroup(
            jdpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        jdpDesktopLayout.setVerticalGroup(
            jdpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        jMenu1.setText("Student");

        jmiRegisterStudent.setText("Register Student");
        jmiRegisterStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegisterStudentActionPerformed(evt);
            }
        });
        jMenu1.add(jmiRegisterStudent);

        jmiShowStudents.setText("Show Students");
        jmiShowStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiShowStudentsActionPerformed(evt);
            }
        });
        jMenu1.add(jmiShowStudents);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Subject");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Score");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiRegisterStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegisterStudentActionPerformed
        RegisterStudentGUI rsg = new RegisterStudentGUI();
        jdpDesktop.add(rsg);
        rsg.show();
    }//GEN-LAST:event_jmiRegisterStudentActionPerformed

    private void jmiShowStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiShowStudentsActionPerformed
        ShowStudentGUI ssg = new ShowStudentGUI();
        jdpDesktop.add(ssg);
        ssg.show();
    }//GEN-LAST:event_jmiShowStudentsActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainStudentsScoresGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpDesktop;
    private javax.swing.JMenuItem jmiRegisterStudent;
    private javax.swing.JMenuItem jmiShowStudents;
    // End of variables declaration//GEN-END:variables
}
