package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@MapperScan("com.trade.Mappers")
public class FcserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FcserviceApplication.class, args);
    }

}
