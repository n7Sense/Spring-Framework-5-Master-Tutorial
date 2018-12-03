WebSocket Bean Scope
=====================

1. Finally, let’s create the bean with websocket scope:

	@Bean
	public HelloMessageGenerator websocketScopedBean() {
	@Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
	    return new HelloMessageGenerator();
	}

	WebSocket-scoped beans when first accessed are stored in the WebSocket session attributes. The same instance of the bean is
	then returned whenever that bean is accessed during the entire WebSocket session.

	We can also say that it exhibits singleton behavior but limited to a WebSocket session only.