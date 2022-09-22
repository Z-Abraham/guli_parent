package com.abraham.servicebase;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @Author Abraham
 * @Date 2022/9/22 10:33
 * @Version 1.0
 */
@Configuration
@EnableKnife4j
@EnableOpenApi
public class SwaggerConfig {
    /**
     * 配置swagger的Docket bean
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }
    /**
     * 配置swagger的ApiInfo
     * @return
     */
    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfo("谷粒学苑"
                ,"谷粒学苑项目后端"
                ,"1.0"
                ,"www.abrahamqqz.com"
                ,new Contact("Abraham", "www.abrahamqqz.com",
                "abraham2002@163.com")
                ,"Apache 2.0"
                ,"http://www.apache.org/licenses/LICENSE-2.0"
                ,new ArrayList());
    }
}
