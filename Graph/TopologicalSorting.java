import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSorting {

    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

        public static void dfs(ArrayList<Edge>[] graph){
            boolean[] vis = new boolean[graph.length];
            Stack<Integer> st = new Stack<>();
            for(int i = 0;i< graph.length;i++){
                if(!vis[i]){
                    dfs_util(graph,i,vis,st);
                }
            }
            while (!st.isEmpty()){
                System.out.print(st.pop()+"->");
            }
        }
        public static void dfs_util(ArrayList<Edge>[] graph,int curr,boolean[] vis,Stack<Integer> st){
            vis[curr] = true;
            for(Edge e : graph[curr]){
                if(!vis[e.dest]){
                    dfs_util(graph,e.dest,vis,st);
                }
            }
            st.push(curr);

        }

        // topologicalsorting using BFS
    public static void calcInd(ArrayList<Edge>[] graph,int [] ind){
        for(int i = 0;i< graph.length;i++){
            int v = i;
            for(int j = 0;j< graph[i].size();j++){
                Edge e = graph[i].get(j);
                ind[e.dest]++;

            }
        }
    }
    public static void topoSort(ArrayList<Edge>[] graph){
        int[] ind =new int[graph.length];
        calcInd(graph,ind);
        Queue<Integer> q = new LinkedList<>();

        for(int i =0;i<graph.length;i++){
            if(ind[i] == 0){
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (Edge e : graph[curr]) {
                ind[e.dest]--;
                if (ind[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }


    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        dfs(graph);
        System.out.println();
        topoSort(graph);


    }
}
