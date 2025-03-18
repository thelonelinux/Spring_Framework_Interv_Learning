package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeBean {

    String message;

    @Autowired
    Employee myEmployee;  //You have to use object name whatever you have added in Employee @Component
    //However it will not give you error. but will ask to make changes or preview the object name.


    @Autowired
    MyBean myBean;

    public void SomeBean(){
        System.out.println("Inside SomeBean");
        myBean.myBeanFunction();
    }

}
