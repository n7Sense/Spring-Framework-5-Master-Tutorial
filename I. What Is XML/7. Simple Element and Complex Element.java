XSD Element
===============

1. Simple Element
=================

		1. Does not contain child element and attribute.
		2. it contain only Text data.
		3. Syntax:

			<empNo> 101 </empNo>
			<empName> Sunita </empName>

		4. Example:

			+-------------------------------------------------+
				<element name="empNo" type="int">
				<element name="empName" type="string">
				<element name="salary" type="decimal">
			+-------------------------------------------------+

2. Complex Element
===================

		1. contain child element and attribute or both is called Complex Element
		2. Element with EMPTY content and attribute
		3. Elements with Mixed content and Or  attribute
		4. Syntax:

				<employee id = "1">
					<empNo> 101 </empNo>
					<empName> Sunita </empName>	
				</employee>
		5. but to create complex must it shuld contain Complex Data Type
		6. Example: 

			+-------------------------------------------------+
				<element name="element-name">
					<complexType>
						<sequence>
							<element name="empNo" type="int">
							<element name="empName" type="string">
							<element name="salary" type="decimal">
						</sequence>	
					</complexType>
				</element>
			+-------------------------------------------------+
