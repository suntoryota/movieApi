# Movie RESTful

This is a Complete Backend Java / Maven / Spring Boot (version 3.2.4) application that can be used as a starter for creating a RESTful Movie API.

## About the Service

Here is what application demonstrates:
- Setup DB Configuration
- Uploading and Serving file at Backend
- Handle file and JSON data 
- Handling update and delete operations with File & JSON
- Handle Exceptions in REStful API displaying proper error message
- Pagination and sorting integration 
- JWT Auth | Access and Refresh token | Implmentation | Controller

## Question
- How will you use AOP in the spring-boot application?
  Create an Aspect Class: @Aspect -> define aspect
  Define Advice : @Before, @After, @Around -> specify adivce target
  Define Pointcut: @Pointcut -> define expression method

- What is Spring Batch processing? How do you implement it in spring-boot?
  Define Batch Jobs : @Job -> consists of one | @Step -> processing unit
  Configure Tasks:  @Task  @Step -> define proccesing logic

- How to implement exception handling in Springboot?
  Use Sparing Data JPA lib -> Pageable

- How to implement interceptors in Springboot?
  Create an Interceptor Class implements HandlerInterceptor -> preHandle, postHandle, afterCompletion
  Register the Interceptor -> extending WebMvcConfigurer -> addInterceptors 
  Configuring Interceptor URLs -> addPathPatterns
  
- How to override and replace Tomcat embedded server?
  Add Dependencies -> maven -> pom.xml
  Spring Boot Application Configuration -> application.yaml
  
- How @springbootapplication annotation works internally?
  Annotation indicate that the class is a configuration class for the Spring Boot application
  
- How to use Postgres in Spring Boot projects?
  Add PostgreSQL Dependency -> Configure Database Connection(properties/yaml) -> Create Entities 
  -> Create Repository Interfaces ->  JPA 
  

  
