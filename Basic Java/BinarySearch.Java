import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args)
	{
		int arr[] = { 10, 20, 15, 22, 35, 50, 60 };
		Arrays.sort(arr);
		int key = 22;
		int res = Arrays.binarySearch(arr, key);
		if (res >= 0)
			System.out.println(key + " found at index = " + res);
		else
			System.out.println(key + " Not found");
		key = 40;
		res = Arrays.binarySearch(arr, key);
		if (res >= 0)
			System.out.println(key + " found at index = " + res);
		else
			System.out.println(key + " Not found");
	}
}
