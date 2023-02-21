package org.example;

import org.example.object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/2/20 19:08
 * 给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。
 */
public class _515 {
    private List<Integer> result = new ArrayList<>();

    private void traverse(TreeNode node, int deep) {
        if (node == null) return;
        deep++;

        if (result.size() < deep) {  // not set
            result.add(deep-1, node.val);
        } else {  // already set
            int max = Math.max(node.val, result.get(deep-1));
            result.set(deep-1, max);
        }

        traverse(node.left, deep);
        traverse(node.right, deep);
    }

    public List<Integer> largestValues(TreeNode root) {
        traverse(root, 0);
        return result;
    }

    public static void main(String[] args) {

    }
}
