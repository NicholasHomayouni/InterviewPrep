import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result {
    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        long min = Collections.min(arr);
        long max = Collections.max(arr);

        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);  // summing all the numbers up
        }
        sum -= max;     // subtracting max; therefore giving us the min
        System.out.print(sum + "\t");       // print the min sum of 4 of 5 elements in array

        sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        sum -= min;
        System.out.print(sum);      // print the max of 4 of 5 elements
    }
}

public class Solution {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(793810624, 895642170, 685903712, 623789054, 468592370));

        Result.miniMaxSum(arr);
    }
}
