
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentID;
    private String firstName;
    private String lastName;
    private String enrollment;


    public Student(int studentID, String firstName, String lastName, String enrollment){
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enrollment = enrollment;
    }
    
    public Student(int studentID, String firstName, String lastName){
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Student(String firstName, String lastName, String enrollment){
        this.firstName = firstName;
        this.lastName = lastName;
        this.enrollment = enrollment;
    }
    
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    @Override
    public String toString() {
        return studentID + " " + firstName + " " + lastName;
    }
    
    
}
