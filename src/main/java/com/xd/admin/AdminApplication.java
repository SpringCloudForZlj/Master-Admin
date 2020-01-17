package com.xd.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by 张立军 on 2020/1/14.
 * Project Name : SpringCloud
 * Package Name : com.xd.admin
 */
@EnableSwagger2
@SpringBootApplication
@EnableEurekaClient
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class,args);
    }
}
