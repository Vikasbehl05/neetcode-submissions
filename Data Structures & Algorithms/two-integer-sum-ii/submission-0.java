class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int begin = 0;
        int end = numbers.length - 1;

        int[] result = new int[2];

        while(begin < end){
            if(numbers[begin] + numbers[end] == target){
                result[0] = begin + 1;
                result[1] = end + 1;
                break;
            }
            if(numbers[begin] + numbers[end] < target){
                begin++;
            }else if(numbers[begin] + numbers[end] > target){
                end--;
            }
        }

        return result;
        
    }
}
