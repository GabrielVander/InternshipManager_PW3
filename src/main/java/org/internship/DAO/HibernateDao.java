package org.internship.DAO;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Repository
public class HibernateDao<T> {
  private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernatepu");;
  private EntityManager manager = entityManagerFactory.createEntityManager();
  private Class<T> type;

  public HibernateDao() {
  }

  public HibernateDao(Class<T> type) {
    this.type = type;
  }

  public T save(T entity) {
    EntityManager em = manager;
    em.getTransaction().begin();
    em.persist(entity);
    em.getTransaction().commit();
    return entity;
  }

  public Boolean delete(T entity) {
    try {
      manager.remove(entity);
    } catch (Exception ex) {
      return false;
    }
    return true;
  }

  public Boolean delete(Long id) {
    try {
      manager.remove(manager.find(type, id));
    } catch (Exception ex) {
      return false;
    }
    return true;
  }

  public T edit(T entity) {
    try{
      return manager.merge(entity);
    } catch(Exception ex) {
      return null;
    }
  }

  public T find(Long id) {
    return manager.find(type, id);
  }

  public List<T> findAll(){
    return (List<T>) manager.createQuery("Select t from " + type.getSimpleName() + " t").getResultList();
  }
}
