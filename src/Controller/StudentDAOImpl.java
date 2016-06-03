package Controller;

import Interfaces.StudentDAO;
import Model.Student;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentDAOImpl implements StudentDAO{
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentsScoresPU");
    EntityManager em;
    Query q;

    @Override
    public List<Student> searchForEnrollment(String enrollment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Student s) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }

    @Override
    public List<Student> search(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> showAll() {
        em = emf.createEntityManager();
        q = em.createNamedQuery("Student.findAll");
        return q.getResultList();
    }

    @Override
    public void delete(Student m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Student m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
