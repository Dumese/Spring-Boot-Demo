package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dto.UserLoginDTO;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import com.example.demo.utils.BaseResponse;
import com.example.demo.utils.JwtUtils;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author Dumese
 * @since 2025-02-15
 */
@Service
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    private UserMapper userMapper;

    private PasswordEncoder passwordEncoder;

    private AuthenticationManager authenticationManager;

    private JwtUtils jwtUtils;

    @Override
    public BaseResponse login(UserLoginDTO user) throws RuntimeException {
        String key = StringUtils.isNotEmpty(user.getUsername()) ? user.getUsername() :
                (StringUtils.isNotEmpty(user.getPhone()) ? user.getPhone() : null);

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                key, user.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtUtils.generateToken(authentication);
        BaseResponse baseResponse = new BaseResponse();
        return baseResponse.success(Map.of("token", token));
    }
}
