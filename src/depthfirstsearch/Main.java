package depthfirstsearch;

public class Main {

	public static void main(String[] args) {

		// Depth First Search
		
		// DFS = a search algorithm for traversing 
		// 	     a tree or graph data structure
		// 1. Pick a route
		// 2. Keep going until you reach a dead end,
		// or a previously visited node
		// 3. Backtrack to last node that has
		// unvisited adjacent neighbors
		
		Graph graph = new Graph(5);
		
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
		
		graph.print();
		
		System.out.println("Let's search to the starting node");
		graph.depthFirstSearch(0);
		System.out.println("Let's search to B which has an index of 1");
		graph.depthFirstSearch(1);
		System.out.println("Let's search to C which has an index of 2");
		graph.depthFirstSearch(2);
		System.out.println("Let's search to D which has an index of 3");
		graph.depthFirstSearch(3); // We only visit D
		System.out.println("Let's search to E which has an index of 4");
		graph.depthFirstSearch(4);
		
	}

}
