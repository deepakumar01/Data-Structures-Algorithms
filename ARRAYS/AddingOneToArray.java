package ARRAYS;
class AddingOneToArray {
    static int[] addOne(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        // Case: 999 -> 1000
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        int[] res = addOne(arr);
        for (int i : res) {
            System.out.print(i);
        }
    }
}