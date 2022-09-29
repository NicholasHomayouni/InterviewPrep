class Result {
    // function to flip matrix along diagonals
    public static int[][] diagonalFlip(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int temp = 0;
        for (int i = 0; i < m / 2; i++) {
            for (int j = 1; j < n; j++) {
                // do diagonal flipping alg...
                temp = A[i][j];
                A[i][j] = A[m - 1 - i][n - 1- j];
                A[m - 1 - i][n - 1 - j] = temp;
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
                System.out.print(A[i][j] + "  ");
            }
            System.out.println();
        }
    }

}

public class Solution {
    public static void main(String[] args) {
        int[][] arr = { {1,2},
                        {3,4}};
        Result.diagonalFlip(arr);
        Result.show(arr);
    }
}
