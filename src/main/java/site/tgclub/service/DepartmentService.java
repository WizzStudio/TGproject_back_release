package site.tgclub.service;

import org.springframework.stereotype.Service;
import site.tgclub.dao.DepartmentDao;
import site.tgclub.model.Department;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author fzm
 * @date 2017/11/15
 **/
@Service
public class DepartmentService {

    @Resource
    private DepartmentDao departmentDao;

    public Department getDepartmentById(Integer id){
        return departmentDao.selectDepartmentById(id);
    }

    public List<Department> getAllDepartment(){
        return departmentDao.getAllDepartment();
    }


}
