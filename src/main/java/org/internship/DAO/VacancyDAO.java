package org.internship.DAO;

import org.internship.model.Vacancy;

public class VacancyDAO extends HibernateDao<Vacancy> {
  public VacancyDAO() {
    super(Vacancy.class);
  }
}
