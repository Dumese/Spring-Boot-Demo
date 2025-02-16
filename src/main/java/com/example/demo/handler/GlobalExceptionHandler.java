package com.example.demo.handler;

import com.example.demo.utils.BaseResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Log4j2
@RestControllerAdvice
@ResponseBody
@SuppressWarnings("unused")
public class GlobalExceptionHandler {

    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public BaseResponse exceptionHandler(Exception e){
        log.error("出现异常:{}", e.getMessage());
        BaseResponse baseResponse = new BaseResponse();
        return baseResponse.fail(e.getMessage());
    }
}
