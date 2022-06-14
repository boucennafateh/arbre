package org.fate7;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    Node(){
    }

    Node(int val) {
        this.value = val;
    }

    Node(int val, Node left, Node right) {
        this.value = val;
        this.leftChild = left;
        this.rightChild = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + value +
                ", left=" + leftChild +
                ", right=" + rightChild +
                '}';
    }
}

