import java.io.*;
import java.util.*;

class hashset 
{
    public static void main(String arg[])
    {
        HashSet<String> hs=new HashSet<>();  //object created of hash set
        
        hs.add("AMERICA");       //insert elemnet into hashset
        hs.add("AUSTRIA");
        hs.add("EUROPE");
        hs.add("ENGLAND");
        hs.add("AMERICA");
        System.out.println("Hash set before removing" +hs );
       
        Iterator it = hs.iterator();
        System.out.println("Element using iterator:");
        while(it.hasNext())
        {
           // String s=(String)it.next();
            System.out.println(it.next());
        }

         hs.remove("ENGLAND");
         System.out.println("After removing element from Hash set" +hs);

         HashSet<String> h=new HashSet<>();
         h.add("USA");
         h.add("ITALY");
        
         hs.addAll(h);
         System.out.println("After updating Hash set" +hs );

         hs.removeAll(h);
         System.out.println("After removing element from Hash set" +hs );

         hs.clear();
         System.out.println("Clear all element from Hash set" +hs );
        }
}

/*abstractHash set before removing :[EUROPE, AMERICA, ENGLAND, AUSTRIA]
Element using iterator:
EUROPE
AMERICA
ENGLAND
AUSTRIA
After removing element from Hash set:[EUROPE, AMERICA, AUSTRIA]

After updating Hash set:[EUROPE, AMERICA, USA, ITALY, AUSTRIA]

After removing element from Hash set:[EUROPE, AMERICA, AUSTRIA]

Clear all element from Hash set:[]
*/