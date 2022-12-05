package com.example.democustomer;

//import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DemoCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCustomerApplication.class, args);
    }

}
