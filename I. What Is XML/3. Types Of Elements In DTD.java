Data Type For AttributeTypes Of Elements In DTD
===========================

	1> Text only Elements
	2> Child only Elements
	3> Mixed Elements
	4> Empty Elements
	5> Any Elements


1. Text only Elements
=====================
	 
	 Example:

	 	<!ELEMENT empName(#PCDATA) >
	 		empName is called as Text only data.


2. Child only Elements
=======================
	Example: 
				employee.dtd : External File
			-------------------------------------
				<!ELEMENT employee (empName, empSalary) >
				<!ELEMENT empName(#PCDATA) >
				<!ELEMENT empSalary (#PCDATA) >


					employee.xml : External File
			-------------------------------

				<!DOCTYPE employee SYSTEM "C:\user\nSense\dtd\employee.dtd"
				<employee>
					<empName>Sunita</empName>
					<empSalary>150000</empSalary>
				</employee>

3. Mixed Elements
==================
	if any Elements allow Child Elements and Text Data then it is called Mixed Elements.

		Example:

					employee.dtd : External File
				-------------------------------------
					<!ELEMENT employees (employee*) >
					<!ELEMENT employee (#PCDATA | empName | empSalary)* > // // why * ? because 0 to many 
					<!ELEMENT empName(#PCDATA) >
					<!ELEMENT empSalary (#PCDATA) >


						employee.xml : External File
				-------------------------------

					<!DOCTYPE employee SYSTEM "C:\user\nSense\dtd\employee.dtd">
					<employees>	
						<employee>
							The Employee Name Is <empName>Sunita</empName>
							The Employee Salary Is <empSalary>150000</empSalary>
						</employee>
					</employees>
				
				+-----------------------------------------------------------------------------+

		NOTE: Must be * is there content model, because many times Text data, child elements allow.

4. Empty Elements
==================
	Elements not allow Text Data, and Child Elements but elements can contain Attributes.
	Sysntax: 	<!ELEMENT employee EMPTY>

		Example: in html <br> and <hr> both tag are called as empty elements.
		
