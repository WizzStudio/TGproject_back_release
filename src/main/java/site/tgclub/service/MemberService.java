package site.tgclub.service;

import org.springframework.stereotype.Service;
import site.tgclub.dao.MemberDao;
import site.tgclub.exception.NoSuchResourceException;
import site.tgclub.model.Member;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fzm
 * @date 2017/11/15
 **/
@Service
public class MemberService {

    @Resource
    private MemberDao memberDao;

    public Member getMemberById(Integer id){
        Member member = memberDao.selectMemberById(id);
        if (member == null){
            throw new NoSuchResourceException("没有找到这个成员!");
        }else {
            return member;
        }
    }

    public Member getMemberByName(String name){
        String str = name.replace(" ","");
        Member member = memberDao.selectMemberByName(str);
        if (member == null){
            throw new NoSuchResourceException("没有找到这个成员!");
        }else {
            return member;
        }
    }

    public List<Member> getAllMembers(){
        return memberDao.getAllMembers();
    }

    public Member insertMember(Member member){
        memberDao.insertMember(member);
        return member;
    }

    public Member updateMemberById(Integer id, Member member){
        memberDao.updateMemberById(id, member);
        return member;
    }

    public Member deleteMemberById(Integer id){
        memberDao.deleteMemberById(id);
        return null;
    }

}
