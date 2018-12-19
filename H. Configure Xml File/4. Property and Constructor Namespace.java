	Property and Constructor Namespace	
============================================

	By using P & C Namespace we can reduce the no. of XML Tags, so then we can improve performence of Reading XML
	
	Example:

		+-----------------------------------------------------------------------------------------------------------+
			<?xml version="1.0" encoding="UTF-8"?>
			<!--
			To change this license header, choose License Headers in Project Properties.
			To change this template file, choose Tools | Templates
			and open the template in the editor.
			-->

			<beans xmlns = "http://www.springframework.org/schema/beans"
			   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
			   xmlns:p = "http://www.springframework.org/schema/p"
			   xmlns:c = "http://www.springframework.org/schema/c"
			   xsi:schemaLocation = "http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

			   <bean id = "a" class = "test.Super" p:message="SuperClassInitializedBy Proert NameSpace" />
			   <bean id = "b" class = "test.Parent" c:message = "ParentClassInitializedByConstructorNameSpace" />
			   <bean id = "c" class = "test.Sub" p:message="SubClassInitializedByProertNameSpace" p:super1-ref="a" />
			  
			</beans>
		+-----------------------------------------------------------------------------------------------------------+


