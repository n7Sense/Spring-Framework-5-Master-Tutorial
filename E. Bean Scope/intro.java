Overview
=========
	Link{
			"https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-scopes"
			"https://www.baeldung.com/spring-bean-scopes"
		}

	1. The scope of a bean defines the life cycle and visibility of that bean in the contexts in which it is used.

	2. When you create a bean definition, you create a recipe for creating actual instances of the class defined by that bean definition.
		The idea that a bean definition is a recipe is important, because it means that, as with a class, you can create many object instances
		from a single recipe.

	3. You can control not only the various dependencies and configuration values that are to be plugged into an object that is created from a
		particular bean definition but also control the scope of the objects created from a particular bean definition.

	4. Beans can be defined to be deployed in one of a number of scopes. The Spring Framework supports six scopes, four of which are available
		only if you use a web-aware ApplicationContext. You can also create a custom scope.
		
		1. singleton
		2. prototype
		3. request
		4. session
		5. application
		6. websocket

The last four scopes mentioned request, session, application and websocket are only available in a web-aware application.