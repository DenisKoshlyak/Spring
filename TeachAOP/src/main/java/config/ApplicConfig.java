package config;

import aspect.AspectOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "services")
@EnableAspectJAutoProxy
public class ApplicConfig {

    @Bean
    public AspectOne aspectOne(){
        return new AspectOne();
    }
}
