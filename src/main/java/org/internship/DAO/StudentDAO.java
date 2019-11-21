package org.internship.DAO;

import org.internship.model.Student;

public class StudentDAO extends GenericDAO<Student> {
  public StudentDAO() {
    super(Student.class);
  }
}
