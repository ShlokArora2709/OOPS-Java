import java.util.*;


public class hashmaps {
    public static void main(String[] args) 
    { 
  
        // Creating an empty HashMap 
        Map<String, Integer> map = new HashMap<>(); 
  
        // Inserting entries in the Map 
        // using put() method 
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20); 
  
        // Iterating over Map 
        for (Map.Entry<String, Integer> e : map.entrySet()) 
  
            // Printing key-value pairs 
            System.out.println(e.getKey() + " "
                               + e.getValue()); 
    }
}
