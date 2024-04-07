import java.security.Permission;
import java.util.*;

public class Djk {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Integer> CyclicGraph[]){
        for(int i=0; i<CyclicGraph.length; i++){
             CyclicGraph[i] = new ArrayList<>();
        }
        CyclicGraph[0].add(new Edge(0, 1, 5));
    }
}
