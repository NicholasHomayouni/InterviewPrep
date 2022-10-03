import java.util.ArrayList;

// use n x n boolean matrix
// true return value at matrix[i][j] indicates an edge from node i to node j
// there is an undirected edge between B[i][0] and B[i][1]
// find the number of connected nodes (return A)
 class Result {
    public int solve(int A, int[][] B) {
        ArrayList<Integer>[] graph = new ArrayList[A + 1];
        for(int[] e : B){
            if(graph[e[0]] == null){
                graph[e[0]] = new ArrayList<>();
            }
            if(graph[e[1]] == null){
                graph[e[1]] = new ArrayList<>();
            }
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        visited = new boolean[A + 1];
        int count = 0;
        for(int i = 1; i <= A; ++i){
            if(!visited[i]){
                visited[i] = true;
                ++count;
                dfs(graph, i);
            }
        }
        return count;

    }

    boolean[] visited;

    void dfs(ArrayList<Integer>[] graph, int cur){
        if(graph[cur] != null){
            for(int e : graph[cur]){
                if(!visited[e]){
                    visited[e] = true;
                    dfs(graph, e);
                }
            }
        }
    }
}

public class Solution {
    public static void main(String[] args) {

    }
}
