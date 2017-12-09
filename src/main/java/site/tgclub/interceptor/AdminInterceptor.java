package site.tgclub.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import site.tgclub.exception.NoPermissionException;
import site.tgclub.jwt.JwtToken;
import site.tgclub.service.ManagerService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fzm
 */
@Component
public class AdminInterceptor extends HandlerInterceptorAdapter{

    private final ManagerService managerService;

    @Autowired
    public AdminInterceptor(ManagerService managerService) {
        this.managerService = managerService;
    }


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        if (RequestMethod.POST.name().equalsIgnoreCase(httpServletRequest.getMethod()) || RequestMethod.PUT.name().equalsIgnoreCase(httpServletRequest.getMethod())
                || RequestMethod.DELETE.name().equalsIgnoreCase(httpServletRequest.getMethod())){

            if("/login".equals(httpServletRequest.getServletPath())){
                return true;
            }else {

                Cookie[] cookies = httpServletRequest.getCookies();
                String token = cookies[0].getValue();

                if (token == null) {
                    throw new NoPermissionException("您还没有登录，请登录！");
                } else {
                    String managerName = JwtToken.verifyToken(token).get("managerName").asString();
                    if (managerService.getManagerByName(managerName) == null) {
                        throw new NoPermissionException("没有这个账号！");
                    } else {
                        return true;
                    }
                }
            }

        }

        return true;
    }

}
