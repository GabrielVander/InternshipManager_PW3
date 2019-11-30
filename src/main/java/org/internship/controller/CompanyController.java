package org.internship.controller;

import org.internship.DAO.CompanyDAO;
import org.internship.model.Company;
import org.internship.model.Company;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {
  private CompanyDAO dao = new CompanyDAO();

  @GetMapping("/companies")
  public List<Company> all(){
    return (List<Company>) dao.findAll();
  }

  @PostMapping("/companies")
  public Company newCompany(@RequestBody Company newCompany){
    return dao.save(newCompany);
    //TODO: Implement error handling
  }

  @GetMapping("/companies/{id}")
  Company one(@PathVariable int id) {
    return dao.find(id);
    //TODO: Implement error handling
  }

//  @PutMapping("/companies/{id}")
//  Company editCompany(@RequestBody Company company, @PathVariable int id) {
//    company.setId(id);
//    return dao.edit(company);
//    //TODO: Implement error handling
//  }

  @DeleteMapping("/companies/{id}")
  Boolean deleteCompany(@PathVariable int id) {
    return dao.delete(id);
    //TODO: Implement error handling
  }
}
