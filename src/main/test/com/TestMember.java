package com;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;
import org.testng.annotations.Test;
import site.tgclub.dao.MemberDao;

import site.tgclub.model.Member;


import javax.annotation.Resource;
import java.util.List;

@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestMember extends AbstractTestNGSpringContextTests{

    @Resource
    private MemberDao memberDao;

    @Test
    public void testSelect(){
        Member member = memberDao.selectMemberById(7);
        System.out.println(member.toString());
    }

    @Test
    public void testGetAllMembers(){
        List<Member> members = memberDao.getAllMembers();
        System.out.println(members.toString());
    }

    @Test
    public void testInsert(){
        Member member = new Member();
        member.setUsername("yzy");
        member.setCollege("软件学院");
        member.setDepartmentId(1);
        member.setProjectId(1);
        member.setAvatar("http:localhost");
        member.setAge(20);
        member.setGender(1);
        member.setTag("性格：活泼");
        member.setIntroduction("我是一个小肥羊");
        System.out.println(member);
        memberDao.insertMember(member);
    }

    @Test
    public void testUpdate(){
        Member member = memberDao.selectMemberById(4);
        member.setCollege("软件工程");
        member.setDepartmentId(2);
        member.setProjectId(1);
        System.out.println(member);
        memberDao.updateMemberById(4,member);
    }

    @Test
    public void TestDelete(){
        memberDao.deleteMemberById(4);
    }

}
