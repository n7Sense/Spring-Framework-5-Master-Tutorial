	
1. Calender Class

	We can not directly create an object of Calender class by new Key Word. we must go for factory class OR static method.

	*if Class having SingleTone
	+------------------------------------------------------------------------------------------+
		Calendar alendar = Calendar.getInstance();

			OR In Spring XML
	
		<bean id="calender" class="java.util.Calendar" factory-method="getInstance" />
	+------------------------------------------------------------------------------------------+
	

	Calendar class is an SingleTone class 

2. Logger logger  = LoggerFactory.getLogger(this.class);
	
	*if factory having satic Method	
	+------------------------------------------------------------------------------------------+
		<bean id="logger" class="LoggerFactory" factory-method="getLogger"/>
	+------------------------------------------------------------------------------------------+		

3. Validator v = ValidatorFactory.getValidator();
	
4. If the class is an factory class like LoggerFactory, Validator then it will return other class Object.
5. If the class is a SingleTone class like Calendar then it will return same class Object
6. we need to use static method of Factory class to create an object OR also called as Static Factory.
7. if the Factory contain the static method then we can configure by using factory-method.

8. but if our class have instance method  then how to create an object like for Session in hibernate
	SessionFactory sf= new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();

	hear we can see that openSession() is an instance method.

	*if factory having Instance Method
	+------------------------------------------------------------------------------------------+
		<bean id="sf" class="SessionFactory"/>
		<bean id="session" factory-bean="sf" factory-method="openSession"/>
	+------------------------------------------------------------------------------------------+


	
		