package org.example.forOffer;

import org.example.object.TreeNode;

import java.util.*;

/**
 * Created by hekun on 2023/1/16 10:07
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 *
 * 
 *
 * 例如:
 * 给定二叉树:[3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回：
 *
 * [3,9,20,15,7]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _32 {
    public static int[] levelOrder(TreeNode root) {
        if (root == null){
            return new int[0];
        }
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        TreeNode curr = null;
        while (!stack.isEmpty()) {
            curr = stack.poll();
            result.add(curr.val);
            if (curr.left != null) {
                stack.add(curr.left);
            }
            if (curr.right != null) {
                stack.add(curr.right);
            }
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static int[] levelOrder2(TreeNode root) {
        if(root==null)return new int[0];
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<Integer> list=new ArrayList<Integer>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            list.add(node.val);
            if(node.left!=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        int[] result = levelOrder(treeNode1);
        Arrays.stream(result).forEach(System.out::println);
    }
}
