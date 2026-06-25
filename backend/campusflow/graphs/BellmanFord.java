package backend.campusflow.graphs;

public class BellmanFord {

    static class Edge {
        int source;
        int destination;
        int weight;

        Edge(int source,
             int destination,
             int weight) {

            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public void shortestPath(
            Edge[] edges,
            int vertices,
            int source) {

        int[] distance =
                new int[vertices];

        for (int i = 0;
             i < vertices;
             i++) {

            distance[i] =
                    Integer.MAX_VALUE;
        }

        distance[source] = 0;

        for (int i = 1;
             i < vertices;
             i++) {

            for (Edge edge : edges) {

                if (distance[edge.source]
                        != Integer.MAX_VALUE
                        &&
                        distance[edge.source]
                        + edge.weight
                        <
                        distance[edge.destination]) {

                    distance[edge.destination]
                            =
                            distance[edge.source]
                                    + edge.weight;
                }
            }
        }

        System.out.println(
                "Bellman-Ford Result:");

        for (int i = 0;
             i < vertices;
             i++) {

            System.out.println(
                    source +
                    " -> " +
                    i +
                    " = " +
                    distance[i]);
        }
    }
}