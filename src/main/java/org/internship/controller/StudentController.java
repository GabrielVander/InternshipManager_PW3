package org.internship.controller;

import org.internship.DAO.StudentDAO;
import org.internship.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class StudentController {
  private StudentDAO dao = new StudentDAO();

  @GetMapping("/students")
  public RedirectView all(Model model){
    List<Student> students = dao.findAll();
    System.out.println(students.size());
    model.addAttribute("students", students);
    return new RedirectView("./");
  }

  @PostMapping("/newStudent")
  public RedirectView newStudent(Student newStudent){
    System.out.println(newStudent.getName());
    dao.save(newStudent);
    return new RedirectView("./");
    //TODO: Implement error handling
  }

  @GetMapping("/students/{id}")
  Student one(@PathVariable int id) {
    return dao.find(id);
    //TODO: Implement error handling
  }

  @PostMapping("/students/{id}")
  Student editStudent(Student student, @PathVariable int id) {
    student.setId(id);
    return dao.edit(student);
    //TODO: Implement error handling
  }

  @RequestMapping("/students/{id}")
  Boolean deleteStudent(@PathVariable int id) {
    return dao.delete(id);
    //TODO: Implement error handling
  }
}
