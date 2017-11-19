package site.tgclub.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import site.tgclub.exception.NoSuchResourceException;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class OwnExceptionHandler {

    @ExceptionHandler(NoSuchResourceException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> noSuchResourceException(RuntimeException ex){

        Map<String,String> map = new HashMap<>();
        map.put("status","error!");
        map.put("message",ex.getMessage());
        return map;
    }
}
