package org.example;

import org.example.object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/2/20 09:26
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 */
public class _144 {
    public void traversal(TreeNode node, List<Integer> result) {
        if (node != null) {
            result.add(node.val);
            traversal(node.left, result);
            traversal(node.right, result);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            result.add(root.val);
            traversal(root.left, result);
            traversal(root.right, result);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
