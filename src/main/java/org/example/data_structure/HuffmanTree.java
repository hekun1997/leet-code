package org.example.data_structure;

import java.util.PriorityQueue;

/**
 * Created by hekun on 2023/3/21 10:29
 */
public class HuffmanTree {
    PriorityQueue<TreeNode> treeNodes = new PriorityQueue<>((o1, o2) -> {
        if (o1.value > o2.value) return 1;
        else if (o1.value == o2.value) return 0;
        return -1;
    });

    private TreeNode root;

    public HuffmanTree (int[] values) {
        for (int val : values) {
            treeNodes.offer(new TreeNode(val));
        }
        init();
    }

    public void init() {
        if (treeNodes.size() < 2) {
            return;
        }
        TreeNode o1;
        TreeNode o2;

        TreeNode parent;
        while (treeNodes.size() > 2) {
            o1 = treeNodes.poll();
            o2 = treeNodes.poll();

            parent = new TreeNode(o1.value + o2.value);

            parent.left = o1;
            parent.right = o2;

            treeNodes.offer(parent);
        }

        o1 = treeNodes.poll();
        o2 = treeNodes.poll();
        root = new TreeNode(o1.value + o2.value);
        root.left = o1;
        root.right = o2;
    }

    private class TreeNode {

        private int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }

        public TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        int[] values = {3,2,1,4,5,6};
        new HuffmanTree(values);
    }
}
