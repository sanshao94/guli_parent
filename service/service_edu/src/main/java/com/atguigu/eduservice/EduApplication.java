package com.atguigu.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author shkstart
 * @create 2021-04-27-16:28
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.atguigu"})

public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class,args);

    }
}
