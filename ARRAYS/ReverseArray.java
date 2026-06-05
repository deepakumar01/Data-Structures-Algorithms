package ARRAYS;
class ReverseArray {

    static void reverseArray(int arr[]) {
        int n = arr.length;
        int l = 0, r = n-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;r--;
        }

        // OR
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        
        // OR
        int[] temp = new int[n];
        for (int i = 0; i < n; i++)
            temp[i] = arr[n - i - 1];
        // Copy elements back to original array
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];

        // OR
        // import java.util.ArrayList;
        // import java.util.Arrays;
        // import java.util.Collections;
        // import java.util.List;

        // Collections.reverse(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }
}