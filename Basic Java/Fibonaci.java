import java.util.Scanner;


public class fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int n1=0;
		int n2= 1;
		int n3;
		
		System.out.println(n1);
		System.out.println(n2);
		while((n1+n2)<=n)
		{
			n3 = n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
			
		}
		

	}

}
