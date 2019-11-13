package org.internship.DAO;

import org.internship.model.Supervisor;

public class SupervisorDAO extends HibernateDao<Supervisor> {
  public SupervisorDAO() {
    super(Supervisor.class);
  }
}
