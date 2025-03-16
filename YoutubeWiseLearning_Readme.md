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
    * Add this dependency as you won't be able to find applicationContext or BeanFactory or setup Xml Beans Configuration
  * Create the Required Pojo Classes
  * Configure the Beans in an XML
  * Use Bean Factory to read the XML for Object creation and injection.
  * 
#### IGNORE FOR NOW - OUT OF CONTEXT LEARNING - EXTRA DOUBTFUL LEARNING AND MAVEN (IGNORE FOR NOW - THE ISSUE WAS I WAS NOT ADDING SPRINGFRAMEWOK DEPENDENCY SO UNABLE TO CREAT XML BEANS AND APPLICATIONCONTEXT)
  * USING INTELLIJIDEA IDE TO CREATE SPRING PROJECT
  * ON CODE PRACTISE LEARNING (WHEN CREATION PROJECTS)
    * Looks like XML Based configuration is only used until spring 3.0
    * This appendix details the XML Schema-based configuration introduced in Spring 2.0 and enhanced and extended in Spring 2.5 and 3.0.
    * https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html
  * SOME OFFICE RELATED LEARNING AS SEEN IN ABPA APPLICATION (https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html)
    * 40.2.3 the jee schema
      * The jee tags deal with Java EE (Java Enterprise Edition)-related configuration issues, such as looking up a JNDI object and defining EJB references.
  * https://www.baeldung.com/spring-boot-xml-beans
    * Before Spring 3.0, XML was the only way to define and configure beans. 
    * Spring 3.0 introduced JavaConfig, allowing us to configure beans using Java classes. 
    * However, XML configuration files are still used today.
    * In this tutorial, we’ll discuss how to integrate XML configurations into Spring Boot.
  * NEED TO LEARN MORE ABOUT XML BASED CONFIGURATION, TYPES OF XML SCHEMA, VERSIONS WHICH SUPPORT, SPRING VERSION, MAVEN VERSION , JDK VERSION AND ALL 
    * https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-Versions
    * https://bluebirdinternational.com/spring-framework-versions/
    * https://www.codejava.net/frameworks/spring/spring-framework-version-history
    * https://www.codejava.net/frameworks/spring-boot/spring-boot-version-history
    * https://www.marcobehler.com/guides/spring-and-spring-boot-versions
    * https://jsession4d.com/list-of-spring-boot-and-spring-release-versions-and-schedule/
  * WHEN CREATING PROJECT LEARNING
    * TO CHANGE JDK
      * First change the path from jdk/bin from on 11 to 1.8 in System Variable Path and User
      * Change in intellijIdea in settings and project structure.
      * And then restart the computer, they jdk version will be changed. 
      * Reload the maven. It didn't work. 
        * It is still unable to identify applicationContext class.
      * Need to check maven version and spring compatible version and need to check how to check and change that.
      * To Check java Versions : $$ java -version      $$ javac -version
    * MAVEN      
      * https://www.simplilearn.com/tutorials/maven-tutorial/maven-interview-questions
      * In this below link, you can see Maven version compatibility with java versions.
        * https://maven.apache.org/docs/history.html
        * Maven 1 (End of life)
        * Maven 2 (Old)
        * Maven 3 (Mostly used in current project)
            * Maven 3.6.0 to below has reached end of life, they supports only Jdk 7 or less.
            * 3.8.1 to 3.8.8 => This supports or requires Jdk 7
            * 3.9.0 to 3.9.9 => This supports or required Jdk 8
            * However remember, we can always run below jdks by using toolchain plugins, check in below notes, it is written there.
        * Maven 4 (New - Not Yet Commonly used)
        * https://maven.apache.org/developers/compatibility-plan.html
      * Important to Note - InjellijIdea always comes with bundled maven, So you better do your maven download and Maven_Home setup in env variables.
      * Go to IntellijIdea  >> File >> Settings >> Maven, 
        * There you will see the bundled maven with version. So you better chose compatible maven with java 8 by downloading and putting it in Maven_Home in env path.
        * https://www.youtube.com/watch?v=JhSBS2OpGdU&ab_channel=ProgrammingTechie
      * So when you are doing $$ mvn --version to check maven version, then you won't get any maven, as you have not downloaded maven and set the env variable. 
      * And in intellijIdea it was running maven project because of it's own pre-installed bundled maven. Which is not required for different versions.
      * In ABPA they are using
        * 2023-03-08	3.8.8	Java 7
      * Maven downloading and system requirements how it is mentioned see this 
        * https://maven.apache.org/download.cgi
        * Also how you can add toolchains plugin to use lower jdk project to be build when you are using higher jdk version compatible maven.
        * Check on this link for that : https://maven.apache.org/guides/mini/guide-using-toolchains.html
        * The maven-toolchains-plugin is the one that sets the toolchain to be used by the toolchain-aware plugins in your project.
        * For example, you want to use a different JDK version to build your project than the version used to run Maven, 
          * you can configure the version you want to use via this plugin as shown in the pom.xml below:
        * So once you download and set M2_HOME environment variable, system variable and run $$ mvn --version in command prompto, you will see it is done. 
          * https://www.youtube.com/watch?v=JhSBS2OpGdU&ab_channel=ProgrammingTechie
        * GK - There is nothing like maven is installed, Until you put MAVEN_HOME or M2_HOME environment variable in System environment variable and system path, until then they won't be shown when you 
          * check via $$ mvn --version.
          * 