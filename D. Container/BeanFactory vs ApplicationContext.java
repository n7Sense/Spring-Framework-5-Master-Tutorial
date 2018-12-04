BeanFactory vs ApplicationContext
=================================

BeanFactory

	1. create the Instance at First User request.


ApplicationContext
	
	1. create the instance of all the Bean, at the time of loading XML file. If that bean scope is SINGLETONE

	2. If we change the scope to PROTOTYPE, then it will not create any instance at the time of loading, it will create
		instance at the time of First User request. 

	3. If we change the scope of Beans the ApplicationContext behave like a BeanFactory.

Example:
	
	Sunita143
	=========

			public class Sunita143 {
			   
			    private String message;

			    public Sunita143() {
			        System.out.println("Sunita143: Constructor");
			    }
			    
			    public void setMessage(String message) {
			        System.out.println("Sunita143 Setter");
			        this.message = message;
			    }

			    public void getMessage() {
			        System.out.println("Your Message : " + message);
			    }
			}

	SunitaILUSoMuch.java
	=====================

		public class SunitaILUSoMuch{
		    private String message;
		    public SunitaILUSoMuch() {
		        System.out.println("SunitaILUSoMuch: Constructor");
		    }
		    public void setMessage(String message) {
		        System.out.println("SunitaILUSoMuch: Setter");
		        this.message = message;
		    }

		    public void getMessage() {
		        System.out.println("Your Message : " + message);
		    }
		}


		public class Sense{
	   
		    public static void main(String[] args) {
		        
		        /**
		        *  @When BeanFactory load the beans.xml file
		        *  @LoadingState
		        *  @Instance Not Create
		        */
		        System.out.println("Loafing XML document inside BeanFactory container");
        		Resource resource = new ClassPathResource("beans.xml");
        		BeanFactory beanFactory  = new XmlBeanFactory(resource);
        		
        		//requesting For Object
        		beanFactory.getBean("a"); //creating Instance
		        
		        /**
		        *  @When ApplicationContext load the beans.xml file
		        *  @LoadingState
		        *  @Instance Created
		        */
		        System.out.println("\n\nLoafing XML document inside ApplicationContext container");
        		ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
        		
        		//requesting For Object
        		context.getBean("b"); //creating Instance
		          
		    }
	    
		}

	1. Out/Put: If SingleTone scope:

		
		Loafing XML document inside BeanFactory container
		Sunita143: Constructor
		Sunita143 Setter


		Loafing XML document inside ApplicationContext container
		Sunita143: Constructor
		Sunita143 Setter
		SunitaILUSoMuch: Constructor
		SunitaILUSoMuch: Setter 

		+----------------------------------------------------------------------------------------------------------+
			Note: we can easily see the ApplicationContext container create the instance of both
			class at the time of loading
		+----------------------------------------------------------------------------------------------------------+
		

	2. Out/Put: If Both Bean set to  Prototype scope:

		Loafing XML document inside BeanFactory container
		Sunita143: Constructor
		Sunita143 Setter


		Loafing XML document inside ApplicationContext container
		SunitaILUSoMuch: Constructor
		SunitaILUSoMuch: Setter

		+----------------------------------------------------------------------------------------------------------+
			Note: we can easily see the ApplicationContext container not create the instance of both
			class at the time of loading, it create the instance of only SunitaILUSoMuch.java Class
			after calling context.getBean("b");
		+----------------------------------------------------------------------------------------------------------+