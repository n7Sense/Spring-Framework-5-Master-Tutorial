Foremost amongst these is the Spring Framework’s Inversion of Control (IoC) container. A thorough treatment of the Spring Framework’s
IoC container is closely followed by comprehensive coverage of Spring’s Aspect-Oriented Programming (AOP) technologies.
The Spring Framework has its own AOP framework, which is conceptually easy to understand and which successfully addresses the 80%
sweet spot of AOP requirements in Java enterprise programming.

The IoC Container
=================

	1. IoC is also known as dependency injection (DI).
	
	2. DEFINATION:  It is a process whereby objects define their dependencies (that is, the other objects they work with) only through constructor
	arguments, arguments to a factory method, or properties that are set on the object instance after it is constructed or returned from
	a factory method. 
	The container then injects those dependencies when it creates the bean. This process is fundamentally the inverse
	(hence the name, Inversion of Control) of the bean itself controlling the instantiation or location of its dependencies by using direct
	construction of classes or a mechanism such as the Service Locator pattern.

	3. The org.springframework.beans and org.springframework.context packages are the basis for Spring Framework’s IoC container.
		The BeanFactory interface provides an advanced configuration mechanism capable of managing any type of object.
		ApplicationContext is a sub-interface of BeanFactory. It adds:

			A.Easier integration with Spring’s AOP features
			B.Message resource handling (for use in internationalization)
			C.Event publication
			D.Application-layer specific contexts such as the WebApplicationContext for use in web applications.

	4. In short, the BeanFactory provides the configuration framework and basic functionality, and the ApplicationContext adds more 
		enterprise-specific functionality.
		The ApplicationContext is a complete superset of the BeanFactory

	5.BEAN: In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans.
			A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. Otherwise, a bean is simply one
			of many objects in your application. Beans, and the dependencies among them, are reflected in the configuration metadata used by a
			container.