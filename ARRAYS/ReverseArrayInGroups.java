package ARRAYS;
class ReverseArrayInGroups {
    static void reverseInGroups(int[] arr, int k){
        int n = arr.length;
        for(int i=0;i<n;i=i+k){
            int l = i;
            int r = Math.min(n-1,l+k-1);
            while(l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        reverseInGroups(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}