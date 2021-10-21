class Solution {
    static int maxSum(int arr[], int n, int k)
    {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int current_sum = 0;
            for (int j = 0; j < k; j++)
                current_sum = current_sum + arr[i + j];
            max_sum = Math.max(current_sum, max_sum);
        }
 
        return max_sum;
    }
    public static void main(String[] args)
    {
        int arr[] = { 12, 41, 24, 10, 2, 3, 14, 50, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}
