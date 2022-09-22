import java.text.SimpleDateFormat;
import java.util.Date;

class Result {
    public static String timeConversion() {
        Date dt = new Date();   // making a new date object                         // lowercase k equates to hour(1-24)
        SimpleDateFormat dateFormat = new SimpleDateFormat("kk:mm:ss a");   // making a new dateFormat object with pattern
        return dateFormat.format(dt);   // returns the time in a 24-hour format
    }
}

public class Solution {
    public static void main(String[] args) {
        System.out.println(Result.timeConversion());    // testing
    }
}
