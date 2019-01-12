	Static Dependency Injection
====================================

	If we want to do Dependency Injection for static properties, then by normal <property> tag we cant do
	we must have to instantiate MethodinvokingFactorybean class.

	Example:

		package ns.nsense;
		public claass Car{

			private static String name[];

			public static void setName(String name[]){
				this.name = name;
			}

			public static String getname(){
				return name;
			}
		}


		<beans xmlns = "http://www.springframework.org/schema/beans"
			   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
			   xmlns:p = "http://www.springframework.org/schema/p"
			   xmlns:c = "http://www.springframework.org/schema/c"
			   xsi:schemaLocation = "http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

			   <bean id="c" class="ns.nsense.Car"/>
			   <bean class="org.springframework.beans.factory.config.MethodinvokingFactorybean">
			   		<property name="staticMethods" value="ns.nsense.Car.setName"/>
			   		<property name="arguments">
			   			<list>
			   				<value>Hero</value>
			   				<value>Maruti</value>
			   				<value>AUDI</value>
			   				<value>ferari</value>
			   				<value>Lamberghuini</value>
			   				<value>Skoda</value>
			   			</list>
			   		</property>
			   </bean>   
		</beans>

	

