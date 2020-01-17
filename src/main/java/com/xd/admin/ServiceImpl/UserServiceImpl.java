package com.xd.admin.ServiceImpl;

import com.xd.admin.mapper.UserMapper;
import com.xd.admin.service.UserService;
import com.xd.common.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 张立军 on 2020/1/15.
 * Project Name : SpringCloud
 * Package Name : com.xd.admin.ServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(@Param("userid")String userid) {
        User user = userMapper.selectUserById(userid);
        return user;
    }
}
