class Solution {
    public static int maximumElement(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i) > max){
                max = arr.get(i);
            }
        }
        return max;
    }

    public static int minimumElement(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for(int i=1; i<arr.size(); i++){
            if(arr.get(i) < min){
                min = arr.get(i);
            }
        }
        return min;
    }
}
