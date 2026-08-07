package ARRAYS;
import java.util.ArrayList;
import java.util.Arrays;
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        //With extra space using array
        // int[] temp = new int[m+n];
        // int i=0,j=0;
        // int index=0;
        // while(i<m && j<n){
        //     if(nums1[i]<=nums2[j]){
        //         temp[index++]=nums1[i];
        //         i++;
        //     }
        //     else{
        //         temp[index++]=nums2[j];
        //         j++;
        //     }
        // }
        // while(i<m){
        //     temp[index++]=nums1[i];
        //     i++;
        // }
        // while(j<n){
        //     temp[index++]=nums2[j];
        //     j++;
        // }
        // int idx=0;
        // for(int k=0;k<temp.length;k++){
        //     nums1[idx++] = temp[k];
        // }

        //With extra space using ArrayList
        // ArrayList<Integer> list = new ArrayList<>();
        // int i=0,j=0;
        // while(i<m && j<n){
        //     if(nums1[i]<=nums2[j]){
        //         list.add(nums1[i]);
        //         i++;
        //     }
            
        //     else{
        //         list.add(nums2[j]);
        //         j++;
        //     }
            
        // }
        // while(i<m){
        //     list.add(nums1[i]);
        //     i++;
        // }
        // while(j<n){
        //     list.add(nums2[j]);
        //     j++;
        // }
        // int idx = 0;
        // for(int nums:list){
        //     nums1[idx++] = nums;
        // }

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