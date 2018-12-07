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


	WebServices specifications
==================================

	To develop web application with any Programming languages, the specifications are provided by "WS-I"
	that specifications are provided in the form of "Basic Profile Documents" in the give version.
	B.P 1.0
	B.P 1.1
	B.P 1.2
	B.P 2.0

	By using this Basic Profile Documents specifications all the Programming languages all the technologies are designed there
	own API

	the Java Technology given the some API that follows the WS-I specifications.
		1. JaxRPC API
		2. JaxWS API
		3. JaxRS API 
		this all API is given by Sun Microsystem.

	IMP: The WS-I is give total 2-types of WebServices
		1. SOAP WebServices
		2. RESTFull WebServices

	The JaxRPC and JaxWS are used to design SOAP based WebServices
	The JaxRs are used to design RESTFull WebServices

Functions of All API
======================

	JAXP : Java API For XML Processing
			to work with parser softwere like DOM Parser, SAX parser, Stack Parser.

	JAXB : Java Architeture for XML binding
			use to convert XML formate data into Java Object and java Object into XML Formate

	NOTE: this 2 API are possible to use it Non-Web Servicess Environment also.

	SAAJ : SOAP Atachement API for java.
	JAXM : Java API for XML Messaging.

	NOTE: this 2 apis are used to build the XML based Messaging, but only possible with the WebServices Envirnonment only.

	JAXRPC : Java API for Remote Procedure Call.
	JAXWS : Java API for XML WebServices.

		NOTE : both API are used to develop SOAP based WebServices, the JaxRPC 2.0 is renamed as JaxWS API


	JaxRS : Java Api for XML RestFull WebServices.
			



