public class BST {
    public static class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node right, Node left) {
            this.value = value;
            this.right = right;
            this.left = left;

        }

    }
    
    public Node insert(int value, Node n) {
        if (n == null) {
            n = new Node(value);
            return n;
        }
        if (value < n.value) {
            n.left = insert(value, n.left);
        }
        if (value > n.value) {
            n.right = insert(value, n.right);
        }
        return n;
    }
}
