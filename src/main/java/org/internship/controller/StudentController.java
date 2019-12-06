package org.internship.controller;

import org.internship.DAO.StudentDAO;
import org.internship.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
  private StudentDAO dao = new StudentDAO();

  @GetMapping("/students")
  public List<Student> all(){
    return (List<Student>) dao.findAll();
  }

  @PostMapping("/students")
  public Student newStudent(Student newStudent){
    System.out.println(newStudent.getName());
    return dao.save(newStudent);
    //TODO: Implement error handling
  }

  @GetMapping("/students/{id}")
  Student one(@PathVariable int id) {
    return dao.find(id);
    //TODO: Implement error handling
  }

  @PutMapping("/students/{id}")
  Student editStudent(Student student, @PathVariable int id) {
    student.setId(id);
    return dao.edit(student);
    //TODO: Implement error handling
  }

  @DeleteMapping("/students/{id}")
  Boolean deleteStudent(@PathVariable int id) {
    return dao.delete(id);
    //TODO: Implement error handling
  }
}
