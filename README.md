🍃 Spring Cloud Zuul Proxy Server Example

Zuul Server is a gateway application that handles all the requests and does the dynamic routing of microservice applications. 
The Zuul Server is also known as Edge Server.

For Example, /weather-service/weather is mapped to the weather service, Zuul Server dynamically routes the requests to the respective backend application.

http://localhost:8761/ in your web browser and you can find the Eureka Server running on the port 8761 as 
shown below

![alt text](https://github.com/eshanwp/spring-cloud-eureka-service/blob/master/eureka-service/img/screencapture-localhost-8761-2018-11-25-10_48_53.png)

Following technologies being used

* Spring Boot 2.1.0.RELEASE

* Spring Boot Eureka Server

* Spring Boot Eureka Discovery Server

* Spring Boot Zuul

* JDK 1.8

* Maven 3