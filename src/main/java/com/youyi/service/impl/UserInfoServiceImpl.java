package com.youyi.service.impl;

import com.youyi.entity.UserInfo;
import com.youyi.mapper.UserInfoMapper;
import com.youyi.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
