package org.internship.controller;

import org.internship.DAO.SupervisorDAO;
import org.internship.model.Supervisor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@CrossOrigin
@Controller
public class SupervisorController {
  private SupervisorDAO dao = new SupervisorDAO();

  @GetMapping("/supervisors")
  public List<Supervisor> all(){
    return dao.findAll();
  }

  @PostMapping("/newSupervisor")
  public RedirectView newSupervisor(Supervisor newSupervisor){
    dao.save(newSupervisor);
    return new RedirectView("./");
  }

  @GetMapping("/supervisors/{id}")
  Supervisor one(@PathVariable int id) {
    return dao.find(id);
    //TODO: Implement error handling
  }

  @PostMapping("/supervisors/{id}")
  Supervisor editSupervisor(Supervisor supervisor, @PathVariable int id) {
    supervisor.setId(id);
    return dao.edit(supervisor);
    //TODO: Implement error handling
  }

  @RequestMapping("/supervisors/{id}")
  Boolean deleteSupervisor(@PathVariable int id) {
    return dao.delete(id);
    //TODO: Implement error handling
  }
}
