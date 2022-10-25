import java.util.HashMap;

class Demo {
    public static int firstUniqChar(String s) {
        // HashMap <characters, #times occurred> if unique, value should be 1
        HashMap<Character, Integer> map = new HashMap<>();
        // go through string and save in hashmap # of times each char appears
        for (int i=0; i<s.length(); ++i) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1 );
        }

        // find the index using the hashmap as a reference to check chars for uniqueness
        for (int i=0; i<s.length(); ++i) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}

public class Solution {
    public static void main(String[] args) {
        String s = "LOVELEETCODE";
        Demo.firstUniqChar(s);
    }
}