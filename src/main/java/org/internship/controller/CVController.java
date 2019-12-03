package org.internship.controller;

import org.internship.DAO.CVDAO;
import org.internship.model.CV;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CVController {
  private CVDAO dao = new CVDAO();

  @GetMapping("/cvs")
  public List<CV> all(){
    return (List<CV>) dao.findAll();
  }

  @PostMapping("/cvs")
  public CV newCV(@RequestBody CV newCV){
    return dao.save(newCV);
    //TODO: Implement error handling
  }

  @GetMapping("/cvs/{id}")
  CV one(@PathVariable int id) {
    return dao.find(id);
    //TODO: Implement error handling
  }

  @PutMapping("/cvs/{id}")
  CV editCV(@RequestBody CV cv, @PathVariable int id) {
    cv.setId(id);
    return dao.edit(cv);
    //TODO: Implement error handling
  }

  @DeleteMapping("/cvs/{id}")
  Boolean deleteCV(@PathVariable int id) {
    return dao.delete(id);
    //TODO: Implement error handling
  }
}
