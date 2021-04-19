package com.spring.cloud.servicedatamanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.spring.cloud.servicedatamanage")
@MapperScan("com.spring.cloud.servicedatamanage.Dao")
@EnableEurekaClient
public class ServiceDatamanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDatamanageApplication.class, args);
    }

}
