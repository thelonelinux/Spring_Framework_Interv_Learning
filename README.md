# Spring_Framework_Interv_Learning
Learning Spring Framework core and all other spring framework concepts

## MY LEARNING APPROACH FOR INTERVIEW
### 1. FROM INTERVIEWBIT - PDF ATTACHED (CHECK AND LEARN)
### 2. FROM GFG INTERVIEWBIT (https://www.geeksforgeeks.org/spring/)
### 3. PRACTICE CODE AND LEARN (Will be adding codes here and learn in this repo only)


## MY LEARNING (SPRING FRAMEWORK, CORE , SPRING MVC, SPRING AOP, SPRING SECURITY ETC.) (FOR DETAIL YT LEARNING SEE YUTUBELEARN_SPRINGFRAMEWORK_README.MD)
### MAVEN LEARNING
* Maven is a build tool, like gradle.
* Let say in spring or springboot project we need to use SQL connector, so for that we need Sql connector jar files to use in our project.
* So all this download task is done by maven build tool.
* So this is what main task for maven. It will also take care of versions and download accordingly.
* artifactID and groupId is like finding that dependency by unique project identification.
* Make sure you are connected with the internet when downloading the jar file from remote repository.
* first Maven search in your local repository, if not found in local then it will look to remote repository.
* YT link : https://www.youtube.com/watch?v=dqJanLvjDqc&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=3&ab_channel=Telusko
### HOW TO CREATE A MAVEN PROJECT IN INTELLIJIDEA OR ECLIPSE, AND LATER A SPRING PROJECT FROM IT
* YT link : https://www.youtube.com/watch?v=uEYjXpMDJiU&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=3&ab_channel=Telusko
* This is make sure you have pom.xml file.
* In intellijIdea, just create new project, chose maven archetype and select archetype, it will create a project wiht pom.xml
* for spring boot, there only you have to chose spring boot when creating new project, not for spring core, framework project.
### SPRING FRAMEWORK LEARNING (JUST SEE YT LINKS PLAYLIST OF SPRING FRAMEWORK, YOU WILL UNDERSTAND ALL AND YOU NOT NEED TO DO ANY OTHER LEARNING, THEY ARE ENOUGH)
* YT Link Follow Part 1 (Most Important) - https://www.youtube.com/watch?v=JNeAwX_MOcU&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=1&ab_channel=Telusko
    * This will give you complete idea of Spring Framework,
        * Project Creation in IntellijIdea, Dependency Injection, What is bean, Bean Factory and ApplicationContext
        * BeanFactory being deprecated, How to make object beans in different ways.
        * Very importantly learn this, you will understand whole concept of core Spring Framework
* YT Link follow Part 2 (Most Important) - https://www.youtube.com/watch?v=wteFNBKs8oU&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=2&ab_channel=LazyProgrammer
    * In this YT link, You will bit more about Spring core, beans, with good theory explanation
* but for once learn this - https://www.geeksforgeeks.org/introduction-to-spring-framework/
*
* DEPENDENCY INJECTION
    * THREE TYPES
        * VIA CONSTRUCTOR
        * VIA SETTER METHOD
        * VIA FIELD INJECTION (USING @AUTOWIRED). Like a Data Member of Class.
* INVERSION OF CONTROL CONTAINER (BEAN CONTAINERS)
    * In Lay Man words - https://www.youtube.com/watch?v=8xBF3RUMQfU&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=4&ab_channel=LazyProgrammer
    * (Very Very Imp - As we do in IOM also for mapper class as you know)In this YT, You can see real life example to understand it's use case of why object created by programmer is tight coupled and issue we face.
        * Inversion of control is a core component of Spring Framework
        * (Very Very Imp) It is a design pattern in which the creation of object is inverted - So now instead of programmer to create the object, it will be done by framework itself.
        * It is independent of languages.
        * It describes the way in which object should be created
        * Control of object creation is inverted. We do this to achieve loose-coupling
        * This is implemented using Dependency injection. Object are created in Spring Container or Bean factory for say in via xml or via configuration class annotation.
        * When we use dependency injection to inject and create those beans rather by using new operator. It will find bean/object and create object for ourselves.
    * TWO TYPES
        * BEAN FACTORY
        * APPLICATION CONTEXT
