Custom Scopes
==============
	The bean scoping mechanism is extensible. You can define your own scopes or even redefine existing scopes, although the latter is considered
	bad practice and you cannot override the built-in singleton and prototype scopes.

Creating a Custom Scope
=======================
1. To integrate your custom scopes into the Spring container, you need to implement the org.springframework.beans.factory.config.Scope interface
2. The Scope interface has four methods to get objects from the scope, remove them from the scope, and let them be destroyed.
3. The following method returns the object from the underlying scope:
		+-----------------------------------------------------------+
		|	Object get(String name, ObjectFactory objectFactory)	|
		+-----------------------------------------------------------+

4. The following method removes the object from the underlying scope:
		+-----------------------------------------------------------+
		|	Object remove(String name)								|
		+-----------------------------------------------------------+

5. The following method registers the callbacks the scope should execute when it is destroyed or when the specified object in the scope is destroyed:
		+-------------------------------------------------------------------------------+
		|void registerDestructionCallback(String name, Runnable destructionCallback)	|
		+-------------------------------------------------------------------------------+

6. The following method obtains the conversation identifier for the underlying scope:
		+-----------------------------------------------------------+
		|String getConversationId()									|	
		+-----------------------------------------------------------+

	Using a Custom Scope
============================
	After you write and test one or more custom Scope implementations, you need to make the Spring container aware of your new scopes.
	The following method is the central method to register a new Scope with the Spring container:
		+-----------------------------------------------------------+
		|	->void registerScope(String scopeName, Scope scope);	|
		+-----------------------------------------------------------+

**>The next example uses SimpleThreadScope, which is included with Spring but is not registered by default.
	The instructions would be the same for your own custom Scope implementations.
		+-----------------------------------------------------------+
		|	Scope threadScope = new SimpleThreadScope();			|
		|	beanFactory.registerScope("thread", threadScope);		|
		+-----------------------------------------------------------+
	
	You can then create bean definitions that adhere to the scoping rules of your custom Scope, as follows:
		+----------------------------------------------------------------------------------------------------------+
		|	<bean id="..." class="..." scope="thread">
		|	With a custom Scope implementation, you are not limited to programmatic registration of the scope. You can also do the Scope registration declaratively, by using the CustomScopeConfigurer class, as the following example shows:
		|
		|	<?xml version="1.0" encoding="UTF-8"?>
		|	<beans xmlns="http://www.springframework.org/schema/beans"
		|	    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		|	    xmlns:aop="http://www.springframework.org/schema/aop"
		|	    xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop.xsd">
		|
		|	    <bean class="org.springframework.beans.factory.config.CustomScopeConfigurer">
		|	        <property name="scopes">
		|	            <map>
		|	                <entry key="thread">
		|	                    <bean class="org.springframework.context.support.SimpleThreadScope"/>
		|	                </entry>
		|	            </map>
		|	        </property>
		|	    </bean>
		|
		|	    <bean id="thing2" class="x.y.Thing2" scope="thread">
		|	        <property name="name" value="Rick"/>
		|	        <aop:scoped-proxy/>
		|	    </bean>
		|
		|	    <bean id="thing1" class="x.y.Thing1">
		|	        <property name="thing2" ref="thing2"/>
		|	    </bean>
		|
		|	</beans>
		|
		|
		+----------------------------------------------------------------------------------------------------------+