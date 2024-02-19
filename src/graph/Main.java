package graph;

public class Main {
    public static void main(String[]args){
        Graph gh = new Graph();
        gh.addVertex("A");
        gh.addVertex("B");
        gh.addEdge("A","B");
        gh.printGraph();


    }
}
