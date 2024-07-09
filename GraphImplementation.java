import java.util.ArrayList;
import java.util.Arrays;

public class GraphImplementation {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 0));
        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 1));
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[4];
        createGraph(graph);
        for (int i = 0; i < graph[1].size(); i++) {
            System.out.println(graph[1].get(i).src + " --> " + graph[1].get(i).dest);
        }
    }
}
