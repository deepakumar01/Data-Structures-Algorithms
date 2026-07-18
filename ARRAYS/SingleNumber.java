package ARRAYS;

// import java.util.HashMap;
// import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {

        //Using XOR
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans ^=nums[i];
        }
        return ans;

        // Using HashMap
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num:nums){
        //     map.put(num, map.getOrDefault(num, 0)+1);
        // }
        // for(int num:nums){
        //     if(map.get(num)==1){
        //         return num;
        //     }
        // }
        // return -1;

        // Using HashMap my approach
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num:nums){
        //     map.put(num, map.getOrDefault(num,0)+1);
        // }
        // for(Map.Entry<Integer,Integer> e:map.entrySet()){
        //     if(e.getValue()==1) return e.getKey();
        // }
        // return -1;

        // Brute force approach
        // for (int i = 0; i < n; i++) {
        //     int count = 0;

        //     for (int j = 0; j < n; j++) {
        //         if (nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }
        //     if (count == 1) {
        //         return nums[i];
        //     }
        // }
        // return -1;

        // Using hash array but does not work on neg and large numbers
        // int n = nums.length;
        // int maxi = nums[0];
        // for(int i=0;i<n;i++){
        //     maxi = Math.max(maxi,nums[i]);
        // }
        // int[] hash = new int[maxi+1];
        // for(int i=0;i<n;i++){
        //     hash[nums[i]]++;
        // }
        // for(int i=0;i<n;i++){
        //     if(hash[nums[i]]==1){
        //         return nums[i];
        //     }
        // }
        // return -1;

        //Using hash array works on neg numbers
        // int min = nums[0], max = nums[0];
        // for (int num : nums) {
        //     min = Math.min(min, num);
        //     max = Math.max(max, num);
        // }
        // int offset = -min;
        // int[] hash = new int[max - min + 1];
        // for (int num : nums) {
        //     hash[num + offset]++;
        // }
        // for (int num : nums) {
        //     if (hash[num + offset] == 1) {
        //         return num;
        //     }
        // }
        // return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};

        int result = singleNumber(arr);

        System.out.println("Single Number: " + result);
    }
}