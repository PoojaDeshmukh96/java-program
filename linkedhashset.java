import java.io.*;
import java.util.*;

class linkedhashset 
{
    public static void main(String arg[]) 
    {
        LinkedHashSet<String> hs = new LinkedHashSet<>(); // object created of hash set

        hs.add("AMERICA"); // insert elemnet into hashset
        hs.add("AUSTRIA");
        hs.add("EUROPE");
        hs.add("ENGLAND");
        hs.add("AMERICA");

        Iterator it = hs.iterator();
        System.out.println("Element in linkedhashset:");
        while (it.hasNext()) 
        {
            // String s=(String)it.next();
            System.out.println(it.next());
        }

        hs.remove("ENGLAND");
        System.out.println("After removing element from LinkedHashset :" + hs);

        LinkedHashSet<String> h = new LinkedHashSet<>();
        h.add("USA");
        h.add("ITALY");

        hs.addAll(h);
        
        Iterator t = hs.iterator();
        System.out.println("After updating LinkedHashset:" + hs);

        hs.removeAll(h);
        System.out.println("After removing element from LinkedHashset:" + hs);

    }
}