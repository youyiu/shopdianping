package com.youyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.youyi.dto.LoginFormDTO;
import com.youyi.dto.Result;
import com.youyi.entity.User;

import javax.servlet.http.HttpSession;


public interface IUserService extends IService<User> {
    

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);
}
