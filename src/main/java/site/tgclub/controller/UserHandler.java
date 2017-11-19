package site.tgclub.controller;

import site.tgclub.model.User;
import site.tgclub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fzm
 */
@Controller
public class UserHandler {

    private final UserService userService;

    @Autowired
    public UserHandler(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("hello")
    public String helloWorld(){

        return "success";
    }

    @RequestMapping("getAll")
    public String getAll(int id, ModelMap map){
        User user =userService.selectUser(id);
        map.addAttribute("user",user);
        System.out.println(user);
        return "success";
    }
}
