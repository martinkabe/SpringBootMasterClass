package com.example.demo.customer;

import com.example.demo.infoapp.AppInfo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

//    @Value("${app.useFakeCustomerRepo}")
//    private Boolean useFakeCustomerRepo;

    @Bean
    CommandLineRunner commandLineRunner(AppInfo appInfo) {
        return args -> {
            System.out.println("Command line runner hooray");
            System.out.println("Info app: " + appInfo.getDescription());
        };
    }

    @Bean
    CustomerRepo customerRepo() {
        // System.out.println("useFakeCustomerRepo = " + useFakeCustomerRepo);
        return new CustomerFakeRepository();
    }
}
