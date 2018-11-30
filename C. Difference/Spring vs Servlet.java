Spring vs Servlet
==================

	Servlet
===============

	1. If we want to write a servlet must we need to implements or extends Servlet classes or interface loke.
		Servlet, GenericServlet, and HttpServlet

	Spring
=============
	
	1. Spring not forcing a programmer to implements or extends the class. suppose there is 3 class like A, B and C
		and you want the behaviour of A and B class into C then Spring reommnding us insted of extending that we have to associate
		the bothe class into C i.e Has-A relation. and if we make a Top-Level-Interface-Model then we can make it 
		"Light-Weigh and Loosely Coupled".

		So, By Using this 2-Pinciple i.e Runtime-Polymorphism and Association they implemented complete Spring Framework