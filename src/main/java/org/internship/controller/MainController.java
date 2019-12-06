package org.internship.controller;

import org.springframework.stereotype.Controller;
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
}
