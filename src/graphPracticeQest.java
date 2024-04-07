import java.util.*;

class graphPracticeQest{
  static class Edge{
    int src;
    int dest;
     public Edge(int s, int d){
      this.src = s;
      this.dest = d;
     }
  }

  public static void createGraph(ArrayList<Edge> CyclicGraph[]){
      for(int i =0; i<CyclicGraph.length; i++){
        CyclicGraph[i] = new ArrayList<Edge>();
      }
    CyclicGraph[0].add(new Edge(0, 1));
    CyclicGraph[0].add(new Edge(0, 2));
    CyclicGraph[0].add(new Edge(0, 3));
    CyclicGraph[1].add(new Edge(1, 3));
    CyclicGraph[2].add(new Edge(2, 4));
    CyclicGraph[3].add(new Edge(3, 4));
    CyclicGraph[3].add(new Edge(3, 5));
    CyclicGraph[4].add(new Edge(4, 5));
    CyclicGraph[5].add(new Edge(5, 4));
    CyclicGraph[5].add(new Edge(5, 6));
    
  }
  public static void printallPaths(ArrayList<Edge> CyclicGraph[], int curr, boolean vis[], int target, String path){
    if(curr == target){
      System.out.println(path);
      return;
    }
    for(int i=0; i<CyclicGraph[curr].size();  i++){
      Edge e = CyclicGraph[curr].get(i);
      if(!vis[e.dest]){
        vis[e.dest] = true;
      printallPaths(CyclicGraph, e.dest, vis, target, path+e.dest);  
      vis[e.dest] = false;
    }
    }
  }

  public static void dfs(ArrayList<Edge> CyclicGraph[], int curr, boolean vis[]){
    if(vis[curr]){
      return;
    }
    System.out.print(curr+" ");
    vis[curr] = true;
    for(int i=0; i<CyclicGraph[curr].size(); i++){
      Edge e = CyclicGraph[curr].get(i);
      dfs(CyclicGraph, e.dest, vis);
    }
  }

  public static void bfs(ArrayList<Edge> CyclicGraph[], int V){
    Queue<Integer> que = new LinkedList<>();
    boolean vis[] = new boolean[V];
    que.add(0);
    while(!que.isEmpty()){
      int curr = que.remove();
      if(!vis[curr]){
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i=0; i<CyclicGraph[curr].size(); i++){
          Edge e = CyclicGraph[curr].get(i);
          que.add(e.dest);
        }
      }
    }
    System.out.println();
  }

 // _________________________Cycle Detection___________________________________

 //Directed Graph
  public static boolean cycleDetection(ArrayList<Edge> CyclicGraph[], int curr, boolean vis[],boolean rec[]){
    vis[curr] = true;
    rec[curr] = true;
    for(int i=0; i<CyclicGraph[curr].size(); i++){
          Edge e = CyclicGraph[curr].get(i);
          if(!rec[e.dest]){
              return true;
          }

          else if(!vis[e.dest]){
            cycleDetection(CyclicGraph, e.dest, vis, rec);
            return true;
          }
    } 
    rec[curr] = false;
          return false;
  }
// Undirected
  public static boolean isCyclic(ArrayList<Edge> CyclicGraph[], int curr, boolean vis[],  int par){
    vis[curr] =  true;
    for(int i=0; i< CyclicGraph[curr].size(); i++){
      Edge e = CyclicGraph[curr].get(i);
      if(vis[e.dest] && par != e.dest){
        boolean isCyle = isCyclic(CyclicGraph, e.dest, vis, curr);
        if(isCyle){
          return true;
        }
      }
        else if(e.dest == par){
          continue;
        }
        else{
          return true;
        }
      }
      return false;
  }

  public static void toSort(ArrayList<Edge> CyclicGraph[], boolean vis[], int curr, Stack<Integer> s){
       vis[curr] = true;
       for(int i=0; i<CyclicGraph[curr].size(); i++){
        Edge e = CyclicGraph[curr].get(i);
        if(!vis[e.dest]){
          toSort(CyclicGraph, vis, e.dest, s);
        }
       }
      s.push(curr);
  }

  public static void checkIs(ArrayList<Edge> CyclicGraph[],  int V){
    // for(int i=0; i<CyclicGraph.length; i++){
    //  if(isCyclic(CyclicGraph, i, vis, -1)){
    //   return true;
    //  }
    // }
    // return false;

    boolean vis[] = new boolean[V];
    Stack<Integer> sort = new Stack<>();
    for(int i=0; i<CyclicGraph.length; i++){
      if(!vis[i]){
        toSort(CyclicGraph, vis, i, sort);
      }
    }
    while(!sort.isEmpty()){
      System.out.print(sort.pop() +" ");
    }
  }

  public static void main(String args[]){
    int V = 7;
    ArrayList<Edge> CyclicGraph[] = new ArrayList[V];
    createGraph(CyclicGraph);
    checkIs(CyclicGraph, V);
    // bfs(CyclicGraph, V);
    // boolean vis[] = new boolean[V];
    // int curr =0;
    // dfs(CyclicGraph, curr, vis);
    // boolean rec[] = new boolean[V];
    // if(cycleDetection(CyclicGraph, curr, vis, rec)){
    //   System.err.println("yes");
    // }
    // vis[curr] = true;
    // printallPaths(CyclicGraph, curr, vis, 5, ""+ curr);
  }
   
}






