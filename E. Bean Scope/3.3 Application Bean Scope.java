Application Bean Scope
========================

1. The application scope creates the bean instance for the lifecycle of a ServletContext.

2. This is similar to the singleton scope but there is a very important difference with regards to the scope of the bean.

3. When beans are application scoped the same instance of the bean is shared across multiple servlet-based applications running in the
	same ServletContext, while singleton-scoped beans are scoped to a single application context only.

4. Consider the following XML configuration for a bean definition:
		
		+-------------------------------------------------------------------------------------------+
		|	<bean id="appPreferences" class="com.something.AppPreferences" scope="application"/>	|
		+-------------------------------------------------------------------------------------------+

		The Spring container creates a new instance of the AppPreferences bean by using the appPreferences bean definition once for the
		entire web application. That is, the appPreferences bean is scoped at the ServletContext level and stored as a regular
		ServletContext attribute.
		This is somewhat similar to a Spring singleton bean but differs in two important ways: It is a singleton per ServletContext,
		not per Spring 'ApplicationContext' (for which there may be several in any given web application), and it is actually exposed
		and therefore visible as a ServletContext attribute.

		When using annotation-driven components or Java configuration, you can use the @ApplicationScope annotation to assign a
		component to the application scope. The following example shows how to do so:

		+---------------------------------------+
			@ApplicationScope
			@Component
			public class AppPreferences {
			    // ...
			}
		+---------------------------------------+

5. Let’s create the bean with application scope:
	
	+---------------------------------------------------------------------------------------------------+
		@Bean
		@Scope(value = WebApplicationContext.SCOPE_APPLICATION, proxyMode = ScopedProxyMode.TARGET_CLASS)
		public HelloMessageGenerator applicationScopedBean() {
		    return new HelloMessageGenerator();
		}
	+---------------------------------------------------------------------------------------------------+


	And the controller that references this bean:
	+---------------------------------------------------------------------------------------------------+
			@Controller
			public class ScopesController {
			    @Resource(name = "applicationScopedBean")
			    HelloMessageGenerator applicationScopedBean;
			 
			    @RequestMapping("/scopes/application")
			    public String getApplicationScopeMessage(final Model model) {
			        model.addAttribute("previousMessage", applicationScopedBean.getMessage());
			        applicationScopedBean.setMessage("Good afternoon!");
			        model.addAttribute("currentMessage", applicationScopedBean.getMessage());
			        return "scopesExample";
			    }
			}
	+---------------------------------------------------------------------------------------------------+

	Note: In this case, value message once set in the applicationScopedBean will be retained for all subsequent requests,
	sessions and even for a different servlet application that will access this bean, provided it is running in the same ServletContext.