package Graph;

import OOPS.Access.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_DFSofGraph {
    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        vis[node] = true;
        ls.add(node);
        for(Integer it : adj.get(node)){
            if(!vis[it]) dfs(it,vis,adj,ls);
        }
    }
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj, int V){
        boolean vis[] = new boolean[V+1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0,vis,adj,ls);
        return ls;
    }
    public ArrayList<Integer> bfsOfGraph(ArrayList<ArrayList<Integer>> adj, int V){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            for(Integer it : adj.get(node)){
                if(visited[it] == false) {
                    visited[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args) {

    }
}
