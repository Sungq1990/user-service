package com.sungq1990.user.api;

import com.sungq1990.user.common.CommonRequest;
import com.sungq1990.user.common.CommonResponse;

import java.util.HashMap;

public interface UserService {
    CommonResponse getUserByToken(CommonRequest<HashMap> req);
}