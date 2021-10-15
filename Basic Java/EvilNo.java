import java.util.*;
class EvilNo
{
	static int n;
	public EvilNo(int nn)
	{
		n=nn;
	}
	long DecToBin(int x)
	{
        if (x==0)
            return 0;
        else
        	return x%2+10*DecToBin(x/2);
	}
	int countOfOnes(int x)
	{
		int c=0;
		while(x!=0)
		{
			c++;
			x/=10;
		}
	}
	void checkEvil()
	{

	}
	public static void main(String args[])
	{
		EvilNo obj=new EvilNo(9);

	}
}
