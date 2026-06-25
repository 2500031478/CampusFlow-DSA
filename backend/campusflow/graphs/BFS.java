package backend.campusflow.graphs;

import java.util.*;

public class BFS {

    public static void traverse(Graph graph, int start) {

        boolean[] visited =
                new boolean[graph.getVertices()];

        Queue<Integer> queue =
                new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {

            int vertex = queue.poll();

            System.out.print(vertex + " ");

            for (Integer neighbor :
                    graph.getAdjList()[vertex]) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }
}