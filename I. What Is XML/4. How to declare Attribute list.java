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

		



