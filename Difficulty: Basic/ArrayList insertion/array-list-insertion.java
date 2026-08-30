class Solution {
    public static ArrayList<Integer> fillArrayList(int arr[]){
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            list.add(arr[i]);
        }
        return list;
    }
}