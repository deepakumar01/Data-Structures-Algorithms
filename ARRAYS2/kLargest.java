
import java.util.ArrayList;
import java.util.Arrays;

public class kLargest {

    public static ArrayList<Integer> kLargest(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int maxIndex = -1;

            // Find maximum element index
            for (int j = 0; j < arr.length; j++) {
                if (maxIndex == -1 || arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Add maximum element to answer
            ans.add(arr[maxIndex]);

            // Replace maximum element with Integer.MIN_VALUE
            arr[maxIndex] = Integer.MIN_VALUE;

            // Print array after replacement
            System.out.println("Array after step " + (i + 1) + ": " + Arrays.toString(arr));
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 787, 1, 23};
        int k = 2;

        ArrayList<Integer> result = kLargest(arr, k);

        System.out.println("K Largest Elements: " + result);
    }
}