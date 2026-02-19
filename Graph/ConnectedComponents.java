import java.util.*;


public class ConnectedComponents {
    //BFS ->
    public static void bfs(ArrayList<Edge>[] graph){
        boolean[] vis= new boolean[graph.length];
        for(int i =0;i< graph.length;i++){
            if(!vis[i]){
                bfsUtil(graph,vis,i);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph,boolean[] vis,int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]){
                System.out.println(curr+" ");
                vis[curr] = true;
                for(Edge e : graph[curr]){

                    q.add(e.dest);

                }

            }
        }
    }
    //DFS ->
    public static void dfs(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i = 0;i< graph.length;i++) {
            if (!vis[i]) {
                dfsUtil(graph, i, vis);
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph,int curr,boolean[] vis){
        vis[curr] = true;
        System.out.println(curr+" ");
        for(Edge e : graph[curr]){

            if(!vis[e.dest]){
                dfsUtil(graph,e.dest,vis);
            }
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        // 0- Vertex
        graph[0].add(new Edge(0,1,0));
        graph[0].add(new Edge(0,2,0));

        graph[1].add(new Edge(1,0,0));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,0));
        graph[2].add(new Edge(2,4,0));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,4,0));
        graph[3].add(new Edge(3,5,0));

        graph[4].add(new Edge(4,2,0));
        graph[4].add(new Edge(4,3,0));
        graph[4].add(new Edge(4,5,0));

        graph[5].add(new Edge(5,3,0));
        graph[5].add(new Edge(5,4,0));
        graph[5].add(new Edge(5,6,0));

        graph[6].add(new Edge(6,5,0));
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println("bfs");
        bfs(graph);
        System.out.println("dfs");
        dfs(graph);
    }
}
