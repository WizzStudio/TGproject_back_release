package site.tgclub.dao;

import site.tgclub.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan
public interface UserDao {
    /**
     * 通过指定id查找用户名
     * @param id
     * @return
     */
    User selectUser(int id);

    /**
     * 获得所有用户
     * @return
     */
    List<User> getAllUsers();

    /**
     * 更新指定用户
     * @param user
     */
    void updateUser(User user);
}
