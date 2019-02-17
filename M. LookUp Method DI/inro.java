	LookUp Method Dependency Injection
==========================================

In spring we can do an DI by Properties, Constructor and LookUp Method DI,

In spring we can do an DI with Abstract class, Interfce and Concrete class.

Example:

	public abstract class Car{
		abstract public Engine getEngine();
	}

	Hear notice how.? we instentiate Car class that return Engine object, because Car is abstract class 

	IoC will generate one RunTime Proxy class i.e CarProxy class and that class will provide the Implementation of Car class and 
	Override the Car class method.
	so this will happen just we have to configure lookup-method.
	
	public class CarProxy extends Car{

		@Override
		public Engine getEngine(){
			return engine;
		}
	}

	<beans>
		<bean id="car" class="Car">
			<lookup-method name="getEngine" bean="engine"/>
		</bean>
		<bean id="engine" class="Engine" />
	</beans>


	NOTE: If we want to know the Runtime generated proxy class by Spring Container 

		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Car car = (Car)ac.getBean("car");
		System.out.println(car.getClass().getCanonicalName());
		

	NOTE: If we want to replace existing method with different implementation class method withoud affecting the
			Existing method we shld use "replace-method"  