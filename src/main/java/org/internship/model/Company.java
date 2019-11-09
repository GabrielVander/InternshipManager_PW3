package org.internship.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Entity
public class Company extends User{
  @Id
  @GeneratedValue
  private Long id;
  private String cpnj;
  private String email;
  private String name;
  private String address;
  @OneToMany
  private List<Vacancy> vacancies = new ArrayList<>();
  @OneToMany
  private List<Internship> internships = new ArrayList<>();
  @OneToMany
  private List<Supervisor> supervisors = new ArrayList<>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCpnj() {
    return cpnj;
  }

  public void setCpnj(String cpnj) {
    this.cpnj = cpnj;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Iterator getVacancies() {
    return vacancies.iterator();
  }

  public void addVacancy(Vacancy vacancy) {
    this.vacancies.add(vacancy);
  }

  public Iterator getInternships() {
    return internships.iterator();
  }

  public void addInternship(Internship internship) {
    this.internships.add(internship);
  }

  public Iterator getSupervisors() {
    return supervisors.iterator();
  }

  public void addSupervisor(Supervisor supervisor) {
    this.supervisors.add(supervisor);
  }
}
