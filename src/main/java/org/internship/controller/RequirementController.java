package org.internship.controller;

import org.internship.DAO.RequirementDAO;
import org.internship.model.Requirement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class RequirementController {
  private RequirementDAO dao = new RequirementDAO();

  @GetMapping("/requirements")
  public List<Requirement> all(){
    return (List<Requirement>) dao.findAll();
  }

  @PostMapping("/requirements")
  public Requirement newRequirement(Requirement newRequirement){
    return dao.save(newRequirement);
    //TODO: Implement error handling
  }

  @GetMapping("/requirements/{id}")
  Requirement one(@PathVariable int id) {
    return dao.find(id);
    //TODO: Implement error handling
  }

  @PutMapping("/requirements/{id}")
  Requirement editRequirement(Requirement requirement, @PathVariable int id) {
    requirement.setId(id);
    return dao.edit(requirement);
    //TODO: Implement error handling
  }

  @DeleteMapping("/requirements/{id}")
  Boolean deleteRequirement(@PathVariable int id) {
    return dao.delete(id);
    //TODO: Implement error handling
  }
}
