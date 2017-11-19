package site.tgclub.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import site.tgclub.model.Department;


import java.util.List;


@Repository
@MapperScan
public interface DepartmentDao {
    Department selectDepartmentById(Integer id);

    List<Department> getAllDepartment();

    void insertDepartment(Department department);
}
