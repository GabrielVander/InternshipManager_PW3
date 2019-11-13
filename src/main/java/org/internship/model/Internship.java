package org.internship.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Internship implements Serializable {
  @Id
  @GeneratedValue
  private Long id;
  private String description;
  private Date startDate;
  private Date endDate;
  @OneToMany
  private List<Report> reports = new ArrayList<>();
  @OneToOne
  private Student student;
  @ManyToOne
  private Supervisor supervisor;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public List<Report> getReports() {
    return reports;
  }

  public void setReports(List<Report> reports) {
    this.reports = reports;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Supervisor getSupervisor() {
    return supervisor;
  }

  public void setSupervisor(Supervisor supervisor) {
    this.supervisor = supervisor;
  }
}
