package org.internship.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Administrator extends User {
  @Id
  @GeneratedValue()
  public Long id;

  public Administrator(String login, String password, String email) {
    this.setLogin(login);
    this.setPassword(password);
    this.setEmail(email);
  }

  public Administrator() {
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
