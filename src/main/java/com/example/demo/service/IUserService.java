package com.example.demo.service;

import com.example.demo.dto.UserLoginDTO;
import com.example.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.utils.BaseResponse;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author Dumese
 * @since 2025-02-15
 */
public interface IUserService extends IService<User> {
    BaseResponse login(UserLoginDTO user) throws RuntimeException;
}
