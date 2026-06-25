package backend.campusflow.graphs;

public class DFS {

    public static void traverse(Graph graph, int start) {

        boolean[] visited =
                new boolean[graph.getVertices()];

        System.out.print("DFS Traversal: ");

        dfs(graph, start, visited);

        System.out.println();
    }

    private static void dfs(
            Graph graph,
            int vertex,
            boolean[] visited) {

        visited[vertex] = true;

        System.out.print(vertex + " ");

        for (Integer neighbor :
                graph.getAdjList()[vertex]) {

            if (!visited[neighbor]) {

                dfs(graph, neighbor, visited);
            }
        }
    }
}