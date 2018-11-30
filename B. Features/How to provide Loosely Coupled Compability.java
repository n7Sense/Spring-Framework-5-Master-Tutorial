	How to provide Loosely Coupled Compability. 
============================================

 in my Business layer if i used JDBC lke  
 public class BusinessLayer{
 	JDBC jdbc = new JDBC();	
 }
 
 its become Tightly copled and it is not compitable with other layer like Hibernate, JPA etc.
 to provide this Compability, our DAO Layer need to follow some Rules,
 In the form of Interface we can provide Rules,

 public interface Rules{

 	"Rulse Interface Model"
 }

 If my all DAO laye classes implements this Rules interface, then insted of passing the DAO layer class as a instance into BusinessLayer
 we can pass Rules instance, at runtime if i have ability to pass my object like JDBC or JPA etc. then my Business Layer will become loosely 
 coupled with DAO layer, So by using Java Runtime Polymorphism we can able to inject any Runtime "Implementation Class Instances".

 public class BusinessLayer{
 		Rules rules = JDBC or JPA or Hibernate etc.
 }

Controller
=============

 While Controller talking with Business Layer, suppose if i use "WebLogic-TX" & "WebLogic-Security"
 in future if dont want this Transaction(TX) and Security, if i have to use JBoss-TX and JBoss-Sec or else
 in future Spring-TX & Spring-Sec
 So by using Interface Model (Top Level Interface) can able to inject any Runtime "Implementation Class Instances".
  