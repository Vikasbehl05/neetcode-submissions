class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int next = start + 1;

        while(next < nums.length){
            if(nums[start] == nums[next]){
                return true;
            }
            next++;
            start++;
        }
        return false;
    }
}