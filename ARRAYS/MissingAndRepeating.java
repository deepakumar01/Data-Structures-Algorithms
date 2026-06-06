package ARRAYS;

import java.util.ArrayList;

class MissingAndRepeating {
    static ArrayList<Integer> findTwoElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        // Brute Force Approach
        int repeating = -1;
        int missing = -1;
        int n = arr.length;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                repeating = i;
            } 
            else if (count == 0) {
                missing = i;
            }
        }
        list.add(repeating);
        list.add(missing);
        return list;

        // By Hash Array
        // ArrayList<Integer> list = new ArrayList<>();
        // int n = arr.length;
        // int repeating = -1;
        // int missing = -1;
        // int[] freq = new int[n+1];
        // for(int i=0;i<n;i++){
        //     freq[arr[i]]++;
        // }
        
        // for(int i=1;i<=n;i++){
        //     if(freq[i]==0) missing = i;
        //     else if(freq[i]==2)  repeating = i;
        //     // Stop the loop once both the missing and repeating numbers are identified
        //     if(missing != -1 && repeating != -1){
        //         break;
        //     }
        // }
        // list.add(repeating);
        // list.add(missing);
        // return list;

        
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3};
        ArrayList<Integer> ans = findTwoElement(arr);

        System.out.println(ans.get(0) + " " + ans.get(1));
    }
}
