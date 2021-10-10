import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
   /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = new QuickSort().partition(arr, low, high);
            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
class QuickSort
{
    static int partition(int arr[], int low, int high)
    {
      int pivot = arr[high];
    int i = low-1;

    int temp1 = 0, temp2 = 0;
    
    for(int j = low; j < high; j++)
    {
        if( arr[j] < pivot )
        {
            i++;
            // swap i and jth element of array
            temp1 = arr[j];
            arr[j] = arr[i];
            arr[i] = temp1;
        }
    }
    
        temp2 = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp2; 
  
    return(i+1);
}

}


