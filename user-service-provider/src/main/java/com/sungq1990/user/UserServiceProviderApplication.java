package com.sungq1990.user;

import com.sungq1990.user.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableCaching
@ImportResource(locations = "dubbo-config.xml")
// java config
// 注解
// xml
public class UserServiceProviderApplication implements CommandLineRunner {
    @Autowired
    private UserService userService;

    // 注入方式：1、注解  2、构造器  3、setter方法
    // 自动配置和依赖管理
    // Spring 1、DI   2、AOP

    public UserServiceProviderApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {

        SpringApplication.run(UserServiceProviderApplication.class, args);

    }

    @Override
    public void run(String... strings) throws Exception {

    }
}
