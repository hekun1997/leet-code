package org.example;

import org.example.object.TreeNode;

import java.util.*;

public class _94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (Objects.equals(root, null)){
            return null;
        }

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root.getLeft());
        q.add(root);
        q.add(root.getRight());
        while (!q.isEmpty()){

        }
        return null;
    }
    public static void main(String[] args) {

    }
}
