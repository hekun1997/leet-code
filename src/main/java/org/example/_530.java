package org.example;

import org.example.object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/2/22 21:33
 */
public class _530 {
    public void traverse(TreeNode curr, List<Integer> data) {
        if (curr == null) return;
        traverse(curr.left, data);
        data.add(curr.val);
        traverse(curr.right, data);
    }

    public int getMinimumDifference(TreeNode root) {
        int result = Integer.MAX_VALUE;
        List<Integer> data = new ArrayList<>();
        traverse(root, data);
        for (int i = 1; i < data.size(); i++) {
            int temp = data.get(i) - data.get(i-1);
            if (temp < result){
                result = temp;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
