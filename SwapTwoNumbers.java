package basicjava;
import java.util.*;

public class SwapTwoNumbers {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int a = sc.nextInt();
	System.out.println("a = " + a);
	System.out.println("Enter the second number: ");
	int b = sc.nextInt();
	System.out.println("b = " + b);
	int temp = a;
	a = b;
	b = temp;
	System.out.println("The swapped numbers are " + "a = " + a + " " + "b = " + b);
	sc.close();
	}
}
