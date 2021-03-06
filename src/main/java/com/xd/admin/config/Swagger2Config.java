package com.xd.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Created by 张立军 on 2020/1/17.
 * Project Name : SpringCloud
 * Package Name : com.xd.admin.config
 */
//@EnableSwagger2
@Configuration
public class Swagger2Config {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.xd.admin.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    //构建api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("Api文档")
                //描述
                .description("Api接口文档")
                //创建人
//                .contact(new Contact("ZLJ","http://localhost:8763/",""))
                //版本号
                .version("1.0")
                .build();
    }
}
