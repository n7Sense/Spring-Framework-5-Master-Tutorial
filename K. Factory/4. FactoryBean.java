	FactoryBean
===================

We can implement Factory by FactoryBean interface in inspring.
FactoryBean interface hvae 3-methods
	i. getObject
	ii. getObjectType
	iii. isSingleton

1. How to implement factory in spring using FactoryBean.?
	
	Example:

		public interface Car{

			public void draw();
		}

	+-------------------------------------------------------------------------------------------------------------+
		public class Benz implements Car{
			@Override
			public void design() {
			    System.out.println("This Is A Benz Car");
			}    
		}

	+-------------------------------------------------------------------------------------------------------------+
		<bean id="cf" class="CarFactory">
			<prop erty name="carName">
				<list>
					<value>model.Benz</value>
				</list>
			</property>
		</bean>

	+-------------------------------------------------------------------------------------------------------------+
		class CarFactory implements FactoryBean{

			public String carName;

			public Object getObject(){
				Car car = (Car)Class.forName(carName).newInstance();
				return car;
			}

			public Class getObjectType(){
				return Car.class;
			}

			public boolean isSingleton(){
				return true;
				//heare the IoC will return only one single Object
				//But if it is false then every call IoC will return new Onject.
			}
		}

