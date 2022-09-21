import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class Result {
    public static String timeConversion(String s) {
        String result = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh mm ss a", Locale.US))
                .format(DateTimeFormatter.ofPattern("HH mm ss"));
    }
}

public class Solution {
    public static void main(String[] args) {

        String s = "12:01:00AM";
    }
}
