import java.util.Arrays;
import java.lang.*;

class Demo {
    public static int Solve(String[] A) {
        boolean[] char_set = new boolean[128];

        for (int i = 0; i < A.length; i++) {
            char val = Arrays.toString(A).charAt(i);
            if (char_set[val]) {    // if we already found this character in the string, return false
                return 0;
            }
            char_set[val] = true;   // returns true if we havent found this character in the string
        }
        return 1;   // return true if unique
    }
}

public class Solution {
    public static void main(String[] args) {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        Demo.Solve(array);
    }
}
