import java.util.ArrayList;

class Demo {
    public static int Solve(ArrayList<String> A) {
        String str = A.toString();
        // Array 'seen' of size 26.
        boolean[] identified = new boolean[26];

        // For every letter 'currChar', we find its ASCII code,
        // and update value at the mapped index as true.
        for (char currChar : str.toCharArray())
            identified[currChar - 'a'] = true;

        // Once we finish iterating, check if 'seen' contains false.
        for (boolean status : identified)
            if (!status)
                return 0;
        return 1;
    }
}

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("interviewbit");
        s.add("pangram");
    }
}
