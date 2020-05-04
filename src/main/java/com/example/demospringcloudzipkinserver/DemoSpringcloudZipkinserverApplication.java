package com.example.demospringcloudzipkinserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;


@SpringBootApplication
@EnableZipkinServer
public class DemoSpringcloudZipkinserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringcloudZipkinserverApplication.class, args);
    }

}
