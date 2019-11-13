package org.internship.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Administrator extends User implements Serializable {
  @Id
  @GeneratedValue
  private Long id;

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
