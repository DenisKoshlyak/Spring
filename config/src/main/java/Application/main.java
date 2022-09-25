package Application;

import Config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class main {
    public static void main(String args[]){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p1 = context.getBean(Person.class);
        System.out.println(p1.getName() + " has parrot " + p1.getParrot().getName());
    }
}
