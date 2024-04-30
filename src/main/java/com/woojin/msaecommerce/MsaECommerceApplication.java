package com.woojin.msaecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class MsaECommerceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsaECommerceApplication.class, args);
    }

}
