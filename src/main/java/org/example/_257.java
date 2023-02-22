package org.example;

import org.example.object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/2/21 21:08
 */
public class _257 {
    private List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        traverse(root.left, String.valueOf(root.val));
        traverse(root.right, String.valueOf(root.val));
        return result;
    }

    public void traverse(TreeNode node, String path) {
        path += "->" + node.val;

        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }
        if (node.left != null) {
            traverse(node.left, path);
        }
        if (node.right != null) {
            traverse(node.right, path);
        }
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

        System.out.println(new _257().binaryTreePaths(_3));
    }
}
