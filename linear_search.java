import java.util.*;
public class linearsearch{
	public int search(int arr[], int x)
	{
		int n = arr.length;
		for (int i = 0; i < n; i++){
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	public static void main(String args[])
	{
        Scanner s = new Scanner(System.in);
        int n = s.nextInt ();
		int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int num = s.nextInt ();

		linearsearch obj= new linearsearch();
        int find=obj.search(arr,num);
        if(find==-1){
            System.out.println("Element not found in given array");
        }
        else{
            System.out.println("Element is present at index "+find);
        }
	}
}