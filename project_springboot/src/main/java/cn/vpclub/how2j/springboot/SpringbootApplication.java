package cn.vpclub.how2j.springboot;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@ServletComponentScan
@SpringBootApplication
public class SpringbootApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
    /**
     * 概述：项目创建好后，就自带一个SpringbootApplication启动类，其被@SpringBootApplication注解所标记，其表示这是一个Springboot应用
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
