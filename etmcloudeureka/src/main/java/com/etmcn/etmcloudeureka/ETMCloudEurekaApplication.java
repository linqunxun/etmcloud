package com.etmcn.etmcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ETMCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ETMCloudEurekaApplication.class, args);
    }

}
