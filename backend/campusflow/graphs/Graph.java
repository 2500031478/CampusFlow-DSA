package backend.campusflow.graphs;

import java.util.*;

public class Graph {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    @SuppressWarnings("unchecked")
    public Graph(int vertices) {

        this.vertices = vertices;
        adjList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge between two locations
    public void addEdge(int source, int destination) {

        adjList[source].add(destination);
        adjList[destination].add(source); // Undirected Graph
    }

    // Display graph
    public void displayGraph() {

        System.out.println("Campus Graph:");

        for (int i = 0; i < vertices; i++) {

            System.out.print("Location " + i + " -> ");

            for (Integer node : adjList[i]) {
                System.out.print(node + " ");
            }

            System.out.println();
        }
    }

    // Getter methods
    public LinkedList<Integer>[] getAdjList() {
        return adjList;
    }

    public int getVertices() {
        return vertices;
    }

    // Sample graph creation
    public static Graph createCampusGraph() {

        Graph g = new Graph(5);

        g.addEdge(0, 1); // Hostel - Library
        g.addEdge(0, 2); // Hostel - AI Lab
        g.addEdge(1, 3); // Library - Seminar Hall
        g.addEdge(2, 4); // AI Lab - Classroom
        g.addEdge(3, 4); // Seminar Hall - Classroom

        return g;
    }
}