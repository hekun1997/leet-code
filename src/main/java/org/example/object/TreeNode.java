package org.example.object;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

//        for (int i = 1; i < 6; i++) {
//            System.out.println("TreeNode treeNode" + i + " = new TreeNode(" + i + ");");
//        }