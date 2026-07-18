package ARRAYS2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {
    static ArrayList<Integer> KLargest(int[] arr, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        // for (int num : arr) {
        //     pq.offer(num);
        //     if (pq.size() > k) {
        //         pq.poll();
        //     }
        // }

        // ArrayList<Integer> ans = new ArrayList<>();
        // while (!pq.isEmpty()) {
        //     ans.add(pq.poll());
        // }

        // Collections.sort(ans, Collections.reverseOrder());
        // return ans;


        //Brute force using all subarrays sum O(n²)
        // int n = arr.length;
        // int len = 0;
        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum==k)
        //         len = Math.max(len,j-i+1);
        //     }
        // }
        // return len;

        //Brute force using all subarrays O(n³)
        // int n = arr.length;
        // int len = 0;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         int sum = 0;
        //         for(int r=i;r<=j;r++){
        //             sum=sum+arr[r];
        //         }
        //         if(sum==k) len = Math.max(len,j-i+1);
        //     }
        // }
        // return len;
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
