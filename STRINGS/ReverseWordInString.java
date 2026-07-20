package STRINGS;

public class ReverseWordInString {

    public static void main(String[] args) {

        Solution obj = new Solution();

        String s = "  the   sky is   blue  ";

        String result = obj.reverseWords(s);

        System.out.println("Original String: \"" + s + "\"");
        System.out.println("Reversed String: \"" + result + "\"");
    }
}

class Solution {

    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            sb.append(words[i]);

            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}