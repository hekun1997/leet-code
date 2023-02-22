package org.example;

import org.example.object.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by hekun on 2023/2/22 15:10
 */
public class _513 {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) return 0;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        int result = 0;
        while (!deque.isEmpty()) {
            boolean isSet = false;
            for (int i = deque.size(); i > 0; i--) {
                TreeNode curr = deque.removeFirst();
                if (!isSet) {
                    result = curr.val;
                    isSet = true;
                }
                if (curr.left != null) {
                    deque.addLast(curr.left);
                }
                if (curr.right != null) {
                    deque.addLast(curr.right);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
