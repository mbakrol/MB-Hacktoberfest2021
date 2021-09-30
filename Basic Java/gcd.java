/*
program to take 2 numbers from user and calculate basic_package.gcd of both the numbers
PRACTICE :: Basic Maths
 */

package basic_package;
import java.util.Scanner;

public class gcd {

    public static void main(String[] args) {

        System.out.print("Enter two numbers to get GCD :: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("GCD of " + n1 + " and " + n2 + " is :: " + GCD(n1, n2));
    }

    /**
     * method to calculate greatest common divisor
     *
     * @param n1 for storing first number
     * @param n2 for storing second number
     * @return the basic_package.gcd of both the numbers
     */
    public static int GCD(int n1, int n2) {
        int gcd = 1; // initial basic_package.gcd is 1 (1 can divisible any numbers )
        int k = 2; // Possible basic_package.gcd (1 is already assumed ) so starting / checking form 2 to till n1

        while (k <= n1 && k <= n2) { // checking all the possibility from 2 to n1 for finding greatest cd
            if (n1 % k == 0 && n2 % k == 0) // if successfully divisible by both number then that number is common divisor (cd)
                gcd = k;
            k++;
        }
        return gcd;
    }
}