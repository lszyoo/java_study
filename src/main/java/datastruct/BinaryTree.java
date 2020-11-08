package datastruct;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    // 判断二叉树是否是平衡二叉树：根结点之差不超过 1
    public boolean isBalanced_Solution(TreeNode root) {
        if (root == null)
            return true;
        if (Math.abs(getDepth(root.left) - getDepth(root.right)) > 1)
            return false;
        return isBalanced_Solution(root.left) && isBalanced_Solution(root.right);
    }

    // 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
    public int getDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);

        return (left > right ? left : right) + 1;
    }

    // 二叉树的前序遍历

    // 迭代
    public List<Integer> preOrder1(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            // 由于栈先进后出的特性，所以先将右子树入栈，再将左子树入栈
            if(node.right != null) {
                stack.push(node.right);
            }
            if(node.left != null) {
                stack.push(node.left);
            }
        }

        return list;
    }

    // 递归
    public List<Integer> preOrderReverse(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder2(root, result);
        return result;
    }

    public void preOrder2(TreeNode root, List<Integer> result) {
        if (root == null)
            return;
        result.add(root.val);
        preOrder2(root.left, result);
        preOrder2(root.right, result);
    }


    // 二叉树的中序遍历

    // 迭代
    public List<Integer> midOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }

    // 递归
    public void midOrderRe(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        } else {
            midOrderRe(treeNode.left);  // 左
            System.out.println(treeNode.val);  // 根
            midOrderRe(treeNode.right);  // 右
        }
    }

//    // 判断二叉树是否是合法的二叉查找树(BST)
//    public boolean isValidBST(TreeNode root) {
//        if (root == null)
//            return true;
//        if (isValidBST(root.left)) {
//            if ()
//        }
//    }

    // 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
    public class tree2DoubleLinkList {
        public TreeNode Convert(TreeNode pRootOfTree) {
            if(pRootOfTree==null)
                return null;
            if(pRootOfTree.left==null && pRootOfTree.right==null)
                return pRootOfTree;
//左子树遍历
            TreeNode left=Convert(pRootOfTree.left);
            TreeNode pNode=left;
            while(pNode!=null && pNode.right!=null)
//得到左子树的最后一个结点
                pNode=pNode.right;
            if(left!=null){
                pNode.right=pRootOfTree;
                pRootOfTree.left=pNode;
            }
//右子树遍历
            TreeNode right=Convert(pRootOfTree.right);
            if(right!=null){
                right.left=pRootOfTree;
                pRootOfTree.right=right;
            }
            return left!=null?left:pRootOfTree;
        }}

}
