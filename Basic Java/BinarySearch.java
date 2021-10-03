import java.util.*;
public class BinarySearch {
	
	 			// ITAERATIVE APPROACH
	static int binarySearch (int arr[], int start, int end, int ele) {
		while (start<=end)
		{
			int mid = start+(end-start)/2;
			if (arr[mid]==ele)
				return mid;
			else if (arr[mid]<ele)
				start=mid+1;
			else 
				end=mid-1;
		}
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int arr [] = {2,23,45,67,78,89};
		System.out.println("Enter Target");
		int target = sc.nextInt();
		int index = binarySearch(arr,0,arr.length-1,target);
		if (index != -1)
			System.out.println("Element found at index "+index);
		else 
			System.out.println("Element not found");
	}

	
	             
	
	
					// RECURSIVE APPROACH
	
//	static int binarySearch (int arr[], int start, int end, int target)
//	{
//		if (start<=end)
//		{
//			int mid = start+(end-start)/2;
//			if (arr[mid]<target)
//				return binarySearch(arr,mid+1,end,target);
//			else if (arr[mid]>target)
//				return binarySearch(arr,start,mid-1,target);
//			else 
//				return mid;
//		}
//		return -1;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		int arr [] = {2,23,45,67,78,89};
//		System.out.println("Enter Target");
//		int target = sc.nextInt();
//		int index = binarySearch(arr,0,arr.length-1,target);
//		if (index != -1)
//			System.out.println("Element found at index "+index);
//		else 
//			System.out.println("Element not found");
	
}

