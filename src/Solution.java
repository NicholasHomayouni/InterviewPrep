import java.util.Arrays;
import java.lang.*;

class Demo {
    public static boolean Solve(String[] A) {
        String str = Arrays.toString(A);
        if (str.length() > 26) return false;       // base case if string length exceeds # of unique characters in alphabet

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < A.length; i++) {
            int val = Arrays.toString(A).charAt(i);     // return each character of string in array
            if (char_set[val]) {    // if we already found this character in the string, return false
                return false;
            }
            char_set[val] = true;   // returns true if we haven't found this character in the string
        }
        return true;   // return true if unique
    }
}

public class Solution {
    public static void main(String[] args) {
        String[] str = {"scaler", "interviewbit"};
        Demo.Solve(str);

        if (Demo.Solve(str))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
