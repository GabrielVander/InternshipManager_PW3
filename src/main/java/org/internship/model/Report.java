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


}
