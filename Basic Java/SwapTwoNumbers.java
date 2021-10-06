//Java Program to Swap two numbers using a temporary variable
import java.util.*; 
public class Main
{
     public static void main(String []args)
     {
        //Take input from the user
        //Create an instance of the Scanner Class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        System.out.println("Before Swapping numbers are: ");
        System.out.println("The first Number is "+num1);
        System.out.println("The second Number is "+num2);
        //Use a temporary variable to swap the numbers
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping numbers are: ");
        System.out.println("The first Number is "+num1);
        System.out.println("The second Number is "+num2);
     }
}
