class Result {
    static int solve(String A) {
        char[] charArr = A.toCharArray();
        boolean val = true;
        for (int i = 0; i < A.length(); i++) {
            if(!Character.isDigit(A.charAt(i))) {
                val = false;
            } else if (!Character.isUpperCase(A.charAt(i))) {
                val = false;
            } else if (!Character.isLowerCase(A.charAt(i))) {
                val = false;
            } else if (A.charAt(i) == '!' || A.charAt(i) == '@'
                    || A.charAt(i) == '#' || A.charAt(i) == '$'
                    || A.charAt(i) == '%' || A.charAt(i) == '&' || A.charAt(i) == '*') {
                val = true;
            }
        }
        if (A.length() < 8 || A.length() > 15) {
            return 0;
        }
        if (val)
            return 1;
        else
            return 0;
    }
}

public class Solution {
    public static void main(String[] args) {
        char[] arr = {'S', 'c', 'a', 'l', 'e', 'r', '@', '1'};
    }
}
