
package Interfaces;

import Model.Student;
import java.util.List;

public interface StudentDAO extends GenericDAO<Student>{
    public List<Student>searchForEnrollment(String enrollment);
}
