package Graph;
import java.util.ArrayList;
import java.util.Scanner;

public class Representation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // adjacency matrix representation // SC O(n^2)
        int[][] adj = new int[n+1][n+1];
        for(int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u][v] = 1;
            adj[v][u] = 1; //if you want to represent weight then adj[u][v] = weight;
        }

        //adjacency list representation // SC O(2*E)
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<=m;i++){
            adjList.add(new ArrayList<>());
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);//if you want to represent weight then use pair<int,int> and store weight along with node
            adjList.get(v).add(u);
        }

        for(int i=0;i<=n;i++){
            for(int j=0;j<adjList.get(i).size();j++){
                System.out.println(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
