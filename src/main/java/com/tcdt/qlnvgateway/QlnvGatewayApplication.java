package com.tcdt.qlnvgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient        // It acts as a eureka client
@EnableZuulProxy        // Enable Zuul
@EnableDiscoveryClient
public class QlnvGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(QlnvGatewayApplication.class, args);
    }

}

