package site.tgclub.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import site.tgclub.model.Department;


import java.util.List;

/**
 * @author fzm
 * @date 2017/11/16
 **/
@Repository
@MapperScan
public interface DepartmentDao {
    /**
     * 根据ID查找部门
     * @param id 代表当前部门ID
     * @return 返回对应的部门
     */
    Department selectDepartmentById(Integer id);

    /**
     * 查询所有部门
     * @return 返回所有部门信息
     */
    List<Department> getAllDepartment();

}
