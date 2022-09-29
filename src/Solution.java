import java.util.HashSet;
import java.util.Set;
/*
Password MUST:
- have at least one digit (0-9)
- length between 8-15 characters
- have at least one lowercase letter (a-z) and one uppercase letter (A-Z)
- have at least one special character (@,#,%,$,!,*,&)
 */
class Result {
    static int solve(String A) {
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
        }
        if (A.contains("@") || A.contains("&") || A.contains("%")
                || A.contains("$") || A.contains("#") || A.contains("*")
                && A.contains(0 ... 9) >= 1
                && Character.isUpperCase(c) >= 1
                && Character.isLowerCase(c) >= 1
                && A.length() >= 8 || A.length() <= 15) {
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
