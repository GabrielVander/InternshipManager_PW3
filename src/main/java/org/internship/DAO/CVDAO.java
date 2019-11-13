package org.internship.DAO;

import org.internship.model.CV;

public class CVDAO extends HibernateDao<CV> {
  public CVDAO() {
    super(CV.class);
  }
}
