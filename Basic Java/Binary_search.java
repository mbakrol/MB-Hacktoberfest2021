//package basic_package;

import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int [] arr = new int[n];
        int i;
        System.out.println("Enter "+ n + " element of array: ");
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the value to search: ");
        int value = input.nextInt();

        int l = 0, r = n-1, mid = ((l+r)/2);
        while (l <= r) {
            if (arr[mid] == value) {
                System.out.println("element found at pos: " + (mid+ 1));
                break;
            } else if (arr[mid] < value)
                l = mid + 1;
            else
                r = mid - 1;
            mid = ((l+r)/2);
        }
        if (l > r)
            System.out.println("Element not found! ");
    }
}