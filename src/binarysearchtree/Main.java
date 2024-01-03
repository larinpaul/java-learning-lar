package binarysearchtree;

public class Main {

	public static void main(String[] args) {
		
		// Our Binary Tree is UNBALANCED.
		
		// Binary Search Tree = A tree data structure, where each node is greater than its left child,
		// 						but less that its right.
		//
		//						benefit: easy to locate a node when they are in this order
		//
		//						time complexity: best case O(log n)
		//										 worst case O(n)
		//
		//						space complexity: O(n)

		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(new Node(5));
		tree.insert(new Node(1));
		tree.insert(new Node(9));
		tree.insert(new Node(2));
		tree.insert(new Node(7));
		tree.insert(new Node(3));
		tree.insert(new Node(6));
		tree.insert(new Node(4));
		tree.insert(new Node(8));
		
		tree.display();
//		tree.displayReversed(); // yeah it didn't work
		
		System.out.println(tree.search(0)); // false
		System.out.println(tree.search(1)); // true
		System.out.println(tree.search(9)); // true
		System.out.println(tree.search(10)); // false
		
		tree.remove(0); // 0 could not be found
	
		tree.remove(7);
		tree.display();
		
	}

}
