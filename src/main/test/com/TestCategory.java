package com;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import site.tgclub.dao.CategoryDao;
import site.tgclub.dao.ProjectDao;
import site.tgclub.model.Category;
import site.tgclub.model.Project;

import javax.annotation.Resource;
import java.util.List;

@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestCategory extends AbstractTestNGSpringContextTests{

    @Resource
    private CategoryDao categoryDao;

    @Test
    public void testSelect(){
        Category category = categoryDao.selectCategoryById(1);
        System.out.println(category);
    }






}
