package org.internship.controller;

import org.internship.DAO.VacancyDAO;
import org.internship.model.Vacancy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class VancancyController {
  private VacancyDAO dao = new VacancyDAO();

  @GetMapping("/vacancies")
  public List<Vacancy> all(){
    return (List<Vacancy>) dao.findAll();
  }

  @PostMapping("/vacancies")
  public Vacancy newVacancy(@RequestBody Vacancy newVacancy){
    return dao.save(newVacancy);
    //TODO: Implement error handling
  }

  @GetMapping("/vacancies/{id}")
  Vacancy one(@PathVariable int id) {
    return dao.find(id);
    //TODO: Implement error handling
  }

  @PutMapping("/vacancies/{id}")
  Vacancy editVacancy(@RequestBody Vacancy vacancy, @PathVariable int id) {
    vacancy.setId(id);
    return dao.edit(vacancy);
    //TODO: Implement error handling
  }

  @DeleteMapping("/vacancies/{id}")
  Boolean deleteVacancy(@PathVariable int id) {
    return dao.delete(id);
    //TODO: Implement error handling
  }
}
