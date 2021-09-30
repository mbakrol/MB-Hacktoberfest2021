/*
QUESTION :: find the given year is Leap or not
PRACTICE :: if-else , Basic Maths
 */
package basic_package;

import java.util.Scanner;

public class leap_year {

    public static void main(String[] args) {

        System.out.print("Enter the year to check whether it is Leap year or not :: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (isLeapYear(year))
            System.out.println(year + " is a Leap year :)");
        else
            System.out.println(year + " is not a Leap year :(");
    }

    /**
     * method will check the given year is leap or not
     *
     * @param year for storing year value
     * @return boolean value depending on the year passed
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
