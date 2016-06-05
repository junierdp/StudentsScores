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
        jmiAddSubject = new javax.swing.JMenuItem();
        jmiShowSubjects = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiAddScore = new javax.swing.JMenuItem();
        jmiShowScores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estudiantes Notas");
        setResizable(false);

        javax.swing.GroupLayout jdpDesktopLayout = new javax.swing.GroupLayout(jdpDesktop);
        jdpDesktop.setLayout(jdpDesktopLayout);
        jdpDesktopLayout.setHorizontalGroup(
            jdpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );
        jdpDesktopLayout.setVerticalGroup(
            jdpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        jMenu1.setText("Students");

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

        jMenu2.setText("Subjects");

        jmiAddSubject.setText("Add Subject");
        jmiAddSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddSubjectActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAddSubject);

        jmiShowSubjects.setText("Show Subjects");
        jmiShowSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiShowSubjectsActionPerformed(evt);
            }
        });
        jMenu2.add(jmiShowSubjects);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Scores");

        jmiAddScore.setText("Add Score");
        jmiAddScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddScoreActionPerformed(evt);
            }
        });
        jMenu3.add(jmiAddScore);

        jmiShowScores.setText("Show Scores");
        jmiShowScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiShowScoresActionPerformed(evt);
            }
        });
        jMenu3.add(jmiShowScores);

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

    private void jmiAddSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddSubjectActionPerformed
        RegisterSubjectGUI rsbg = new RegisterSubjectGUI();
        jdpDesktop.add(rsbg);
        rsbg.show();
    }//GEN-LAST:event_jmiAddSubjectActionPerformed

    private void jmiShowSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiShowSubjectsActionPerformed
        ShowSubjectGUI ssug = new ShowSubjectGUI();
        jdpDesktop.add(ssug);
        ssug.show();
    }//GEN-LAST:event_jmiShowSubjectsActionPerformed

    private void jmiAddScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddScoreActionPerformed
        RegisterScoreGUI rscg = new RegisterScoreGUI();
        jdpDesktop.add(rscg);
        rscg.show();
    }//GEN-LAST:event_jmiAddScoreActionPerformed

    private void jmiShowScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiShowScoresActionPerformed
        ShowScoreGUI sscg = new ShowScoreGUI();
        jdpDesktop.add(sscg);
        sscg.show();
    }//GEN-LAST:event_jmiShowScoresActionPerformed


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
            java.util.logging.Logger.getLogger(MainStudentsScoresGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainStudentsScoresGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainStudentsScoresGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainStudentsScoresGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JMenuItem jmiAddScore;
    private javax.swing.JMenuItem jmiAddSubject;
    private javax.swing.JMenuItem jmiRegisterStudent;
    private javax.swing.JMenuItem jmiShowScores;
    private javax.swing.JMenuItem jmiShowStudents;
    private javax.swing.JMenuItem jmiShowSubjects;
    // End of variables declaration//GEN-END:variables
}
