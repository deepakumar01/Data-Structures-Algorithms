package ARRAYS;

// import java.util.HashMap;
// import java.util.Map;

public class MajorityElement {
    static int majorityElement(int[] nums) {

        // Optimal approach using Moore's Voting Algorithm
        int n = nums.length;
        // Count variable
        int cnt = 0;
        // Candidate element
        int el = 0;
        // Step 1: Find the potential majority element
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        // Step 2: Verify the candidate
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }
        // Return the element if it's a majority
        if (cnt1 > (n / 2)) {
            return el;
        }
        // No majority found
        return -1;

        // Better approach using HashMap
        // int n = nums.length;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num:nums){
        //     map.put(num, map.getOrDefault(num,0)+1);
        // }

        // for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        //     if(entry.getValue()>n/2){
        //         return entry.getKey();
        //     }
        // }
        // return -1;

        // Brute force approach
        // int n = numss.length;
        // for(int i=0;i<n;i++){
        //     int count = 0;
        //     for(int j=0;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>n/2) return nums[i];
        // }
        // return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 3, 5, 1};
        System.out.println(majorityElement(nums));
    }
}
