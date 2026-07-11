package ARRAYS;
public class RotateArrayLeft {
    static void reverse(int[] arr, int a, int b){
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;b--;
        }
    }
    static void rotateArr(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

        //Using formula (i+k)%n
        // int[] temp = nums.clone();
        // int n = nums.length;
        // k = k%n;
        // for(int i=0;i<n;i++){
        //     nums[i] = temp[(i+k)%n];
        // }

        //My approach using ArrayList
        // ArrayList<Integer> list = new ArrayList<>();
        // int n  = arr.length;
        // d = d % n;
        // for(int i=0;i<n;i++){
        //     list.add(arr[(i+d)%n]);
        // }
        // int i=0;
        // for(int nums:list){
        //     arr[i++] = nums;
        // }
        // or easier way to copy elements 
        // for (int i = 0; i < n; i++) {
        //     arr[i] = list.get(i);
        // }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 2;

        rotateArr(arr, k);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
