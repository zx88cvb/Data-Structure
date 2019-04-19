package com.angel;

/**
 * 二分搜索树
 * @author JingXiang Bi
 * @date 2019/4/18
 */
public class BST<E extends Comparable<E>> {
    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    // 根节点
    private Node root;

    // 记录多少元素
    private int size;

    public BST() {
        this.root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // 向二分搜索树中添加新的元素e
    public void add (E e) {
        /*if (root == null) {
            root = new Node(e);
            size ++;
        }*/
        root = add(root, e);
    }

    // 以node为根的二分搜索树插入元素E 递归算法(无重复元素)
    // 返回插入新节点后二分搜索树的根
    private Node add (Node node, E e) {
        /*if (e.equals(node.e)) {
            return;
        } else if (e.compareTo(node.e) < 0 && node.left == null) {
            node.left = new Node(e);
            size ++;
            return;
        } else if (e.compareTo(node.e) > 0 && node.right == null) {
            node.right = new Node(e);
            size ++;
            return;
        }*/

        if (node == null) {
            size ++;
            return new Node(e);
        }

        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0){
            node.right = add(node.right, e);
        }

        return node;
    }

    // 二分搜索树是否包含元素e
    public boolean contains (E e) {
        return contains(root, e);
    }

    // 以node为根的二分搜索树是否包含e
    private boolean contains (Node node, E e) {
        // 根节点为null
        if (node == null)
            return false;

        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            return contains(node.left, e);
        } else {
            return contains(node.right, e);
        }
    }

    // 前序遍历
    public void preOrder() {
        preOrder(root);
    }

    // 前序遍历以node为根的二分搜索树 递归算法
    private void preOrder (Node node) {
        if (node == null)
            return;
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    // 中序遍历
    public void inOrder() {
        inOrder(root);
    }

    // 中序遍历以node为根的二分搜索树 递归算法
    private void inOrder (Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    // 后序遍历
    public void postOrder() {
        postOrder(root);
    }

    // 后序遍历以node为根的二分搜索树 递归算法
    private void postOrder (Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);
        return res.toString();
    }

    private void generateBSTString(Node node, int depth, StringBuilder res) {
        if (node == null) {
            res.append(generateDepthString(depth) + "null\n");
            return;
        }

        res.append(generateDepthString(depth) + node.e + "\n");
        generateBSTString(node.left, depth + 1, res);
        generateBSTString(node.right, depth + 1, res);
    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0;i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }
}
