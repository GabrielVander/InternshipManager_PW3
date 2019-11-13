package org.internship.controller;

import org.internship.DAO.AdministratorDAO;
import org.internship.model.Administrator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {
  @RequestMapping("/")
  public String index(){
    return "index";
  }
}
