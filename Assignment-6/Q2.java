import java.util.*;

public class Q2 {

    // Method to convert an adjacency matrix to an adjacency list
    public static List<List<Integer>> convertToAdjacencyList(int[][] matrix) {
        int n = matrix.length; // Number of vertices in the graph
        List<List<Integer>> adjacencyList = new ArrayList<>();

        // Initialize the adjacency list with empty lists for each vertex
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        // Traverse the adjacency matrix and add edges to the adjacency list
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] == 1) {
                    adjacencyList.get(i).add(j);
                    adjacencyList.get(j).add(i); // Since the graph is undirected
                }
            }
        }
        return adjacencyList;
    }

    // Method to display the adjacency list
    public static void displayAdjacencyList(List<List<Integer>> adjacencyList) {
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print(i + ": ");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example adjacency matrix for an undirected graph
        int[][] matrix = {
                {0, 1, 1, 0},  // Vertex 0 is connected to 1 and 2
                {1, 0, 1, 1},  // Vertex 1 is connected to 0, 2, and 3
                {1, 1, 0, 0},  // Vertex 2 is connected to 0 and 1
                {0, 1, 0, 0}   // Vertex 3 is connected to 1
        };

        // Convert the adjacency matrix to an adjacency list
        List<List<Integer>> adjacencyList = convertToAdjacencyList(matrix);
        // Display the adjacency list
        System.out.println("Adjacency List:");
        displayAdjacencyList(adjacencyList);
    }
}
