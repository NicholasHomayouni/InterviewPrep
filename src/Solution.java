class Result {
    // function to flip matrix along diagonals
    public static int[][] diagonalFlip(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // do diagonal flipping alg...
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
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
