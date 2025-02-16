package com.example.demo;

import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@MapperScan("com.example.demo.mapper")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("===================  Application Started  ===================");
        log.info("http://127.0.0.1:8080/druid/index.html");
        log.info("http://localhost:8080/swagger-ui/index.html");
    }

}
