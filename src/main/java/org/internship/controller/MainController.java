package org.internship.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
  @RequestMapping("/")
  public String index(){
    return "index";
  }
}
