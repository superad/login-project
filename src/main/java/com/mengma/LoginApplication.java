package com.mengma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author fgm
 * @description
 * @date 2020-04-06
 ***/

@SpringBootApplication
@EnableCaching
@EnableRedisHttpSession
public class LoginApplication  extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LoginApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }

}
