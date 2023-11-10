package treetraversal;

public class Main {

    public static void main(String[] args) {
    	
    	// What is supposed to be here???

    }

    // In-order traversal is left->root->right
    // In-order traversal, when used in the context of a Binary Search tree,
    // visits all of the nodes in a non-decreasing order
    private static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left); // left
        System.out.println(root.data); // root
        inOrderTraversal(root.right); // right
    }

    // Post-order traversal is left->right->root
    // Post-order traversal is used to delete a tree from leaf to root
    private static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left); // left
        postOrderTraversal(root.right); // right
        System.out.println(root.data); // root
    }

    // Pre-order traversal is root->left->right
    // Pre-order traversal is used to create a copy of a tree
    private static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data); // root
        preOrderTraversal(root.left); // left
        preOrderTraversal(root.right); // right
    }

    public static class Node {

        String data;
        Node left;
        Node right;

        public Node(String data) {
            this.data = data;
        }

    }

}