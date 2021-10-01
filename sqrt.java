import java.util.*;
public class sqrt {
    public static int sqrtt(int x)
    {
        int start = 1;
        int end = x;
        int res = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid <= x / mid){
                start = mid + 1;
                res = mid;
            }
            else{
                end = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sqrtt(num));
    }
}
