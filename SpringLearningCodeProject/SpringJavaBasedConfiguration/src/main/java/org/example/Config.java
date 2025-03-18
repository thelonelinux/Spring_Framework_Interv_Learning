package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration - This let us know that this is our Configuration class which takes care of making beans

//@ComponentScan will pick all the classes within this package annotated with @Component, @Service and  makes
//Bean automatically of that class
@Configuration
@ComponentScan
public class Config {

    //So here we have created bean for our Interface hardDisk, so we return Seagate,
    //Later in future if we want Samsung hardDisk then we only have to make changes here.
    //So this is how lose coupling is achieved by concept of IOC. Inversion of control where the control
    //of making object/bean is done by framework only and not by the developer/programmer
    //Rem- We don't have to put @Component in HardDisk, Samsung and Seagate Class as we are already defining beans here only
    //Here bean/object name is identified by it's method name. Here object name that framework will create for us
    //it will be named sa "hardDisk"
    @Bean
    public HardDisk hardDisk() {
        return new Seagate();
    }

    @Bean
    public MyBean myBeanObjectNameChangedInConfigSoUseThisMethodNameOnlyToAutowired() {
        return new MyBean();
    }

    @Bean
    public Student student() {
        return new Student();
    }


}
