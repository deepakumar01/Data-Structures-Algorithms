package ARRAYS;
class SumOfSubarrays{
    static int subarraySum(int[] arr) {
        
        int n = arr.length;
        int result = 0, temp = 0;

        // pick starting point
        for (int i = 0; i < n; i++) {

            // pick ending point
            temp = 0;
            for (int j = i; j < n; j++) {

                // sum subarray between current starting 
                // and ending points
                temp += arr[j];
                result += temp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2};
        System.out.println(subarraySum(arr));
    }
}