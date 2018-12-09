How to declare Attribute list
==============================
	
	Syntax: to declare Attribute List we have to use <ATTLIST> tag element.

		<!ATTLIST element-name attributeName attributeType attributeSprcifier other-information >

	Example:

	employee.dtd
	+---------------------------------------------------+
		<!ELEMENT employees (employee+) >
		<!ELEMENT employee EMPTY >
		<!ATTLIST employee empNo CDATA #REQUIRED >
		<!ATTLIST employee name CDATA #REQUIRED >
		<!ATTLIST employee salary CDATA #REQUIRED >


	employee.xml
	+---------------------------------------------------+

		<employees>
			<employee empNo="100" name="Sunita" salary="120000" />
			<employee empNo="100" name="Rahul" salary="120000" />
		</employees>

	+---------------------------------------------------+


Attribute Specifiier
=====================
	
	Used to specify an attribute is a mandetory attribute.
	optional attribute
	fixed attribute
	default attribute

	there are have 4-types of attribute.

		1) #REQUIRED		mandatory attribute
		2) #IMPLIED 		optional attribute
		3) #FIXED 			fixed attribute
		4) default 			any specifier if we are not specify explicitly then that attribute is "default" attribute.
	

		Example:
			employee.dtd
			+---------------------------------------------------+
				<!ELEMENT employees (employee+) >
				<!ELEMENT employee EMPTY >
				<!ATTLIST employee empNo CDATA #REQUIRED >
				<!ATTLIST employee name CDATA #REQUIRED >
				<!ATTLIST employee salary CDATA #REQUIRED >
				<!ATTLIST employee address CDATA #IMPLIED >
				<!ATTLIST employee phone CDATA #IMPLIED "979271935" > this is default value for default specifier
				<!ATTLIST employee empId CDATA #FIXED  "1520000E01">

Data Type For Attribute
========================

	1. CDATA : 	CDATA is character data (text and not markup). It is a String Attribute Type.

	2. 	ID : It is a unique identifier of the attribute. It should not appear more than once. It is a Tokenized Attribute Type.

	3. 	IDREF : It is used to reference an ID of another element. It is used to establish connections between elements.
				It is a Tokenized Attribute Type.

	4. 	IDREFS : It is used to reference multiple ID. It is a Tokenized Attribute Type.

	5. 	ENTITY : It represents an external entity in the document. It is a Tokenized Attribute Type.

	6. 	ENTITIES : It represents a list of external entities in the document. It is a Tokenized Attribute Type.

	7. 	NMTOKEN : It is similar to CDATA and the attribute value consists of a valid XML name.

	8. 	NMTOKENS : It is similar to CDATA and the attribute value consists a list of valid XML name.
					It is a Tokenized Attribute Type.

	9. NOTATION : An element will be referenced to a notation declared in the DTD document. It is an Enumerated Attribute Type.

	10.	Enumeration : It allows defining a specific list of values where one of the values must match.
						It is an Enumerated Attribute Type.



