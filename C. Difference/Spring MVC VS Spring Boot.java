	Spring MVC VS Spring Boot 
==================================
thanks to url : "https://stackoverflow.com/questions/32922914/difference-between-spring-mvc-and-spring-boot";

Spring MVC
=============
is a complete HTTP oriented MVC framework managed by the Spring Framework and based in Servlets.
It would be equivalent to JSF in the JavaEE stack. The most popular elements in it are classes annotated with @Controller,
where you implement methods you can access using different HTTP requests. It has an equivalent @RestController to implement REST based APIs.


Spring boot
===============
is a utility for setting up applications quickly, offering an out of the box configuration in order to build Spring powered applications.
As you may know, Spring integrates a wide range of different modules in its umbrella, as
spring-core, spring-data, spring-web (which includes Spring MVC, by the way) and so on. With this tool you can tell Spring how many of
them to use and you will get a fast setup for them (you are allowed to change it by yourself later on).

So, Spring MVC is a framework to be used in web applications and Spring boot is a Spring based production-ready project initializer.
You might find useful visiting the Spring MVC tag wiki as well as the Spring Boot tag wiki in SO.