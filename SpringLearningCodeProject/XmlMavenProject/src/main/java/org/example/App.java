package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * This is sample project to learn spring core, ioc, dependency injection, annotation in XML based Configuration
 * To run this project you can have any jdk version 8 and above
 * maven version is 3.9.9. Any other maven versions in 3 will work good with jdk 8
 * You have to add dependency org.springFramework in pom.xml file to get BeanFactory, ApplicationContext classes libraries and other useful things
 *  This dependency org.SpringFramework add here in pom.xml is good version, higher version won't find BeanFActory atleast.
 * XML header and all that find in the YT learning of SpringFramework
 * More details there as well
 * Here we have learned below topics
 * 0. How to create maven project and start with Maven, Doing Maven Project and Selecting QuickStart Archetype
 * 1. XML Bean configuration (config.xml)
 * 2. Annotation Based Configuration using XML config.xml file only. (@Component in class Employee and Component-Scan in xml to find it and create bean for it)
 * 3. Understood why IOC is important. To avoid loose coupling with good example of Computer and HardDisk interface with seagate and samsung
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //BEAN FACTORY XML CONTAINER
        //While running, you will get info in red colored in console, just ignore that
        System.out.println( "#1 - DEMONSTRATION - BEAN FACTORY XML CONTAINER " );
        BeanFactory factory = new ClassPathXmlApplicationContext("Config.xml"); //Belongs to SpringFramework dependencies //It is an interface
        Student student = (Student) factory.getBean("student");
        student.sayHello();
        //System.out.println(student);

        //APPLICATION CONTEXT XML CONTAINER
        //While running, you will get info in red colored in console, just ignore that
        System.out.println( "#2 - DEMONSTRATION - APPLICATION CONTEXT XML CONTAINER " );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml"); //Belongs to SpringFramework dependencies //It is an interface which indirectly child of BeanFactory only.
        Student student2 = (Student) context.getBean("student1");
        student2.sayHello();
       // System.out.println(student2);


        //APPLICATION CONTEXT XML CONTAINER WITH INTERFACE TO SHOW DEFINITION OF WHY WE NEED IOC. INVERSION OF CONTROL OF CREATING BEANS
        //Here we can anytime change the object of hardDisk from Seagate to Samsung in future, without having tight coupling.
        //As we have to make change in XML Beans only. They will only give you the object
        System.out.println( "#3 - DEMONSTRATION - APPLICATION CONTEXT XML CONTAINER WITH INTERFACE TO SHOW DEFINITION OF WHY WE NEED IOC. INVERSION OF CONTROL OF CREATING BEANS" );
        HardDisk hardDisk = (HardDisk) context.getBean("hardDisk");
        hardDisk.myTask();


        //COMPUTER CLASS HAS DEPENDENCY ON HARDDISK. HOW TO INJECT THAT DEPENDENCY IN XML
        //This can be done via field injection or construction injection or setter injection via @Autowired annotation
        //check and go in that class mentioned.
        System.out.println( "#4 - DEMONSTRATION - COMPUTER CLASS HAS DEPENDENCY ON HARDDISK. HOW TO INJECT THAT DEPENDENCY IN XML USING AUTOWIRED" );
        Computer computer = (Computer) context.getBean("computer");
        computer.myHardDisk();



        //ANNOTATION BASED CONFIGURATION IN XML FILE USING @COMPONENT FOR EMPLOYEE CLASS AND ADDED COMPONENT-SCAN TAG IN XML CONFIG.XML
        //SO WE DIDN'T MAKE ANY BEAN FOR EMPLOYEE CLASS, IT WILL AUTOMATICALLY CREATE BEAN IN XML
        //THIS CONCEPT IS CALLED ANNOTATION BASED CONFIGURATION
        System.out.println( "#5 - DEMONSTRATION - ANNOTATION BASED CONFIGURATION IN XML FILE USING @COMPONENT FOR EMPLOYEE CLASS AND ADDED COMPONENT-SCAN TAG IN XML CONFIG.XML" );
        Employee employee = (Employee) factory.getBean("employee"); //This object name employee is by default, you can change by doing @Component(value="myEmployeeObject") in that class only.
        employee.message();
        System.out.println( "Hello World! - Keep Learning Spring and Spring Core" );


        //NON-XML JAVA BASED CONFIGURATION
        //Better not learn this Java Based Configuration here as it too have Annotation based Config
        //So the applicationContext might get confused in picking the @Component Scan.
        //As both XML Component-Scan and Java Configuration class @ComponentScan will pick @Component
        //So to avoid ambiguity of from where it was picked better make separate project for JAVA BASED CONFIGURATION
        ApplicationContext javaBasedConfigurationContext = new AnnotationConfigApplicationContext();
        System.out.println( "Hello World! - Keep Learning Spring and Spring Core" );


    }
}
