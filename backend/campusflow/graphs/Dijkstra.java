package backend.campusflow.graphs;

import java.util.Arrays;

public class Dijkstra {

    private static final int V = 5;

    int minDistance(int dist[],
                    boolean visited[]) {

        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < V; v++) {

            if (!visited[v] &&
                dist[v] <= min) {

                min = dist[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    public void shortestPath(
            int graph[][],
            int source) {

        int dist[] = new int[V];

        boolean visited[] =
                new boolean[V];

        Arrays.fill(dist,
                Integer.MAX_VALUE);

        dist[source] = 0;

        for (int count = 0;
             count < V - 1;
             count++) {

            int u =
                    minDistance(
                            dist,
                            visited);

            visited[u] = true;

            for (int v = 0;
                 v < V;
                 v++) {

                if (!visited[v]
                        && graph[u][v] != 0
                        && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][v]
                        < dist[v]) {

                    dist[v] =
                            dist[u]
                                    + graph[u][v];
                }
            }
        }

        printSolution(
                source,
                dist);
    }

    void printSolution(
            int source,
            int dist[]) {

        System.out.println(
                "\nShortest Paths from Node "
                        + source);

        for (int i = 0;
             i < V;
             i++) {

            System.out.println(
                    source
                            + " -> "
                            + i
                            + " = "
                            + dist[i]
                            + " meters");
        }
    }
}