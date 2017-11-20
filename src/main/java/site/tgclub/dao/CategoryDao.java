package site.tgclub.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import site.tgclub.model.Category;

import java.util.List;
/**
 * @author fzm
 * @date 2017/11/16
 **/
@Repository
@MapperScan
public interface CategoryDao {

    /**
     * 根据ID查找标签
     * @param id 代表当前标签的ID
     * @return 返回对应的标签
     */
    Category selectCategoryById(Integer id);


}
