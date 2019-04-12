package com.sungq1990.user.dao;

import com.sungq1990.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper // 标记它为spring bean  spring 容器
public interface UserMapper {

    User selectUserByToken(@Param("token") String token);

}
