package org.internship.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Report {
  @Id
  @GeneratedValue
  private Long id;
  private String link;
  @ManyToOne
  private Internship internship;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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
