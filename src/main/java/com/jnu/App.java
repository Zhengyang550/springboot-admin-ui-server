package com.jnu;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: zy
 * @Description: 启动类
 * @Date: 2020-2-8
 */
@SpringBootApplication
@EnableAdminServer
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
}
