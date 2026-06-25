package ARRAYS;
import java.util.ArrayList;
class RemoveDuplicates {
    static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr.length == 0) return result;
        //To avoid error index 0 out of bound for result.add(arr[0]);
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
        // you used Integer, not int, because:
        // ArrayList can only store objects, not primitives
        // int is a primitive type
        // Integer is the wrapper class for int
        // ✅ Best practice here
        // Both are fine:
        // for (Integer num : list)
        // or
        // for (int num : list)
        // Java will handle conversion automatically.
    }
}