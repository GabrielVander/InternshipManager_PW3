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
  private Long id;
  private String cpf;
  @OneToMany
  private List<Internship> internships;
}
