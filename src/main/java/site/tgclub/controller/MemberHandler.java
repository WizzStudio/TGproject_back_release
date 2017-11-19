package site.tgclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import site.tgclub.model.Member;
import site.tgclub.service.MemberService;

import java.util.List;

@Controller
@ControllerAdvice
public class MemberHandler {

    private final MemberService memberService;

    @Autowired
    public MemberHandler(MemberService memberService) {
        this.memberService = memberService;
    }
    @RequestMapping(value = "/memberId/{memberId}",method = RequestMethod.GET)
    @ResponseBody
    public Member getMemberById(@PathVariable("memberId") Integer id){
        return memberService.getMemberById(id);
    }

    @RequestMapping(value = "/memberName/{memberName}",method = RequestMethod.GET)
    @ResponseBody
    public Member getMemberByName(@PathVariable("memberName") String name){
        return memberService.getMemberByName(name);
    }

    @RequestMapping(value = "/members",method = RequestMethod.GET)
    @ResponseBody
    public List<Member> getAllMembers(){
        return memberService.getAllMembers();
    }


    @RequestMapping(value = "/member" ,method = RequestMethod.POST)
    @ResponseBody
    public Member insertMember(Member member){
        return memberService.insertMember(member);
    }

    @ResponseBody
    @RequestMapping(value = "memberId/{memberId}",method = RequestMethod.PUT)
    public Member updateMember(@RequestBody Member member,@PathVariable("memberId") Integer memberId){
        return memberService.updateMemberById(memberId, member);
    }

    @ResponseBody
    @RequestMapping(value = "memberId/{memberId}",method = RequestMethod.DELETE)
    public Member deleteMember(@PathVariable("memberId") Integer id){
         return memberService.deleteMemberById(id);
    }
}
