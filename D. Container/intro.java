	Container
=================
	like in Servlet, Tomcat Container, When we deploy our application 
	1. it will read web.xml file and it will understand configuration, by using configuration it will create object
	2. if it will find load-on-startup Servlet, then that load-on-startup Servlet immediately created.
	3. After creation of object it will call Life-Cycle methods i.e init(),

	Conclusion: 
		1. reading xml file, 
		2. creating the instances of XML Bean (Java class object or Servlet class)
		3. manage Life-Cycle of Bean classes.
		4. Dynamic parameter supply to Bean class.


Container In Spring Framework
===============================
To pass runtime argument by CMD we can pass by XML file we can pass, so to supply any input to POJO class
we need to have Container support

there are have basicly 3-Container in Spring Framework
1. Web Container
2. Core Container
3. J2EE Container

Note: Web Container are provided by Spring MVC, when we use Spring MVC then we no need to use IOC container it is already
present inside Spring MVC, Core Container and J2EE Container is a part of IOC container.
 
imp: The main job of Container is, the will read data from XML documents, and pass that data to POJO classes into Association References
	to make your layer loosely coupled, by using Runtime Polymorphism, by using Has-A relatin we can make loosely coupled and lightweight.



Spring IoC container
======================
	A:	The Spring IoC container is at the core of the Spring Framework. The container will create the objects, wire them together, 
		configure them, and manage their complete life cycle from creation till destruction. 
		The Spring container uses dependency injection (DI) to manage the components that make up an application.

	B: Spring provides following two distinct types of containers.

		1. BeanFactory container (Core Container)
		2. ApplicationContext container (J2EE Container)

	C: Container Hirerchry
								
								IOC 												MVC
								 |													 |
								 |													 |	
					-----------------------------									Web		
					|							|						(WebApplicationContext(I) )	
				  Core 						   J2EE
			( BeanFactory(I) )				( ApplicationContext(I) )
					  	
	D:	Steps
	
			1. reading xml file, 
			2. creating the instances of XML POJO Class
			3. manage Life-Cycle of POJO class
			4. Dynamic parameter supply to POJO class. (called as Dependency Injection(DI) )


	
	