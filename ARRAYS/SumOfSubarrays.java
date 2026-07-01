package ARRAYS;
class SumOfSubArrays{
    static int subarraySum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i] * (i+1)*(n-i);
        }
        return sum;

        // O(n2) approach
        // int n = arr.length;
        // int sum = 0;
        // for(int i = 0; i < n; i++) {
        //     int currSum = 0;
        //     for(int j = i; j < n; j++) {
        //         currSum += arr[j];
        //         sum += currSum;
        //     }
        // }
        // return sum;

        // Brute force approach
        // int sum = 0;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         for(int k=i;k<=j;k++){
        //             sum += arr[k];
        //         }
        //     }
        // }
        // return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2};
        System.out.println(subarraySum(arr));
    }
}