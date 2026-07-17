package ARRAYS;
import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.Collections;
// import java.util.HashSet;
// import java.util.HashMap;
public class MergeUnionSortedArrays {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
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
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};
        ArrayList<Integer> ans = findUnion(a, b);
        System.out.println(ans);
    }
}