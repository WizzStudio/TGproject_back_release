package site.tgclub.dao;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import site.tgclub.model.Project;

import java.util.List;

/**
 * @author fzm
 * @date 2017/11/16
 **/
@Repository
@MapperScan
public interface ProjectDao {
    /**
     * 根据ID查询部门
     * @param id 代表部门ID
     * @return 返回整个部门信息
     */
    Project selectProjectById(Integer id);

    /**
     * 查询所有部门
     * @return 返回所有部门信息
     */
    List<Project> getAllProjects();

    /**
     * 插入部门信息
     * @param project 插入的部门数据
     */
    void insertProject(Project project);

    /**
     * 根据ID更新部门数据
     * @param id 代表部门ID
     * @param project 更新的部门数据
     */
    void updateProjectById(@Param("id") Integer id, @Param("project") Project project);

    /**
     * 根据ID删除部门数据
     * @param id 代表部门ID
     */
    void deleteProjectById(Integer id);


}
