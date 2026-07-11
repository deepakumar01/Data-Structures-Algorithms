package ARRAYS;
public class RotateArrayRight {
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
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    //Using formula (i+k)%n
    // int[] temp = nums.clone();
    //     int n = nums.length;
    //     k = k%n;
    //     for(int i=0;i<n;i++){
    //         nums[(i+k)%n] = temp[i];
    //     }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 2;

        rotateArr(arr, k);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
