/*Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer
 range [-231, 231 - 1], then return 0.
 Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Constraints:
-231 <= x <= 231 - 1
*/
import java.util.*;
public class reverse_integer {
    public static int reverse(int x){
        int result = 0;
        while(x!=0)
        {
            int lsb = x%10;// We will get the Rightmost digit
            int newResult = result*10+lsb; //0+1
            if((newResult-lsb)/10!=result) //if(1-1=0)
            {return 0;}
            result = newResult; // 1
            x = x/10;  // 321/10 = 32; 32/10 = 3 // 3/10 = 0
        }return result;
       
    }
    public static void main(String[] args) {
        int x = 321;
        System.out.println(reverse(x));

    }
}
