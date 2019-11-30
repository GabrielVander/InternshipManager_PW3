package org.internship.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Entity
public class Vacancy {
  @Id
  @GeneratedValue
  private int id;
  private String title;
  private String description;
  @OneToMany
  private List<Requirement> requirements = new ArrayList<>();
  @ManyToOne
  private Company company;
  @ManyToMany
  private List<Student> applicants = new ArrayList<>();

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Iterator<Requirement> getRequirements() {
    return requirements.iterator();
  }

  public void addRequirement(Requirement requirement) {
    this.requirements.add(requirement);
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public Iterator<Student> getApplicants() {
    return applicants.iterator();
  }

  public void addApplicant(Student applicant) {
    this.applicants.add(applicant);
  }
}
