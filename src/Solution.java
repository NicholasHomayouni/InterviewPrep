

//class Result {
//    public static String timeConversion() {
//        Date dt = new Date();   // making a new date object                         // lowercase k equates to hour(1-24)
//        SimpleDateFormat dateFormat = new SimpleDateFormat("kk:mm:ss a");   // making a new dateFormat object with pattern
//        return dateFormat.format(dt);   // returns the time in a 24-hour format
//    }
//}

class Demo {
    public static String convDemo(String str) {                 // parse first two digits
        int hour = Integer.parseInt(str.substring(0, 2)) % 12;  // beg. index and ending index. if # = 12, set it to 0
        if (str.endsWith("PM")) {   // if input ends with PM
            hour += 12;             // add 12
        }
        return String.format("%02d", hour);     // replace first two digits with new #, remove AM/PM suffix
    }
}

public class Solution {
    public static void main(String[] args) {
        //System.out.println(Result.timeConversion());    // testing
        System.out.println(Demo.convDemo("12:30:45PM"));    // testing

    }
}
