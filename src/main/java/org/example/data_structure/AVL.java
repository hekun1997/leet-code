package org.example.data_structure;

/**
 * Created by hekun on 2023/3/21 9:55
 */
public class AVL<T> {
    private AVLNode<T> root;

    private class AVLNode<T> {
        private T value;
        private AVLNode<T> left;
        private AVLNode<T> right;
        private int height;

        public void LL() {  // k2
            /**
             *         k2
             *        /  \
             *       k1  node
             *      /  \
             *    node node
             *    /
             *  node
             */
            AVLNode<T> k2  = this;
            AVLNode<T> k1 = this.left;

            k2.left = k1.right;
            k1.right = k2;

            k2.height = Math.max(k2.left.height, k2.right.height) + 1;
            k1.height = Math.max(k1.left.height, k1.right.height) + 1;
        }

        public void RR() {
            /**
             *         k1
             *        /  \
             *     node   k2
             *          /  \
             *       node node
             *               \
             *               node
             */
            AVLNode<T> k1 = this;
            AVLNode<T> k2 = this.right;

            k1.right = k2.left;
            k2.left = k1;

            k1.height = Math.max(k1.left.height, k1.right.height) + 1;
            k2.height = Math.max(k2.left.height, k2.right.height) + 1;
        }

        public void LR() {
            LL();
            RR();
        }

        public void RL() {
            RR();
            LL();
        }
    }
}
