package org.internship.DAO;

import org.internship.model.Requirement;

public class RequirementDAO extends HibernateDao<Requirement> {
  public RequirementDAO() {
    super(Requirement.class);
  }
}
