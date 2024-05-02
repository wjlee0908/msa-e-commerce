package com.woojin.msaecommerce.shipment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class ShipmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShipmentApplication.class, args);
    }

}
