Prototype Bean Scope
=====================
	Scopes a single bean definition to any number of object instances.

	A bean with prototype scope will return a different instance every time it is requested from the container.
	It is defined by setting the value prototype to the @Scope annotation in the bean definition:

	: Way to defoine Scope
-----------------------

		1. By Annotation
			a. @Scope("prototype")

				OR

			b. We can also use a constant instead of the String value in the following manner:
				@Scope(value = ConfigurableBeanFactory.SCOPE_PROTYPE)

				OR

		2.	By XML Configuration

				<bean id="student" class="bean.Student" scope="prototype">
	        		<property name="name" value="Sunita"/>
	    		</bean>


: Example
===========
	
	A. Bean class

			@ImportResource("classpath:beans.xml")

			public class Student {
			    private String name;

			    public Student() {
			        System.out.println("Only One Time Constructor called by IoC Because SCOPE:prototype");
			    }

			    public String getName() {
			        return name;
			    }

			    public void setName(String name) {
			        System.out.println("Only One Time Setter called by IoC Because SCOPE:prototype");
			        this.name = name;
			    }
			}

	B. bean.xml

			<beans xmlns = "http://www.springframework.org/schema/beans"
			   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
			   xsi:schemaLocation = "http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">
			    <description>Hello World</description>
			    <bean id="student" class="bean.Student" scope="prototype">
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

			Many Time Constructor called by IoC Because SCOPE:prototype
			Many Time Setter called by IoC Because SCOPE:prototype
			Many Time Constructor called by IoC Because SCOPE:prototype
			Many Time Setter called by IoC Because SCOPE:prototype
			Many Time Constructor called by IoC Because SCOPE:prototype
			Many Time Setter called by IoC Because SCOPE:prototype
			Student{name='Sunita'}	&	HashCode : 1846896625
			Student{name='Sunita'}	&	HashCode : 1555690610
			Student{name='Sunita'}	&	HashCode : 13329486

	E. Note:

			Notice that all Bean instances have different hashcode and the constructor and setter is called many times, it means that
			Bean instance is created every time it’s requested from spring container..	