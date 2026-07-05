package ARRAYS;
public class RemoveDuplicatesInplace {

    static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;

        // Using HashSet (library -> import java.util.HashSet;)
        // HashSet<Integer> set = new HashSet<>();
        // int index = 0;
        // for(int num : nums) {
        //     if(set.add(num)) { 
        //         nums[index++] = num;
        //     }
        // }
        // return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};

        int count = removeDuplicates(arr);

        System.out.println("Count = " + count);

        for(int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}