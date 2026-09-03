class Solution {
    public static int[] decrementArray(int[] arr, int n) {
        for(int i=0; i<n; i++){
            arr[i]-=1;
        }
        return arr;
    }
}