													
												package org.springframework.beans.factory
																BeanFactory(I)
																	|
																	|
		-------------------------------------------------------------------------------------------------------------------------
		|													|
		|													|
package org.springframework.context;		package org.springframework.beans.factory
	ApplicationContext(I)					HierarchicalBeanFactory(I)
	|													|
	|													
	|
	|->package org.springframework.context
	|		ConfigurableApplicationContext(I)	--->|
	|												|
 	|->package org.springframework.web.context 		|
 	|		WebApplicationContext(I)			--->|
 													|
 													|
 		package org.springframework.web.context 	|
 		ConfigurableWebApplicationContext(I)	<---|