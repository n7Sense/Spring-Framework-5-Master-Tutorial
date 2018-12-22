	Sterio Type Annotation
=============================

	there are have manily 4-types of Sterio type Annotation

	1. @Controller 	:	for controller layer

	2. @Repository	: 	DAO layer

	3. @Service		:	Business layer

	4. @Component	: 	if it not any thing then i.e Non-MVC, like for your utility classes or for your factory classes.
						Example: if you use for DB connection you use some factory class i.e for Hibernat SessionFactory
						object you ave to define that class as @Component Annotation.


	 for auto-scanning creation of object we must have to use "context-namespace" inside xml file i.e

	 	<beas>
			 <context : component-scan base-package="ns.nsense.controller" />
			 <context : component-scan base-package="ns.nsense.business" />
			 <context : component-scan base-package="ns.nsense.dao" />
			 <context : component-scan base-package="ns.nsense.util" />
		</beans>
	
	when IoC container scan the all specified packages when he found that any class annotated with any Sterio type
	Annotation then he will create object autometically.

	but to acativate @Autowire annotation we have ti instantite BeanPostProcessorAnnotation to activate this we have to do
	only <context:annotation-config/> in xml file, after inserting this, it will instantiate following Annotation.
	@Required, @Autowire, @PostConstruct, @PreDestroyed Annotation will activated.
	
		+----------------------------------------------------------------------------+
			<beas>
				 <context : component-scan base-package="ns.nsense.controller" />
				 <context : component-scan base-package="ns.nsense.business" />
				 <context : component-scan base-package="ns.nsense.dao" />
				 <context : component-scan base-package="ns.nsense.util" />
				 <context:annotation-config/>
			</beans>
		+----------------------------------------------------------------------------+


		NOTE: if your class contain any primitive type property then do not annotate that class with any Sterio
		type annotation because IoC will not create object of that class you have to create the object manually.
		