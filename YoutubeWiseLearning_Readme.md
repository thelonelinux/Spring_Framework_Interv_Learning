# SPRING FRAMEWORK LEARNING - YOUTUBE WISE
* Best way to learn by watching and coding, But in youtube sequence

## TODO
* LEARN ABOUT REGEX IN JAVA

## MY LEARNING (SPRING FRAMEWORK PLUS)
### PLAYLIST OF YOUTUBE (https://www.youtube.com/watch?v=wteFNBKs8oU&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=1&ab_channel=LazyProgrammer)
#### INTRODUCTION TO SPRING FRAMEWORK (https://www.youtube.com/watch?v=ymvjY71eVDA&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=6&ab_channel=LazyProgrammer)
* WHAT IS SPRING FRAMEWORK
  * It is open source framework, currently owned by VMWare.
  * Enterprise and Internet Support
  * As compared to JEE, it is lightweight for packaging
  * Modest
* SPRING IN THE ENTERPRISE
  * No need for heavy application servers. Just tomcat embedded is fine
  * Provides abstraction for enterprise systems.
  * Focus on business logic. Less code
* DEPENDENCY MANAGEMENT
  * Spring manages runtime dependencies - By allowing the framework to maintain the runtime objects.
    * So that we don't have to deal with the creation and maintenance.
    * This greatly decreases the complexity of the code.
    * Also helps in memory management, even though we have garbage collection.
  * Configure or create them (object) once only.
    * Managed either through applicationContext or BeanFactory
* FRAMEWORK RUNTIME COMPONENTS
  * SPRING CORE CONTAINER COMPONENTS
    * CORE
    * BEANS
    * CONTEXT
    * EXPRESSION LANGUAGE
  * AOP COMPONENTS
    * AOP
    * ASPECTS
    * INSTRUMENTATION
  * DATA ACCESS/INTEGRATION COMPONENT
    * JDBC
    * ORM
    * OXM
    * JMS
    * TRANSACTIONS
  * WEB RELATED COMPONENTS (MVC/REMOTING)
    * WEB
    * SERVLET
    * PORTLET
    * STRUTS
  * See in Youtube for component example

#### INVERSION OF CONTROL AND DEPENDENCY INJECTION (https://www.youtube.com/watch?v=8xBF3RUMQfU&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=4&ab_channel=LazyProgrammer)
* INVERSION OF CONTROL
  * It is core component of Spring Framework
  * It is a software design principle which is independent of any language
  * It does not creates any object, but it describes the way in which any object should be created.
* MEANING OF INVERSION OF CONTROL
  * It is called inversion of control, because the control of creating the object is inverted.
  * So now instead of programmer controlling the creation of object, that will be taken care by the framework itself.
  * We have this spring IOC concept to achieve loose-coupling, (Very imp - best example you will see below)
  * In Spring IOC in implemented using Dependency Injection
* REAL LIFE EXAMPLE
  * As we develop code, we build objects. So objects are dependent on some other objects also.
  * So here we will take a real time example. 
  * Suppose we want to assemble a Computer class. So we will get Ram class and HardDisk class from other object as third party company to assemble our computer.
  * So Computer class will require object of HardDisk and Ram.
  * So we have interface of HardDisk.
    * public class HitachiHardDisk implements HardDisk
    * public class SeaGateHardDisk implements HardDisk
  * So now in our Computer Class, if we create a hardDisk object directly using new keyword then it will become tightly coupled
    * public class Computer {
      * HardDisk hd = new SeaGateHardDisk();
  * So now if in the future, you want to change the company of the hardDisk, let's say from SeaGate to Hitachi,
  * So this means you want to use the other implementation of the hard disk.
  * So this will require the code changes, which is not a good practise.
  * So what we really need in this case?
    * We need someone to provide the object of the dependent component and inject to the main class. Here main class is Computer.
    * So for that we have Container in Spring IOC, which are the homes for Beans (object) which are responsible for injecting the required beans.
    * So we can say container is pool of objects, where objects of hard disk implementation is present, and we can get rid of tight coupling.
    * DEPENDENCY INJECTION - The process of injecting the Dependent Objects by the container or external entity is knows as Dependency Injection.
  * So now new question comes up about how container will know where to inject which object?
    * So for that we must do the configurations.
* HOW TO CONFIGURE DEPENDENCY IN SPRING
  * 1. XML BASED CONFIGURATION
    * In the beginning only this way was used for configuration.
    * So this will provide the object and inject to the class which has dependent.
    * So if in future we want to change the hard disk implementation, then we don't have to change the implementation, but only make changes/update here in xml. No code level changes.
    * So this will make is loosely coupled.
  * 2. ANNOTATION BASED CONFIGURATION
* BUT AS A DEVELOPER WE DON'T WANT TO CONCENTRATE MORE ON CONFIGURATION SIDE. AND FOR THAT WE HAVE SPRING BOOT
  * ROLE OF SPRING BOOT
    * It minimized the configuration required, so that we can concentrate more on business logic.
    * Spring boot take away all the boiler plate configuration.
    * We will learn more about spring boot later, 
    * for now we do spring framework.
* TYPES OF DEPENDENCY INJECTION
  * 1. SETTER DEPENDENCY INJECTION
  * 2. CONSTRUCTOR DEPENDENCY INJECTION
  * FROM MY LEARNING => FIELD DEPENDENCY INJECTIONS
  * Example see in code or in youtube only for injecting dependency injection.
* LEARN WITH CODE NOW FOR THIS STUFFS IN YOUTUBE SHOWN OR WATCH YOUTUBE ONLY.

#### IOC CONTAINERS - BEAN FACTORY AND APPLICATION CONTEXT (https://www.youtube.com/watch?v=tH6rd_OkClM&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=2&ab_channel=LazyProgrammer)
* These two are the containers present in Spring Core components of spring IOC, which completely manages the lifecycle of bean/object.
* WHAT IS BEAN?
  * It is objects maintained and managed by the IOC containers.
* TYPES OF BEANFACTORY OR IOC CONTAINERS
  * 1. BEAN FACTORY
    * It is an Interface class in Spring Framework.
    * It does not supports annotation.
    * Bean Configuration to be done in XML
    * Important methods available in BeanFactory interface and there role
      * containsBean(String name) -> Parameter as name of Bean. To Check if XML container contains that bean or not.
      * getBean(String name) -> Retrieve that bean from the pool, Invoke bean.
      * getType(String name) -> It gets the type of the bean
      * isPrototype(String name) -> Scope of the bean if it is prototype or not (Prototype bean, every time we inject, we get new bean/object created)
      * isSingleton(String name) -> Scope of the bean if it is singleton or not (Singleton bean, same object is created once, and will be passed everywhere whenever it is injected.)
  * 2. APPLICATION CONTEXT
    * It supports annotation based configuration
* STEPS TO CREAT SPRING PROJECT
  * Creating a Maven Project with maven-archetype-quickstart
  * Add Spring Framework Dependency in pom.xml
  * Create the Required Pojo Classes
  * Configure the Beans in an XML
  * Use Bean Factory to read the XML for Object creation and injection.
* USING INTELLIJIDEA IDE TO CREATE SPRING PROJECT