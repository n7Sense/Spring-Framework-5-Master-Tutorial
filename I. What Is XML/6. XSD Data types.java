XSD Data types
==============

												Data Types
													+
													|
					+-------------------------------+-------------------------------+
					|																|
				Simple Types 													Complex Types
					+																+
					|																|
		+------------+------------------+						+-------------------+-------------------+
		|						 		|						|					|					|
User Derived Types					Built In Types(44)		   EMPTY			Simple Content 			Complex Content
		+								+																|
		|								|																|> Sequence
		|> Atomic						|> Primitive													|
		|								|																|> Choice
		|> Non Atomic					|> Derived														|
																										|> All




Primitive Data Types
====================
	string, boolean, decimal, float, double, duration, dateTime, time, date, gYearMonth, gYear, gDay, gMonth,
	hexBinary, base64Binary, anyURI, QName, Notation


Derived Data Types
===================
	normalizedString, token, language, IDREFS, ENTITIES, NMTOKEN, NMTOKENS, Name NCName, ID, IDREF, ENTITY,
	integer, nonPositiveInteger, negativeInteger, long, int, short, byte, nonNegativeInteger, unsignedLong,
	unsignedInt, unsignedShort, unsignedByte, positiveinteger