package org.internship.controller;

import org.internship.DAO.RequirementDAO;
import org.internship.model.Requirement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RequirementController {
  private RequirementDAO dao = new RequirementDAO();

  @GetMapping("/requirements")
  public List<Requirement> all(){
    return (List<Requirement>) dao.findAll();
  }

  @PostMapping("/requirements")
  public Requirement newRequirement(@RequestBody Requirement newRequirement){
    return dao.save(newRequirement);
    //TODO: Implement error handling
  }

  @GetMapping("/requirements/{id}")
  Requirement one(@PathVariable Long id) {
    return dao.find(id);
    //TODO: Implement error handling
  }

  @PutMapping("/requirements/{id}")
  Requirement editRequirement(@RequestBody Requirement requirement, @PathVariable Long id) {
    requirement.setId(id);
    return dao.edit(requirement);
    //TODO: Implement error handling
  }

  @DeleteMapping("/requirements/{id}")
  Boolean deleteRequirement(@PathVariable Long id) {
    return dao.delete(id);
    //TODO: Implement error handling
  }
}
