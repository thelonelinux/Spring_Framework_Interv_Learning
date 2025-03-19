# SPRING FRAMEWORK LEARNING (SPRING, SPRING FRAMEWORK, SPRING CORE, SPRING MVC, SPRING AOP, SPRING SECURITY) - YOUTUBE WISE
* Best way to learn by watching and coding, But in youtube sequence

## TODO
* LEARN ABOUT REGEX IN JAVA

## MY LEARNING (SPRING FRAMEWORK, SPRING, SPRING CORE, SPRING AOP) (Completely done with project also attached in this repo - Now you can do brainstorming type doubts in it like in stackoverflow)
* OTHER PLAYLIST YOU CAN FOLLOW FOR SPRING LEARNING:
  * https://www.youtube.com/watch?v=If1Lw4pLLEo&t=101s&ab_channel=Telusko
    * This includes one video for learning spring
  * https://www.youtube.com/watch?v=Zxwq3aW9ctU&list=PLsyeobzWxl7qbKoSgR5ub6jolI8-ocxCF&ab_channel=Telusko
    * This has whole playlist from spring and many spring and spring plus concepts
### A.PLAYLIST OF YOUTUBE - LAZY PROGRAMMER (https://www.youtube.com/watch?v=wteFNBKs8oU&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=1&ab_channel=LazyProgrammer)
#### 1.INTRODUCTION TO SPRING FRAMEWORK (https://www.youtube.com/watch?v=ymvjY71eVDA&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=6&ab_channel=LazyProgrammer)
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

#### 2.INVERSION OF CONTROL AND DEPENDENCY INJECTION (https://www.youtube.com/watch?v=8xBF3RUMQfU&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=4&ab_channel=LazyProgrammer)
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

#### 3.BEAN FACTORY AND APPLICATION CONTEXT (IOC CONTAINERS) (https://www.youtube.com/watch?v=tH6rd_OkClM&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=2&ab_channel=LazyProgrammer)
* These two are the containers present in Spring Core components of spring IOC, which completely manages the lifecycle of bean/object.
* WHAT IS BEAN?
  * It is objects maintained and managed by the IOC containers.
* TYPES OF BEANFACTORY OR IOC CONTAINERS
  * 1. BEAN FACTORY
    * It is an Interface class in Spring Framework.
    * It does not support annotation based configuration
    * Bean Configuration to be done in XML
    * Important methods available in BeanFactory interface and there role
      * containsBean(String name) -> Parameter as name of Bean. To Check if XML container contains that bean or not.
      * getBean(String name) -> Retrieve that bean from the pool, Invoke bean.
      * getType(String name) -> It gets the type of the bean
      * isPrototype(String name) -> Scope of the bean if it is prototype or not (Prototype bean, every time we inject, we get new bean/object created)
      * isSingleton(String name) -> Scope of the bean if it is singleton or not (Singleton bean, same object is created once, and will be passed everywhere whenever it is injected.)
  * 2. APPLICATION CONTEXT
    * It supports annotation based configuration
* STEPS TO CREATE SPRING PROJECT
  * Creating a Maven Project with maven-archetype-quickstart
  * Add Spring Framework Dependency in pom.xml
    * Add this dependency as you won't be able to find applicationContext or BeanFactory or setup Xml Beans Configuration
    * <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring</artifactId>
      <version>2.5.6</version>
    </dependency>
    * This dependency will give us both ApplicationContext/BeanFactory and XML Based Configuration.
    * And this XML Initial Tag is required in xml config, You can check this, and to find xml header you have to see in below topic documentation
    * (opening angular bracket) beans xmlns="http://www.springframework.org/schema/beans"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="
      http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd>

      <!-- bean definitions here -->

      <bean id="student" class="org.example.Student">

      </bean>
      </beans>
  * Create the Required Pojo Classes
  * Configure the Beans in an XML
  * Use Bean Factory to read the XML for Object creation and injection.
  * OTHER RELATED ITEMS FOR MAVEN AND SETUP CHECK IN BELOW TOPIC.
  * Remember I was using Java JDK 8 and Maven 3.9.9. We would have used java 11, but didn't checked that.
  * The code was working fine with JDK8.
