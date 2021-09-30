/*
program to demonstrate the keyboard buffer full problem and solution to avoid that problem
AIM :: Knowing working of input buffer in java
 */
package basic_package;
import  java.util.Scanner;

public class input_buffer {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("\nenter your age :: ");
        int age = sc.nextInt(); // taking age of user

        System.out.print("\nenter your salary :: ");
        float sal = sc.nextFloat(); // taking salary of user

        sc.nextLine(); // emptying the input buffer  (which is having two new line characters )

        /*
         because as user inputted age and hit enter the \n character get stored in the buffer.
          next user asked to input salary ,
          but it doesn't effected the nextFloat , because nextFloat is designed to skip any leading \n character
          next user asked to input name ,
          but nextLine reads the leading \n character and considered it as input (it can't skip the \n )
          so user cant input name and nextLine terminated :(
          so to avoid this kind of mistakes we have to empty the buffer :)
         */

        System.out.print("\nenter your name :: "); // now the buffer is empty
        String name = sc.nextLine(); // taking name of user

        System.out.println("\nHello " + name + " your age is : " + age + " & your salary is : " + sal);
    }
}
