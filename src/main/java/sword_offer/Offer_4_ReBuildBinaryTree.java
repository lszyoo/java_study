package sword_offer;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树（假设输入的前序遍历和中序遍历的结果中都不含重复的数字）。
 *
 * 例如：
 *      前序遍历序列：{1,2,4,7,3,5,6,8}
 *      中序遍历序列：{4,7,2,1,5,3,8,6}
 *      则重建二叉树并返回。
 */
public class Offer_4_ReBuildBinaryTree {
    public static void main(String[] args) {
        int[] be = {1 ,2, 4, 7, 3, 5, 6, 8};
        int[] af = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode node = reBuildBinaryTree(be, af);
        System.out.println(node);
        /*
           输出：TreeNode{val=1, left=TreeNode{val=2, left=TreeNode{val=4, left=null, right=TreeNode{val=7, left=null, right=null}}, right=null}, right=TreeNode{val=3, left=TreeNode{val=5, left=null, right=null}, right=TreeNode{val=6, left=TreeNode{val=8, left=null, right=null}, right=null}}}
         */
    }

    public static TreeNode reBuildBinaryTree (int[] be, int[] af) {
        return reBuildBinaryTree(be, 0, be.length - 1, af, 0, af.length - 1);
    }

    public static TreeNode reBuildBinaryTree (
            int[] be,
            int startBe,
            int endBe,
            int[] af,
            int startAf,
            int endAf
    ) {
        if (startBe > endBe || startAf > endAf)
            return null;
        TreeNode node = new TreeNode(be[startBe]);
        for (int i = startAf; i <= endAf; i++) {
            if (af[i] == be[startBe]) {
                node.left = reBuildBinaryTree(be, startBe + 1, endBe, af, startAf, i - 1);
                node.right = reBuildBinaryTree(be, i - startAf + startBe + 1, endBe, af, i + 1, endAf);
            }
        }
        return node;
    }

    // 定义二叉树
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode (int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
