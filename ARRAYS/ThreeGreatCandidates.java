package ARRAYS;
public class ThreeGreatCandidates {
    static int maxProduct(int[] arr) {
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;
        int firstmin = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstmax){
                thirdmax = secondmax;
                secondmax = firstmax;
                firstmax = arr[i];
            }
            else if(arr[i]>secondmax){
                thirdmax = secondmax;
                secondmax = arr[i];
            }
            else if(arr[i]>thirdmax){
                thirdmax = arr[i];
            }
            if(arr[i]<firstmin){
                secondmin = firstmin;
                firstmin = arr[i];
            }
            else if(arr[i]<secondmin){
                secondmin = arr[i];
            }
        }
        return Math.max(firstmax*secondmax*thirdmax,
        firstmax*firstmin*secondmin);
    }
    
    public static void main(String[] args){
        int[] arr = { 10, 3, 5, 6, 20 };
        int res = maxProduct(arr);
        System.out.println(res);
    }
}
