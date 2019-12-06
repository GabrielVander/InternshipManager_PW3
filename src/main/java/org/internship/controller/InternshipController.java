package org.internship.controller;

import org.internship.DAO.InternshipDAO;
import org.internship.model.Internship;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class InternshipController {
  private InternshipDAO dao = new InternshipDAO();

  @GetMapping("/internships")
  public List<Internship> all(){
    return (List<Internship>) dao.findAll();
  }

  @PostMapping("/internships")
  public Internship newInternship(Internship newInternship){
    return dao.save(newInternship);
    //TODO: Implement error handling
  }

  @GetMapping("/internships/{id}")
  Internship one(@PathVariable int id) {
    return dao.find(id);
    //TODO: Implement error handling
  }

  @PutMapping("/internships/{id}")
  Internship editInternship(Internship internship, @PathVariable int id) {
    internship.setId(id);
    return dao.edit(internship);
    //TODO: Implement error handling
  }

  @DeleteMapping("/internships/{id}")
  Boolean deleteInternship(@PathVariable int id) {
    return dao.delete(id);
    //TODO: Implement error handling
  }
}
