class Solution {
    public int stringToNumber(String str) {
        int first_digit = str.charAt(0) - '0';
        int second_digit = str.charAt(1) - '0';
        int age = (first_digit * 10) + second_digit;
        return age;
    }

    public int countSeniors(String[] details) {
        int count = 0;

        for (String str : details) {
            String age = str.substring(11, 13);
            if (stringToNumber(age) > 60)
                count++;
        }

        return count;
    }
}