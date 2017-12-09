package site.tgclub.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import site.tgclub.exception.NoPermissionException;
import site.tgclub.exception.NoSuchResourceException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fzm
 */
@ControllerAdvice
public class OwnExceptionHandler {

    @ExceptionHandler(NoSuchResourceException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> noSuchResourceExceptionHandler(RuntimeException ex){

        Map<String,String> map = new HashMap<>(16);
        map.put("status","1");
        map.put("message",ex.getMessage());
        return map;
    }

    @ExceptionHandler(NoPermissionException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public Map<String,String> noPermissionExceptionHandler(RuntimeException ex){
        Map<String,String> map = new HashMap<>(16);
        map.put("status","1");
        map.put("message",ex.getMessage());
        return map;
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String,String> runtimeExceptionHandler(RuntimeException ex){
        Map<String,String> map = new HashMap<>(16);
        map.put("status","1");
        map.put("message",ex.getMessage());
        return map;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String,String> exceptionHandler(RuntimeException ex){
        Map<String,String> map = new HashMap<>(16);
        map.put("status","1");
        map.put("message",ex.getMessage());
        return map;
    }
}