* WHY SPRING BOOT
    * We don't have to all these spring framework, it will remove all these boiler plate code
    * And help programmer to directly begin with main task


## MY LEARNING (SPRING FRAMEWORK - TOPIC WISE)
### TABLE OF CONTENT (https://www.geeksforgeeks.org/spring/)
* Basics of Spring Framework
  * Software Setup and Configuration (STS/Eclipse/IntelliJ)
  * Core Spring
  * Spring Annotations
  * Spring Boot
  * Spring MVC
  * Spring with REST API
  * Spring Data JPA
  * Spring JDBC
  * Spring ORM or Spring Hibernate
  * Spring AOP
  * Spring Security
  * Interview Questions on Spring Framework
  * Advantages of Spring
  * Spring Latest & Upcoming Features
* 
#### Basics of Spring Framework
* The Spring Framework is a comprehensive framework designed for enterprise Java development. It offers a range of tools and libraries to support various aspects of application development, 
* from dependency injection to transaction management. This section covers the core concepts and foundational aspects of Spring, helping you understand the building blocks of the framework.
* TOPICS
  * Introduction to Spring Framework
  * Spring Framework Architecture
  * 10 Reasons to Use Spring Framework in Projects
  * Spring Initializr
  * Spring vs. Struts in Java

#### Software Setup and Configuration (STS/Eclipse/IntelliJ)
* Getting started with Spring development requires setting up an integrated development environment (IDE). This section guides you through installing and configuring popular IDEs like Spring Tool Suite (STS), Eclipse, and IntelliJ IDEA, ensuring you have the right tools for building Spring applications.
* TOPICS
  * How to Download and Install Spring Tool Suite (Spring Tools 4 for Eclipse) IDE?
  * How to Create and Setup Spring Boot Project in Spring Tool Suite?
  * How to Create a Spring Boot Project with IntelliJ IDEA?
  * How to Create and Setup Spring Boot Project in Eclipse IDE?
  * How to Run Your First Spring Boot Application in Spring Tool Suite?
* 

#### Core Spring
* Core Spring focuses on the fundamental principles of Inversion of Control (IoC) and Dependency Injection (DI). These concepts are crucial for decoupling components and managing object lifecycles. This section explores how Spring’s IoC container and DI mechanisms work, providing examples and explanations.
* TOPICS
  * How to Create a Simple Spring Application?
  * Understanding Inversion of Control with Example
  * Spring – BeanFactory
  * Spring – ApplicationContext
  * Spring Dependency Injection with Example
  * Spring – Difference Between Inversion of Control and Dependency Injection
  * Spring – Injecting Objects By Constructor Injection
  * Spring – Setter Injection with Map
  * Spring – Dependency Injection by Setter Method
  * Spring – Setter Injection with Non-String Map
  * Spring – Constructor Injection with Non-String Map
  * Bean life cycle in Java Spring
  * Custom Bean Scope in Spring
  * Spring – IoC Container
  * How to Configure Dispatcher Servlet in web.xml File?
  * Spring – Expression Language(SpEL)
  * Spring – Difference Between RowMapper and ResultSetExtractor

#### Spring Annotations
* Annotations in Spring simplify configuration and setup by providing metadata about our components. This section deep dives into the various annotations available in Spring, such as @Component, @Service, @Repository, and more, explaining how they help streamline development.
* TOPICS
  * Spring Framework Annotations
  * Spring Core Annotations
  * Spring Stereotype Annotations
  * Spring @Bean Annotation with Example
  * Spring @Controller Annotation with Example
  * Spring @Value Annotation with Example
  * Spring @Configuration Annotation with Example
  * Spring @ComponentScan Annotation with Example
  * Spring @Qualifier Annotation with Example
  * Spring @Service Annotation with Example
  * Spring @Repository Annotation with Example
  * Spring @Required Annotation
  * Spring @Component Annotation with Example
  * Spring @Autowired Annotation
  * Spring @Scope Annotation to Set a POJO’s Scope
  * Spring @Required Annotation with Example
* 

