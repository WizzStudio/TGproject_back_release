package site.tgclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import site.tgclub.exception.NoPermissionException;
import site.tgclub.jwt.JwtToken;
import site.tgclub.model.Manager;
import site.tgclub.service.ManagerService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fzm
 * @date 2017/11/26
 **/
@Controller
public class ManagerHandler {

    private final ManagerService managerService;

    @Autowired
    public ManagerHandler(ManagerService managerService) {
        this.managerService = managerService;
    }

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    @ResponseBody
    public Map<String,String> login(Manager manager, HttpServletResponse response) throws UnsupportedEncodingException {
        Map<String,String> map = new HashMap<>(16);
        String managerName = manager.getManagerName();
        String password = manager.getPassword();
        if(password == null){
            throw new NoPermissionException("没有输入密码！");
        }else if(managerName == null ){
            throw new NoPermissionException("没有输入账号！");
        }else if (managerService.getManagerByName(managerName) == null){
            throw new NoPermissionException("没有这个账号！");
        }else if (!password.equals(managerService.getManagerByName(managerName).getPassword())){
            throw new NoPermissionException("账号和密码不匹配！");
        }else if (password.equals(managerService.getManagerByName(managerName).getPassword())){
            String jwtToken = JwtToken.createToken(managerName);
            Cookie jwtTokenCookie = new Cookie("token",jwtToken);
            jwtTokenCookie.setMaxAge(60*60*24);
            response.addCookie(jwtTokenCookie);
            map.put("status","0");
            return map;
        }else {
            throw new RuntimeException("未知异常！");
        }
    }

    @RequestMapping(value = "/logout" ,method = RequestMethod.PUT)
    @ResponseBody
    public Map<String,String> logout(HttpServletRequest request,HttpServletResponse response){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie :cookies){
            cookie.setMaxAge(-1);
            response.addCookie(cookie);
        }
        Map<String,String> map = new HashMap<>();
        map.put("status","0");
        return map;
    }
}
