class Solution {
    static ArrayList<Integer> getSum(int N) {
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0;i<=N; i++){
            if(i%2==0){
                evenSum += i;
            } else {
                oddSum += i;
        }
    }
    ArrayList<Integer> result = new ArrayList<>();
    result.add(evenSum);
    result.add(oddSum);
    return result;
    }
}