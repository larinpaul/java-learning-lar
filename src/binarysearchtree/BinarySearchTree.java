package binarysearchtree;

public class BinarySearchTree {

	Node root;
	
	public void insert(Node node) {
		
		root = insertHelper(root, node);
		
	}
	
	private Node insertHelper(Node root, Node node) {
		
		int data = node.data;
		
		if(root == null) {
			root = node;
			return root;
		}
		else if(data < root.data) {
			root.left = insertHelper(root.left, node);
		}
		else {
			root.right = insertHelper(root.right, node);
		}
		
		return root;
		
	}
	
	public void display() {
		displayHelper(root);
	}
	
	public void displayReversed() { // Yeah it didn't work...
		displayHelperReversed(root);
	}
	
	private void displayHelper(Node root) {
		if (root != null) {
			displayHelper(root.left);
			System.out.println(root.data);
			displayHelper(root.right);
		}
	}
	
	private void displayHelperReversed(Node root) { // Yeah it didn't work...
		if (root != null) {
			displayHelper(root.right);
			System.out.println(root.data);
			displayHelper(root.left);
		}
	}
	
	public boolean search(int data) {
		return searchHelper(root, data);
	}
	
	private boolean searchHelper(Node root, int data) {
		
		if (root == null) {
			return false;
		}
		else if (root.data == data) {
			return true;
		}
		else if (root.data > data) {
			return searchHelper(root.left, data);
		}
		else {
			return searchHelper(root.right, data);
		}
	}
	
	public void remove(int data) {
		
		if (search(data)) { // if (true)
			removeHelper(root, data);
		}
		else {
			System.out.println(data + " could not be found");
		}
		
	}
	
	public Node removeHelper(Node root, int data) {
		
		if (root == null) {
			return root;
		}
		else if (data < root.data) {
			root.left = removeHelper(root.left, data);
		}
		else if (data > root.data) {
			root.right = removeHelper(root.right, data);
		}
		else { // node found
			if (root.left == null && root.right == null) {
				root = null;
			}
			else if (root.right != null) {// means there is a right child
				root.data = successor(root); // find a successor to replace this node
				root.right = removeHelper(root.right, root.data);
			}
			else { // find a predecessor to replace this node
				root.data = predecessor(root);
				root.left = removeHelper(root.left, root.data);
			}
		}
		
		return root;
	}
	
	private int successor(Node root) { // find least value below the right child of this root node
		root = root.right;
		while (root.left != null) {
			root = root.left;
		}
		return root.data;
	}
	
	private int predecessor(Node root) {
		root = root.left;
		while (root.right != null) {
			root = root.right;
		}
		return root.data;
	}
	
}
