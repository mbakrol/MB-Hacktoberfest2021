class Solution {

    public int findLength(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;

        int result = 0;

        int[][] lengths = new int[a + 1][b + 1];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                lengths[i][j] = 0;
            }
        }

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    lengths[i][j] = 1 + lengths[i - 1][j - 1];
                    result = Math.max(result, lengths[i][j]);
                }
            }
        }

        return result;
    }
}