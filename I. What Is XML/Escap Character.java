
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
