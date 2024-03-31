import java.util.*;

//https://www.geeksforgeeks.org/collections-in-java-2/
//reference image for hierarchy of collections and maps


/*  a vector is a dynamic array that can grow or shrink as needed. 
It is part of the Java Collections Framework and is similar to an ArrayList, but with some key differences. 
Vectors are synchronized, which means that multiple threads can access and modify them safely. 
They also have a default capacity of 10 elements, which can be increased or decreased as needed.
Vectors can be used to store any type of object, including primitive data types, strings, and other objects.
*/

public class vectors {
    public static void main(String[] args) {
        //initial
        Vector<Integer> v=new Vector<Integer>(5);

        //appending elements in a vector
        for (int i = 1; i <= 5; i++){
            v.add(i);
        }

        System.out.println(v);

        //removing
        v.remove(3);

        System.out.println(v);
    }
}
