	Default Autowire
========================

	the "default-autowire" attribute at <beans> tag not at <bean> tag if we have thousands of beans then insted of defining
	thousand times autowire="byType" we can do at root level at <beans> tag i.e

		+-----------------------------------------------------------------------------------------------------------+
				<beans default-autowire="byType">

				   <bean id = "object1" class = "test.Super" >
				   		<property name="message" value="ValueInitializedIntoSuperClassInstance" />
				   	</bean>

				   <bean id = "object2" class = "test.Super" > 
				   		<property name="message" value="ValueInitializedIntoSuperClassInstance" />
				   	</bean>
				</beans>
		+-----------------------------------------------------------------------------------------------------------+

		if suppose youhave packages like "controller" , "business", and "dao" in these all packages contain the many classes
			and Spring autimetically inject the dependency but atlit you have to careate an Object

		But if you dont want to create an object, if you want that all object create autometically then you shuld have to do an 
		"auto-scanning" at all pckages then IoC container will autometically scan and create all Object. 

		and after creation of object @Autowire can inject Dependency.

		NOTE: but for auto-scanning creation of object all classes must be annotated with Sterio-Type annotation.