package backend.campusflow.trees;

public class BTree {

    static class Node {

        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    Node root;

    public BTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);

        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {

        if (root == null)
            return false;

        if (root.key == key)
            return true;

        if (key < root.key)
            return searchRec(root.left, key);

        return searchRec(root.right, key);
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {

        if (root != null) {

            inorderRec(root.left);

            System.out.print(root.key + " ");

            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {

        BTree tree = new BTree();

        tree.insert(100);
        tree.insert(200);
        tree.insert(150);
        tree.insert(300);
        tree.insert(250);

        System.out.println("Inorder Traversal:");
        tree.inorder();

        System.out.println("\nSearch 150: "
                + tree.search(150));
    }
}