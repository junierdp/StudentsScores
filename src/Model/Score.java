package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "score")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Score.findAll", query = "SELECT s FROM Score s"),
    @NamedQuery(name = "Score.findByScoreID", query = "SELECT s FROM Score s WHERE s.scoreID = :scoreID"),
    @NamedQuery(name = "Score.findByScore", query = "SELECT s FROM Score s WHERE s.score = :score"),
    @NamedQuery(name = "Score.showAll", query = "SELECT sc.scoreID, st.firstName, st.lastName, st.enrollment, su.name, sc.score FROM Score sc INNER JOIN sc.studentID st INNER JOIN sc.subjectID su"),
    @NamedQuery(name = "Score.findByEnrollment", query = "SELECT sc FROM Score sc INNER JOIN sc.studentID st WHERE st.enrollment = :enrollment")})
public class Score implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ScoreID")
    private Integer scoreID;
    @Basic(optional = false)
    @Column(name = "Score")
    private int score;
    @JoinColumn(name = "StudentID", referencedColumnName = "StudentID")
    @ManyToOne(optional = false)
    private Student studentID;
    @JoinColumn(name = "SubjectID", referencedColumnName = "SubjectID")
    @ManyToOne(optional = false)
    private Subject subjectID;

    public Score() {
    }

    public Score(Integer scoreID) {
        this.scoreID = scoreID;
    }

    public Score(Integer scoreID, int score) {
        this.scoreID = scoreID;
        this.score = score;
    }

    public Score(Student studentID, Subject subjectID, int score){
        this.studentID = studentID;
        this.subjectID = subjectID;
        this.score = score;
    }
    
    public Integer getScoreID() {
        return scoreID;
    }

    public void setScoreID(Integer scoreID) {
        this.scoreID = scoreID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student getStudentID() {
        return studentID;
    }

    public void setStudentID(Student studentID) {
        this.studentID = studentID;
    }

    public Subject getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(Subject subjectID) {
        this.subjectID = subjectID;
    }
}
