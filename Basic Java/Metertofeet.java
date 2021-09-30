// This is a Java program which converts meter length to feet and Inches   
import java.io.*;   
class convert {   
static double Conversion_length(double meter)   
{   
double inch, feet;  
inch  = 39.37 * meter;   
feet = 3.281 * meter;   
System.out.printf("The value of 20 meter in Inches is: %.2f \n", inch);   
System.out.printf("The value of 20 meter in Feet is: %.2f", feet);   
return 0;   
}    
public static void main(String args [])   
{   
Double meter = 20;   
Conversion_length(meter);   
}  
}  
