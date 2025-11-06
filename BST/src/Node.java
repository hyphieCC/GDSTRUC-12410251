public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (left == null) {
                left = new Node(value);
            }
            else {
                left.insert(value);
            }
        }
        else {
            if (right == null) {
                right = new Node(value);
            }
            else {
                right.insert(value);
            }
        }
    }

    public void traverseInOrderAscending() {
        if (left != null) {
            left.traverseInOrderAscending();
        }

        System.out.println("Traversed: " + this);

        if (right != null) {
            right.traverseInOrderAscending();
        }
    }

    public void traverseInOrderDescending() {
        if (right != null) {
            right.traverseInOrderDescending();
        }

        System.out.println("Traversed: " + this);

        if (left != null) {
            left.traverseInOrderDescending();
        }
    }

    public Node get(int value) {
        if (value == data) {
            return this;
        }

        if (left != null && value < data) {
            return left.get(value);
        }

        if (right != null && value > data) {
            return right.get(value);
        }

        return null;
    }

    public Node getMin() {
        if (left == null) {
            return this;
        }

        return left.getMin();
    }

    public Node getMax() {
        if (right == null) {
            return this;
        }

        return right.getMax();
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}