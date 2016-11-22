import java.util.Scanner;

/** Class ArrayDequeTest **/
public class ArrayDequeTest
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Array Deque Test\n");
 
        DequeArray ad = new DequeArray();
 
        char ch;
        /*  Perform Array Deque operations */
        do    
        {
            System.out.println("\nArray Deque Operations\n");
            System.out.println("1. add");
            System.out.println("2. get");
            System.out.println("3. set");
            System.out.println("4. remove");
            System.out.println("5. check empty");
            System.out.println("6. clear");
            System.out.println("7. size");
 
            int choice = scan.nextInt();            
            switch (choice) 
            {
            case 1 : 
                System.out.println("Enter index and element");
                ad.add(scan.nextInt(), scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter index");
                System.out.println("Result : "+ ad.get(scan.nextInt() ));
                break;        
            case 3 : 
                System.out.println("Enter index and element");
                ad.set(scan.nextInt(), scan.nextInt() );  
                break; 
            case 4 : 
                System.out.println("\nEnter index");
                ad.remove(scan.nextInt() );  
                break;        
            case 5 : 
                System.out.println("\nEmpty Status : "+ ad.isEmpty());
                break;                                                  
            case 6 : 
                System.out.println("\nArray Deque Cleared");
                ad.clear();
                break;    
            case 7 : 
                System.out.println("\nSize = "+ ad.getSize() );
                break;         
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }   
            /** print array deque **/
            ad.display();             
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');  
    }
}
