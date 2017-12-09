package com;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import site.tgclub.dao.ManagerDao;
import site.tgclub.model.Manager;

import javax.annotation.Resource;

/**
 * @author fzm
 * @date 2017/11/22
 **/
@ContextConfiguration({"classpath:applicationContext.xml"})
public class ManagerTest extends AbstractTestNGSpringContextTests {

    @Resource
    private ManagerDao managerDao;

    @Test
    public void testSelect(){
        Manager manager = managerDao.selectManagerByName("FZM");
        System.out.println(manager);
    }

    @Test
    public void testUpdate(){
        Manager manager = new Manager();
        manager.setManagerName("DBT");
        manager.setPassword("12345678");
        managerDao.updateManagerPassword(manager);
    }

}
