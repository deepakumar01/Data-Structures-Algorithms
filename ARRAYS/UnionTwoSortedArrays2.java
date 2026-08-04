package ARRAYS;
import java.util.ArrayList;
import java.util.Arrays;
public class UnionTwoSortedArrays2 {

    static int[] unionArray(int[] nums1, int[] nums2) {

        //Using ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }
                i++;
            }
            else {
                if (list.isEmpty() || list.get(list.size() - 1) != nums2[j]) {
                    list.add(nums2[j]);
                }
                j++;
            }
        }
        while (i < nums1.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                list.add(nums1[i]);
            }
            i++;
        }
        while (j < nums2.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != nums2[j]) {
                list.add(nums2[j]);
            }
            j++;
        }
        int[] ans = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }
        return ans;

        //Using simple array
        // int m = nums1.length;
        // int n = nums2.length;
        // int[] temp = new int[m + n];
        // int i = 0, j = 0, index = 0;
        // while (i < m && j < n) {
        //     if (nums1[i] <= nums2[j]) {
        //         if (index == 0 || temp[index - 1] != nums1[i]) {
        //             temp[index++] = nums1[i];
        //         }
        //         i++;
        //     }
        //     else {
        //         if (index == 0 || temp[index - 1] != nums2[j]) {
        //             temp[index++] = nums2[j];
        //         }
        //         j++;
        //     }
        // }
        // while (i < m) {
        //     if (index == 0 || temp[index - 1] != nums1[i]) {
        //         temp[index++] = nums1[i];
        //     }
        //     i++;
        // }
        // while (j < n) {
        //     if (index == 0 || temp[index - 1] != nums2[j]) {
        //         temp[index++] = nums2[j];
        //     }
        //     j++;
        // }
        // int[] ans = new int[index];
        // for (int k = 0; k < index; k++) {
        //     ans[k] = temp[k];
        // }
        // return ans;

        //My approach using duplicated elements array
        // int n1 = nums1.length;
        // int n2 = nums2.length;
        // int i=0,j=0;
        // int[] temp = new int[n1+n2];
        // int t = 0;
        // while(i<n1 && j<n2){
        //     if(nums1[i]<=nums2[j]){
        //         temp[t] = nums1[i];
        //         t++;i++;
        //     }
        //     else{
        //         temp[t] = nums2[j];
        //         t++;j++;
        //     }
        // }
        // while(i<n1){
        //     temp[t] = nums1[i];
        //     t++;i++;
        // }
        // while(j<n2){
        //     temp[t] = nums2[j];
        //     t++;j++;
        // }
        // if (temp.length == 0) {
        //     return new int[0];
        // }
        // int[] ans = new int[temp.length];
        // int index= 0;
        // ans[index] = temp[0];
        // for(int k=1;k<ans.length;k++){
        //     if(temp[k]!=temp[k-1]){
        //         ans[++index] = temp[k];
        //         //res[index+1] = temp[k]  also be written as
        //     }
        // }
        // return Arrays.copyOf(ans, index + 1);

        // Arrays.copyOf(originalArray, newLength) -> It creates a new array of size newLength and copies the first newLength elements from the original array.
        // creates a new array of exactly the right size, containing only the valid unique elements.
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};
        int[] ans = unionArray(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
}