package site.tgclub.service;

import org.springframework.stereotype.Service;
import site.tgclub.dao.CategoryDao;
import site.tgclub.dao.DepartmentDao;
import site.tgclub.model.Category;
import site.tgclub.model.Department;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryService {

    @Resource
    private CategoryDao categoryDao;

    public Category getCategoryById(Integer id){
        return categoryDao.selectCategoryById(id);
    }


}
