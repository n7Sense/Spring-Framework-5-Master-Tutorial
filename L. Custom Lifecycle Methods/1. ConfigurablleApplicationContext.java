ConfigurablleApplicationContext
===============================

the ConfigurablleApplicationContext is an IOC container that use to manage Custom life cycle methods

How many ways to manage Lif Cycle methods.?
-------------------------------------------

1. By Programmeable Aproach
	
	POJO must have to implement 2-Interface
		i.	
		InitializingBean (I) {	

			@Override
			public void afterPropertiesySet(){
			}

		ii.
		DisposableBean (I){
			
			@Override
			public void destroy() {
			}
		}


2. XML Aproach OR Decearative Aproach
	
	by xml aproach we no need to implement any Interface just we have to use one attribute in xml i.e "init-methods" and "destroy-method"

	<bean id="myPojpo" class="MyPojoClass" init-method = "myInitMethodName" destroy-method="myDestroyMethodName" />
	
	In this aproach if you have 100 of Bean class(i.e Pojo class) and same name init() and destroy() methods you use
	then under root tag of beans you have to configure "default-init-method" and "default-destroy-method"

		<beans default-init-method="init" default-destroy-method="destroy">
			<bean></bean>
		</beans>



3. @Annotation  Aproach

	class MyPojoClass{

		@PostConstruct
		myinit(){

		}

		@PreDetroy
		myDestroy(){

		}
	}

	in this way aproach must we need to activate container i.e in xml , to activate this both Annotation we must have to initialize 
	CommonAnnotationBeanPostProcessor

	<bean class ="org.springframework.context.support.CommonAnnotationBeanPostProcessor"/>


NOTE:	After creation of any one of them aproach , then in which container we need to loadd them that container is 
		ConfigurablleApplicationContext container.

		At the time of Loading this IoC container 

			create the Object of MyPojoClass
			Inject the properties of MyPojoClass
			and then it will call my init() method.

			NOTE: at the time of cloasing how IoC call Destroye method, using ConfigurablleApplicationContext container
			class the destroy() method.
