package com.jm.config;

import com.jm.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebApplicationConfig {
    //定义方法，注册Servlet对象
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        //public ServletRegistrationBean(T servlet, String... urlMappings)
        //第一个参数是servlet对象，第二个参数是url地址
        //ServletRegistrationBean bean =
        //        new ServletRegistrationBean(new MyServlet(),"/myServlet");

        ServletRegistrationBean bean=new ServletRegistrationBean();
        bean.setServlet(new MyServlet());
        bean.addUrlMappings("/login","/mytest");
        return bean;
    }
}
