package ARRAYS;

class Solution {
    public static int missingNum(int arr[]) {
        // Using XOR Operation
        int n = arr.length+1;
        int xor1 = 0, xor2 = 0;
        for(int i=0;i<n-1;i++){
            xor2 ^= arr[i];
        }
        for(int i=1;i<=n;i++){
            xor1 ^= i;
        }
        return xor1^xor2;

        // Using Sum of n terms Formula
        // long n = arr.length+1;
        // long sum = 0;
        // long sumN = 0;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        // }
        // sumN += n*(n+1)/2;
        // return (int)(sumN-sum);

        //Using Hash Array
        // int n = arr.length+1;
        // int[] hash = new int[n+1];
        // for(int i=0;i<n-1;i++){
        //     hash[arr[i]]++;
        // }
        // for(int i=1;i<=n;i++){
        //     if(hash[i]==0) return i;
        // }
        // return -1;

        // Brute force approach
        // int n = arr.length+1;
        // for(int i=1;i<=n;i++){
        //     boolean found = false;
        //     for(int j=0;j<n-1;j++){
        //         if(arr[j]==i){
        //             found=true;
        //             break;
        //         }
        //     }
        //     if(!found) return i;
        // }
        // return -1;

        //My approach with sorting implementaion
        // Arrays.sort(arr);
        // int n = arr.length;
        // if (arr[0] != 1)
        //     return 1;

        // for (int i = 0; i < n - 1; i++) {
        //     if (arr[i + 1] - arr[i] > 1) {
        //         return arr[i] + 1;
        //     }
        // }
        // return n + 1;
    }
}
public class MissingNumberArray {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println("Missing Number: " + Solution.missingNum(arr));
    }
}