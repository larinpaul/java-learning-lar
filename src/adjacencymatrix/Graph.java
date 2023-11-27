package adjacencymatrix;

import java.util.ArrayList;

public class Graph {

	ArrayList<Node> nodes;
	
	int[][] matrix;
	
	Graph(int size) { // size is the number of nodes that we have
		nodes = new ArrayList<>();
		matrix = new int[size][size];
	}
	
	public void addNode(Node node) {
		nodes.add(node);
	}
	
	public void addEdge(int src, int dst) { // src = row // dst = column
		matrix[src][dst] = 1; // 0 + 1, which means there is an edge between two nodes
	}
	
	public boolean checkEdge(int src, int dst) {
		if (matrix[src][dst] == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void print() {
		
		System.out.print("  "); // If you were to work with something more complex, I would consider working with printf so that you could align things more properly
		for (Node node : nodes) {
			System.out.print(node.data + " ");
		}
		System.out.println();
		
		for (int i = 0; i < matrix.length; i++) { // This will iterate over all of our rows
			System.out.print(nodes.get(i).data + " ");			
			
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
	
	
}
