package com.luffy.springmvcspringboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: zqy
 * @date: 2020-08-04 09:20
 **/
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     *
     * 拦截捕捉自定义异常 BusinessException.class
     *
     * @param response response
     * @param ex ex
     * @return ResultData
     */
    @ResponseBody
    @ExceptionHandler(value = BusinessException.class)
    public String businessErrorHandler(HttpServletRequest request, HttpServletResponse response, BusinessException ex) {

        return ex.getMessage();
    }
}
