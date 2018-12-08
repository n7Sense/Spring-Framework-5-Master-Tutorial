
There are two additional ways in XML documents to reference characters: •a numeric character reference refers to a character
•an entity reference refers to a series of characters

Where entities are used, the referenced characters appear. 


Numeric character references:
==============================

A numeric character reference can be specified in two formats:
	+---------------------------+
	|	&#nnnn; or &#xhhhh;		|
	+---------------------------+

	where the n decimal digits or the h hexadecimal characters identify the Unicode character code of the referenced
	character

Entity references OR XML escape characters
============================================

	The following predefined entities exist in XML: 


	Entity Name  +	Character +	Decimal Reference +	Hexadecimal Reference
				 |			  | 				  |
	&quot 		 |		" 	  |		&#34; 		  |		&#x22; 				"
							
	&amp 		 |		&	  |		&#38;		  |		&#x26; 

	&apos 		 |		' 	  |		&#39;		  |		&#x27; 				'

	&lt 		 |		< 	  |		&#60; 		  |		&#x3C;

	&gt 		 |		> 	  |		&#62; 		  |		&#x3E       



Example 1:
===========

		This example declares an entity named 'dotto' and uses it and the predefined 'lt' entity in an XML document: 
		 
		<?xml version="1.0" encoding="utf-8"?>
		<!DOCTYPE sample [
		    <!NOTATION vrml PUBLIC "VRML 1.0">
		    <!ENTITY dotto "Dottoro">
		    <!ENTITY keshav "Madhusudan"> 
		]>
		<entityTest>
		    <predefined>2 &lt; 5</predefined>
		    <declared>&dotto;</declared>
		    <yogeshwar>&keshav</yogeshwar>
		</entityTest>


		OUT:PUT on Browser:
		===================

			<?xml version="1.0" encoding="UTF-8"?>
			<!DOCTYPE sample>
			<entityTest>
				<predefined>2 < 5</predefined>
				<declared>Dottoro</declared>
				<yogeshwar>MadhuSudan</yogeshwar>
			</entityTest>

Text
=====

The safe way is to escape all five characters in text, however, the three characters " , ' and  > needn't be escaped in text: 	"
	Example: this is valid

	<?xml version="1.0"?>
		<valid>"'></valid>  			"

	 
