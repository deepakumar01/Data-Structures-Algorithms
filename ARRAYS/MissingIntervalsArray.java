package ARRAYS;
import java.util.*;
class MissingIntervalsArray {
    static List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;
        // Check for missing range before the first element
        if(lower<arr[0]){
            list.add(Arrays.asList(lower,arr[0]-1));
        }
        // Check for missing ranges between consecutive elements
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]>1){
                list.add(Arrays.asList(arr[i]+1,arr[i+1]-1));
            }
        }
        // Check for missing range after the last element
        if(upper>arr[n-1]){
            list.add(Arrays.asList(arr[n-1]+1,upper));
        }
        return list;
    }

    public static void main(String[] args) {
        int lower = 10;
        int upper = 50;
        int[] arr = {14, 15, 20, 30, 31, 45};
        List<List<Integer>> res = missingRanges(arr, lower, upper);
        for (List<Integer> range : res) {
            System.out.println(range.get(0) + " " + range.get(1));
        }
    }
}