How To Configure Ben Xml File.?
==============================

1. for setter injection gothrough <propertirs> tag
2. for Constructor injection go through <constructor-org> tag
		bay Data type go through "type" attribute to define Data type,
		if not in order then go by "index" attribute start with "0"

3. If there is another Object associated then we can use "ref" attribute.
4. Inner Ben (this is Pass by Value and can not be share to other)
	If Associated directly assigned with Object thne go for inner bean.

	example: private setEngine(new Engine()){}

	<beans>	
		<bean id="c" class="beans.Car">

			<property name="carName" value="AUDI"/>
			<property name="engine">
				<bean claaa="beans.Engine">
					<property name="modelLayer" value="2015"/>
				</bean>
		</bean>

	</beans>

5. If Array Of primitive type is there, then we have to use "<list>"  tag 

	Example: String setCarName(String[] carName){}

	<beans>	
		<bean id="c" class="beans.Car">
			<property name="carName">
				<list>
					<value>Maruti</value>
					<value>Honda</value>
					<value>Ferrari</value>
					<value>AUDI</value>
				</list>
			</property>
		</bean>
	</beans>

6. If Array Of Object is there then
	
	Example:

		Engine setEngine(Engine[] engine){}

	<beans>	
		<bean id="c" class="beans.Engine">
			<property name="modelType">
				<list>
					<ref>2001</ref>
					<ref>2010</ref>
					<ref>2015</ref>
					<ref>2019</ref>
				</list>
			</property>
		</bean>
	</beans>

7. Collection 
	
	1. for List with Homogenious Element use <list> tag

		<beans>	
			<bean id="c" class="beans.Engine">
				<property name="modelType">
					<list>
						<value>2001</value>
						<value>2010</value>
						<value>2015</value>
						<value>2019</value>
					</list>
				</property>
			</bean>
		</beans>

	2. for Set with Homogenious Element use <set> tag
		<beans>	
			<bean id="c" class="beans.Engine">
				<property name="modelType">
					<set>
						<value>2001</value>
						<value>2010</value>
						<value>2015</value>
						<value>2019</value>
					</set>
				</property>
			</bean>
		</beans>

	3. for Map

		<beans>	
			<bean id="c" class="beans.Engine">
				<property name="modelType">
					<map>
						<entry key="1" value="Maruti"/>
						<entry key="2" value="Honda"/>
						<entry key="3" value="Lamborghini"/>
					</map>
				</property>
			</bean>
		</beans>