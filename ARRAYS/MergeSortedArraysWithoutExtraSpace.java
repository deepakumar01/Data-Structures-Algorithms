package ARRAYS;

import java.util.Arrays;

public class MergeSortedArraysWithoutExtraSpace {
    public void mergeArrays(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int left = m - 1;
        int right = 0;
        while (left >= 0 && right < n) {
            if (a[left] > b[right]) {
                int temp = a[left];
                a[left] = b[right];
                b[right] = temp;

                left--;
                right++;
            } else {
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        
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
        // for(int i=0;i<m+n;i++){
        //     if(i<m) nums1[i] = nums3[i];
        //     else nums2[i-m] = nums3[i];
        // }


        // Optimal approach using shell sort and gap method
        // private void swapIfGreater(int[] a, int[] b, int ind1, int ind2) {
        //     if (a[ind1] > b[ind2]) {
        //         int temp = a[ind1];
        //         a[ind1] = b[ind2];
        //         b[ind2] = temp;
        //     }
        // }
        // public void mergeArrays(int[] a, int[] b) {
        //     int n = a.length;
        //     int m = b.length;
        //     int len = n + m;
        //     // Initial gap
        //     int gap = (len / 2) + (len % 2);
        //     while (gap > 0) {
        //         int left = 0;
        //         int right = left + gap;
        //         while (right < len) {
        //             // Both elements are in a[]
        //             if (left < n && right < n) {
        //                 swapIfGreater(a, a, left, right);
        //             }
        //             // Left element in a[], right element in b[]
        //             else if (left < n && right >= n) {
        //                 swapIfGreater(a, b, left, right - n);
        //             }
        //             // Both elements are in b[]
        //             else {
        //                 swapIfGreater(b, b, left - n, right - n);
        //             }

        //             left++;
        //             right++;
        //         }
        //         // Reduce gap
        //         if (gap == 1)
        //             break;
        //         gap = (gap / 2) + (gap % 2);
        //     }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 9, 10, 15, 20};
        int[] b = {2, 3, 8, 13};

        MergeSortedArraysWithoutExtraSpace obj = new MergeSortedArraysWithoutExtraSpace();
        obj.mergeArrays(a, b);

        System.out.println("Array a:");
        for (int ele : a) {
            System.out.print(ele + " ");
        }

        System.out.println();

        System.out.println("Array b:");
        for (int ele : b) {
            System.out.print(ele + " ");
        }
    }
}