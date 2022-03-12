
package basic_package;
import java.util.*;
public class swaping_numbers{
    public static void main(String[] args) {int a;
     int b;
    int c;
    Scanner sc = new Scanner(System.in);
     //Scan Number
        System.out.println("Enter the value of A and B");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Numbers Which Wanna User Swap: "+a +"  "+ b);
        c = a; a = b; b = c;
        System.out.println("After swapping: "+a +"   " + b); System.out.println( );
    }
}