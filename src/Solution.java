class Demo {
    public static void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++){
                System.out.print(array[i] + "," + array[j]);
            }
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        Demo.printPairs(array);
    }
}
