import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the element of array: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int value = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (array[i] == value) {
                System.out.println("Element found at pos: " + (i + 1));
                break;
            }
            if (i == n)
                System.out.println("Element not found! ");
        }
    }
}