//use to find the maximun number in array
public class FindMaxArray {
    public static void main(String[] args) {
        int[] arr = {10,1,2500,12,45,23,100,150};
        int max = arr[0];
        for(int a:arr){
            if(max<a){
                max = a;
            }
        }
        System.out.println(max);
    }
}