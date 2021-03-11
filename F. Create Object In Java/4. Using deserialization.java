Using deserialization
======================

4) Using deserialization : Whenever we serialize and then deserialize an object, JVM creates a separate object.
  In deserialization, JVM doesn’t use any constructor to create the object.
To deserialize an object we need to implement the Serializable interface in the class.

Serializing an Object :

filter_none
edit
play_arrow

brightness_4
// Java program to illustrate Serializing 
// an Object. 
import java.io.*; 
  
class DeserializationExample implements Serializable 
{ 
    private String name; 
    DeserializationExample(String name) 
    { 
        this.name = name; 
    } 
  
    public static void main(String[] args) 
    { 
        try
        { 
            DeserializationExample d = 
                    new DeserializationExample("GeeksForGeeks"); 
            FileOutputStream f = new FileOutputStream("file.txt"); 
            ObjectOutputStream oos = new ObjectOutputStream(f); 
            oos.writeObject(d); 
            oos.close(); 
            f.close(); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 
Object of DeserializationExample class is serialized using writeObject() method and written to file.txt file.

Deserialization of Object :

filter_none
edit
play_arrow

brightness_4
// Java program to illustrate creation of Object 
// using Deserialization. 
import java.io.*; 
  
public class DeserializationExample 
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            DeserializationExample d; 
            FileInputStream f = new FileInputStream("file.txt"); 
            ObjectInputStream oos = new ObjectInputStream(f); 
            d = (DeserializationExample)oos.readObject(); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
        System.out.println(d.name); 
    } 
} 
Output:

GeeksForGeeks
