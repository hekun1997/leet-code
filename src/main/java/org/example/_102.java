package org.example;

import org.example.object.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by hekun on 2023/2/20 15:06
 */
public class _102 {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        order(root, 0);
        Collections.reverse(result);
        return result;
    }

    private void order(TreeNode node, int deep) {
        if (node == null) return;
        deep++;

        if (result.size() < deep) {
            result.add(new ArrayList<>());
        }

        result.get(deep - 1).add(node.val);

        order(node.left, deep);
        order(node.right, deep);
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

        System.out.println(new _102().levelOrderBottom(_3));
    }
}
