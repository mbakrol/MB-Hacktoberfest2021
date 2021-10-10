
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int i;
		    for(i=x;i<=y && i!=1;i*=x);
		    
		    if((i/x)==y)
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}
