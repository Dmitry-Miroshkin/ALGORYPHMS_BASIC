package HomeWork.Lesson6;

import java.util.NoSuchElementException;

public class MyDigitTree {
    private Node root;

    private class Node {

        int value;
        Node left;
        Node right;
        int size;

        public Node(int value) {

            this.value = value;
            this.size = 1;
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        return node.size;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public final int get(int size) {

        return get(root, size);
    }

    private int get(Node node, int size) {
        if (node == null) {
            return 0;
        }
        if (size == node.size) {
            return node.value;
        } else if (size < node.size) {
            return get(node.left, size);
        } else {
            return get(node.right, size);
        }
    }

    public final void put(int value) {

        root = put(root, value);
    }

    private Node put(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value == node.value) {
            node.value = value;
        } else if (value < node.value) {
            node.left = put(node.left, value);
        } else {
            node.right = put(node.right, value);
        }
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    public int minValue() {
        return min(root).value;
    }

    private Node min(Node node) {
        if (node.left == null) {
            return node;
        }
        return min(node.left);
    }

    public void deleteMin() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        root = deleteMin(root);
    }

    private Node deleteMin(Node node) {
        if (node.left == null) {
            return node.right;
        }
        node.left = deleteMin(node.left);
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    public final void delete(int value) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        root = delete(root, value);
    }

    private Node delete(Node node, int value) {
        if (node == null) {
            return null;
        }

        if (value < node.value) {
            node.left = delete(node.left, value);
        } else if (value > node.value) {
            node.right = delete(node.right, value);
        } else {
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            Node tmp = node;
            node = min(node.right);
            node.right = deleteMin(tmp.right);
            node.left = tmp.left;
        }
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    @Override
    public String toString() {
        return toString(root);
    }

    private String toString(Node node) {
        if (node == null) {
            return "";
        }
        return toString(node.left)
                + "[" + node.value + "], "
                + toString(node.right);
    }
}
