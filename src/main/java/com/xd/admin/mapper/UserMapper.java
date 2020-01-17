package com.xd.admin.mapper;

import com.xd.common.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 张立军 on 2020/1/15.
 * Project Name : SpringCloud
 * Package Name : com.xd.admin.mapper
 */
@Mapper
public interface UserMapper {
    User selectUserById(@Param("userid")String userid);
}
