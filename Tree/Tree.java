class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
    }
}

class TreeStructure {
    Node root;

    TreeStructure() {
        root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node root, int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
            return n;
        } else {
            if (data <= root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    public void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.data + " ");
        inOrderTraversal(root.right);
    }

}

public class Tree {
    public static void main(String[] args) {
        TreeStructure t = new TreeStructure();
        for (int i = 1; i <= 14; i++) {
            t.insert(i);
        }
        t.inOrderTraversal();
    }
}
