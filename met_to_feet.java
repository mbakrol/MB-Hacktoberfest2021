/*
program to convert meter into feet
PRACTICE :: Basic Maths
 */
package basic_package;
import  java.util.Scanner;

public class m_to_feet {

    public static void main(String[] args){

        System.out.print("\nenter the meter to convert it into feet: ");

        Scanner ip = new Scanner(System.in);
        float m = ip.nextFloat(); // getting the input in the meter

        System.out.println(m + " meter " + "= " + (m * 3.28084) + " feet "); // 1 meter = 3.28084 feet so multiplying this value in the user given meter

    }
}
