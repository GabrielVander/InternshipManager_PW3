package org.internship.controller;

import org.internship.DAO.AdministratorDAO;
import org.internship.model.Administrator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdministratorController {
  private AdministratorDAO dao = new AdministratorDAO();

  @GetMapping("/administrators")
  public List<Administrator> all(){
    return (List<Administrator>) dao.findAll();
  }

  @PostMapping("/administrators")
  public Administrator newAdministrator(@RequestBody Administrator newAdministrator){
    return dao.save(newAdministrator);
    //TODO: Implement error handling
  }

  @GetMapping("/administrators/{id}")
  Administrator one(@PathVariable Long id) {
    return dao.find(id);
    //TODO: Implement error handling
  }

  @PutMapping("/administrators/{id}")
  Administrator editAdministrator(@RequestBody Administrator administrator) {
    return dao.edit(administrator);
    //TODO: Implement error handling
  }

  @DeleteMapping("/employees/{id}")
  void deleteAdministrator(@PathVariable Long id) {
    dao.delete(id);
    //TODO: Implement error handling
  }
}