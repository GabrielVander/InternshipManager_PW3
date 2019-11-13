package org.internship.DAO;

import org.internship.model.Administrator;

public class AdministratorDAO extends HibernateDao<Administrator> {
  public AdministratorDAO(Class<Administrator> type) {
    super(type);
  }

}
