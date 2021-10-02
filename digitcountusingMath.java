import java.util.Scanner;
public class digitcountusingMath {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Number of digits in Integer is :" +(int)(Math.log10(num)+1));

    }
    
}