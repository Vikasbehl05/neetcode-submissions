class Solution {

    public int result(int n){
        int sum = 0;
        while(n > 0){

            int number = n % 10;
            int square = number * number;
            sum = sum + square;
            n = n / 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {

        HashMap<Integer, Integer> mapresult  = new HashMap<>();
        while (n  > 0) {
            int result = result(n);
            mapresult.put(n, result);
            if (result == 1) {
                return true;
            } else if (mapresult.containsKey(result)) {
                return false;
            }

            n = result;
            result(n);
        }

        return false;

        
    }
}
