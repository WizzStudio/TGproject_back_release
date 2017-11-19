package com;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import site.tgclub.dao.DepartmentDao;
import site.tgclub.dao.ProjectDao;
import site.tgclub.model.Department;
import site.tgclub.model.Project;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestProject extends AbstractTestNGSpringContextTests{

    @Resource
    private ProjectDao projectDao;

    @Test
    public void testSelect(){
        Project project = projectDao.selectProjectById(2);
        System.out.println(project.toString());
    }
    @Test
    public void testGetAllProject(){
        List<Project> projects = projectDao.getAllProjects();
        System.out.println(projects.toString());
    }

    @Test
    public void testInsert(){
        Project project = new Project();
        project.setId(3);
        project.setProjectName("组队平台");
        project.setStartDate(Date.valueOf("2017-11-12"));
        project.setFinishedDate(Date.valueOf("2017-12-12"));
        project.setSourceUrl("oj8k");
        project.setLeaderId(1);
        project.setUIProgress(20d);
        project.setFrontProgress(30d);
        project.setBackProgress(40d);
        project.setPicUrl("localhost");
        project.setIntroduction("一个组队的平台");
        project.setTotalProgress(25d);
        projectDao.insertProject(project);
    }

    @Test
    public void testUpdate(){
        Project project = projectDao.selectProjectById(3);
        project.setStartDate(Date.valueOf("2017-11-11"));
        projectDao.updateProjectById(3,project);
    }

    @Test
    public void testDelete(){
        projectDao.deleteProjectById(3);
    }

}
