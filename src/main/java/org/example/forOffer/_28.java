package org.example.forOffer;

import org.example.object.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by hekun on 2023/1/17 09:36
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * 例如，二叉树[1,2,2,3,4,4,3] 是对称的。
 *   1
 *  / \
 *  2  2
 * / \ / \
 * 3 4 4 3
 * 但是下面这个[1,2,2,null,3,null,3] 则不是镜像对称的:
 *   1
 *  / \
 *  2  2
 *  \  \
 *  3  3
 * 示例 1：
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 * 示例 2：
 * 输入：root = [1,2,2,null,3,null,3]
 * 输出：false
 * 限制：
 * 0 <= 节点个数 <= 1000
 * 注意：本题与主站 101 题相同：https://leetcode-cn.com/problems/symmetric-tree/
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/dui-cheng-de-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _28 {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            TreeNode curr = null;
            for (int i = queue.size(); i > 0; i--) {
                curr = queue.poll();
                if (curr == null) {
                    list.add(null);
                } else {
                    list.add(curr.val);
                }
                if (curr != null) {
                    queue.add(curr.left);
                    queue.add(curr.right);
                }
            }
            for (int i = 0, j = list.size() - 1; i <= j; i++, j--) {
                if (list.get(i) != list.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode21 = new TreeNode(2);
        TreeNode treeNode22 = new TreeNode(2);
        TreeNode treeNode31 = new TreeNode(3);
        TreeNode treeNode32 = new TreeNode(3);

        treeNode1.left = treeNode21;
        treeNode1.right = treeNode22;

        treeNode21.right = treeNode31;

        treeNode22.left = treeNode32;

        System.out.println(isSymmetric(treeNode1));
    }
}
