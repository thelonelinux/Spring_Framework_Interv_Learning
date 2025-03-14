# Spring_Framework_Interv_Learning
Learning Spring Framework core and all other spring framework concepts

## MY LEARNING APPROACH FOR INTERVIEW
### 1. FROM INTERVIEWBIT
* Get/download pdf from interview bit and learn

### 2. FROM GFG INTERVIEWBIT
* Get the link and learn from there


### 3. PRACTICE CODE AND LEARN
* See the github edureka java springboot microservice learning and how different java code is written to build microservice application


## MY LEARNING (SPRING FRAMEWORK, CORE TO SPRING BOOT)
* https://www.geeksforgeeks.org/spring-boot/
* Parallelly do code and learn
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