* CONTINUE WITH THE YOUTUBE LEARNING ALONG WITH THE PROJECT CREATED IN CODE
  * APPLICATION CONTEXT
    * It is a sub-interface of BeanFactory
    * It is mostly used for lightweight application like mobile application
    * In addition to Basic Features of BeanFactory it provides enterprise-specific functionalities such as:
      * Publishing events to registered listeners by resolving property files.
      * Methods for accessing application components.
      * Supports Internationalization
      * Loading File resource in a generic fashion.
    * Remember : BeanFactory Interface is deprecated in latest releases of spring and spring boot
      * checking on that too
    * Different Types of Application Containers provided by spring for different needs in ApplicationContext.
      * 1. AnnotationConfigApplicationContext
        * This class accept classes annotated with @Configuration and @Component Annotation as an argument and returns the context itself.
        * The constructor of this accepts one or more classes.
        * If there are two @Configuration classes, then beans define in later class will be used.
        * To enable the overriding functionality you need to add one property in the application.properties file:
          * spring.main.allow-bean-definition-overriding=true
      * 2. AnnotationConfigWebApplicationContext
        * It was introduced in spring3.0
        * It is similar to above one but for the web environment
        * This too uses @Configuration and @Component
        * Classes can be registered via register() method or passing base package to scan() method.
      * Other than this two we have few more context containers, we will check them later.
    * This different Context you explore in coding in some other YT, check there and write code
    * In this YT only this much
* Remember - BeanFactory is already getting deprecated in the latest versions.
* -.
##### IGNORE FOR NOW - OUT OF CONTEXT LEARNING - EXTRA DOUBTFUL LEARNING AND MAVEN (IGNORE FOR NOW - THE ISSUE WAS I WAS NOT ADDING SPRINGFRAMEWOK DEPENDENCY SO UNABLE TO CREAT XML BEANS AND APPLICATIONCONTEXT)
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

#### 4.SPRING BEANS (https://www.youtube.com/watch?v=wteFNBKs8oU&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=1&ab_channel=LazyProgrammer)
* WHAT ARE SPRING BEANS
  * They are simple Java Objects
  * Managed by SpringIOC
  * Created and configured using XML or Java Annotations
* SPRING IOC CONTAINER
  * Responsible for Instantiating, Configuring and Assembling the objects
  * It does this using the Dependency Injection, Which is a design pattern that allows the object to receive its dependency from external source, other than creating the dependency on its own.  
* DEFINING THE SPRING BEANS
  * 1. @Bean Annotation
    * This annotation is used to let use know that method will return the spring bean.
    * Example in Configuration Class we have this bean created.
      * @Configuration
      * public class MyConfiguration {
        * @Bean
        * public MyBean myBean(){
          * return new MyBean();
        * }
      * }
    * So this bean will be injected to other classes using @AutoWired Annotation
    * @Bean annotation can be also be used for customization of the bean. example
      * @Bean(name ="myCustomBean", initMethod="init", destroyMethod="cleanup")
        * You can use this name attribute to specify the name of the bean.
        * initMethod you can specify to be called after the bean is being created
        * destroyMethod is called after the bean is being destroyed
  * 2. DEFINING A BEAN USING XML
    * <bean id="myBean" class="com.example.MyBean" --/> (remove double hypen at closing tag as it was giving some error, so I added)
    * For example code, you can see in 3 topic above
    * With the introduction of SpringBoot we have moved away from xml based configuration, and it will impact the development in a very good way
    * As developers now not needed to do xml configuration going forward
* INJECTING BEAN USING @AUTOWIRED
  * How to use created Beans in our spring framework. 
  * Main benefit of using Spring Bean - It can be easily injected.
  * Example code
    * public class MyService{
      * @Autowired
      * private MyBean myBean;
    * }
  * So here in this code, We are using @Autowired, so without creating any instance of myBean, we can use this object, As it is taken care by Spring Container to give the beans and create the beans for us.
  * WHERE @Autowired CAN BE USED?
    * 1. Fields
      * Example the above one
    * 2. Constructors (inject via constructors)
      * Example
        * public class MyService{
          * private MyBean myBean;
          * @Autowired  (Used just above the constructor)
          * public MyService (MyBean myBean){
            * this.myBean = myBean;
          * }
        * }
    * 3. Setter Methods (inject via setter methods)
      * Example
        * public class MyService{
          * private MyBean myBean;
          * @Autowired  (Used just above the setter method)
          * public void setMyBean (MyBean myBean){
            * this.myBean = myBean;
          * }
        * }
    * 4. ONE MORE WAY TO INJECT USING INTERFACES
      * This you explore yourselves how to do.
* OPTIONAL BEAN INJECTION @Autowired
  * If you inject the bean using @Autowired and it didn't find any beans in the context, then it will throw an error during startup.
  * But if the bean is marked as optional, the Spring IOC will not throw an exception if it is unable to find the matching bean.
  * To mark dependency as optional, you can use following annotation for Autowired
  * example
    * public class MyService{
      * @Autowired(required = false)
      * private MyBean myBean;
    * }
  * So here we have provided Required parameter as false, But by default they are always true.
* CONCLUSION 
  * Spring Beans are object managed by IOC container. It can be easily injected into other objects.
  * They are used to create and configure objects in an application.
*

