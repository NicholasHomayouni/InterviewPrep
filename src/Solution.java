

class Result {
    // function to flip matrix along diagonals
    public static int[][] diagonalFlip(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {

            }
        }
        return A;
    }

    // function print and format the matrix
    static void show(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(A[i][j]+ "  ");
            }
            System.out.println();
        }
    }

}

public class Solution {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        Result.show(arr);
    }
}
