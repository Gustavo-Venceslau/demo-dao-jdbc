package dao;

import entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findByIf(Integer id);
    List<Department> findAll();

}
