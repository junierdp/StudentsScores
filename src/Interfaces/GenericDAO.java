
package Interfaces;

import java.util.List;

public interface GenericDAO<M> {
    public void insert(M m);
    public List<M> search(int id);
    public List<M> showAll();
    public void delete(M m);
    public void update(M m);
}
