class T37_BST {
    class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    Node root;

    // ================= INSERT =================
    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // ================= SEARCH =================
    boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    // ================= FIND MIN =================
    int minValue(Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    // ================= DELETE =================
    Node delete(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Case 1: No child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 2: Two children
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    // ================= INORDER =================
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // ================= PREORDER =================
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // ================= POSTORDER =================
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // ================= MAIN =================
    public static void main(String[] args) {
        T37_BST tree = new T37_BST();

        // Insert nodes
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        // Traversals
        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);

        // Search
        int key = 40;
        if (tree.search(tree.root, key))
            System.out.println("\nElement " + key + " found");
        else
            System.out.println("\nElement " + key + " not found");

        // Delete
        System.out.println("\nDeleting 20...");
        tree.root = tree.delete(tree.root, 20);
        System.out.println("ROOT NOW" + tree.root.data);

        System.out.print("Inorder after deletion: ");
        tree.inorder(tree.root);
    }
}