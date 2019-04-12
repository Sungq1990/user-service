package com.sungq1990.user.config;

import com.alibaba.dubbo.remoting.http.servlet.DispatcherServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 标记为Java config    spring boot
public class DubboServletConfiguration {


    @Bean // 标记它为spring bean    id（名称） 默认就是这里的方法名。请求的分发器 /store-service/
    public ServletRegistrationBean servlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(
                new DispatcherServlet(), "/user-service/*");
        servletRegistrationBean.setName("dubbo");  // servlet 名称
        return servletRegistrationBean;

    }

}