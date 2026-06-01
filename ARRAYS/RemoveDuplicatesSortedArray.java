package ARRAYS;
import java.util.ArrayList;
class RemoveDuplicatesSortedArray {
    static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr.length == 0) return result;
        result.add(arr[0]);
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        for (Integer num : removeDuplicates(arr)) {
            System.out.print(num + " ");
        }
    }
}