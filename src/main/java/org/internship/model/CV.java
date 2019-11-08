package org.internship.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CV {
  @Id
  @GeneratedValue
  private Long id;

}
