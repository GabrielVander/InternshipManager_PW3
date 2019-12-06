package org.internship.controller;

import org.internship.DAO.SupervisorDAO;
import org.internship.model.Supervisor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class SupervisorController {
  private SupervisorDAO dao = new SupervisorDAO();

  @GetMapping("/supervisors")
  public List<Supervisor> all(){
    return (List<Supervisor>) dao.findAll();
  }

  @PostMapping("/supervisors")
  public Supervisor newSupervisor(Supervisor newSupervisor){
    return dao.save(newSupervisor);
    //TODO: Implement error handling
  }

  @GetMapping("/supervisors/{id}")
  Supervisor one(@PathVariable int id) {
    return dao.find(id);
    //TODO: Implement error handling
  }

  @PutMapping("/supervisors/{id}")
  Supervisor editSupervisor(@RequestBody Supervisor supervisor, @PathVariable int id) {
    supervisor.setId(id);
    return dao.edit(supervisor);
    //TODO: Implement error handling
  }

  @DeleteMapping("/supervisors/{id}")
  Boolean deleteSupervisor(@PathVariable int id) {
    return dao.delete(id);
    //TODO: Implement error handling
  }
}
