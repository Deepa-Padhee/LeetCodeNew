public class IncreasingOrderSearchTree {

    private static TreeNode dummyRoot = new TreeNode(0);
    private static TreeNode p = dummyRoot;

    public static TreeNode increasingBST(TreeNode root) {
        /*TreeNode treeNode = new TreeNode();
        if (root.left!=null){
            increasingBST(root.left);
        }
        else {
            treeNode
        }
        return treeNode;*/
        buildTree(root);
        return dummyRoot.right;
    }

    private static void buildTree(TreeNode root) {
        if (root == null) return;
        buildTree(root.left);
        p.right = new TreeNode(root.val);
        p = p.right;
        buildTree(root.right);
    }

        public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2,node1,null);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3,node2,node4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node8 = new TreeNode(8,node7,node9);
        TreeNode node6 = new TreeNode(6,null,node8);
        TreeNode node5 = new TreeNode(5,node3,node6);
        System.out.println(increasingBST(node5));
    }
}
