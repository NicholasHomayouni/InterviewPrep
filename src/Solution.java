import java.util.ArrayList;
import java.util.HashMap;
// intersection of two arrays II
class Demo {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=0; i<nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        for (int i=0; i<nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                result.add(nums2[i]);
                map.put(nums2[i], map.getOrDefault(nums2[i], 0) - 1);
            }
        }

        int[] r = new int[result.size()];
        for (int i=0; i<result.size(); ++i){
            r[i] = result.get(i);
        }
        return r;
    }
}

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = { 2,3,4,2,5,1};
        int[] nums2 = { 3,1,4};
        Demo.intersect(nums1, nums2);
    }
}