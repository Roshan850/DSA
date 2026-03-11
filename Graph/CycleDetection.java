import java.util.ArrayList;

public class CycleDetection {
    static class Edge{
        int src , dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }

    }
    // FOR DIRECTED GRAPH
    public static boolean isCycle1(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i =0;i< graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil1(graph,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil1(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par){
        vis[curr] = true;
        for(Edge e : graph[curr]){
            //case 3:
            if(!vis[e.dest]){
                if(isCycleUtil1(graph, vis, e.dest, curr)){
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
    // FOR DIRECTED GRAPH
    public static boolean isCycle2(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];

        for(int i =0;i< graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil2(graph,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil2(ArrayList<Edge>[] graph,int curr,boolean[] vis,boolean[] stack){
        vis[curr] = true;
        stack[curr]= true;
        for(Edge e: graph[curr]){
            if(stack[e.dest]){
                return true;
            }
           else if(!vis[e.dest] && isCycleUtil2(graph,e.dest,vis,stack)){
                   return true;
            }

        }
        stack[curr] = false;
        return false;
    }

//    public static void createGraph(ArrayList<Edge>[] graph){
//        for(int i=0;i<graph.length;i++){
//            graph[i] = new ArrayList<>();
//        }
//        // 0- Vertex
//        graph[0].add(new Edge(0,1));
//        graph[0].add(new Edge(0,2));
//        graph[0].add(new Edge(0,3));
//
//        graph[1].add(new Edge(1,0));
//        graph[1].add(new Edge(1,2));
//
//        graph[2].add(new Edge(2,1));
//         graph[2].add(new Edge(2,4));
//         graph[2].add(new Edge(2,0));
//
//        graph[3].add(new Edge(3,0));
//
//
//        graph[4].add(new Edge(4,2));
//
//
//
//    }
    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Directed edges
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2,0));

        // graph[3] has no outgoing edges
        // graph[4] has no outgoing edges
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycle2(graph));
    }
}
