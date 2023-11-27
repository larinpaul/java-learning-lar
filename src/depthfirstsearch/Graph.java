package depthfirstsearch;

import java.util.ArrayList;

public class Graph {
	
	// We're using an adjacency matrix.
	// If it were an adjacency list, the code would've been just a little bit different
	
	ArrayList<Node> nodes;
	int[][] matrix;
	
	Graph(int size) {
		
		nodes = new ArrayList<>();
		matrix = new int[size][size];
		
	}
	
	public void addNode(Node node) {
		nodes.add(node);
	}
	
	public void addEdge(int src, int dst) {
		matrix[src][dst] = 1;
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
		
		System.out.print(" ");
		for (Node node : nodes) {
			System.out.print(node.data + " ");
		}
		System.out.println();
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(nodes.get(i).data + " ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void depthFirstSearch(int src) {
		boolean[] visited = new boolean[matrix.length];
		dFSHelper(src, visited);
	}
	
	// You can implement it iteratively using a stack
	// Or you can use recursion with a call stack
	// Here we use recursion
	private void dFSHelper(int src, boolean[] visited) {
		
		if (visited[src] == true) {
			return;
		}
		else {
			visited[src] = true;
			System.out.println(nodes.get(src).data + " = visited");
		}
		
		for(int i = 0; i < matrix[src].length; i++) {
			if (matrix[src][i] == 1) {
				dFSHelper(i, visited);
			}
		}
		return;
		
	}
	
	
	
	
		
	

}
