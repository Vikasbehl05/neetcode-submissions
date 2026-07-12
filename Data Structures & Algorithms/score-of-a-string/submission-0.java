class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int n = s.length();
        int difference = 0;

        for (int i = 0; i < n - 1; i++) {
            difference = Math.abs((int) s.charAt(i + 1) - (int) s.charAt(i));
            sum = sum + difference;
        }

        return sum;
    }
}