package backend.campusflow.trees;

import java.util.ArrayList;
import java.util.List;

public class BPlusTree {

    static class Node {

        List<Integer> keys;
        List<Node> children;
        boolean isLeaf;

        Node(boolean isLeaf) {
            this.isLeaf = isLeaf;
            keys = new ArrayList<>();
            children = new ArrayList<>();
        }
    }

    private Node root;

    public BPlusTree() {
        root = new Node(true);
    }

    public void insert(int key) {

        root.keys.add(key);
        root.keys.sort(Integer::compareTo);
    }

    public boolean search(int key) {

        return root.keys.contains(key);
    }

    public void display() {

        System.out.println("B+ Tree Keys:");

        for (Integer key : root.keys) {
            System.out.print(key + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        BPlusTree tree = new BPlusTree();

        tree.insert(101);
        tree.insert(105);
        tree.insert(103);
        tree.insert(120);
        tree.insert(115);

        tree.display();

        System.out.println(
                "Search 103 : "
                        + tree.search(103)
        );
    }
}