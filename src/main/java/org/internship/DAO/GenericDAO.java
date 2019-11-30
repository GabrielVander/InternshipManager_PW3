package org.internship.DAO;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Repository
public class GenericDAO<T> {
  private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernatepu");;
  private EntityManager manager = entityManagerFactory.createEntityManager();
  private Class<T> type;

  public GenericDAO() {
  }

  public GenericDAO(Class<T> type) {
    this.type = type;
  }

  public T save(T entity) {
    EntityManager em = manager;
    em.getTransaction().begin();
    em.persist(entity);
    em.getTransaction().commit();
//    em.close();
    return entity;
  }

  public Boolean delete(T entity) {
    try {
      EntityManager em = manager;
      em.getTransaction().begin();
      em.remove(entity);
      em.getTransaction().commit();
//      em.close();
    } catch (Exception ex) {
      return false;
    }
    return true;
  }

  public Boolean delete(int id) {
    try {
      EntityManager em = manager;
      em.getTransaction().begin();
      em.remove(em.find(type, id));
      em.getTransaction().commit();
//      em.close();
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
      return false;
    }
    return true;
  }

  public T edit(T entity) {
    try{
      EntityManager em = manager;
      em.getTransaction().begin();
      T result = em.merge(entity);
      em.getTransaction().commit();
//      em.close();
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