#### Spring Boot
* Spring Boot is an extension of the Spring Framework that simplifies the development of new applications. It provides a range of out-of-the-box configurations and defaults, embedded servers, and streamlined deployment options, making it easier and faster to build production-ready applications.
* TOPICS
  * Introduction to Spring Boot
  * How to Create a Spring Boot Project?
  * How to Run Your First Spring Boot Application in Spring Tool Suite?
  * Spring Boot – Architecture
  * Spring Boot – Application Properties
  * Spring Boot – Dependency Management
  * Spring Boot – Starters
  * Spring Boot – Hello World Example
  * Spring Boot – REST Example
  * Spring Boot – Starter Test
  * Spring Boot – Spring JDBC vs Spring Data JDBC
  * Spring Boot – Exception Handling
  * Spring Boot Actuator

#### Spring MVC
* Spring MVC is a framework within Spring that helps you build robust and maintainable web applications using the Model-View-Controller design pattern. This section covers everything from setting up a simple controller to advanced topics like custom validation and integration with databases.
* TOPICS
  * Introduction to Spring MVC
  * Spring MVC using Java-based configuration
  * Create and Run Your First Spring MVC Controller in Eclipse/Spring Tool Suite
  * How to Create Your First Model in Spring MVC?
  * How to Create Your First View in Spring MVC?
  * ViewResolver in Spring MVC
  * Spring MVC – RequestParam Annotation
  * Spring @RequestMapping Annotation with Example
  * Difference Between @Controller and @RestController Annotation in Spring
  * Spring MVC – Exception Handling
  * How to Capture Data using @RequestParam Annotation in Spring?
  * Spring MVC – Sample Project For Finding Doctors Online with MySQL
  * Spring MVC – Custom Validation
  * Spring MVC File Upload
  * Spring MVC Integration with MySQL
  * Spring MVC CRUD with Example

#### Spring with REST API
* Spring’s support for RESTful web services allows developers to create robust APIs that can be consumed by various clients. This section introduces the basics of REST, how to create controllers, and how to handle different types of data formats like JSON and XML.
* TOPICS
  * Spring – REST Controller
  * Spring Boot – Introduction to RESTful Web Services
  * How to Make a Simple RestController in Spring Boot?
  * How to create a REST API using Java Spring Boot
  * Spring REST JSON Response
  * Spring – REST XML Response
  * JSON using Jackson in REST API Implementation with Spring Boot
  * Spring – RestTemplate
  * How to create a REST API using Java Spring Boot
  * Easiest Way to Create REST API using Spring Boot

#### Spring Data JPA
* Spring Data JPA makes it easy to implement JPA-based repositories with minimal boilerplate code. This section explores how to perform CRUD operations , use custom queries, and manage database transactions using Spring Data JPA.
* TOPICS
  * Introduction to the Spring Data Framework
  * What is Spring Data JPA?
  * Spring Data JPA – Find Records From MySQL
  * Spring Data JPA – Delete Records From MySQL
  * Spring Data JPA – @Table Annotation
  * Spring Data JPA – Insert Data in MySQL Table
  * Spring Data JPA – Attributes of @Column Annotation with Example
  * Spring Data JPA – @Column Annotation
  * Spring Data JPA – @Id Annotation
  * How to access database using Spring Data JPA
  * How to Make a Project Using Spring Boot, MySQL, Spring Data JPA, and Maven?

#### Spring JDBC
* Spring JDBC provides a straightforward way to interact with databases, offering a simpler alternative to ORM frameworks like Hibernate. This section covers the basics of using JdbcTemplate, named parameters, and handling SQL exceptions.
* TOPICS
  * Spring JDBC Template
  * Spring JDBC Example
  * Spring – SimpleJDBCTemplate with Example
  * Spring – Prepared Statement JDBC Template
  * Spring – NamedParameterJdbcTemplate
  * Spring – Using SQL Scripts with Spring JDBC + JPA + HSQLDB
  * Spring – ResultSetExtractor

