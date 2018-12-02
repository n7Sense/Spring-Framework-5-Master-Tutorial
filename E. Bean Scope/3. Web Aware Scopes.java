Web Aware Scopes
=================
	As mentioned, there are four additional scopes that are only available in a web-aware application context.
	These are less often used in practice.
	
	1. request
	2. session
	3. application
	4. websocket

	The request, session, application, and websocket scopes are available only if you use a web-aware Spring ApplicationContext
	implementation (such as XmlWebApplicationContext). If you use these scopes with regular Spring IoC containers, such as the
	ClassPathXmlApplicationContext, an IllegalStateException that complains about an unknown bean scope is thrown.

	because these kind of scope comes under Web Application not a standalone application, therefoe this kind of Scope Object
	(i.e request, session etc..) are identified only in WebApplication and J2EE application.

1.How you accomplish this initial setup depends on your particular Servlet environment.?

	a. If you access scoped beans within Spring Web MVC, in effect, within a request that is processed by the Spring DispatcherServlet,
		no special setup is necessary. DispatcherServlet already exposes all relevant state.

	b. If you use a Servlet 2.5 web container, with requests processed outside of Spring’s DispatcherServlet (for example, when using
		JSF or Struts), you need to register the org.springframework.web.context.request.RequestContextListener
		ServletRequestListener.
		For Servlet 3.0+, this can be done programmatically by using the WebApplicationInitializer interface.
		Alternatively, or for older containers, add the following declaration to your web application’s web.xml file:

		example:

			+----------------------------------------------------------------------------------
			|	<web-app>
    		|		...
			|	    <listener>
			|	        <listener-class>
			|	            org.springframework.web.context.request.RequestContextListener
			|	        </listener-class>
			|	    </listener>
			|	    ...
			|	</web-app>
			+----------------------------------------------------------------------------------

	c. Alternatively, if there are issues with your listener setup, consider using Spring’s RequestContextFilter.
		The filter mapping depends on the surrounding web application configuration, so you have to change it as appropriate.
		The following listing shows the filter part of a web application:

		example:

			+----------------------------------------------------------------------------------
			|	<web-app>
			|	    ...
			|	    <filter>
			|	        <filter-name>requestContextFilter</filter-name>
			|	        <filter-class>org.springframework.web.filter.RequestContextFilter</filter-class>
			|	    </filter>
			|	    <filter-mapping>
			|	        <filter-name>requestContextFilter</filter-name>
			|	        <url-pattern>'/*'</url-pattern>
			|	    </filter-mapping>
			|	    ...
			|	</web-app>
			+----------------------------------------------------------------------------------

	d. NOTE: DispatcherServlet, RequestContextListener, and RequestContextFilter all do exactly the same thing, namely bind
			the HTTP request object to the Thread that is servicing that request.
			This makes beans that are request- and session-scoped available further down the call chain.

2. Example:

	<beans xmlns = "http://www.springframework.org/schema/beans"
	   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
	   xsi:schemaLocation = "http://www.springframework.org/schema/beans   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

	    <description>Hello World</description>

	    <bean id="student" class="bean.Student" scope="request">
	        <property name="name" value="Sunita"/>
	    </bean>
	</beans>

	NOTE: this will throw an exception:

		Exception in thread "main" java.lang.IllegalStateException: No Scope registered for scope name 'request'
			at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:350)
			at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199)
			at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1083)
			at Main.main(Main.java:19)

		because, these kind of scope comes under Web Application, so we have to use either Spring MVC or Spring Boot
