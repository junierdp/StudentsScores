package Controller;

import Interfaces.ScoreDAO;
import Model.Score;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScoreDAOImpl implements ScoreDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentsScoresPU");
    EntityManager em;
    Query q;


    @Override
    public void insert(Score s) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }

    @Override
    public List<Score> search(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Score> showAll() {
        em = emf.createEntityManager();
        q = em.createNamedQuery("Score.findAll");
        return q.getResultList();
    }

    @Override
    public void delete(Score m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Score m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Score> searchForEnrollment(String enrollment){
        em = emf.createEntityManager();
        q = em.createNamedQuery("Score.findByEnrollment").setParameter("enrollment", enrollment);
        return q.getResultList();
    }
}
