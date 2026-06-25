package backend.campusflow.trees;

public class BST {

    class Node {
        int key;
        Node left, right;

        Node(int item) {
            key = item;
        }
    }

    Node root;

    public Node insert(Node root, int key) {

        if (root == null)
            return new Node(key);

        if (key < root.key)
            root.left = insert(root.left, key);
        else if (key > root.key)
            root.right = insert(root.right, key);

        return root;
    }

    public void inorder(Node root) {

        if (root != null) {

            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
}