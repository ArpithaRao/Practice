package DataStructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ARPITHA RAO on 10-03-2017.
 */
public class Graph {

    private int v = 0;
    private LinkedList<Integer> adj[];

    public  Graph(int v){
        this.v = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v ; i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
    }

    //breadth first search
   public void BFS(int s){
        //creating boolean array to keep track of visited nodes
        boolean visited[] = new boolean[v];

        //add all nodes visited from source 's' to queue
        Queue<Integer> queue = new LinkedList<>();

        //mark source node visited and add it to the queue
        visited[s] = true;
        queue.add(s);

       while (queue.size()!=0) {

           s = queue.poll();
           System.out.print(s+" ");

           //iterate through all the neighbors of 's' and mark them visited and add them to the queue
           Iterator<Integer> i = adj[s].listIterator();
           while (i.hasNext()) {

               int n = i.next();
               if (!visited[n]) {
                   visited[n] = true;
                   queue.add(n);
               }

           }
       }
    }

    // A function used by DFS
    void DFSUtil(int v,boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v+" ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(int v)
    {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[v];

        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited);
    }

    public static void main(String args[]){

        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println();
        System.out.println("DFS");
        g.DFS(2);

    }

}
