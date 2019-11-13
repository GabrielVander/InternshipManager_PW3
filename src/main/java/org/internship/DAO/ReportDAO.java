package org.internship.DAO;

import org.internship.model.Report;

public class ReportDAO extends HibernateDao<Report> {
  public ReportDAO() {
    super(Report.class);
  }
}
