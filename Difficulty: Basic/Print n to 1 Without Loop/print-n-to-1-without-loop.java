class Solution {
    void printNos(int n) {
        if(n<=0){
            return;
        }
        System.out.print(n+" ");
        printNos(n-1);
    }
}