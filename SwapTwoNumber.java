import java.util.*;  
class SwapTwoNumber {  
    public static void main(String[] args) {  
       int x, y, t;  
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter first value");  
       x = sc.nextInt(); 
       System.out.println("Enter second value");
       y = sc.nextInt();  
       System.out.println("before swapping numbers: "+x +"  "+ y);  
       
       t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping: "+x +"   " + y);  
       System.out.println( );  
    }    
}  
