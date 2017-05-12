
package DataStructures;
/*

import com.sun.javafx.geom.Edge;
import sun.security.provider.certpath.Vertex;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

*/
/**
 * Created by ARPITHA RAO on 10-03-2017.
 *//*

public class Graph <T>{

    private int noOfVertices = 0;
    private LinkedList<Integer> adj[];

    Graph(int noOfVertices){
        this.noOfVertices = noOfVertices;
        adj = new LinkedList[noOfVertices];
        for(int i = 0; i < noOfVertices; ++i){
            adj[i] = new LinkedList<>();
        }
    }

    public void connectVertices(int V, int w){
        adj[V].add(w);
    }

    public void DFSUtil(int startVertex,boolean[] visited ){
        //mark the vertex visited
        visited[startVertex] = true;
        System.out.print(startVertex + " ");


        Iterator<Integer> iterator = adj[startVertex].listIterator();

        while (iterator.hasNext()){
            int c = iterator.next();
            if(!visited[c]){
                DFSUtil(c,visited);
            }
        }
    }

    public void DFS(int v){
        boolean[] visited = new boolean[noOfVertices];
        DFSUtil(v,visited);
    }

    public void BFS(int s){

        boolean[] visited = new boolean[noOfVertices];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        while (!queue.isEmpty()){
             s = queue.poll();
            System.out.print(s+" ");

            Iterator<Integer> iterator = adj[s].listIterator();
            while (iterator.hasNext()){
                int i = iterator.next();
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }

        }

    }

    public static void main(String args[]){
        Graph graph = new Graph(4);

        graph.connectVertices(0, 1);
        graph.connectVertices(0, 2);
        graph.connectVertices(1, 2);
        graph.connectVertices(2, 0);
        graph.connectVertices(2, 3);
        graph.connectVertices(3, 3);

        System.out.println("DFS starting at 2");
        graph.DFS(2);

        System.out.println();
        System.out.println("BFS starting at 2");
        graph.BFS(2);

        Map<Long,<Vertex<T>>
    }

}
*/


import java.util.*;

public class Graph<T>{

    private List<Edge<T>> allEdges;
    private Map<Long,Vertex<T>> allVertex;
    boolean isDirected = false;

    public Graph(boolean isDirected){
        allEdges = new ArrayList<Edge<T>>();
        allVertex = new HashMap<Long,Vertex<T>>();
        this.isDirected = isDirected;
    }
/*
    public void addEdge(long id1, long id2){
        addEdge(id1,id2,0);
    }

    //This works only for directed graph because for undirected graph we can end up
    //adding edges two times to allEdges
    public void addVertex(Vertex<T> vertex){
        if(allVertex.containsKey(vertex.getId())){
            return;
        }
        allVertex.put(vertex.getId(), vertex);
        for(Edge<T> edge : vertex.getEdges()){
            allEdges.add(edge);
        }
    }

    public Vertex<T> addSingleVertex(long id){
        if(allVertex.containsKey(id)){
            return allVertex.get(id);
        }
        Vertex<T> v = new Vertex<T>(id);
        allVertex.put(id, v);
        return v;
    }*/

    public Vertex<T> getVertex(long id){
        return allVertex.get(id);
    }

    public void addEdge(long id1,long id2, int weight){
        Vertex<T> vertex1 = null;
        if(allVertex.containsKey(id1)){
            vertex1 = allVertex.get(id1);
        }else{
            vertex1 = new Vertex<T>(id1);
            allVertex.put(id1, vertex1);
        }
        Vertex<T> vertex2 = null;
        if(allVertex.containsKey(id2)){
            vertex2 = allVertex.get(id2);
        }else{
            vertex2 = new Vertex<T>(id2);
            allVertex.put(id2, vertex2);
        }

        Edge<T> edge = new Edge<T>(vertex1,vertex2,isDirected,weight);
        allEdges.add(edge);
        vertex1.addAdjacentVertex(edge, vertex2);
        if(!isDirected){
            vertex2.addAdjacentVertex(edge, vertex1);
        }

    }

    public List<Edge<T>> getAllEdges(){
        return allEdges;
    }

    public Collection<Vertex<T>> getAllVertex(){
        return allVertex.values();
    }
   /* public void setDataForVertex(long id, T data){
        if(allVertex.containsKey(id)){
            Vertex<T> vertex = allVertex.get(id);
            vertex.setData(data);
        }
    }*/

   /* @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        for(Edge<T> edge : getAllEdges()){
            buffer.append(edge.getVertex1() + " " + edge.getVertex2() + " " + edge.getWeight());
            buffer.append("\n");
        }
        return buffer.toString();
    }*/
}


