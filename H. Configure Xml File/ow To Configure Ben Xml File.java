How To Configure Ben Xml File.?
==============================

1. for setter injection gothrough <propertirs> tag
2. for Constructor injection go through <constructor-org> tag
		bay Data type go through "type" attribute to define Data type,
		if not in order then go by "index" attribute start with "0"

3. If there is another Object associated then we can use "ref" attribute.
4. Inner Ben
	If Associated directly assigned with Object thne go for inner bean.
	<beans>	
		<bean id="c" class="beans.Car">

			<property name="carName" value="AUDI"/>
			<property name="engine">
				<bean claaa="beans.Engine">
					<property name="modelLayer" value="2015"/>
				</bean>
		</bean>

	</beans>	 