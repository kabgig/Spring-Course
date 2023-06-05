package com.kabgig.learnspringframework;

import com.kabgig.learnspringframework.game.GameRunner;
import com.kabgig.learnspringframework.game.PacmanGame;
import com.kabgig.learnspringframework.helloworld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        /*try (var context =
                     new AnnotationConfigApplicationContext
                             (HelloWorldConfiguration.class);
        ) {
            System.out.println(context.getBean());
        }*/
        //var game = new MarioGame();
        //var game = new SuperContraGame();
       /* var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();*/
    }
}
