// program to solve fizz buzz problem
// this problem is to print to fizz at the place of the divisible of 3 and print buzz at the divisible of the 5 and print fizzbuzz at the of the both
package basic_package;

public class fizz_buzz_problem {

    public static void main(String[] args) {

        // traditional way (% , * , /  operator take O(n2) time
//        for (int i = 0; i < 100; i++) {
//            if (i % 15 == 0)
//                System.out.println("fizzbuzz");
//            else if (i % 5 == 0)
//                System.out.println("buzz");
//            else if (i % 3 == 0)
//                System.out.println("fizz");
//            else
//                System.out.println(i);

        // optimized solution (++ , -- take O(n) time)
        String output = "";
        int c3 = 0, c5 = 0;
        for (int i = 1; i <= 100; i++) {
            c3++;
            c5++;
            if (c3 == 3) {
                output += "fizz";
                c3 = 0;
            }
            if (c5 == 5) {
                output += "buzz";
                c5 = 0;
            }
            if (output != "") {
                System.out.println(output);
                output = "";
            } else
                System.out.println(i);
        }
    }
}