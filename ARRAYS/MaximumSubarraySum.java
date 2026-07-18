package ARRAYS;
public class MaximumSubarraySum {
    static int maxSubarraySum(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max = Math.max(max,sum);
            if(sum<0) sum = 0;
        }
        return max;

        // Only using two loops both will have same results
        //TC - O(n2)
        // int n = arr.length;
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         max = Math.max(max,sum);
        //     }
        // }
        // return max;

        // My approach using three loops
        //TC - O(n3)
        // int n = arr.length;
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         int sum = 0;
        //         for(int k=i;k<=j;k++){
        //             sum+=arr[k];
        //             max = Math.max(max,sum);
        //         }
        //     }
        // }
        // return max;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}
