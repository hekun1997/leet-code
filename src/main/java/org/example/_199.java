package org.example;

import org.example.object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/2/20 16:20
 * 给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 */
public class _199 {

    private List<Integer> result = new ArrayList<>();

    public void order(TreeNode node, int deep){
        if (node == null) return;
        deep++;

        if (result.size() < deep) {
            result.add(node.val);
        }
        order(node.right, deep);
        order(node.left, deep);
    }

    public List<Integer> rightSideView(TreeNode root) {
        order(root, 0);
        return result;
    }
    public static void main(String[] args) {
        TreeNode _3 = new TreeNode(3);
        TreeNode _9 = new TreeNode(9);
        TreeNode _20 = new TreeNode(20);
        TreeNode _15 = new TreeNode(15);
        TreeNode _7 = new TreeNode(7);

        _3.left = _9;
        _3.right = _20;

        _20.left = _15;
        _20.right = _7;
        new _199().rightSideView(_3);
    }
}
