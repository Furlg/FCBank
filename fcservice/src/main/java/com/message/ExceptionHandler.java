package com.message;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@SuppressWarnings("all")
public class ExceptionHandler {

    Response response;

    @org.springframework.web.bind.annotation.ExceptionHandler(GlobalException.class)
    @ResponseBody
    public Response handelerGlobalException(HttpServletRequest request,GlobalException ex){

        response = new Response(ex.getErrorCodeAndMessage().getCode(),ex.getErrorCodeAndMessage().getMsg());
        return response;
    }

    /**
     * 用来捕获为定义错误码和错误信息的异常
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    @ResponseBody
    public Response handelerException(HttpServletRequest request,Exception exception){

        response = new Response(ErrorCodeAndMessage.ERROR_UNKNOWN.getCode(),exception.getStackTrace()+":"+exception.getMessage());
        return response;
    }
}
