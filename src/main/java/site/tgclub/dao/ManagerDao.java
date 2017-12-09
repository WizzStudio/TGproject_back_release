package site.tgclub.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import site.tgclub.model.Manager;

/**
 * @author fzm
 * @date 2017/11/22
 **/
@Repository
@MapperScan
public interface ManagerDao {

    /**
     * 查询管理员姓名
     * @param name 管理员姓名
     * @return 返回对应的管理员对象
     */
    Manager selectManagerByName(String name);

    /**
     * 更新管理员密码信息
     * @param manager 对应的管理员对象
     */
    void updateManagerPassword(Manager manager);

}
