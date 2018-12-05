As you all know, in Java, a class provides the blueprint for objects, you create an object from a class. There are many different ways to create objects in Java.
Following are some ways in which you can create objects in Java:

1) Using new Keyword : Using new keyword is the most basic way to create an object. This is the most common way to create an object in java. Almost 99% of objects are created in this way. By using this method we can call any constructor we want to call (no argument or parameterized constructors).


// Java program to illustrate creation of Object 
// using new keyword 

public class NewKeywordExample  
{ 
    String name = "GeeksForGeeks"; 
    public static void main(String[] args)  
    { 
        // Here we are creating Object of  
        // NewKeywordExample using new keyword 
        NewKeywordExample obj = new NewKeywordExample(); 
        System.out.println(obj.name); 
    } 
} 