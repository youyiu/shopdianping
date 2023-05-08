package com.youyi.service.impl;

import com.youyi.entity.BlogComments;
import com.youyi.mapper.BlogCommentsMapper;
import com.youyi.service.IBlogCommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
