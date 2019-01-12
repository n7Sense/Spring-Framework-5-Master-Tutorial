	SingleTone Classe
=========================

	Reduce the no. ofobject.
	It is used if our class contain Static content
	If the class contain Dynamic content, then no use of this SingleTone. but if you make it SingleTone then One User value may Override
		By another User Value. so inside the SingleTone Class if you put Dynamic content (instance leve data) the any one can access it.

	*Example: Is Servlet class are SingleTone.?
				Servlet class is not a SingleTone Class but TomCat container will make it as SingleTone, so heare
				TomCat container is Factory, thet Factory making our class as a SingleTone.
				so Factory classes can make other class Object as SingleTone


	* Example: java.utill.ResourceBundle class is SingleTone which is used for Internationalization.

	Spring can create an object of private Constructor but if you dont allow to create object by Spring then throw an 
	Exception inside that private Constructor.

	

