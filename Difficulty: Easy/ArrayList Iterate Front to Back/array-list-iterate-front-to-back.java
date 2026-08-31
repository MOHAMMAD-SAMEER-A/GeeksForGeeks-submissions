class Solution {

    public static void iterateArrayList(Iterator iterator) {
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}