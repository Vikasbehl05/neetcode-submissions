class Solution {
    // public int power(int num, int power)
    // {
    //     int result = 1;
    //     while (power != 0){
    //         result = result * num;
    //         power--;
    //     }

    // }

    public int[] plusOne(int[] digits) {
        for (int j = digits.length - 1; j >= 0; j--) {
            if (digits[j] < 9) {
                digits[j]++;
                return digits;
            } else {
                digits[j] = 0;
            }
        }

        int[] newdigits = new int[digits.length + 1];
        // newdigits = digits;
        newdigits[0] = 1;
        return newdigits;
    }
}
