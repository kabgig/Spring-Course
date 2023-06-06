package com.kabgig.learnspringframework.BusinessCalculationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessCalculationLauncher {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(
                             BusinessCalculationLauncher.class)) {
            System.out.println(
                    context.getBean(BusinessCalculationService.class)
                            .findMax());
        }
    }
}
