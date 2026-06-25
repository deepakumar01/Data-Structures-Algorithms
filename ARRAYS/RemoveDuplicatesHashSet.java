package ARRAYS;
import java.util.ArrayList;
import java.util.HashSet;
class RemoveDuplicatesHashSet {
    static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(!set.contains(num)){
                set.add(num);
                list.add(num);
            }
        }
        return list;


    }
    public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 1, 4, 3, 5, 5, 4, 2};
        for (Integer num : removeDuplicates(arr)) {
            System.out.print(num + " ");
        }
    }
}