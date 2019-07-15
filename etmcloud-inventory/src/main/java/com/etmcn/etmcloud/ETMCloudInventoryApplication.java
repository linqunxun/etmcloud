package com.etmcn.etmcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class ETMCloudInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ETMCloudInventoryApplication.class, args);
    }

}
