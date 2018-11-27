package com.example.dodi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;


/**
 * @author afei
 * @date 2018/11/27
 */
@Configurable
public class Person {
    private String name;
    private Integer age;

    @Autowired
    private transient LoveRepository loveRepository;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person showGirlFriend() {
        return loveRepository.getGirlFriend();
    }
}
