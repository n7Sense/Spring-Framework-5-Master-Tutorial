	SAX Parser
================
	
1. XSD or DTD validate the Spring XMl.

2. SAX Parser is present inside the IoC container.

3. IoC container read the Spring XMl file with the help of SAX Parser.

4. the SAX Parser check the well formed and validation of document.

5. if the parser foud any mistake, not well formed xml documents, then it will throws an Exception 
		
	1.Example: if we do a mistake in Element like un-closed Elements, or spelling mistake of elements etc..
		

				Loafing XML document inside BeanFactory container
			+---------------------------------------------------------------------------------------------------------------------------------		
				Exception in thread "main" org.springframework.beans.factory.xml.XmlBeanDefinitionStoreException: Line 14 in XML document from class path resource [beans.xml] is invalid; nested exception is org.xml.sax.SAXParseException; lineNumber: 14; columnNumber: 8; The value of attribute "scope" associated with an element type "bean" must not contain the '<' character.
			+---------------------------------------------------------------------------------------------------------------------------------		
					at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.doLoadBeanDefinitions(XmlBeanDefinitionReader.java:404)
					at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:336)
					at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:304)
					at org.springframework.beans.factory.xml.XmlBeanFactory.<init>(XmlBeanFactory.java:79)
					at org.springframework.beans.factory.xml.XmlBeanFactory.<init>(XmlBeanFactory.java:67)
					at ns.Sense.main(Sense.java:30)

			+---------------------------------------------------------------------------------------------------------------------------------		
				Caused by: org.xml.sax.SAXParseException; lineNumber: 14; columnNumber: 8; The value of attribute "scope" associated with an element type "bean" must not contain the '<' character.
			+---------------------------------------------------------------------------------------------------------------------------------			
					at com.sun.org.apache.xerces.internal.util.ErrorHandlerWrapper.createSAXParseException(ErrorHandlerWrapper.java:203)
					at com.sun.org.apache.xerces.internal.util.ErrorHandlerWrapper.fatalError(ErrorHandlerWrapper.java:177)
					at com.sun.org.apache.xerces.internal.impl.XMLErrorReporter.reportError(XMLErrorReporter.java:400)
					at com.sun.org.apache.xerces.internal.impl.XMLErrorReporter.reportError(XMLErrorReporter.java:327)
					at com.sun.org.apache.xerces.internal.impl.XMLScanner.reportFatalError(XMLScanner.java:1472)
					at com.sun.org.apache.xerces.internal.impl.XMLScanner.scanAttributeValue(XMLScanner.java:944)
					at com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl.scanAttribute(XMLNSDocumentScannerImpl.java:447)
					at com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl.scanStartElement(XMLNSDocumentScannerImpl.java:250)
					at com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$FragmentContentDriver.next(XMLDocumentFragmentScannerImpl.java:2784)
					at com.sun.org.apache.xerces.internal.impl.XMLDocumentScannerImpl.next(XMLDocumentScannerImpl.java:602)
					at com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl.next(XMLNSDocumentScannerImpl.java:112)
					at com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl.scanDocument(XMLDocumentFragmentScannerImpl.java:505)
					at com.sun.org.apache.xerces.internal.parsers.XML11Configuration.parse(XML11Configuration.java:842)
					at com.sun.org.apache.xerces.internal.parsers.XML11Configuration.parse(XML11Configuration.java:771)
					at com.sun.org.apache.xerces.internal.parsers.XMLParser.parse(XMLParser.java:141)
					at com.sun.org.apache.xerces.internal.parsers.DOMParser.parse(DOMParser.java:243)
					at com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderImpl.parse(DocumentBuilderImpl.java:339)
					at org.springframework.beans.factory.xml.DefaultDocumentLoader.loadDocument(DefaultDocumentLoader.java:77)
					at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.doLoadDocument(XmlBeanDefinitionReader.java:434)
					at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.doLoadBeanDefinitions(XmlBeanDefinitionReader.java:392)
					... 5 more
				C:\Users\nSense\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
				BUILD FAILED (total time: 0 seconds)



	2. Example: if we do a mistake in Elements of attribute values like 
	+--------------------------------------------------------------------+
		if class="ClassName" if name of this class not match with POJO
	+--------------------------------------------------------------------+

			Loafing XML document inside BeanFactory container
			Exception in thread "main" org.springframework.beans.factory.CannotLoadBeanClassException: Cannot find class [my.Snita143] for bean with name 'a' defined in class path resource [beans.xml]; nested exception is java.lang.ClassNotFoundException: my.Snita143
				at org.springframework.beans.factory.support.AbstractBeanFactory.resolveBeanClass(AbstractBeanFactory.java:1392)
				at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:470)
				at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:338)
				at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199)
				at ns.Sense.main(Sense.java:31)
			Caused by: java.lang.ClassNotFoundException: my.Snita143
				at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
				at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
				at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:349)
				at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
				at java.lang.Class.forName0(Native Method)
				at java.lang.Class.forName(Class.java:348)
				at org.springframework.util.ClassUtils.forName(ClassUtils.java:275)
				at org.springframework.beans.factory.support.AbstractBeanDefinition.resolveBeanClass(AbstractBeanDefinition.java:437)
				at org.springframework.beans.factory.support.AbstractBeanFactory.doResolveBeanClass(AbstractBeanFactory.java:1457)
				at org.springframework.beans.factory.support.AbstractBeanFactory.resolveBeanClass(AbstractBeanFactory.java:1384)
				
	+----------------------------------------------------------------------------+
		if scope="ProtoType" values is incorrect, valid values is "prototype"
	+----------------------------------------------------------------------------+

			Loafing XML document inside BeanFactory container
			Exception in thread "main" java.lang.IllegalStateException: No Scope registered for scope name 'ProtoType'
				at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:350)
				at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199)