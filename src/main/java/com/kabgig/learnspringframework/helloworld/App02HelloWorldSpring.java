package com.kabgig.learnspringframework.helloworld;

import com.kabgig.learnspringframework.game.GamingConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingConfiguration.class);
        ) {
          //  System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("perCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean("person5Qualifier"));
            // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }
    }
}