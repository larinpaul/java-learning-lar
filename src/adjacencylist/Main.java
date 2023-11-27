package adjacencylist;

public class Main {

	public static void main(String args[]) {
		
		// Adjacency List = An array/arraylist of linkedlists.
		//				    Each LinkedList has a unique node at the head.
		//   				All adjacent neighbors to that node are added to that node's linkedlist
		
		// 					runtime complexity to check an Edge: O(v)
		//					space complexity: O(v + e)
		
		Graph graph = new Graph();
		
		graph.addNode(new Node('A')); // 0
		graph.addNode(new Node('B')); // 1
		graph.addNode(new Node('C')); // 2
		graph.addNode(new Node('D')); // 3
		graph.addNode(new Node('E')); // 4
		
		graph.addEdge(0, 1); // A -> B
		graph.addEdge(1, 2); // B -> C
		graph.addEdge(1, 4); // B -> E
		graph.addEdge(2, 3); // C -> D
		graph.addEdge(2, 4); // C -> E
		graph.addEdge(4, 0); // E -> A
		graph.addEdge(4, 2); // E -> C
		
		graph.print();
		
	}
	
}
