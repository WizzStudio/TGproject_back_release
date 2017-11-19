package site.tgclub.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import site.tgclub.model.Category;
import site.tgclub.model.User;

import java.util.List;

@Repository
@MapperScan
public interface CategoryDao {

    Category selectCategoryById(Integer id);

    List<Category> selectCategoryByName(String name);

}
