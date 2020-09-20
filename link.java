import java.io.*;
import java.util.*;

public class link 
{
    public static void main(String arg[]) throws IOException 
    {
        LinkedList<Integer> ll = new LinkedList<>(); // object created of stack

        int ch = 0, pos = 0;int elmt;

        BufferedReader br = (new BufferedReader(new InputStreamReader(System.in)));

        while (ch <= 5) {
            System.out.println("LINKEDLIST OPERATION");
            System.out.println("1.INSERT AN ELEMENT");
            System.out.println("2.REMOVE AN ELEMENT");
            System.out.println("3.CHANGE AN ELEMENT");
            System.out.println("4.first element");
            System.out.println("5.exit");

            System.out.println("Enter your choice:");

            ch = Integer.parseInt(br.readLine());

            switch (ch) {
                case 1:
                    System.out.println("Enter an element");
                    elmt =Integer.parseInt(br.readLine());

                    System.out.println("Enter a position");
                    pos = Integer.parseInt(br.readLine());

                    ll.add(pos-1, elmt);
                    break;

                case 2:
                    System.out.println("At which position");
                    pos = Integer.parseInt(br.readLine());

                    ll.remove(pos-1);
                    break;

                case 3:

                    System.out.println("Enter  position");
                    pos = Integer.parseInt(br.readLine());

                    System.out.println("Enter new element");
                    elmt =Integer.parseInt(br.readLine());

                    ll.set(pos-1, elmt);
                    break;
                 case 4:

                   System.out.println("1st element" + ll.getFirst());
                default:
                    return;
              }
            System.out.println("Linkedlist:" + ll);
        }
    }
}