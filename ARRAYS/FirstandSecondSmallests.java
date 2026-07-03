package ARRAYS;
import java.util.ArrayList;
public class FirstandSecondSmallests {
    public static ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i]!=smallest){
                secondSmallest = arr[i];
            }
        }
        if(secondSmallest==Integer.MAX_VALUE){
            list.add(-1);
            return list;
        }
        list.add(smallest);
        list.add(secondSmallest);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {12, 25, 8, 55, 10, 33, 17, 11};
        ArrayList<Integer> res = minAnd2ndMin(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
