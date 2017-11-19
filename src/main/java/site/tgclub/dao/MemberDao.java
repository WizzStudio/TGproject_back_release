package site.tgclub.dao;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import site.tgclub.model.Member;


import java.util.List;

@Repository
@MapperScan
public interface MemberDao {
    Member selectMemberById(Integer id);

    Member selectMemberByName(String name);

    List<Member> getAllMembers();

    void insertMember(Member member);

    void updateMemberById(@Param("id") Integer id,@Param("member")Member member);

    void deleteMemberById(Integer id);
}
