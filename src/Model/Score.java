package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author JunierDP
 */
@Entity
@Table(name = "Score")
public class Score{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ScoreID")
    private int scoreID;
    
    @Column(name = "Score")
    private int score;
    
    @Column(name = "StudentID")
    private int studentID;
    
    private String studentFirstName;
    private String studentLastName;
    private String studentEnrollment;
    
    @Column(name = "SubjectID")
    private int subjectID;
    
    private String subjectName;
        
    public Score(int scoreID, String studentFirstName, String studentLastName, 
            String studentEnrollment, String subjectName, int score){
        this.scoreID = scoreID;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentEnrollment = studentEnrollment;
        this.subjectName = subjectName;
        this.score = score;
    }
    
    public Score(int scoreID, int score){
        this.scoreID = scoreID;
        this.score = score;
    }
    
    public Score(int studentID, int subjectID, int score){
        this.studentID = studentID;
        this.subjectID = subjectID;
        this.score = score;
    }
    
    public Score(String studentFirstName, String studentLastName, 
            String studentEnrollment, String subjectName, int score){
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentEnrollment = studentEnrollment;
        this.subjectName = subjectName;
        this.score = score;
    }

    public int getScoreID() {
        return scoreID;
    }

    public void setScoreID(int scoreID) {
        this.scoreID = scoreID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentEnrollment() {
        return studentEnrollment;
    }

    public void setStudentEnrollment(String studentEnrollment) {
        this.studentEnrollment = studentEnrollment;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
