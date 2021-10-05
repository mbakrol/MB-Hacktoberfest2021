import java.util.Scanner;
 
class Main
{
   public static void main(String args[])
   {
      int a, b;
      System.out.print("Enter two numbers: ");
      Scanner sc = new Scanner(System.in);
 
      a = sc.nextInt();
      b = sc.nextInt();
 
      System.out.println("Before swapping: a = "+a+" and b = "+b);
 
      a = a + b;
      b = a - b;
      a = a - b;
 
      System.out.println("After swapping: a = "+a+" and b = "+b);
   }
}