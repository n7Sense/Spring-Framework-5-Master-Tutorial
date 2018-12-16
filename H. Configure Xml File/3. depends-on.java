depends-on Attribute
=====================

	Suppose if there is dependency like one Bean is depend on another Bean
	like in MVC Model

	The 				
	Controller Layer ---depend on----> Business Layer ---depend on----> DAO Layer ------> MySql Database

	in this senario if we want 1st DAO class object create then Business class Object create and after that
	Controller object create then we shuld go for this concept.

	<bens>
		<bean id="con" Class="Controller" depends-on="Business"/>
		<bean id="con" Class="Business" depends-on="Dao"/>
		<bean id="con" Class="Dao"/>
	</beans>
