Using clone
===========

3) Using clone() method: Whenever clone() is called on any object, the JVM actually creates a new object and copies all content of the previous object into it. Creating an object using the clone method does not invoke any constructor.
To use clone() method on an object we need to implement Cloneable and define the clone() method in it.


// Java program to illustrate creation of Object 
// using clone() method 
public class CloneExample implements Cloneable 
{ 
    @Override
    protected Object clone() throws CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
    String name = "GeeksForGeeks"; 
  
    public static void main(String[] args) 
    { 
        CloneExample obj1 = new CloneExample(); 
        try
        { 
            CloneExample obj2 = (CloneExample) obj1.clone(); 
            System.out.println(obj2.name); 
        } 
        catch (CloneNotSupportedException e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 
Output:

GeeksForGeeks

Note :

Here we are creating the clone of an existing Object and not any new Object.
Class need to implement Cloneable Interface otherwise it will throw CloneNotSupportedException.