#### Spring ORM or Spring Hibernate
* Spring ORM integrates with Hibernate to provide a robust solution for object-relational mapping in Java applications. This section covers the setup, configuration, and use of Hibernate with Spring, including mappings, lifecycle management, and query handling.
* TOPICS
  * Spring Hibernate Configuration and Create a Table in the Database
  * JPA vs Hibernate
  * Spring ORM Example using Hibernate
  * Hibernate Lifecycle
  * Spring Boot – Validation using Hibernate Validator
  * CRUD Operations using Hibernate
  * Hibernate – One-to-One Mapping
  * Hibernate – Many-to-One Mapping
  * Hibernate – One-to-Many Mapping
  * Hibernate – Many-to-Many Mapping
  * Hibernate – Eager/Lazy Loading
  * Hibernate – @Embeddable and @Embedded Annotation
  * Hibernate Example using JPA and MySQL
  * Automatic Table Creation Using Hibernate
  * Hibernate – get() and load() Method
  * Hibernate – Pagination
  * Hibernate – Batch Processing

#### Spring AOP
* Aspect-Oriented Programming (AOP) in Spring helps in separating cross-cutting concerns, such as logging, security, and transaction management, from the business logic. This section introduces AOP concepts, usage of aspects, and how to implement them in Spring applications.
* TOPICS
  * Aspect-Oriented Programming and AOP in Spring Framework
  * Spring AOP – Example (Spring1.2 Old Style AOP)
  * Spring AOP – AspectJ Xml Configuration
  * Spring AOP – AspectJ Annotation
  * Usage of @Before, @After, @Around, @AfterReturning, and @AfterThrowing in a Single Spring AOP Project
  * How to Implement AOP in Spring Boot Application?
  * Spring Boot – AOP(Aspect Oriented Programming)
  * Spring Boot – Cache Provider
  * Spring Boot – AOP Around Advice
  * Spring Boot – Difference Between AOP and OOP
  * Spring Boot – Difference Between AOP and AspectJ
  * Spring Boot – AOP After Throwing Advice
  * Spring Boot – AOP After Returning Advice
  * Spring Boot – AOP After Advice
  * Spring Boot – AOP Before Advice

#### Spring Security
* Spring Security is a powerful and customizable authentication and access control framework for Java applications. This section covers the core features, including setting up basic security, customizing authentication, and managing user sessions.
* TOPICS
  * Introduction to Spring Security and its Features
  * Some Important Terms in Spring Security
  * Spring Security Project Example using Java Configuration
  * Spring Security Form-Based Authentication
  * How to Change Default User and Password in Spring Security?
  * Spring – Add User Name and Password in Spring Security
  * Spring – Add Roles in Spring Security
  * Spring Security JSP Tag Library
  * Spring Security – Remember Me
  * Spring Security XML
  * Spring Security at Method Level
  * OAuth2 Authentication with Spring and Github

#### Interview Questions on Spring Framework
* Spring Interview Questions and Answers
* Java Spring MCQ & Quiz

#### Advantages of Spring
* Predefined Templates
* Loose Coupling
* Lightweight
* Fast Development
* Powerful abstraction
* Declarative support
* Security Features
* Transaction Management

#### Spring Latest & Upcoming Features
##### Spring Framework Updates
* Spring Framework 6.x: This release enhances compatibility with Jakarta EE 10 and Java 17, bringing improved integration with contemporary Java standards and enterprise requirements.
* Enhanced Kubernetes Support: Updates focus on optimizing Spring’s functionality within cloud-native environments, with better configuration and management capabilities.
* Native Compilation Enhancements: Expanded support for GraalVM Native Image, allowing Spring applications to be compiled into native executables. This advancement improves application startup times and reduces memory usage.
##### Upcoming Features (Anticipated in Future Releases)
* Spring Framework 7.0: Expected to integrate with Jakarta EE 11, offering additional improvements in cloud-native support and reactive programming capabilities.
* Spring Boot 3.x: Projected enhancements include better integration with cloud platforms, advanced observability features, and further optimization for native compilation.
##### Trends in Spring Development
* Cloud-Native Focus: Emphasis on enhancing cloud-native features, including support for microservices, service discovery, and distributed tracing.
* Reactive Programming: Increasing support for reactive paradigms, aiming to improve handling of real-time and large-scale data streams.
* AI and Machine Learning Integration: Future updates are likely to include improved support for AI/ML frameworks, expanding Spring’s application in data-intensive and intelligent systems.
* => Spring’s future advancements are focused on optimizing performance, enhancing developer productivity, and integrating seamlessly with emerging technologies.