package org.internship.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Supervisor extends User {
  @Id
  @GeneratedValue
  private int id;
  private String cpf;
  @OneToMany
  private List<Internship> internships;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public List<Internship> getInternships() {
    return internships;
  }

  public void setInternships(List<Internship> internships) {
    this.internships = internships;
  }
}
