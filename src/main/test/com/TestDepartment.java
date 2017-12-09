package com;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import site.tgclub.dao.DepartmentDao;
import site.tgclub.model.Department;

import javax.annotation.Resource;
import java.util.List;


@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestDepartment extends AbstractTestNGSpringContextTests{

    @Resource
    private DepartmentDao departmentDao;

    @Test
    public void testSelect(){
        Department department = departmentDao.selectDepartmentById(1);
        System.out.println(department.toString());
    }

    @Test
    public void testGetAllDepartment(){
        List<Department> departments = departmentDao.getAllDepartment();
        System.out.println(departments);
    }

    @Test
    public void testInsert(){
        Department department = new Department();
        department.setId(4);
        department.setDescription("XX部");
        departmentDao.insertDepartment(department);
    }


}
