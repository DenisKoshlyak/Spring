package main;

import CommServ.*;
import Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var c1 = context.getBean(CommentService.class).getDbc();
        var c2 = context.getBean(CommentService2.class).getDbc();
        System.out.println(c1 == c2);
    }
}
