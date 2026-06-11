package ARRAYS;
class SumOfSubarrays{
    static int subarraySum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int currSum = 0;
            for(int j = i; j < n; j++) {
                currSum += arr[j];
                sum += currSum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2};
        System.out.println(subarraySum(arr));
    }
}