import java.util.*;


//dicts..

public class hashtables{
    public static void main(String[] args) {
        Hashtable<String,Integer> ht = new Hashtable<>();

               // Adding elements to the hashtable
        ht.put("A", 1);
        ht.put("B", 2);
        ht.put("C", 3);

        int valueA = ht.get("A");
        System.out.println("Value of A: " + valueA);

        // Removing elements from the hashtable
        ht.remove("B");
    }
}