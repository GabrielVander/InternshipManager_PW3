package org.internship.DAO;

import java.util.List;

public interface DAO<T> {
  List<T> getAll();
  T getSingle(Long id);
  void update(T obj);
  void save(T obj);
  void delete(Long id);
  void delete(T obj);
}
