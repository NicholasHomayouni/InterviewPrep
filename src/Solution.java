import java.util.ArrayList;

/*
Given a string A and a dictionary of words B, determine if A can be segmented into a
space-separated sequence of one or more dictionary words.
 */
 class Result {
    public static int wordBreak(String A, ArrayList<String> B) {
        // base case
        if (A.length() == 0) {
            return 0;
        }
        for (int i = 1; i <= A.length(); i++) {
            // consider all prefixes of the current string
            String prefix = A.substring(0,i);

            // if the prefix is present in the dictionary, add it to the output string and recur for
            // remaining string
            if (B.contains(prefix)) {
                wordBreak(A.substring(i), B);
                return 1;
            }
        }
        return 0;
    }
 }

 public class Solution {
    public static void main(String[] args) {
        ArrayList<String> B = new ArrayList<>();
        B.add("this");
        B.add("th");
        B.add("is");
        B.add("famous");
        B.add("word");
        B.add("break");
        B.add("b");

        String A = "Wordbreakproblem";
        Result.wordBreak(A, B);
    }
}
