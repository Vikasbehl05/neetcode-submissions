class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int resultmax = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = resultmax;
            resultmax = Math.max(resultmax, arr[i]);
        }
        return result;
    }
}