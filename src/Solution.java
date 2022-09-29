class Result {
    static int solve(String A) {
        //char[] charArr = A.toCharArray();
        boolean n1 = false, n2 = false, n3 = false, n4 = false, n5 = false;
        for (int i = 0; i < A.length(); i++) {
            if(Character.isDigit(A.charAt(i))) {
                n1 = true;
            } else if (Character.isUpperCase(A.charAt(i))) {
                n2 = true;
            } else if (Character.isLowerCase(A.charAt(i))) {
                n3 = true;
            } else if (A.charAt(i) == '!' || A.charAt(i) == '@'
                    || A.charAt(i) == '#' || A.charAt(i) == '$'
                    || A.charAt(i) == '%' || A.charAt(i) == '&' || A.charAt(i) == '*') {
                n4 = true;
            }
        }
        if (A.length() >= 8 && A.length() <= 15) {
            n5 = true;
        }
        if (n1 && n2 && n3 && n4 && n5)
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
