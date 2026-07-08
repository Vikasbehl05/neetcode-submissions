class Solution {
    public int[] getConcatenation(int[] nums) {
        int numslength = nums.length;
        int n = numslength * 2;
        int[] result = new int[n];
        for (int i = 0; i < numslength; i++) {
            result[i] = nums[i];
        }

        for (int i = numslength; i < n; i++) {
            result[i] = nums[i - numslength];
        }

        return result;
    }
}