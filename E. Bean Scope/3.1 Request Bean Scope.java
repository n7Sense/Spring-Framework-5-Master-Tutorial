Request Bean Scope
====================
	
	1. The request scope creates a bean instance for a single HTTP request.

	2. Consider the following XML configuration for a bean definition:

		+-----------------------------------------------------------------------------------+
		|	<bean id="loginAction" class="com.something.LoginAction" scope="request"/>		|
		+-----------------------------------------------------------------------------------+

		The Spring container creates a new instance of the LoginAction bean by using the loginAction bean definition for each and every
		HTTP request. 
		That is, the loginAction bean is scoped at the HTTP request level.
		You can change the internal state of the instance that is created as much as you want, because other instances created from the
		same loginAction bean definition do not see these changes in state.They are particular to an individual request.
		When the request completes processing, the bean that is scoped to the request is discarded.

		When using annotation-driven components or Java configuration, the @RequestScope annotation can be used to assign a component
		to the request scope. The following example shows how to do so:

		+---------------------------------------+
		|	@RequestScope						|
		|	@Component 							|
		|	public class LoginAction {			|
		|	    	--							|
		|	}									|
		|										|		
		+---------------------------------------+

	: Way to defoine Scope
	-----------------------
		1. @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)

		2. @Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
		
		3. @RequestScope

		4. We can define the bean with request scope using the @Scope annotation:
			
			+---------------------------------------------------------------------------------------------------+	
			|	@Bean
			|	@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
			|	public HelloMessageGenerator requestScopedBean() {
			|	    return new HelloMessageGenerator();
			|	}
			|
			+----------------------------------------------------------------------------------------------------+
			The proxyMode attribute is necessary because, at the moment of the instantiation of the web application context, there is no
			active request. Spring will create a proxy to be injected as a dependency, and instantiate the target bean when it is needed
			in a request.

			Next, we can define a controller that has an injected reference to the requestScopedBean. We need to access the same request
			twice in order to test the web specific scopes.

			If we display the message each time the request is run, we can see that the value is reset to null, even though it is later
			changed in the method. This is because of a different bean instance being returned for each request.

			+-----------------------------------------------------------------------------------+
			|	@Controller 																	
			|	public class ScopesController {
			| 	 	@Resource(name = "requestScopedBean")
			|	  	HelloMessageGenerator requestScopedBean;
			| 
			|    	@RequestMapping("/scopes/request")
			|    	public String getRequestScopeMessage(final Model model) {
			|        	model.addAttribute("previousMessage", requestScopedBean.getMessage());
			|        	requestScopedBean.setMessage("Good morning!");
			|        	model.addAttribute("currentMessage", requestScopedBean.getMessage());
			|        	return "scopesExample";
			|    	}
			|	}
			+-----------------------------------------------------------------------------------+