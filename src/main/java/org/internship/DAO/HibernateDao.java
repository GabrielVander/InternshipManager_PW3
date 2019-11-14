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
    manager.getTransaction().begin();
    manager.persist(entity);
    manager.getTransaction().commit();
    return entity;
  }

  public Boolean delete(T entity) {
    try {
      manager.getTransaction().begin();
      manager.remove(entity);
      manager.getTransaction().commit();
    } catch (Exception ex) {
      return false;
    }
    return true;
  }

  public Boolean delete(Long id) {
    try {
      manager.getTransaction().begin();
      manager.remove(manager.find(type, id));
      manager.getTransaction().commit();
    } catch (Exception ex) {
      return false;
    }
    return true;
  }

  public T edit(T entity) {
    try{
      manager.getTransaction().begin();
      T result = manager.merge(entity);
      manager.getTransaction().commit();
      return result;
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
