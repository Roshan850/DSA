import java.util.ArrayList;

public class CycleDetection {
    static class Edge{
        int src , dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }

    }
    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i =0;i< graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graph,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge>[] graph,boolean[] vis,int curr,int par){
        vis[curr] = true;
        for(Edge e : graph[curr]){
            //case 3:
            if(!vis[e.dest]){
                if(isCycleUtil(graph, vis, e.dest, curr)){
                    return true;
                }
            }
            //case 1:
            else if(vis[e.dest] && e.dest != par){
                return true;
            }
            //case 2: do nothing

        }
        return false;
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        // 0- Vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,1));
         graph[2].add(new Edge(2,4));
         graph[2].add(new Edge(2,0));

        graph[3].add(new Edge(3,0));


        graph[4].add(new Edge(4,2));



    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}
