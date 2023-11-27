package breathfirstsearch;

public class Main {

	public static void main(String[] args) {

		// Breadth First Search
		
		// BFS = a search algorithm for traversing
		//	     a tree or graph data structure.
		//  	 This is done one "level" at a time, using a queue
		//		 rather than one "branch" at a time, using a stack
		
		// Breadth FS = Traverse a graph level by level
		//		        Utilizes a Queue
		//        		Better if destination is on average close to start
		//				Siblings are visited before children
		
		// Depth FS  = Traverse a graph branch by branch
		// 			   Utilizes a stack
		//    	 	   Better if destination is on average far from the start
		//			   Children are visited before siblings
		//   		   More popular for games/puzzles
		
		Graph graph = new Graph(5);
		
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
		
		graph.print();
		
		System.out.println("Beginning at node A");
		graph.breadthFirstSearch(0); // Beginning at node A
		System.out.println("Beginning at node B");
		graph.breadthFirstSearch(1); // Beginning at node B
		System.out.println("Beginning at node C");
		graph.breadthFirstSearch(2); // Beginning at node C
		System.out.println("Beginning at node D");
		graph.breadthFirstSearch(3); // Beginning at node D
		System.out.println("Beginning at node E");
		graph.breadthFirstSearch(4); // Beginning at node E
		
	}
}
