How to make Setter DI mendatory.?
=================================

	to make Setter Dependency Injection mandetory we have to go for  "dependency-check" concept.	
	along with our Bean ID we have to use dependency-check attribute.

	there are have 4-vale for dependency-check
		1. none  		no need to pass value 
		2. simple		mandetory to pass primitive value
		3. Object 		mandetory to pass non-primitive values
		4. all			both Primitive and non-primitive values are allowed but mandetory.

	@Required
=================
	1.We can use @Required annotation to make customized mandetory DI.
	2.but at Setter Method leve we have to apply this annotation.
	3.it is aplicable for both data types Primitive and non-primitive.
	4.but to activate this annotation IoC need to create an object of RequiredAnnotationBeanPostprocessor class.
		<bean class="org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor"/>

