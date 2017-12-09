package site.tgclub.service;

import org.springframework.stereotype.Service;
import site.tgclub.dao.ManagerDao;
import site.tgclub.exception.NoSuchResourceException;
import site.tgclub.model.Manager;

import javax.annotation.Resource;

/**
 * @author fzm
 * @date 2017/11/22
 **/
@Service
public class ManagerService {

    @Resource
    private ManagerDao managerDao;

    public Manager getManagerByName(String name){
        Manager manager = managerDao.selectManagerByName(name);
        if (manager == null){
            throw new NoSuchResourceException("没有这个管理员账号！");
        }else {
            return manager;
        }
    }

    public Manager updateManagerPassword(Manager manager){
        managerDao.updateManagerPassword(manager);
        return manager;
    }

}
