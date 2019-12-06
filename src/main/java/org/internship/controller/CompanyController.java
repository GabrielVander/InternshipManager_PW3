package org.internship.controller;

import org.internship.DAO.CompanyDAO;
import org.internship.model.Company;
import org.internship.model.Company;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class CompanyController {
  private CompanyDAO dao = new CompanyDAO();

  @GetMapping("/companies")
  public List<Company> all(){
    return dao.findAll();
  }

  @PostMapping("/newCompany")
  public RedirectView newCompany(Company newCompany){
    dao.save(newCompany);
    return new RedirectView("./");
    //TODO: Implement error handling
  }

  @GetMapping("/getCompany/{id}")
  Company getCompany(@PathVariable int id) {
    return dao.find(id);
    //TODO: Implement error handling
  }

  @PostMapping("/companies/{id}")
  Company editCompany(@RequestBody Company company, @PathVariable String cnpj) {
    company.setCnpj(cnpj);
    return dao.edit(company);
    //TODO: Implement error handling
  }

  @RequestMapping("/deleteCompany/{id}")
  Boolean deleteCompany(@PathVariable int id) {
    return dao.delete(id);
    //TODO: Implement error handling
  }
}
