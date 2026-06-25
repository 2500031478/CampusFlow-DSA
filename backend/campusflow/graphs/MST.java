package backend.campusflow.graphs;

import java.util.Arrays;

public class MST {

    private static final int V = 5;

    public void primMST(int[][] graph) {

        int[] parent = new int[V];
        int[] key = new int[V];
        boolean[] mstSet = new boolean[V];

        Arrays.fill(key, Integer.MAX_VALUE);

        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < V - 1; count++) {

            int u = minKey(key, mstSet);

            mstSet[u] = true;

            for (int v = 0; v < V; v++) {

                if (graph[u][v] != 0 &&
                    !mstSet[v] &&
                    graph[u][v] < key[v]) {

                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent, graph);
    }

    private int minKey(int[] key,
                       boolean[] mstSet) {

        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < V; v++) {

            if (!mstSet[v] &&
                key[v] < min) {

                min = key[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    private void printMST(
            int[] parent,
            int[][] graph) {

        System.out.println(
                "Minimum Spanning Tree:");

        int total = 0;

        for (int i = 1; i < V; i++) {

            System.out.println(
                    parent[i] + " - " + i +
                    " : " + graph[i][parent[i]]);

            total += graph[i][parent[i]];
        }

        System.out.println(
                "Total Cost = " + total);
    }
}