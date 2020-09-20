import java.io.*;
import java.util.*;

public class arraylist
{
     public static void main(String arg[])throws Exception
     {
         ArrayList<Integer> arl = new ArrayList<>();
        
         BufferedReader br= (new BufferedReader(new InputStreamReader(System.in)));
         int ch=0,elmt=0,pos=1;

         while(ch<=5)
         {
            System.out.println("ARRAYlist OPERATION");
            System.out.println("1.INSERT AN ELEMENT");
            System.out.println("2.REMOVE AN ELEMENT");
            System.out.println("3.CHANGE AN ELEMENT");
            System.out.println("4.CONTAINS A ELEMENT");
            System.out.println("5.EXIT");

            
            System.out.println("Enter your choice:");

            ch = Integer.parseInt(br.readLine());

            switch(ch)
            {
                case 1:
                  System.out.println("Enter an element:");
                  elmt = Integer.parseInt(br.readLine());
                  
                  System.out.println("Enter a position you want to insert:");
                  pos = Integer.parseInt(br.readLine());
                  
                  arl.add(pos,elmt);
                  break;

                  case 2:
                 // System.out.println("Enter an element:");
                 // elmt = Integer.parseInt(br.readLine());
                  
                  System.out.println("Enter a position you want to insert:");
                  pos = Integer.parseInt(br.readLine());
                  
                  arl.remove(pos);
                  break;

                  case 3:
                  System.out.println("Enter a position you want to replace:");
                  pos = Integer.parseInt(br.readLine());
                  
                  System.out.println("Enter new element:");
                  elmt = Integer.parseInt(br.readLine());

                  arl.set(pos,elmt);
                  break;
                      

                  case 4:
                  System.out.println("Enter the element you want to check!");
                  elmt=Integer.parseInt(br.readLine());
                  if(arl.contains(elmt))
                    System.out.println("ELEMENT IS PRESENT IN ARRAYLIST!");
                  else
                    System.out.println("ELEMENT is not present in arraylist");

                    break;

               default:
                return;
            }
            System.out.println("ARRAYLIST CONTENT:" +arl);
            System.out.println("SIZE OF ARRAYLIST:" +arl.size());
            System.out.println("\n");
         }


     } 
}