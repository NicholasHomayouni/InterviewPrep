import java.util.ArrayList;

class Demo {
    public int Solve(ArrayList<String> A) {
        //if (A.size() > 26) return 0;
        boolean[] boolArr = new boolean[A.size()];
        int abcIndex = 0;
        for (int i = 0; i < A.size(); i++) {
            String str = A.get(i);  // get each index and store it as a string
            if('a' <= str.charAt(i) & 'z' >= str.charAt(i)) {
                abcIndex = str.charAt(i) - 'a';
                boolArr[abcIndex] = true;
            //    return 0;
            }
        }
        for (boolean index : boolArr) {
            if (!index) {
                return 0;
            }
        } return 1;
//        if ( <= 26)
//            return 1;
//        else
//            return 0;
    }
}

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("interviewbit");
        s.add("pangram");
    }
}
