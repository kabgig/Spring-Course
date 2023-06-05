package com.kabgig.learnspringframework;

import com.kabgig.learnspringframework.game.GameRunner;
import com.kabgig.learnspringframework.game.GamingConfiguration;
import com.kabgig.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingConfiguration.class);
        ) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
