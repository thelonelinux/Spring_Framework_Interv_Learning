package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Computer {

    //This @Autowired will find bean from XML, and inject here
    //This is field injection of adding depdendency injection.
    //You could have done via setter and constructor injection as well - for now they are commented below
    //So object creation will be taken care by the XML config file only.
    // It will pick the bean which has implemented HardDisk interface and create object of it and send here;
    @Autowired
    HardDisk hardDisks;  //Whether the name be hardDisk or hardDisks, it does not matter, as the context will find any bean which is implementing this HardDisk interface and returns the object of that over here.

    public void myHardDisk(){
        System.out.println( "Hello - I am inside computer" );
        hardDisks.myTask();
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
