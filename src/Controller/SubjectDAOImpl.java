
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
        em = emf.createEntityManager();
        q = em.createQuery("SELECT s FROM Subject s WHERE s.subjectID=:id");
        q.setParameter("id", id);
        return q.getResultList();
    }

    @Override
    public List<Subject> showAll() {
        em = emf.createEntityManager();
        q = em.createNamedQuery("Subject.findAll");
        return q.getResultList();
    }

    @Override
    public void delete(Subject s) {
        em = emf.createEntityManager();
        s = em.find(Subject.class, s.getSubjectID());
        em.getTransaction().begin();
        em.remove(s);
        em.getTransaction().commit();
    }

    @Override
    public void update(Subject s) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createNamedQuery("Subject.update", Subject.class)
                .setParameter("name", s.getName())
                .setParameter("subjectID", s.getSubjectID())
                .executeUpdate();
        em.getTransaction().commit();
    }   
}
