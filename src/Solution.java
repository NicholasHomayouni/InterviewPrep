import java.util.HashSet;
import java.util.Set;

/*
Password MUST:
- have at least one digit (0-9)
- length between 8-15 characters
- have at least one lowercase letter (a-z) and one uppercase letter (A-Z)
- have at least one special character (@,#,%,$,!,*,&)
 */

/*
Algorithm pseudocode:

// iterate through char_Arr[] and map each index letter to its hashcode
- Set<Character> char_set = new HashSet<>()
- for (int i = 0; i < char_Arr.length; i++)
    `
-       if (char_arr[i].contains(SPECIAL_CHARACTERS))
            && char_Arr[i].contains(0...9)
            && char_Arr.length >= 8 && char_Arr.length <= 15
                    && char_Arr[i].contains(UPPERCASE_LETTERS >= 1)
                    && char_Arr[i].contains(lowercase_letters >= 1)
            return 1;
        else
            return 0;

 */

class Result {
    static int solve(String A) {
        Set<Character> char_set = new HashSet<>();
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (A.contains("@") || A.contains("&") || A.contains("%")
                                || A.contains("$") || A.contains("#") || A.contains("*")
                                && Character.isUpperCase(c)) {
            } else
                return 0;
        }
        if (char_set.equals(A)){
            return 1;
        } else
            return 0;
    }
}

public class Solution {
    public static void main(String[] args) {
        char[] arr = {'S', 'c', 'a', 'l', 'e', 'r', '@', '1'};
    }
}
