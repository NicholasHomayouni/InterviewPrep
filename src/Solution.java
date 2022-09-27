import java.util.HashSet;
import java.util.Set;

class Demo {
    public static int Solve(String[] A) {
        Set<Character> char_set = new HashSet<>();
        for (int i = 0; i <A.length; i++) {
            String str = A[i];
            for (int j = 0; j < str.length(); j++) {
                char_set.add(str.charAt(j));
            }
        }
        if (char_set.size() == 26)
            return 1;
        else
            return 0;
    }
}

public class Solution {
    public static void main(String[] args) {
        String[] s = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        Demo.Solve(s);
    }
}
