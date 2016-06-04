
package Controller;

import Interfaces.SubjectDAO;
import Model.Subject;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SubjectDAOImpl implements SubjectDAO{
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentsScoresPU");
    EntityManager em;
    Query q;

    @Override
    public void insert(Subject s) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }

    @Override
    public List<Subject> search(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Subject> showAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Subject m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Subject m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
