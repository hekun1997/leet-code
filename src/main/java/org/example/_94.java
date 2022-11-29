package org.example;

import org.example.object.TreeNode;

import java.util.*;

public class _94 {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> retVal = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                curr = stack.pop();
                retVal.add(curr.val);
                curr = curr.right;
            }
        }
        return retVal;
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        a.right = b;
        b.left = c;

        System.out.println(inorderTraversal(a));
    }
}
