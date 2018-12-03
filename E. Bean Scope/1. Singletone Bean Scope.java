	Singletone Bean Scope
===========================
	(Default) Scopes a single bean definition to a single object instance for each Spring IoC container.
	
	Defining a bean with singleton scope means the container creates a single instance of that bean, and all requests for that bean
	name will return the same object, which is cached. Any modifications to the object will be reflected in all references to the bean.
	This scope is the default value if no other scope is specified.


: Way to defoine Scope
-----------------------

		1. By Annotation
			a. @Scope("singletone")

				OR

			b. We can also use a constant instead of the String value in the following manner:
				@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)

				OR

		2.	By XML Configuration

				<bean id="student" class="bean.Student" scope="singletone">
	        		<property name="name" value="Sunita"/>
	    		</bean>


: Example
===========
	
	A. Bean class

			@ImportResource("classpath:beans.xml")

			public class Student {
			    private String name;

			    public Student() {
			        System.out.println("Only One Time Constructor called by IoC Because SCOPE:singletone");
			    }

			    public String getName() {
			        return name;
			    }

			    public void setName(String name) {
			        System.out.println("Only One Time Setter called by IoC Because SCOPE:singletone");
			        this.name = name;
			    }
			}

	B. bean.xml

			<beans xmlns = "http://www.springframework.org/schema/beans"
			   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
			   xsi:schemaLocation = "http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">
			    <description>Hello World</description>
			    <bean id="student" class="bean.Student" scope="singletone">
			        <property name="name" value="Sunita"/>
			    </bean>
			</beans>

	C. Main.java

			public class Main {

			    public static void main(String[] args) {
			        String url = "C:\\Users\\nSense\\IdeaProjects\\SpringTest\\src\\beans.xml";
			        Resource resource = new ClassPathResource("/beans.xml");

			        BeanFactory beanFactory = new ClassPathXmlApplicationContext("/beans.xml");
			        Student student1 = (Student)beanFactory.getBean("student");
			        Student student2 = (Student)beanFactory.getBean("student");
			        Student student5 = (Student)beanFactory.getBean("student");

			        System.out.println("CPAC : "+student1.toString()+"\t&\t"+"HashCode : "+student1.hashCode());
			        System.out.println("CPAC : "+student2.toString()+"\t&\t"+"HashCode : "+student2.hashCode());
			        System.out.println("CPAC : "+student5.toString()+"\t&\t"+"HashCode : "+student5.hashCode());
			    }
			}

	D. Out-Put:

			Only One Time Constructor called by IoC Because SCOPE:singletone
			Only One Time Setter called by IoC Because SCOPE:singletone
			Student{name='Sunita'}	&	HashCode : 1776957250
			Student{name='Sunita'}	&	HashCode : 1776957250
			Student{name='Sunita'}	&	HashCode : 1776957250

	E. Note:

			Notice that all Bean instances have same hashcode and the constructor and setter is called once, it means that spring
			container is returning the same instance of Bean always.