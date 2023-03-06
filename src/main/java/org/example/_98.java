package org.example;

import org.example.object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/2/22 20:54
 */
public class _98 {
    public void traverse(TreeNode node, List<Integer> data) {
        if (node == null) return;
        traverse(node.left, data);
        data.add(node.val);
        traverse(node.right, data);
    }
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        List<Integer> data = new ArrayList<>();
        traverse(root, data);
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) <= data.get(i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
