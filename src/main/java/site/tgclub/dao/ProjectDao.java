package site.tgclub.dao;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import site.tgclub.model.Project;

import java.util.List;

@Repository
@MapperScan
public interface ProjectDao {
    Project selectProjectById(Integer id);

    List<Project> getAllProjects();

    void insertProject(Project project);

    void updateProjectById(@Param("id") Integer id, @Param("project")Project project);

    void deleteProjectById(Integer id);


}
