import java.util.ArrayList;
import java.util.List;

public class NumberOfProvinces {
    public static int countPro(int[][] adj,int V){
        boolean[] vis = new boolean[V];
        //convert Matrix to  adjecency list
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i =0;i<V;i++){
              adjList.add(new ArrayList<>());
        }

        for(int i =0;i < V;i++){
            for (int j = 0;j<V;j++){ // add node in list
                if(adj[i][j] == 1 && i != j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        int count = 0 ;
        for(int i = 0;i< V;i++){
            if(!vis[i]){
                count++;
                bfs(adjList,i,vis);
            }
        }
        return count;
    }
    public static void bfs(List<List<Integer>> adjList,int curr,boolean[] vis){
        vis[curr] = true;

        for(int neighbor : adjList.get(curr)){
            if(!vis[neighbor]){
                bfs(adjList,neighbor,vis);
            }

        }
    }

    public static void main(String[] args) {
        int[][] adj = {{1,0,0,1},{0,1,1,0},{0,1,1,0},{1,0,0,1}};
        int V = 4;
        System.out.println(countPro(adj,V));

    }
}
