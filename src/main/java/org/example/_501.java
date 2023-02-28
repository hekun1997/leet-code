package org.example;

import org.example.object.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hekun on 2023/2/23 09:23
 */
public class _501 {
    Map<Integer, Integer> map;
    int maxTimes = 0;
    public void traverse(TreeNode node) {
        if (node == null) return;  // exit

        // curr
        int times = map.getOrDefault(node.val, 0);
        times++;

        map.put(node.val, times);
        maxTimes = Math.max(maxTimes, times);

        // next
        traverse(node.left);
        traverse(node.right);
    }

    public int[] findMode(TreeNode root) {
        map = new HashMap<>();
        traverse(root);

        List<Integer> temp = new ArrayList<>();
        for(Integer key : map.keySet()) {
            if (map.get(key) == maxTimes) {
                temp.add(key);
            }
        }

        return temp.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        TreeNode _1 = new TreeNode(1);
        TreeNode _21 = new TreeNode(2);
        TreeNode _22 = new TreeNode(2);

        _1.right = _21;
        _21.left = _22;

        new _501().findMode(_1);
    }
}
