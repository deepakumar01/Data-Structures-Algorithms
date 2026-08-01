package ARRAYS;
import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.Collections;
// import java.util.HashSet;
// import java.util.HashMap;
public class MergeUnionSortedArrays {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = a.length;
        int n2 = b.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                if(list.size()==0 || list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                i++;
            }
            else{
                if(list.size()==0 || list.get(list.size()-1)!=b[j]){
                    list.add(b[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if(list.size()==0 || list.get(list.size()-1)!=a[i]){
                list.add(a[i]);
            }
            i++;
        }
        while(j<n2){
            if(list.size()==0 || list.get(list.size()-1)!=b[j]){
                list.add(b[j]);
            }
            j++;
        }
        return list;

        // My approach using set
        // ArrayList<Integer> list = new ArrayList<>();
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<a.length;i++){
        //     if(!set.contains(a[i])) set.add(a[i]);
        // }
        // for(int i=0;i<b.length;i++){
        //     if(!set.contains(b[i])) set.add(b[i]);
        // }
        // for(int nums:set){
        //     list.add(nums);
        // }
        // Collections.sort(list);
        // return list;

        // My approach with cleaner application
        // ArrayList<Integer> list = new ArrayList<>();
        // HashSet<Integer> set = new HashSet<>();
        // for (int num : a) {
        //     set.add(num);
        // }
        // for (int num : b) {
        //     set.add(num);
        // }
        // for (int num : set) {
        //     list.add(num);
        // }
        // Collections.sort(list);
        // return list;

        // Using HashMap
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num:a){
        //     map.put(num,1);
        // }
        // for(int num:b){
        //     map.put(num,1);
        // }
        // ArrayList<Integer> list = new ArrayList<>(map.keySet());
        // Collections.sort(list);
        // return list;

        // Detailed conditional comparison for both arrays
        // ArrayList<Integer> list = new ArrayList<>();
        // int n = a.length;
        // int m = b.length;
        // int i=0,j=0;
        // while(i<n && j<m){
        //     if(a[i]<b[j]){
        //         if(list.size()==0 || list.get(list.size()-1)!=a[i]){
        //             list.add(a[i]);
        //         }
        //         i++;
        //     }
        //     else if(a[i]>b[j]){
        //         if(list.size()==0 || list.get(list.size()-1)!=b[j]){
        //             list.add(b[j]);
        //         }
        //         j++;
        //     }
        //     else{
        //         if(list.size()==0 || list.get(list.size()-1)!=a[i]){
        //             list.add(a[i]);
        //         }
        //         i++;j++;
        //     }
        // }
        // while(i<n){
        //     if(list.size()==0 || list.get(list.size()-1)!=a[i]){
        //         list.add(a[i]);
        //     }
        //     i++;
        // }
        // while(j<m){
        //     if(list.size()==0 || list.get(list.size()-1)!=b[j]){
        //         list.add(b[j]);
        //     }
        //     j++;
        // }
        // return list;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};
        ArrayList<Integer> ans = findUnion(a, b);
        System.out.println(ans);
    }
}