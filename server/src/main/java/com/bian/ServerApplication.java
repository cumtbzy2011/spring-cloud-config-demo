package com.bian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Mr.Bi on 2017/6/3.
 */
@SpringBootApplication
@EnableConfigServer
public class ServerApplication {
    public static void main(String[] args){
        SpringApplication.run(ServerApplication.class, args);
    }
}
