package Config;

import Application.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "Application")
public class ProjectConfig {

    @Bean
    public Parrot parrot1(){
        Parrot p1 = new Parrot();
        p1.setName("kaka");
        return p1;
    }

    @Bean
    public Parrot parrot2(){
        Parrot p1 = new Parrot();
        p1.setName("kiki");
        return p1;
    }

    @Bean
    public Person person(@Qualifier("parrot2") Parrot parrot){
        Person p = new Person();
        p.setName("kiki");
        p.setParrot(parrot);
        return p;
    }
}
