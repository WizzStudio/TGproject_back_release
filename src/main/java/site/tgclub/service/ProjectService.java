package site.tgclub.service;

import org.springframework.stereotype.Service;
import site.tgclub.dao.ProjectDao;
import site.tgclub.model.Project;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProjectService {

    @Resource
    private ProjectDao projectDao;

    public Project getProjectById(Integer id){
        return projectDao.selectProjectById(id);
    }

    public List<Project> getAllProjects(){
        return projectDao.getAllProjects();
    }

    public Project insertProject(Project project){
        projectDao.insertProject(project);
        return project;
    }

    public Project updateProject(Integer id,Project project){
        projectDao.updateProjectById(id, project);
        return project;
    }

    public Project deleteProjectById(Integer id){
        projectDao.deleteProjectById(id);
        return null;
    }
}
