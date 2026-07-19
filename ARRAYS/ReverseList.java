package ARRAYS;

import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        // List<String> fruits = new ArrayList<>(); can be used instead of ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");
        System.out.println("Original List: " + fruits);
        int left = 0;
        int right = fruits.size() - 1;
        while (left < right) {
            String temp = fruits.get(left);
            fruits.set(left, fruits.get(right));
            fruits.set(right, temp);
            left++;
            right--;
        }
        System.out.println("Reversed List: " + fruits);

        // Reverse Without Changing the List
        // ArrayList<String> fruits = new ArrayList<>();
        // fruits.add("Apple");
        // fruits.add("Banana");
        // fruits.add("Mango");
        // fruits.add("Orange");
        // fruits.add("Grapes");
        // for (int i = fruits.size() - 1; i >= 0; i--) {
        //     System.out.print(fruits.get(i) + " ");
        // }

        // Using Collections.reverse()
        // ArrayList<String> fruits = new ArrayList<>();
        // fruits.add("Apple");
        // fruits.add("Banana");
        // fruits.add("Mango");
        // fruits.add("Orange");
        // fruits.add("Grapes");
        // System.out.println("Original List: " + fruits);
        // Collections.reverse(fruits);
        // System.out.println("Reversed List: " + fruits);
    }
}
