package org.internship.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Entity
public class Company extends User {
//  @Id
//  @GeneratedValue
//  private int id;
  @Id
  private String cpnj;
  private String name;
  private String address;
  @OneToMany
  private List<Vacancy> vacancies = new ArrayList<>();
  @OneToMany
  private List<Internship> internships = new ArrayList<>();
  @OneToMany
  private List<Supervisor> supervisors = new ArrayList<>();

//  public int getId() {
//    return id;
//  }
//
//  public void setId(int id) {
//    this.id = id;
//  }

  public String getCpnj() {
    return cpnj;
  }

  public void setCpnj(String cpnj) {
    this.cpnj = cpnj;
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

  public Iterator<Vacancy> getVacancies() {
    return vacancies.iterator();
  }

  public void addVacancy(Vacancy vacancy) {
    this.vacancies.add(vacancy);
  }

  public Iterator<Internship> getInternships() {
    return internships.iterator();
  }

  public void addInternship(Internship internship) {
    this.internships.add(internship);
  }

  public Iterator<Supervisor> getSupervisors() {
    return supervisors.iterator();
  }

  public void addSupervisor(Supervisor supervisor) {
    this.supervisors.add(supervisor);
  }
}
