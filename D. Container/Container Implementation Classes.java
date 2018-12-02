Container Implementation Classes Example
=========================================

*****************************************************************
Bean Class: Student.java 
=========================
	package bean;

import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:beans.xml")
public class Student {

    private int studentId;
    private String name;
    private String address;
    private long phone;

    public int getStudentId() { return studentId;   }

    public void setStudentId(int studentId) {       this.studentId = studentId;    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
}

******************************************************************
Bean Configuration File: bean.xml
==================================
<?xml version="1.0" encoding="UTF-8"?>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

    <description>Hello World</description>

    <bean id="student" class="bean.Student" name="student2">
        <property name="studentId" value="100" />
        <property name="name" value="Rahul"/>
        <property name="address" value="Kolshet"/>
        <property name="phone" value="9769874512"/>
    </bean>


</beans>

*****************************************************************
Main: File.java
===================
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import bean.Student;

public class Main {

    public static void main(String[] args) {
        String url = "C:\\Users\\nSense\\IdeaProjects\\SpringTest\\src\\beans.xml";
        Resource resource = new ClassPathResource("/beans.xml");

        BeanFactory beanFactory1 = new XmlBeanFactory(resource);
        BeanFactory beanFactory2  = new GenericXmlApplicationContext(resource);
        BeanFactory beanFactory3 = new FileSystemXmlApplicationContext(url);
        BeanFactory beanFactory4 = new ClassPathXmlApplicationContext("/beans.xml");
        BeanFactory beanFactory5 = new AnnotationConfigApplicationContext(Student.class);

        System.out.println("BeanFactory Implementation Classes...");
        Student student1 = (Student)beanFactory1.getBean("student");
        Student student2 = (Student)beanFactory2.getBean("student");
        Student student3 = (Student)beanFactory3.getBean("student");
        Student student4 = (Student)beanFactory4.getBean("student");
        Student student5 = (Student)beanFactory5.getBean("student");

        System.out.println("XBF : "+student1.toString()+" HC : "+student1.hashCode());
        System.out.println("GXAC : "+student2.toString()+" HC : "+student2.hashCode());
        System.out.println("FXAC : "+student3.toString()+" HC : "+student3.hashCode());
        System.out.println("CPXAC : "+student4.toString()+" HC : "+student4.hashCode());
        System.out.println("ACAC : "+student5.toString()+" HC : "+student5.hashCode());

        ApplicationContext context6 = new  FileSystemXmlApplicationContext(url);
        ApplicationContext context7 = new GenericXmlApplicationContext(resource);
        ApplicationContext context8 = new ClassPathXmlApplicationContext("/beans.xml");
        ApplicationContext context9 = new AnnotationConfigApplicationContext(Student.class);

        Student student6 = (Student)context6.getBean("student");
        Student student7 = (Student)context7.getBean("student");
        Student student8 = (Student)context8.getBean("student");
        Student student9 = (Student)context9.getBean("student");

        System.out.println("\nApplicationContext Implementation Classes");
        System.out.println("AC : "+student6.toString()+" HC : "+student6.hashCode());
        System.out.println("AC : "+student7.toString()+" HC : "+student7.hashCode());
        System.out.println("AC : "+student8.toString()+" HC : "+student8.hashCode());
        System.out.println("AC : "+student9.toString()+" HC : "+student9.hashCode());
    }
}
