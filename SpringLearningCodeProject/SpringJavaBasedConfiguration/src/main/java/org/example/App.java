package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Ignore some red lines info comes in beginning in console while running the app


        //NON-XML - JAVA BASED CONFIGURATION - USING CONFIG CLASS (@Configuration)
        ApplicationContext javaBasedConfigurationContext = new AnnotationConfigApplicationContext(Config.class); //Here too we have to mention the configuration class, like we mentioned config.xml in xml based configuration
        Student student = javaBasedConfigurationContext.getBean(Student.class); //Get the bean from config class where you have created bean with @Bean
        student.sayHello();

        //With object name customized = @Component(value="myEmployee")
        //This myEmployee you have to use when you are injecting this dependencies in other classes
        Employee employee = javaBasedConfigurationContext.getBean(Employee.class);
        employee.message();


        //JAVA BASED CONFIGURATION
        //Testing interface, how it will pick the hardDisk and demonstrate lose coupling and IOC
        //You don't have to make @Component for hardDisk and Seagate and Samsung - As you have made bean of it in config class
        //Only make computer as @Component, as you don't have make bean of it in config class, and it will automatically make bean of it if it has @Component.
        //that hardDisk will be injected via @Autowired which will ask config class for bean, It can be injected in setter or field or constructor way also.
        Computer computer = javaBasedConfigurationContext.getBean(Computer.class);
        computer.myHardDisk();



        //Testing bean name should be method name as in config file when injecting via @Autowired
        //MyBean is injected in SomeBean but with different object name
        SomeBean someBean = javaBasedConfigurationContext.getBean(SomeBean.class);
        someBean.SomeBean();  //This ran fine, May be spring is itself finding the bean even without method name it will find the bean.
        //Hence we didn't got any error when injecting bean with bean name other than what is specified as the method name in the config file.


        System.out.println( "Hello World! - Keep Learning Spring and Spring Core" );

    }
}
