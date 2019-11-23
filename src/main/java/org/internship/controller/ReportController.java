package org.internship.controller;

import org.internship.DAO.ReportDAO;
import org.internship.model.Report;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReportController {
  private ReportDAO dao = new ReportDAO();

  @GetMapping("/reports")
  public List<Report> all(){
    return (List<Report>) dao.findAll();
  }

  @PostMapping("/reports")
  public Report newReport(@RequestBody Report newReport){
    return dao.save(newReport);
    //TODO: Implement error handling
  }

  @GetMapping("/reports/{id}")
  Report one(@PathVariable Long id) {
    return dao.find(id);
    //TODO: Implement error handling
  }

  @PutMapping("/reports/{id}")
  Report editReport(@RequestBody Report report, @PathVariable Long id) {
    report.setId(id);
    return dao.edit(report);
    //TODO: Implement error handling
  }

  @DeleteMapping("/reports/{id}")
  Boolean deleteReport(@PathVariable Long id) {
    return dao.delete(id);
    //TODO: Implement error handling
  }
}
