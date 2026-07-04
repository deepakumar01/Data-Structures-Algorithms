package ARRAYS;
import java.util.ArrayList;
import java.util.Arrays;
class AlternatePositiveNegative {
    static void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=0) pos.add(arr.get(i));
            else neg.add(arr.get(i));
        }
        
        int i=0, posIdx=0, negIdx=0;
        while(posIdx<pos.size() && negIdx<neg.size()){
            arr.set(i++, pos.get(posIdx++));
            arr.set(i++, neg.get(negIdx++));
        }
        // Filling rest of elements
        while(posIdx<pos.size()) arr.set(i++, pos.get(posIdx++));
        while(negIdx<neg.size()) arr.set(i++, neg.get(negIdx++));
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, -4, -1, 4));
        rearrange(arr);
        for (int i = 0; i < arr.size(); i++) 
            System.out.print(arr.get(i) + " ");
    }
}