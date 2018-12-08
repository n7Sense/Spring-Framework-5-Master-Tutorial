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

		2. External DTD
			if we are writing the DTD in separate text bases documents, and linking that to XML documents.
