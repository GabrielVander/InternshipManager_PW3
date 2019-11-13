package org.internship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.sql.ordering.antlr.Factory;
import org.internship.model.CV;
import org.internship.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@RestController
public class Main  {
  @RequestMapping("/ahhh")
  public void ahhh(){
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernatepu");
    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    CV cv = new CV();
    cv.setLink("jeiferson.besta");

    manager.persist(cv);
    manager.getTransaction().commit();
    manager.close();
    factory.close();
  }
}
