package com.example.dodi;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@SpringBootApplication
@EnableSpringConfigured
public class DomainObjectDependencyInjectionApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(DomainObjectDependencyInjectionApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person boy = new Person("阿飞", 18);
        Person girl = boy.showGirlFriend();

        System.out.println(String.format("%s 的女朋友是 %s, 今年 %d", boy.getName(), girl.getName(), girl.getAge()));
    }
}
