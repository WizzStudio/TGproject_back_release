package site.tgclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import site.tgclub.model.Category;
import site.tgclub.model.Department;
import site.tgclub.service.CategoryService;
import site.tgclub.service.DepartmentService;

import java.util.List;

/**
 * @author fzm
 * @date 2017/11/18
 **/
@Controller
public class CategoryHandler {

    private final CategoryService categoryService;

    @Autowired
    public CategoryHandler(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @ResponseBody
    @RequestMapping(value = "/category/{id}" ,method = RequestMethod.GET)
    public Category getCategoryById(@PathVariable("id") Integer id){
        return categoryService.getCategoryById(id);
    }

}
