package ARRAYS;
import java.util.*;
class MissingRangesOfNumbers {
    static List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();
        long next = lower;
        for (int num : arr) {
            if (num < next) {
                continue;
            }

            if (num > upper) {
                break;
            }

            if (next < num) {
                result.add(Arrays.asList((int) next, num - 1));
            }

            next = (long) num + 1;
        }

        if (next <= upper) {
            result.add(Arrays.asList((int) next, upper));
        }

        return result;
    }

    public static void main(String[] args) {
        int lower = 10;
        int upper = 50;
        int[] arr = {14, 15, 20, 30, 31, 45};
        List<List<Integer>> res = missingRanges(arr, lower, upper);
        for (List<Integer> range : res) {
            System.out.println(range.get(0) + " " + range.get(1));
        }
    }
}