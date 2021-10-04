import java.util.Scanner;
class SwapNumbers{
public static void main(String[] args){
  Scanner sc = new Scanner (System.in);
  System.out.println("enter your first number: ");
  int n1=sc.nextInt();
  System.out.println("enter your second number: ");
  int n2=sc.nextInt();
  int temp = n1;
  n1=n2;
  n2=temp;
  System.out.println("after swapping your first number is: "+n1);
  System.out.println("after swapping your second number is: "+n2);
}
}
