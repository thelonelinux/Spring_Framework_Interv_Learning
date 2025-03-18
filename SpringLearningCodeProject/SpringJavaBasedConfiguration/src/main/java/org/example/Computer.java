package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    //This @Autowired will find bean from Config class, and inject here
    //This is field injection of adding dependency injection.
    //You could have done via setter and constructor injection as well - for now they are commented below
    //So object creation will be taken care by the XML config file only.
    // It will pick the bean which has implemented HardDisk interface and create object of it and send here;
    @Autowired
    HardDisk hardDisk; //Here bean name should be the methodName you have added in @Bean in Configuration class
    //HardDisk hardDisks;  //You can add this also it won't give you error as this object name is not same as bean method name as in config file.
            //Check more about it, as I heard somewhere that method name and object injected name should be same.

    public void myHardDisk(){
        System.out.println( "Hello - I am inside computer" );
        hardDisk.myTask();
    }

//    @Autowired //This is constructor injection of hard disk
//    public Computer(HardDisk hardDisk){
//        this.hardDisk=hardDisk;
//    }

//    public HardDisk getHardDisk() {
//        return hardDisk;
//    }
//    @Autowired  //This is Setter Injection of dependency
//    public void setHardDisk(HardDisk hardDisk) {
//        this.hardDisk = hardDisk;
//    }
}