#### 5. SPRING BEAN LIFE CYCLE (https://www.youtube.com/watch?v=vbo6l7HIyVk&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=3&ab_channel=LazyProgrammer)
* LIFE CYCLE OF AN OBJECT
  * When and how it is created
  * How it behaves
  * When and how it is destroyed
* LIFE CYCLE OF SPRING BEANS
  * CONTAINER STARTED => BEAN INSTANTIATED => DEPENDENCIES INJECTED => CUSTOM INIT => CUSTOM DESTROY METHOD
* WAYS TO HANDLE BEAN LIFE CYCLE (WAYS TO IMPLEMENT)
  * We will write init method and destroy method in the below configuration to set and handle bean life cycle.
    * 1. USING XML CONFIGURATION
      * Example code
        * public class MyBean{
          * public void init() throws exception {
            * Syso("XML:Bean has been instantiated. This is init method");
          * }
          * public void destroy() throws exception {
            * Syso("XML:container has been closed. This is destroy() method");
          * }
        * }
        * ------.----
        * <beans
          * <bean id="myBean" class="com.MyBean" init-method="init" destroy-method="destroy"/>
        * </beans
    * 2. JAVA CODE LEVEL IMPLEMENTATION
      * Here we need to implement two interfaces (InitializingBean, DisposableBean) and override there method (afterPropertiesSet and destroy)
      * So these method will get invoked once the container is getting started and closed.
      * Example code
        *  public class MyBean{ implements InitializingBean, DisposableBean{
          * public void afterPropertiesSet() throws exception {
            * Syso("Java:Bean has been instantiated. This is init method");
            * }
            * public void destroy() throws exception {
              * Syso("Java:container has been closed. This is destroy() method");
            * }
        * }
        * ------.----
        * Here in xml we don't have to define the init and destroy attribute, as it is taken care by implementing the interfaces.
        * <beans
          * <bean id="myBean" class="com.MyBean" />
        * </beans
    * 3. ANNOTATIONS
      * Here we neither have to implement any interfaces nor we have to add init and destroy attribute in xml bean.
      * Example code . We make use of annotations (@PostConstruct for init and @PreDestroy for destroy and container beans will find it itself.)
        *  public class MyBean{
          * @PostConstruct
          * public void init() throws exception {
            * Syso("Annotations:Bean has been instantiated. This is init method");
          * }
          * @PreDestroy
          * public void destroy() throws exception {
            * Syso("Annotations:container has been closed. This is destroy() method");
          * }
        * }
        * ------.----
        * <beans
          * <bean id="myBean" class="com.MyBean" />
        * </beans
* IMPLEMENT ALL THIS IN THE CODE AND CHECK AS SHOW IN YT
  * 1. FOR XML CONFIGURATION
    * Create Beans in XML file only, call by ApplicationContext or ConfigurableApplicationContext but in springboot check it
    * sample code to start context is 
      * @SpringBootApplication
      * @ImportResource("classpath:MyBeansConfig.xml")  //This will import the xml configuration where you have defined the beans
      * public class SpringLifeCycleByXmlApplication {
        * psvm {
          * ConfigurableApplicationContext context = SpringApplication.run(SpringLifeCycleByXmlApplication.class); //This will call the init method
          * context.close(); //This will call the destroy method
        * }
      * }
  * 2. FOR JAVA LEVEL IMPLEMENTATION(INTERFACES)
         * Same example code only
  * 3. ANNOTATIONS (POSTCONSTRUCT AND PREDESTROY ANNOTATIONS)
      * Same example code only for springbootapplication context as above.
* 

#### 6. SPRING BEAN SCOPE (https://www.youtube.com/watch?v=MSVvzTuGuIs&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=5&ab_channel=LazyProgrammer)
* When creating the bean, you don't only control the Dependencies and Configuration, but also the scope of that bean definition.
* SCOPE OF BEAN
  * SPRING FRAMEWORK SUPPORTS 6 SCOPES (4 OF WHICH ARE AVAILABLE ONLY WHEN YOU ARE USING WEB APPLICATION CONTEXT)
    * 1. SINGLETON SCOPE
      * Only one shared instance of a singleton bean is managed
      * Spring IOC container creates exactly one instance of the object by that bean definition.
      * It is not same as the Singleton Design Pattern
      * This is default scope of spring beans
      * We define scope in xml configuration or java configuration. If we do not define then by default it is singleton.
    * 2. PROTOTYPE SCOPE
      * Creates a new bean instance every time a request for htt specific bean is made.
      * As a rule, you should use the prototype scope for all stateful beans.
        * Stateful - state of object can be changed, means internal values of member variables of that object can be changed.
        * Example of stateless object
          * class Stateless {
            void test() {
            System.out.println("Test!");
            }
          }
          * This is also a stateless object:
            class Stateless {
             //No static modifier because we're talking about the object itself
             final String TEST = "Test!";
  
             void test() {
              System.out.println(TEST);
             }
          }
      * Here initialization lifecycle method is called, but destroy method is not called for prototype beans.
      * SINGLETON BEANS WITH PROTOTYPE BEANS DEPENDENCIES
        * When you in Computer class which is Singleton Type Bean has dependencies on Ram which is prototype type bean, then
        * When creating the Computer class bean, which has Ram Prototype bean in it, then we know that dependencies are resolved during instantiation of object.
        * Thus, in above case, Ram prototype Bean is first created and then injected in Computer Singleton bean.
        * So if a new bean again created for Computer Singleton bean then same Ram bean will be called everytime, No new instance will be created for Ram if computer bean is created again.
    * WEB AWARE SCOPES (Learn later in deep during Web Applications)
      * 3. REQUEST - Scopes a single bean definition to the lifecycle of a single HTTP request
      * 4. SESSION - Scopes a single bean definition to the lifecycle of an HTTP Session.
      * 5. APPLICATION - Scopes a single bean definition to the lifecycle of a Servlet Context.
      * 6. WEBSOCKET - Scopes a single bean definition to the lifecycle of a WebSocket.
* HOW TO SET SCOPE
  * USING ANNOTATIONS
    * Example
      * @Bean
      * @Scope("singleton")
      * public MyBean getMyBean(){..}
    * We can also use a constant instead of the String value in the following manner
      * @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
  * USING XML
    * <bean id="myBean" class="com.example.MyBean" scope="prototype"/.>
* 

#### 7. SPRING BEAN ANNOTATION (https://www.youtube.com/watch?v=v4hYFYATF_Y&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=12&ab_channel=LazyProgrammer)
* Just same topic as above bean related only but all in one and in sequence only.
* USER DEFINED BEAN
  * By default bean name is same as method name, but user defined can be done in this way
  * @Bean ("myBean")
  * public Bean bean(){
    * return new Bean();
  * }
* BEAN NAME ALIASING
  * Sometimes it is required for a particular bean to have multiple names for three different env or systems so.
  * the name attributes of the @Bean annotation accepts an array of String for this purpose.
  * @Bean({"dataSource", "subsystemA-dataSource", "subsystemB-dataSource"})
* DESCRIPTION OF THE BEAN
  * Sometimes, it is helpful to provide a more detail textual description of a bean.
  * To add a description to a @Bean, you can use the @Description annotation
    * @Bean
    * @Description("This is a service bean")
    * public Service service(){
      * return new Service();
    * }
  * This is done only to get some info about that bean.
* 

#### 8. ANNOTATION BASED CONFIGURATION (https://www.youtube.com/watch?v=lRO7n8BZj9g&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=8&ab_channel=LazyProgrammer)
* OVERVIEW
  * We can do configuration in spring using XML and Annotations or both in same project.
  * The question is "Are annotations better than XML for configuration in Spring?"
    * Each configuration has it's own pros and cons, and let developer decides which suits him better.
  * Annotation provide shorter declaration whereas XML is very good in re-wiring the components, without touching the source code.
  * That means in Annotation, we are directly making changes in java class which is not in case of xml configuration.
  * It does not matter as "SPRING CAN ACCOMODATE BOTH OF THEM AND MIXED OF THEM AS WELL" We can use either or both together.
* WHAT IF WE USE BOTH ANNOTATION AND XML CONFIGURATION FOR SAME CLASS COMPONENT BUT WITH DIFFERENT DETAILS
  * Then which configuration will take precedence.
  * Since Annotation injection is performed before XML, thus XML configuration will override annotation for properties wired through both approaches.
* @Autowired
  * Used for dependency injection. See above there it is done.
* @Primary
  * When we have multiple implementations of a single dependency in the container.
  * @Primary indicates that a particular beans should be given preference.
* @Qualifier
  * Fine tune using @Qualifier. (It will specifically that specific bean out of multiple bean declaration for same class object)
  * It is used in conjunction with the @Autowired.
  * It allows you to specify which bean should be wired when there are multiple beans of the same type in the application context.
  * Example we have HardDisk interface class 
  * We have two class implementing this interface, lets say "Seagate" and "Samsung".
  * So in the class implementation we will have code like this
    * @Service
    * @Qualifier("seagate")
    * public class Seagate implements HardDisk{.method 1.}
    * -----...----
    * @Service
    * @Qualifier("samsung")
    * public class Samsung implements HardDisk{.method 1.}
  * So here qualifier will uniquely identify each bean.
    * Example of how we will use this when injecting
      * public class Computer{
        * @Autowired
        * @Qualifier("seagate") //Here we know which bean to chose here only and inject that only
        * private HardDisk hardDisk;
        * ..
        * public void myHardDiskTask(String message){
          * hardDisk.method1(message);
        * }
      * }
* WHAT WILL HAPPEN IF WE USE @Primary AND @Qualifier TOGETHER
  * Both can be used together, But only one will be used.
  * @Qualifier has higher precedence as compared to @Primary
* @Resource
  * @Resource is another annotation used for dependency injection in the java.
  * It is not specific to Spring Framework but similar to the @Autowired annotation.
  * It is same as @Autowired
  * Just here we have arguments which we can pass like as below from the above example. It does roles of @Qualifier using the arguments.
    * @Resource(name="Seagate")
    * private Harddisk hardDisk;
* @Inject
  * Same as @Autowired to inject bean, this you learn yourself.
* @Autowired vs @Resource vs @Inject
  * Why we need 3 annotation for same job of injecting bean or wire the bean.
  * They differ in the execution path taken to find the bean.
  * @Autowired - Specific to Spring Framework
  * @Resource and @Inject - Not specific to Spring Framework. They belong to JSR Standards.
* @Value
  * It is used to inject externalized properties. Present in external sources. Not in the java code itself.
  * It can be properties file or remote server as well.
  * Let say we have application.properties file
    * Having key value pair as 
      * category.name=Test
    * Then we can inject this in below way
      * @Value("${category.name}")
      * private String categoryName; 
    * Just in case that key is not present then we can add default value in this way
      * @Value("${category.name:defaultBeanValue}")
      * private String categoryName; 
      * 
* END OF YOUTUBE PLAYLIST = LAZY PROGRAMMER FOR SPRING FRAMEWORK LEARNING
* -------------------- END ----------------------------*

### B.PLAYLIST OF YOUTUBE - SPRING FRAMEWORK WITH MAVEN (https://www.youtube.com/watch?v=JNeAwX_MOcU&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&ab_channel=Telusko)
* HERE MOSTLY CODING STUFFS AND UNDERSTANDING WITH PROJECTS
#### 1.JAVA SPRING DEPENDENCY INJECTION (https://www.youtube.com/watch?v=JNeAwX_MOcU&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&ab_channel=Telusko)
* JUST INTRO - Object beans is required in spring core

#### 2.INTRODUCTION TO MAVEN THEORY (https://www.youtube.com/watch?v=dqJanLvjDqc&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=2&ab_channel=Telusko)
* MAVEN
  * Build Tool, Owner is Apache.
  * Why we need maven
    * We need some third party library to make our project. example for sql we need mysql connector libraries or dependency jar file.
    * We have to download all this jar file / dependency ourselves if maven was not there.
    * It also make sure the versions are compatible with each other.
    * Better connect with internet if you are using spring dependency not present in your local repository.
    * If it is already present in local repository then it won't go to remote repository to download it.
* GRADLE
  * Build tool like maven for java.

#### 3.MAVEN TUTORIAL PRACTICAL (https://www.youtube.com/watch?v=uEYjXpMDJiU&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=3&ab_channel=Telusko)
* www.spring.io
  * you can download the jar files from here.
  * go to project, >> go to spring framework
  * you will also see minimum jdk requirements to run certain spring dependencies.
  * dependencies
    * org.springFramework (groupID)
    * artifact. spring-context
* CREATE MAVEN PROJECT
  * In intellijIdea/ or eclipse (chose maven project in eclipse)
  * File >> Create New Project >> Maven >> Archetype (choose quickStart for core java)
  * Archetype you can chose web for web applications and so on , this is just boilerplate code template.
  * And then once the project is created. in pom.xml file add the springframework dependencies.
    * org.springFramework (groupID), spring-context (artifactId), 4.2.4.RELEASE (version)
    * This will support for all JDK above 6 for Spring Framework 4.x
    * and JDK 5+ for Spring Framework 3.x
  * It will download jar of spring-context, spring-core, spring-aop, spring-beans, aopalliance, spring-expression, commons-logging.
* In POM.XML
  * You will see maven version <modelVersion
  * You will see what type of application you have and its packaging (jar or war if web application)
* PROJECT WILL CONTINUE IN NEXT LECTURE YT PLAYLIST

#### 4.SPRING CORE FRAMEWORK (xmL BASED PROJECT) contd.. (https://www.youtube.com/watch?v=jdRd5hR9ON8&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=4&ab_channel=Telusko)
* DEPENDENCY INJECTION BY CODE PRACTISE
  * project continue in next class

#### 5.SPRING CORE FRAMEWORK (xmL BASED PROJECT) contd.. (https://www.youtube.com/watch?v=Lw_PszjKu68&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=5&ab_channel=Telusko)
* XML Tag to define bean in project only continues.. 
  * XML needs custom tags which needs some definition. Definition you can get in spring websites.
  * <beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="
    http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
  * Here advantage we will have is in xml we don't have to recompile like java sorce code. So this is advantage we are getting when creating beans in xml.
* 

#### 6.SPRING CORE FRAMEWORK (xmL BASED PROJECT) contd.. (https://www.youtube.com/watch?v=4fZJfqpnyWg&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=6&ab_channel=Telusko)
* DIFFERENT TYPES ON CONFIGURATION
  * Context object is responsible to give you beans. (ApplicationContext)
    * Three types of Configuration
      * 1. XML BASED CONFIGURATION - Like we are doing by bean tag in xml file
      * 2. ANNOTATION BASED CONFIGURATION IN XML FILE ONLY - But not creating Bean Tag, instead using @Component in every class which we need bean of.
        * Here in XML we just add component scan tag.
        * In annotation based configuration, we don't have make bean tag for that class in xml file.
        * Just add @Component in the class which you want bean of.
        * But how XML will identify that class with @component and create bean for it on its own.
        * So our spring framework does not know about that @Component defined classes.
        * So to let our Spring framework know it in Annotation Based Configuration. we will add this below tag in our xml config file.
          * <!-- This componentScan tag is used for finding class annotated with @Component and make bean of it automatically
             * This is called Annotation Based Configuration (Done from XML Only-->
           * <context:component-scan base-package="org.example"></context:component-scan>
        * Also our XML Tag header will be changed like this where we add some more context http as shown below
          * <!-- This xml header details belongs to spring framework dependencies when we want annotation based configuration as well -->
        <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:context="http://www.springframework.org/schema/context"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans-4.0.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context-4.0.xsd">
        * So after this just make the object of @ComponentScan using context and run it. It will run fine
        * VERY IMPORTANT - SO WE CAN HAVE BOTH XML BEAN TAG CONFIGURATION AND ANNOTATION BASED CONFIGURATION IN XML TOGETHER.
      * 3. JAVA CONFIGURATION - Here we make a configuration class using @Configuration and there we will have @Beans method to make bean
        * If we don't want to make bean, then here we can write @Component on every class we need bean of and in configuration class we will add @ComponentScan annotation, It will make bean of all classes annotated with @Component.
        * This is mostly used in latest versions.
* NOTE
  *  <dependency
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>6.1.4</version>
    <dependency>
  * On adding this 6.1.4 Version for springFramework which is latest of it's dependency, It won't be able to identify bean factory.
* 

#### 7.SPRING CORE FRAMEWORK (xmL BASED PROJECT) contd..(https://www.youtube.com/watch?v=1MDpTdCit9s&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=7&ab_channel=Telusko)
* PROJECT CODE LEARNING CONTINUES..
  * See more in the project code added in this repo.
  * You can run this maven project once you pick it up and run it separately, 
  * Here you may not run it as this is not identified or created as  maven project so.
  * so the ide won't identify it as a maven project.
* 

#### 8.SPRING CORE FRAMEWORK (xmL BASED PROJECT) contd..(https://www.youtube.com/watch?v=oTy2pUILpdQ&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=8&ab_channel=Telusko)
* CONSTRUCTOR INJECTION
  * Check in code project only
* 

#### 9.SPRING CORE FRAMEWORK (xmL BASED PROJECT) contd..(https://www.youtube.com/watch?v=HFt_q0wYYLU&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=9&ab_channel=Telusko)
* AUTOWIRED ANNOTATION
  * Check in code project only, Computer will have hardDisk injected in it using @Autowired,
  * @Autowired will create bean for computer class by finding the bean in xml configuration from context container.
  * If we are using both XML and Annotation in XML, then they are called mixed configuration.
* Also check how to make computer bean in xml and add hardDisk property in it. using bean tag in xml instead of using @Autowired in computer class for hardDisk injection.
* END OF XML BASED PROJECT AND ITS SPRING CORE AND SPRING CONCEPTS

#### 10.SPRING CORE ANNOTATIONS (NEW PROJECT - NON XML - JAVA BASED CONFIGURATION) (https://www.youtube.com/watch?v=5zUTc-kge8I&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=10&ab_channel=Telusko)
* NON-XML BASED CONFIGURATION (JAVA BASED CONFIGURATION - Create @Configuration class and make @Bean there only)
  * CREATE NEW PROJECT
    * Add that same spring framework dependency only, as you have added above.
    * chose maven QuickStart Archetype only again.
  * JAVA BASED CONFIGURATION
    * Since here we don't want to use XML Based Configuration, so we don't create config.xml file.
    * Also here to make context we won't make context by calling as below xml
      * ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml"); //Belongs to SpringFramework dependencies //It is an interface which indirectly child of BeanFactory only.
    * Instead we make context by calling below class
      * ApplicationContext factory = new AnnotationConfigApplicationContext();
    * and then after create the beans or get the beans from this context.
  * Here also same class files will be there like in XML Project
  * Just there won't be XML configuration
  * Instead we will java based configuration
  * So make Config.java and annotate it with @Configuration. So now this will be our configuration class and here you can specify the beans
  * Also to achieve Annotation Based Configuration in Java Config Class, add Annotation @ComponentScan, it will make bean of all the classes annotated with @Component within the package.
  * You can have multiple config class.
* MOSTLY SEE IN CODE PROJECT, YOU WILL LEARN FROM THERE.

#### 11.SPRING CORE ANNOTATION COMPONENT AUTOWIRED PRIMARY QUALIFIER (Java Based Configuration) contd..(https://www.youtube.com/watch?v=VIaBbNaYDaU&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=11&ab_channel=Telusko)
* MOSTLY SEE IN PROJECT CODE ONLY
  * @COMPONENT
    * Put in every class of which you don't want to make bean in config class. 
    * Config class will automatically scan it via @ComponentScan and make bean of it. Bean name will be the class name only in small case but camel case.
  * @COMPONENTSCAN
    * @ComponentScan(basePackages="org.example")
    * It will scan all the component and create beans within this package.
    * By default bean name will be class name with camelcase way. small case letters
  * @AUTOWIRED
    * To inject the dependency in other class. It will create bean/object for that class. It will search for the object in config class.
  * @PRIMARY
    * Like you have Samsung and Seagate implementing interface HardDisk.
    * So if in case you are getting the bean in Java Based Configuration without using @Bean in config class
    * And by using @Component in both Samsung and Seagate,
    * Then at that time when you try to get bean of HardDisk, the IOC Container will get confused and gives error that we have two beans.
    * So there if you want Samsung then you have to add @Primary annotation in that class along with @Component.
    * Other way of doing this is by using @Qualifier while @Autowiring in Computer class.
    * code as 
      * @Autowire
      * @Qualifier("seagate")
      * HardDisk hardDisk;
    * So this will pick Seagate and remove ambiguity.
* SO THAT'S IT LEARNING SPRING CORE AND DI AND IOC AND CONFIGURATION TYPES
* LEARNING ABOUT HOW TO CREATE MAVEN PROJECT, SPRING PROJECT AND ALL BASICS.
* -- END OF PROJECT WISE LEARNING FOR SPRING FRAMEWORK, SPRING , SPRING CORE -----

#### 12. SPRING AOP (https://www.youtube.com/watch?v=Ft29HgsePfQ&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&ab_channel=Telusko)
* IN LAYMAN WORDS
  * It is like Trigger. Use @Aspect annotation in aspect class. @Before or @After in its method. There you mention before what function it should be called.
  * So when such method name is called, it will trigger this Aspect class method before that function.
  * So mostly that's it. 
  * You can watch YT for code. 
  * Not going in deep about it.

*  ----- END OF SPRING FRAMEWORK, SPRING , SPRING CORE ---------

----------------------------------------------------------------

## MY LEARNING (SPRING MVC) (YT Deep dive learning done, But project not created here myself)
### A.PLAYLIST OF YOUTUBE - LAZY PROGRAMMER (https://www.youtube.com/watch?v=U62P5vXaNdk&list=PLOktGWstEblpowQsGUoR8xu9gIzpq1pxw&index=2&ab_channel=LazyProgrammer)
* OVERVIEW OF THIS PLAYLIST
  * Total 6 videos.
  * Simple web application building using spring boot, using dependencies spring web and thymeleaaf
  * Here controller is just that /home will render the hello.html. So this is how it is different from our usual apis.
  * Once only learning this 6 YT videos will enough for you to understand how and what spring mvc.
* 
#### 1.INTRODUCTION TO SPRING MVC (https://www.youtube.com/watch?v=U62P5vXaNdk&list=PLOktGWstEblpowQsGUoR8xu9gIzpq1pxw&index=2&ab_channel=LazyProgrammer)
* IN LAYMAN WORDS
  * See part 3 below
  * This is just web-application you make using spring framework. 
  * Later the project was made using spring boot only (see part 3)

#### 2. HOW SPRING MVC WORK? COMPLETE WORKFLOW OF SPRING MVC REQUEST (https://www.youtube.com/watch?v=IkDsHHLwg4Y&list=PLOktGWstEblpowQsGUoR8xu9gIzpq1pxw&index=2&ab_channel=LazyProgrammer)
* IN LAYMAN WORDS
  * It just specifying the flow of spring MVC how it will render

#### 3. SPRING MVC WITH ZERO CONFIGURATION USING SPRINGBOOT AND THYMELEAF (https://www.youtube.com/watch?v=1lMyJMZzcpM&list=PLOktGWstEblpowQsGUoR8xu9gIzpq1pxw&index=3&ab_channel=LazyProgrammer)
* IN LAYMAN WORDS
  * MODEL IS DB
  * VIEW IS HTML PAGE
  * CONTROLLER
    * This is same as controller as you do in api, but here instead of returning list of student.
    * Here we return html page on calling that /hello. This will return hello.html
    * So we use ThymeLeaf dependencies for frontend to talk with backend
    * We also use spring web dependencies for web application using controller call.
  * So this is just simply learning a web page.
  * You can just watch this 
  * Here they made project using spring boot only, by using jar file, and dependencies like spring web and thymeleaf only.

 
#### 4. SPRING BOOT MVC TUTORIAL - IMPLEMENTING USER REGISTRATION AND LOGIN WITH JPA AND THYMELEAF (https://www.youtube.com/watch?v=i2YxccYlGWw&list=PLOktGWstEblpowQsGUoR8xu9gIzpq1pxw&index=4&ab_channel=LazyProgrammer)
* PROJECT BUILDING AND LEARNING VIA CODING
  * You could have created the web mvc project from maven archetype from intellijIdea only.
  * but we are creating from the spring.io as spring boot project as it will give all the ready configuration to us.
  * @PostMapping("/login")
    * If user enters valid password then goes to dashboard or in same page. so this  is how controller in mvc works for post
  * @GetMapping("/dashboard)
    * This will just show you the dashboard.html page as get request.
    * Use of HttpSession
* (Very Very IMP)You can see DB in db console in web browser after starting the application. We don't need sql server ide in our computer for it.
* So just register, it will add user details in table.

#### 5. SPRING MVC APPLICATION DEMO - (above project) Cont.. (https://www.youtube.com/watch?v=UdVXuT0OJ8g&list=PLOktGWstEblpowQsGUoR8xu9gIzpq1pxw&index=5&ab_channel=LazyProgrammer)
* PROJECT CREATED ABOVE
  * This will just show us the demo of using project created in playlist 5 above
* 

#### 6. SIMPLIFY CONFIGURATION USING @EnableWebMvc IN MVC APPLICATION (https://www.youtube.com/watch?v=N0dzymNyiHM&list=PLOktGWstEblpowQsGUoR8xu9gIzpq1pxw&index=6&ab_channel=LazyProgrammer)
* @EnableWebMvc (VERY IMP TO LEARN THIS - GOOD EXPLAINED - FOR NOW JUST NOT GOING IN VERY DETAIL AS NOT REAL LIFE EXAMPLE I AM USING RIGHT NOW)
  * How this annotation made our spring mvc work much easier
  * web.xml configuration
    * DISPATCHERSERVLET
    * SERVLET MAPPING
    * SPRING CONTEXT
  * THE POWER OF @EnableWebMvc
    * DispatcherServlet Init 
      * In web.xml we had to do something just not now
    * Request Mapping
      * It will automatically do mapping with the introduction of @EnableWebMvc
    * Adapter
    * Exception Handling
    * Static Resource Handling - Automatically handles  static files like CSS, HTML etc.
      * View Resolution - Resolves view like xml 
    * Simplified Configuration

#### CONCLUSION 
* You can learn this for starting with the code and understanding spring mvc
* PROJECT created in this playlist is enough to learn and understand spring mvc. but right now not adding this project or making this project.
  * will be doing that in future
* Further learning will come if we deep dive.
* But since right now I am not directly anywhere using spring mvc in office or external so not going deep.
* But this is good learning as you can build full fledged website in java spring.
* This is like good with both backed and fronted in java only


----------------------------------------------------------------

## MY LEARNING (SPRING SECURITY) (Done but not doing deep dive learning - no project created just seen YT videos sort of)
* IN LAYMAN WORDS
  * Just learn some youtube playlist attached here.
  * No need to go deep dive.
  * It mostly includes
    * How to make spring Boot project secure by using some security dependency. They are making via spring boot project only.
    * It also includes JDBC security
    * Login security
    * JWT Security
* YT Links
  * https://www.youtube.com/watch?v=29vmP4YLwyo&list=PLxhSr_SLdXGOpdX60nHze41CvExvBOn09&ab_channel=EmbarkX%7CLearnProgramming
  * This has got 12 videos in the playlist. Just watch it, but right now not doing deep dive, but idea taken
  * Also check this YT also : https://www.youtube.com/watch?v=sm-8qfMWEV8&list=PLqq-6Pq4lTTYTEooakHchTGglSvkZAjnE&ab_channel=JavaBrains

----------------------------------------------------------------

## MY LEARNING (SPRING JDBC, SPRING ORM)

----------------------------------------------------------------

## MY LEARNING (SPRING BOOT, SPRING WITH REST APIS)