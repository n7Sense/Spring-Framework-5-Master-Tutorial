Web Application vs Web Servives
================================

	Web Application
======================
	1. Web Application is a server side Application.
	1. Web Application always communicating with the End User (client)
	3. End user sending request direcly and web Application directly give response to end user.
	4. End User is always use the browser to send the request to Web Application.
	5. Web Application directly take the request and directly response to the End user.
	6.  Technology use to build Web Application.
		Java: Servlet, PHP
		.NET: ASP
		PHP


	Web Service
===================
	1. Web Service is a server side Application.
	2. Web Service is always taking the request from some other Application, and giving response to some other Application.
	3. Web Service not directly interacte with the end user.
	4. for Web Service program some other application is acting as a client, directly End-User is not acting as a client.
	5. Web Service is alway a Distributed application
		to build Distributed Application with Java there are have many API.
				1. Socket Programming API
				2. CORBA
				3. RMI
				4. EJB
				all this api is called Distributed API.

NOTE:
==========

	Every Programing languages and technologies have its own Distributed API to build distributed application.
	but all the Programming languages and technologies, distributed API have some drawback.
	To overcome the Drawback only the WS-I is given WebServices into the market

	WS-I stands for Web Servives interoperability
	WS-I is an open community, in this community all the softwere companies vendor s are assocoated members.
	WS-I given Web Service specifications. thatare common to all the Programming languages and all the technologies.
	 So thats way WebServices are not only specific to java, this are common to all the Programming languages and technologies.


Interoperability
===================
 	to provide the communicating between any Programming languages to any other Programming languages
 	Example:

							Xml request			| 										
 						----------------------> |		
 		IRCTC (Java)		xml response		|
 						<----------------------	|
 												|
 												+-------------------------------+
 							Xml request			|								|
 						---------------------->	|	Payment Gateway Service		|
 		FlipKart (PHP)		xml response		|								|				
 						---------------------->	|	State Bank					|
 												|								|
 												|								|
 												|								|
 							Xml request			|								|
 						---------------------->	+-------------------------------+
 		Amazon (ASP .NET) 	xml response		|
 						---------------------->	|
 												|
 												|

 				all browser support XML, 


 	Stub & Skelotone
 ======================

 	If 2 object are run in 2 different JVM if they want to communicate with each other, then Stub and Skeloton
 	are used to provide communication.

 	The Stub & Skeloton both are called as Proxy object.

 	IMP: Stub is residing in the client System and Skeloton is residing in the Server System.

 	What is proxy Object.?
 ================================

 	Proxy object is not a Real Object, but it is work like a Real Object.
 	Proxy object is a Helper object.

 	Example: ATM System is not a Bank, but it is work like a Bank.
 				ATM is Proxy object of Bank
 				OR
 				ATM is an Helper object of an Bank.


