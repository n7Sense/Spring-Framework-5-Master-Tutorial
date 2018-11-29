	POJO
===========
	If our class written without Implementing and Extending classes and Interfaces then that class we can said that as a POJO class.

For prepairing Controller, DAO and Business part so which type of class we need to implements or extends..?

	In case of Servlet we need to implements the interface an extends the Class
	But in case of Spring we no need to extends and implements any classes and interfaces just simple POJO(Bean class) classes are use
	to prepare Business, DAO and Controller part

	To get capability of Servlet we must have to implements Servlet interface or GenericServlet, but in case of Spring it is not forcig us
	to implements and extends the classes and interfaces. Spring Recommending us to use Association insted of Inheritance (Extending Model)
	Example: Association
		class A {} class B{}
		
		class C{
			A a;  
			B b;
		}
		insted of extending A and B class C associate A and B, heare if do a top level interface so we can make a loosely coupled.
		i.e interface I{} 
			A implements I 
			B implements I
			class c{
				I i; //loosely coupled 
			}
		

		in Spring to implement all the layer like Controller, DAO, Business it uses POJO model insted of Inheritance, by making class as a
		Associate Object.

		So by using Association (Has-A) and by using Java Runtime Polymorphism principle they implemented complete Spring Framework.