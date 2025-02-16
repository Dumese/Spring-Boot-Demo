package com.example.demo.controller;

import com.example.demo.dto.UserLoginDTO;
import com.example.demo.service.IUserService;
import com.example.demo.utils.BaseResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
@Tag(name = "UserController", description = "用户信息管理")
public class UserController {

    private IUserService userService;

    @Operation(summary = "用户登录接口",description = "返回token")
    @PostMapping("/login")
    public BaseResponse login(@RequestBody UserLoginDTO userLoginDTO){
        return userService.login(userLoginDTO);
    }


}
