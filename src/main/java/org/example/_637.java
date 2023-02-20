package org.example;

import org.example.object.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/2/20 16:41
 * 给定一个非空二叉树的根节点 root , 以数组的形式返回每一层节点的平均值。与实际答案相差 10-5 以内的答案可以被接受。
 */
public class _637 {
    List<List<Integer>> allData = new ArrayList<>();

    public void order(TreeNode node, int deep) {
        if (node == null) return;
        deep++;

        if (allData.size() < deep) {
            allData.add(new ArrayList<>());
        }

        allData.get(deep-1).add(node.val);
        order(node.left, deep);
        order(node.right, deep);
    }

    public List<Double> averageOfLevels(TreeNode root) {
        order(root, 0);
        List<Double> result = new ArrayList<>(allData.size());
        for (List<Integer> datas : allData) {
            Double sum = 0D;
            for (Integer data: datas) {
                sum += data;
            }
            result.add(sum / datas.size());
        }
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
        new _637().averageOfLevels(_3);
    }
}
