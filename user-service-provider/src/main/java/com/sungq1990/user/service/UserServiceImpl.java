package com.sungq1990.user.service;

import com.sungq1990.user.api.UserService;
import com.sungq1990.user.common.CommonRequest;
import com.sungq1990.user.common.CommonResponse;
import com.sungq1990.user.common.ResponseCodeEnum;
import com.sungq1990.user.dao.UserMapper;
import com.sungq1990.user.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service("userService") // 标记为spring bean
public class UserServiceImpl implements UserService {

    protected static final Logger logger = LoggerFactory.getLogger(Logger.class);

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取用户信息
     *
     * @param req
     * @return
     */
    public CommonResponse getUserByToken(CommonRequest<HashMap> req) {
        HashMap inputParam = req.getRequestData();
        if (inputParam.get("token") == null || inputParam.get("token").toString().isEmpty()) {
            return CommonResponse.fail(ResponseCodeEnum.PARAM_IS_INVALID);
        }
        CommonResponse<UserDto> r = new CommonResponse<>();
        // 操作数据库
        // 这里mock数据
        /*
        User users = userMapper.selectUserByToken(inputParam.get("token").toString());
        if (users == null) {
            r.setData(null);
            return r.success();
        }
        */
        UserDto usersDto = new UserDto();
        usersDto.setId(1);
        usersDto.setCity("杭州");
        usersDto.setProvince("浙江");
        usersDto.setCountry("中国");
        usersDto.setToken("testtesttest");
        usersDto.setCreated_at(1555071955);
        usersDto.setUpdated_at(1555071955);
        r.setData(usersDto);
        return r.success();
    }
}

