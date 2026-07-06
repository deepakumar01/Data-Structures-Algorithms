package ARRAYS;
public class RotateArray {
    static void reverse(int[] arr, int a, int b){
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;b--;
        }
    }
    static void rotateArr(int[] arr, int d) {
        int n = arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

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

        //Using temporary Array
        // int n = arr.length;
        // d = d % n;
        // int[] temp = new int[n];
        // for (int i = 0; i < n; i++) {
        //     temp[i] = arr[(i + d) % n];
        // }
        // for (int i = 0; i < n; i++) {
        //     arr[i] = temp[i];
        // }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;

        rotateArr(arr, d);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
