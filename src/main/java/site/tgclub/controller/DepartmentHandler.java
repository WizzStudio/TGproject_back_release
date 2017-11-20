package site.tgclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import site.tgclub.model.Department;
import site.tgclub.service.DepartmentService;

import java.util.List;
/**
 * @author fzm
 * @date 2017/11/18
 **/
@Controller
public class DepartmentHandler {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentHandler(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @ResponseBody
    @RequestMapping(value = "/department/{departmentId}" ,method = RequestMethod.GET)
    public Department getDepartmentById(@PathVariable("departmentId") Integer id){
        return departmentService.getDepartmentById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/departments" ,method = RequestMethod.GET)
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartment();
    }
}
