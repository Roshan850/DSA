import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {

    static class Edge {
        int src;
        int dest;
        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int[] color = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            color[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                q.add(i);
                color[i] = 0;

                while (!q.isEmpty()) {
                    int curr = q.remove();

                    for (Edge e : graph[curr]) {
                        if (color[e.dest] == -1) {
                            color[e.dest] = 1 - color[curr];
                            q.add(e.dest);
                        }
                        else if (color[e.dest] == color[curr]) {
                            return false; // NOT bipartite
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));

//        graph[4].add(new Edge(4,2));
//        graph[4].add(new Edge(4,3));
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}