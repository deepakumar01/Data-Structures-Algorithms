package ARRAYS;
import java.util.HashMap;
import java.util.Map;

public class MostOccurenceElementAndIndex {
    public static int[] mostOccurence(int[] arr) {

        int[] temp = new int[3];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int maxElement = -1;
        int freq = 0;
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()>freq){
                freq = e.getValue();
                maxElement = e.getKey();
            }
        }
        int count = freq;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==maxElement){
                index = i;
                break;
            }
        }
        temp[0] = maxElement;
        temp[1] = index;
        temp[2] = count;
        return temp;

        // Using hash array
        // int[] freq = new int[10];
        // // Count frequency
        // for (int i = 0; i < arr.length; i++) {
        //     freq[arr[i]]++;
        // }
        // // Find the digit with maximum frequency
        // int maxElement = arr[0];
        // int maxFreq = freq[arr[0]];
        // for (int i = 0; i < 10; i++) {
        //     if (freq[i] > maxFreq) {
        //         maxFreq = freq[i];
        //         maxElement = i;
        //     }
        // }
        // // Find its first index
        // int index = -1;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == maxElement) {
        //         index = i;
        //         break;
        //     }
        // }
        // return new int[]{maxElement, index};
    }
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 4, 3, 2, 2};
        int[] res = mostOccurence(arr);
        System.out.println("Most Occurring Element: " + res[0]);
        System.out.println("First Index: " + res[1]);
        System.out.println("Most Occurring Element Count: " + res[2]);
    }
}