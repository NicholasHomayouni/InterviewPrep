import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// given an unsorted array A, find if k exists in A or not
class Demo {
    public static String Solve(List<Integer> A, int k) {
        Collections.sort(A);
        boolean test = false;
        for (int e : A) {
            if (e == k) {
                test = true;
                break;
            }
        }
        if (test) {
            return "YES";
        }
        else
            return "NO";
    }

}

public class Solution {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(3);
        s.add(-56);
        s.add(123);
        s.add(34);
        s.add(56);
        s.add(-33);

        int k = 35;

        Demo.Solve(s, k);
    }
}
