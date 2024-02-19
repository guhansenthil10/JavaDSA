package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> graph= new HashMap<>();
    public boolean addVertex(String vertex){
        if(graph.get(vertex) == null){
            graph.put(vertex,new ArrayList<>());
            return true;
        }
        return false;
    }

    public void printGraph(){
        System.out.println(graph);
    }

    public boolean addEdge(String vertex1, String vertex2){
        if(graph.get(vertex1) != null && graph.get(vertex2) != null){
            graph.get(vertex1).add(vertex2);
            graph.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }
}
