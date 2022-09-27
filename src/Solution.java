import java.util.ArrayList;
import java.util.List;
   class Result {
    public static int lonelyInteger(List<Integer> a) {
        int res = 0;
        for (int i = 0; i < a.size(); i++)
            res = res ^ a.get(i);
        return res;
    }
}

public class Solution {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(3);
        lst.add(2);
        lst.add(1);
        Result.lonelyInteger(lst);
    }
}
