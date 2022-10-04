import java.util.ArrayList;
import java.util.List;
/*
Given two integers, l and r, print all the odd numbers between l and r
Return an array of integers denoting the odd numbers between l and r

Ex: input (2,5)     output (3,5)       explanation   l == 2 and r == 5
                                                     odd numbers between 2-5 is (3,5)


 */
class Demo {
    public static List<Integer> Solve(int l, int r) {
        List<Integer> odd = new ArrayList<>();
        int curr = l;
        while (curr < r) {
            if (curr % 2 != 0) {
                odd.add(curr);
            }
            curr++;
        }
        return odd;
    }

}

public class Solution {
    public static void main(String[] args) {

        int l = 4;
        int r = 12;

        Demo.Solve(l, r);
    }
}
