Session Bean Scope
====================
	1. Session scope creates for an HTTP Session.

	2. Consider the following XML configuration for a bean definition:

			+-------------------------------------------------------------------------------------------+
			|	<bean id="appPreferences" class="com.something.AppPreferences" scope="application"/> 	|
			+-------------------------------------------------------------------------------------------+

			The Spring container creates a new instance of the UserPreferences bean by using the userPreferences bean definition
			for the lifetime of a single HTTP Session.
			In other words, the userPreferences bean is effectively scoped at the HTTP Session level.
			As with request-scoped beans, you can change the internal state of the instance that is created as much as you want,
			knowing that other HTTP Session instances that are also using instances created from the same userPreferences bean definition
			do not see these changes in state, because they are particular to an individual HTTP Session. 
			When the HTTP Session is eventually discarded, the bean that is scoped to that particular HTTP Session is also discarded.

			When using annotation-driven components or Java configuration, you can use the @SessionScope annotation to assign a
			component to the session scope.

			+---------------------------------------+
			|	@SessionScope						|
			|	@Component 							|
			|	public class UserPreferences {		|
			|	    								|
			|	}									|
			|										|
			+---------------------------------------+

	3. 	We can define the bean with session scope in a similar manner:

			+---------------------------------------------------------------------------------------------------+
			|
			|	@Bean
			|	@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
			|	public HelloMessageGenerator sessionScopedBean() {
			|	    return new HelloMessageGenerator();
			|	}
			|
			+----------------------------------------------------------------------------------------------------+

			Next, we define a controller with a reference to the sessionScopedBean. Again, we need to run two requests in order to
			show that the value of the message field is the same for the session.

			In this case, when the request is made for the first time, the value message is null. But once, it is changed, then that
			value is retained for subsequent requests as the same instance of the bean is returned for the entire session.

			+----------------------------------------------------------------------------------------------------+
			|	@Controller
			|	public class ScopesController {
			|	    @Resource(name = "sessionScopedBean")
			|	    HelloMessageGenerator sessionScopedBean;
			|	 
			|	    @RequestMapping("/scopes/session")
			|	    public String getSessionScopeMessage(final Model model) {
			|	        model.addAttribute("previousMessage", sessionScopedBean.getMessage());
			|	        sessionScopedBean.setMessage("Good afternoon!");
			|	        model.addAttribute("currentMessage", sessionScopedBean.getMessage());
			|	        return "scopesExample";
			|	    }
			|	}
			|
			+----------------------------------------------------------------------------------------------------+