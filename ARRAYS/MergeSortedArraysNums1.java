package ARRAYS;
import java.util.Arrays;
public class MergeSortedArraysNums1 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = 0;
        while (left >= 0 && right < n) {
            if (nums1[left] > nums2[right]) {
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;right++;
            } else {
                break;
            }
        }
        // Sort the valid parts of both arrays
        Arrays.sort(nums1, 0, m);
        Arrays.sort(nums2);
        // Put nums2 elements into the empty spaces of nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        //Optimal approach using three pointer approach
        // int i = m - 1;
        // int j = n - 1;
        // int k = m + n - 1;
        // while (i >= 0 && j >= 0) {
        //     if (nums1[i] > nums2[j]) {
        //         nums1[k--] = nums1[i--];
        //     } else {
        //         nums1[k--] = nums2[j--];
        //     }
        // }
        // while (j >= 0) {
        //     nums1[k--] = nums2[j--];
        // }


        // Brute force approach using extra space array of size m+n
        // int[] temp = new int[m + n];
        // int left = 0;
        // int right = 0;
        // int index = 0;
        // while (left < m && right < n) {
        //     if (nums1[left] <= nums2[right]) {
        //         temp[index] = nums1[left];
        //         left++;index++;
        //     } else {
        //         temp[index] = nums2[right];
        //         right++;index++;
        //     }
        // }
        // while (left < m) {
        //     temp[index++] = nums1[left++];
        // }
        // while (right < n) {
        //     temp[index++] = nums2[right++];
        // }
        // for (int i = 0; i < m + n; i++) {
        //     nums1[i] = temp[i];
        // }
        // // if you need to put elements in nums1 and nums2 separately
        // for(int i=0;i<m+n;i++){
        //     if(i<m) nums1[i] = nums3[i];
        //     else nums2[i-m] = nums3[i];
        // }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}