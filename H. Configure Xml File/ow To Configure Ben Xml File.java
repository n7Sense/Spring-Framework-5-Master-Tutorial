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
				<lit>
					<ref>2001</ref>
					<ref>2010</ref>
					<ref>2015</ref>
					<ref>2019</ref>
				</lit>
			</property>
		</bean>
	</beans>