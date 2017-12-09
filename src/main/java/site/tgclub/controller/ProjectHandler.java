package site.tgclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import site.tgclub.model.Project;
import site.tgclub.service.ProjectService;

import java.util.List;

/**
 * @author fzm
 */
@Controller
public class ProjectHandler {

    private final ProjectService projectService;

    @Autowired
    public ProjectHandler(ProjectService projectService) {
        this.projectService = projectService;
    }
    @ResponseBody
    @RequestMapping(value = "/projectId/{projectId}" ,method = RequestMethod.GET)
    public Project getProjectById(@PathVariable("projectId") Integer id){
        return projectService.getProjectById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/projects" ,method = RequestMethod.GET)
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

    @ResponseBody
    @RequestMapping(value = "/project" ,method = RequestMethod.POST)
    public Project insertProject(Project project){
        return projectService.insertProject(project);
    }

    @ResponseBody
    @RequestMapping(value = "/projectId/{projectId}" ,method = RequestMethod.PUT)
    public Project updateProject(@PathVariable("projectId") Integer id,@RequestBody Project project){
        return projectService.updateProject(id, project);
    }

    @ResponseBody
    @RequestMapping(value = "/projectId/{projectId}",method = RequestMethod.DELETE)
    public Project deleteProjectById(@PathVariable("projectId") Integer id){
        return projectService.deleteProjectById(id);
    }
}
