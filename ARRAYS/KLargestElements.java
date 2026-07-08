package ARRAYS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {
    static ArrayList<Integer> KLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }

        Collections.sort(ans, Collections.reverseOrder());
        return ans;
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
