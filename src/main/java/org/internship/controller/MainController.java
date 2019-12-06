package org.internship.controller;

import org.internship.DAO.CompanyDAO;
import org.internship.DAO.StudentDAO;
import org.internship.model.Company;
import org.internship.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
  @RequestMapping("/")
  public String index(){
    return "index";
  }

  @RequestMapping("/registerCompany")
  public String registerCompany(){
    return "viewRegisterCompany";
  }

  @RequestMapping("/registerStudent")
  public String registerStudent(){
    return "viewRegisterStudent";
  }

  @RequestMapping("/registerSupervisor")
  public String registerSupervisor(){
    return "viewRegisterSupervisor";
  }

  @GetMapping("/editCompany/{id}")
  public String getEditCompany(@PathVariable int id, Model model){
    Company company = new CompanyDAO().find(id);
    model.addAttribute("company", company);

    return "viewManagerCompany";
  }

  @GetMapping("/login")
  public String login(){
    return "viewLogin";
  }

  @GetMapping("/vacancy/{id}")
  public String getVacancy(@PathVariable int id, Model model){
    Student student = new StudentDAO().find(id);
    model.addAttribute("student", student);
    return "viewManagerCompany";
  }
}
