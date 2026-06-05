package ARRAYS;

class MaxConsecutiveBit01{
    static int maxConsecBits(int[] arr) {
        int count = 1;
        int maxCount = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 1, 1};
        System.out.println(maxConsecBits(arr));
    }
}