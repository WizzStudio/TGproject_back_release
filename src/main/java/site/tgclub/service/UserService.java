package site.tgclub.service;

import site.tgclub.dao.UserDao;
import site.tgclub.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User selectUser(int id){
        return userDao.selectUser(id);
    }

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    public void updateUser(User user){
        userDao.updateUser(user);
    }

}
