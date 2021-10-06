import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b");
		int a =sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swaping\na= "+a+"\nb= "+b);
		System.out.println("Which way do you want to sway \n1.using third variable\n2.without 3rd variable");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:int c=a;
		a=b;
		b=c;
		System.out.println("After swaping a= "+a+"\nb= "+b);
	 break;
		case 2: 
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("After swaping a= "+a+"\nb= "+b);
			break;
			default: System.out.println("Invalid option");
		}
	}
}
