Cardinal Operator
===================

* 	  	Indicate 		0 to n

+ 		Indicate 		1 to n

? 		Indicate 		0 OR 1


	Example:

		<!ELEMENT books (book*) > //chance of 0 to many books are there
 		<!ELEMENT book ((book-name | title-name ), price, author+, publication? ) >

 		author: for one book  1 to many author are available.
 		publication : not mandatory it will or will not.
 		(book-name | title-name ): any one of them.
 		