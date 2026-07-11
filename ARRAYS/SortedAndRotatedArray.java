package ARRAYS;
public class SortedAndRotatedArray {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[(i+1)%n]<nums[i]){
                count++;
            }
            if(count>1) return false;
        }
        return true;

        //Brute Force Approach
        // int n = nums.length;
        // int[] temp = nums.clone();
        // Arrays.sort(temp);
        // for (int r = 0; r < n; r++) {
        //     boolean isSorted = true;
        //     for (int i = 0; i < n; i++) {
        //         if (temp[i] != nums[(i + r) % n]) {
        //             isSorted = false;
        //             break;
        //         }
        //     }
        //     if (isSorted) {
        //         return true;
        //     }
        // }
        // return false;
    }

    public static void main(String[] args) {
        SortedAndRotatedArray obj = new SortedAndRotatedArray();
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 1, 3, 4};
        System.out.println(obj.check(nums1)); // true
        System.out.println(obj.check(nums2)); // false
    }
}