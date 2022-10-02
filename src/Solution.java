import java.util.Stack;

// use n x n boolean matrix
// true return value at matrix[i][j] indicates an edge from node i to node j
// there is an undirected edge between B[i][0] and B[i][1]
// find the number of connected nodes (return A)
class Result {
    public int solve(int A, int[][] B) {
        // connected components part
        boolean[] visited =  new boolean[A];
        for (int i = 0; i < B.length; i++) {
            if (!visited[i]) {
                // run DFS:
                dFS(i, visited, B);
            }
        }

        // DFS util
        visited[A] = true;

    }

    public void dFS(int v, boolean[] visited, int[][] B) {
        visited[v] = true;
        for (int i = 0; i < B[A].length; i++) {

        }
    }
}

public class Solution {
    public static void main(String[] args) {
        int[][] arr = { {1,2},
                        {2,3}};
        Result.solve(4, arr);
    }
}
