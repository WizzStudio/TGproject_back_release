package site.tgclub.dao;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import site.tgclub.model.Member;

import java.util.List;

/**
 * @author fzm
 * @date 2017/11/16
 **/
@Repository
@MapperScan
public interface MemberDao {
    /**
     * 根据ID查询成员
     * @param id 代表成员ID
     * @return 返回整个成员信息
     */
    Member selectMemberById(Integer id);

    /**
     * 根据姓名查询成员
     * @param name 代表成员姓名
     * @return 返回整个成员信息
     */
    Member selectMemberByName(String name);

    /**
     * 查询所有成员
     * @return 返回所有成员信息
     */
    List<Member> getAllMembers();

    /**
     * 插入成员信息
     * @param member 插入的成员数据
     */
    void insertMember(Member member);

    /**
     * 根据ID更新成员数据
     * @param id 代表成员ID
     * @param member 更新的成员数据
     */
    void updateMemberById(@Param("id") Integer id, @Param("member") Member member);

    /**
     * 根据ID删除成员数据
     * @param id 代表成员ID
     */
    void deleteMemberById(Integer id);
}
