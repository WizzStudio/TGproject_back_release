package com;

import site.tgclub.model.User;
import site.tgclub.service.UserService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.annotation.Resource;
import java.util.List;

@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestCURD extends AbstractTestNGSpringContextTests{

    @Resource
    private UserService userService;

    @Test
    public void testSelect(){
        User user = userService.selectUser(1);
        System.out.println(user);
    }

    @Test
    public void testGetAllUsers(){
        List<User> users= userService.getAllUsers();
        System.out.println(users);

    }

    @Test
    public void testUpdateUser(){

        User user = new User(1,"樊磊",19);
        userService.updateUser(user);

    }
}
