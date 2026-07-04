package ARRAYS;
import java.util.ArrayList;

public class KLargestElements {
    static ArrayList<Integer> KLargest(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        ArrayList<Integer> list = KLargest(arr, k);
        for(int ele : list){
            System.out.println(ele+" ");
        }
    }
}
