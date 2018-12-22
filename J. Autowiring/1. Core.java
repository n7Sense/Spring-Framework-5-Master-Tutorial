	AutoWiring
==================

	The main AIM of this concept is "Automatic Dependency Injection".
	The limitation of this concept is, we can only inject Secondary type (i.e Non-Premtive data type).

	Example:
		in Enterprises Application like Banking app, there are have many fors like for Opening Account, Insurance ec.
		for that all form there are have many layer to process into database i.e


			Form(View Layer) 		Contriooler Layer 		Business Layer 		DAO Layer 		Database Layer

		the above given Structure of mvc there are have many business layer and they need same Connection Object to
		communicate to the data base, so insted of creating separate Connection Object, we can create only one Connection Bean
		Instance and inject into all business and Dao layer this will happen by AutoWiring concept


Attrubutes Of AutoWiring
=========================

	autowire = "byType" 	OR 		"byName" 	OR 	"Constructor" 	OR 	"aotoDetect" 	OR  "no"

	"byType" and "byName" is use for setter or Property Dependency Injection.

	"Constructor" is use for Constructor Dependency Injection.

	"autoDetect" id use for both either Property Or Constructor Dependency Injection.


	1. if we use "byType" attribute then it will search by DataType but if the same type defiend multiple times then
		there is an ambiguity problems,

		+-----------------------------------------------------------------------------------------------------------+
			<beans xmlns = "http://www.springframework.org/schema/beans"
			   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
			   xmlns:p = "http://www.springframework.org/schema/p"
			   xmlns:c = "http://www.springframework.org/schema/c"
			   xsi:schemaLocation = "http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

			   <bean id = "object1" class = "test.Super" autowire="byType">
			   		<property name="message" value="ValueInitializedIntoSuperClassInstance" />
			   	</bean>

			   <bean id = "object2" class = "test.Super" autowire="byType"> 
			   		<property name="message" value="ValueInitializedIntoSuperClassInstance" />
			   	</bean>

<!--to resolve the ambiguity problem in second Bean we can use at the place of "autowire" attribute autowire-candidate="false" -->
			</beans>
		+-----------------------------------------------------------------------------------------------------------+

	1.heare "byType" attribute will get confused cause of multiple same DataType Bean is configured. so we can resolve
		this problems by using "byName" attribute then he will search both DataType and reference Name.
		also we can resolve this problem by "autowire-candidate='false' "

	2. in case if class contain default Constructor and the Getter and Setter method and if we use "autoDetect" autowire
	value then first he will execute default Constructor (i.e Constructor Dependency Injection) and create object then he
	will go to Setter Dependency Injection


	3.IMP: if you have requirement of multiple Dependency Injection i.e if you use JDBC like JdbcTemplate and also if you
	 use Hibernate in DAO laye and you want both of Injection into Business layer the you can resolve this problem 
	 by one special attribute i.e "autoWireCandidate"

	 	Example:
			  
			  <bean id = "object2" class = "test.Super" autowire-candidate="byType">
			  		<property name="message" value="ValueInitializedIntoSuperClassInstance" />
			  	</bean>


	@Autowire annotation
=============================

	by using this annotation we can do an Automatic Dependency Injection at Properties Level but by default it autowire
	by "byType" data type, so there a chance of ambiguity problem so we can resolve this problem with the help of 
	@Qualifier annotation inside that we can pass ID reference value of bean i.e 

	Example:

		@Qualifier(value="idName") : 
		so only idName object reference will be injected.

	to activate this both annotation we have to initialized i.e craete an Object of AutowireAnnotationBeanPostProcessor

	Example: <bean id="aabpp" classs = "org.springframework.beans.factory.annotation.AutowireAnnotationBeanPostProcessor" />

	

