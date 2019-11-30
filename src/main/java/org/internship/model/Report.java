package org.internship.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Report {
  @Id
  @GeneratedValue
  private int id;
  private String link;
  @ManyToOne
  private Internship internship;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Internship getInternship() {
    return internship;
  }

  public void setInternship(Internship internship) {
    this.internship = internship;
  }
}
