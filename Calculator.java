import java.util.Scanner;

class Calc{
	int a;
	int b;
	int result;
	 
	public void add()
	{
		result=a+b;
	}
	 public void sub()
	{
		if(a>b) {
			result=a-b;
		}
		else {
			result=b-a;
		}
	}
	public void mul()
	{
		result=a*b;
	}
	public void divide()
	{
		result=a%b;
	}
	public void clear()
	{
		result=0;
	}
}


public class Calculator {
	public static void main(String[] args)
	{
		@SuppressWarnings({ "unused", "resource" })
		Scanner input=new Scanner(System.in);
		Calc obj;
		obj=new Calc();
		System.out.println("Enter your first number");
		obj.a=input.nextInt();
		System.out.println("Enter your second number");
		obj.b=input.nextInt();
		
		
		System.out.println(" 1. For Addition");
		System.out.println(" 2. For Substraction");
		System.out.println(" 3. For Multiplication");
		System.out.println(" 4. For Division");
		System.out.println(" 5. For clear");
		System.out.println("Enter your choice");
		int n=input.nextInt();
	   switch(n)
	   {
	   case 1: obj.add();
	   System.out.println(obj.result);
	   break;
	   
	   case 2: obj.sub();
	   System.out.println(obj.result);
	   break;
	   
	   case 3: obj.mul();
	   System.out.println(obj.result);
	   break;
	   
	   case 4: obj.divide();
	   System.out.println(obj.result);
	   break;
	   
	   case 5: obj.clear();
	   System.out.println(obj.result);
	   break;
	   }
	}
}
