package ARRAYS;
public class ArraySorted {
    static boolean isSorted(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++)
            if (arr[i - 1] > arr[i])
                return false;
        return true;

        //My approach
        // int n = arr.length;
        // int count =0;
        // for(int i=1;i<n;i++){
        //     if(arr[i]>=arr[i-1]){
        //         count++;
        //     }
        // }
        // if(count==n-1) return true;
        // else return false;

        //Another apporach
        // for(int i=1;i<n;i++){
        //     if(arr[i]>=arr[i-1]){

        //     }
        //     else{
        //         return false;
        //     }
        // }
        // return true;

        //Recursive approach
    // static boolean isSortedHelper(int[] arr, int n){
    //     if(n==0 || n==1) return true;
    //     return arr[n-1]>=arr[n-2] && isSortedHelper(arr, n-1);
    // }
    // public boolean isSorted(int[] arr) {
    //     return isSortedHelper(arr, arr.length);
    // }

        //Built-in Methods
        // int[] copy = arr.clone();
        // Arrays.sort(copy);
        // return Arrays.equals(copy,arr);
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        if (isSorted(arr))
            System.out.print("true\n");
        else
            System.out.print("false\n");
    }
}
