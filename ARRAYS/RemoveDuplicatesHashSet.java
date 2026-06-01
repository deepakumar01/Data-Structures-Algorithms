import java.util.ArrayList;
import java.util.HashSet;
class RemoveDuplicatesHashSet {
    static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        
        for(int num : arr){
            if(!seen.contains(num)){
                seen.add(num);
                result.add(num);
            }
        }
        return result;
    }
    public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 1, 4, 3, 5, 5, 4, 2};
        for (Integer num : removeDuplicates(arr)) {
            System.out.print(num + " ");
        }
    }
}