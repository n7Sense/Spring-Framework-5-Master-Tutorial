	DTD
==========
	
	1. Document Type Definition.
	2. DTD is a technique to define the structure of XML documents.
	3. DTD is a Text based documents with .dtd extension.
	4. DTD contains
			Elements Declaration.
			Attributes Declaration.
			Entity Reference Declaration.

How to decleare DTD Elements.?
==============================
	
	<!ELEMENT employee(id, name, salary, phone) >
	<!ELEMENT name (#PCDATA) >

	In the content model 5-types of elements declearation are possible.
		1> Text Only Element
		2> Child Only Element
		3> EMPTY Element
		4> Any Element
		5> Mixed Element

How to map or how to link DTD in XMl documents.?
====================================================

	To map DTD into xml we have to use <!DOCTYPE>
	there are have 2-types of DTD
		1. Internal DTD
			if we writing the DTD within the xml documents.
			+-------------------------------------------------------------------------+	
				<?xml version="1.0" encoding="utf-8"?>
				<!DOCTYPE employee [
				    <!NOTATION vrml PUBLIC "VRML 1.0">
				    <!ELEMENT employee (id, name, salary, phone, yog) >
				    <!ELEMENT phone(#PCDATA) >
				    <!ELEMENT salary(#PCDATA) >
				]>
				<employee>
					<id>100</id>
					<name>Rahul</name>
					<salary>5000</salary>
					<phone>97698 45623</phone>
					<yog>MadhuSudan</yog>
				</employee>
			+--------------------------------------------------------------------------+

		2. External DTD
			if we are writing the DTD in separate text bases documents, and linking that to XML documents.
			External DTD are 2-types
				1. Private DTD
					If any DTD is specific to perticular XML documents, that type of DTD is called Private DTD.
					+--------------------------------------------------------------------------------------+
					|		<!DOCTYPE rootEmement PUBLIC "-//vendorName//version//EN" "DTDFileName.DTD">   |
					+--------------------------------------------------------------------------------------+
					
					"-//vendorname//version//EN"
						plus(+) symbol indicating Registered wth ISO
						minus(-) symbol indicating Not Registered with ISO
						EN indicating this DTD is written in English language
						NOTE: if we not provide the vendorname, version and language then must specify " " double quote.
						NOTE: this information is not required in Private DTD

					example: How to link in external dtd inside xml file
							<!DOCTYPE rootEmement PUBLIC "-//nSense/1.0//EN" "C:\user\nSense\dtd\DtdFileName.dtd">

				2. Public DTD
					If any DTD is not specific to perticular XML documents, that type of DTD is called Public DTD.
					+------------------------------------------------------------------------------+
					|		<!DOCTYPE rootEmement SYSTEM "C:\user\nSense\dtd\DtdFileName.dtd">	   |
					+------------------------------------------------------------------------------+
				

