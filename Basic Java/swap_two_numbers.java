import java.util.*;

public class swap_two_numbers
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    int first=0, second=0, temp=0; // Declare variables
	    
		System.out.print("Enter first number: "); // Display message for user.
		first = scan.nextInt(); // Taking input from user.
		
		System.out.print("Enter second number: "); // Display message for user.
		second = scan.nextInt(); // Taking input from user.
		
		System.out.print("First: "+first); // Display first number.
		System.out.println();
		System.out.print("Second: "+second); // Display second number.
		
        // Swap two numbers
		temp = first;
		first = second;
		second = temp;
		
		System.out.println("\n");
		System.out.print("First: "+first); // Display second number.
		System.out.println();
		System.out.print("Second: "+second); // Display first number.
		
	}
}
