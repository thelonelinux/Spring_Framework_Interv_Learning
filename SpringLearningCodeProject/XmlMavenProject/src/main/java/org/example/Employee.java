package org.example;

import org.springframework.stereotype.Component;

//This will help or get our xml container to know this is a bean
//This is annotation based configuration
//By default bean/object name will "employee" (Bean name)
//If you want other name then you can add as below
//@Component(value="myEmployee")  //Here the bean/object name will be myEmployee
@Component
public class Employee {

    private String name;
    private int age;

    public void message(){
        System.out.println("Hello Employee");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
