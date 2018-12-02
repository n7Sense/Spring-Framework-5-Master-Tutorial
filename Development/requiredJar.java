1. commons-logging-1.2		

If we not set into Class Path then it will throw Exception:

		Exception in thread "main" java.lang.NoClassDefFoundError: org/apache/commons/logging/LogFactory
			at org.springframework.context.support.AbstractApplicationContext.<init>(AbstractApplicationContext.java:162)
			at org.springframework.context.support.AbstractApplicationContext.<init>(AbstractApplicationContext.java:232)
			at org.springframework.context.support.AbstractRefreshableApplicationContext.<init>(AbstractRefreshableApplicationContext.java:92)
			at org.springframework.context.support.AbstractRefreshableConfigApplicationContext.<init>(AbstractRefreshableConfigApplicationContext.java:59)
			at org.springframework.context.support.AbstractXmlApplicationContext.<init>(AbstractXmlApplicationContext.java:62)
			at org.springframework.context.support.FileSystemXmlApplicationContext.<init>(FileSystemXmlApplicationContext.java:139)
			at org.springframework.context.support.FileSystemXmlApplicationContext.<init>(FileSystemXmlApplicationContext.java:85)
			at ns.Sense.main(Sense.java:21)
		Caused by: java.lang.ClassNotFoundException: org.apache.commons.logging.LogFactory
			at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
			at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
			at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:349)
			at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
			... 8 more
		C:\Users\nSense\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
		BUILD FAILED (total time: 0 seconds)

2. spring-expression-5.1.3.RELEASE
		
		Exception in thread "main" java.lang.NoClassDefFoundError: org/springframework/expression/ParserContext
			at org.springframework.context.support.AbstractApplicationContext.prepareBeanFactory(AbstractApplicationContext.java:634)
			at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:521)
			at org.springframework.context.support.FileSystemXmlApplicationContext.<init>(FileSystemXmlApplicationContext.java:142)
			at org.springframework.context.support.FileSystemXmlApplicationContext.<init>(FileSystemXmlApplicationContext.java:85)
			at ns.Sense.main(Sense.java:21)
		Caused by: java.lang.ClassNotFoundException: org.springframework.expression.ParserContext
			at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
			at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
			at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:349)
			at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
			... 5 more
		C:\Users\nSense\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
		BUILD FAILED (total time: 0 seconds)
