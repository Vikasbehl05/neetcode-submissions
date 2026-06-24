class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcount = 0;
        for (int n : nums) {
            if (n == 1)
                count++;
            if (n == 0) {
                count = 0;
            }
            if (count > maxcount) {
                maxcount = count;
            }
        }
        // if(count > maxcount)
        // maxcount = count;

        return maxcount;
    }
}