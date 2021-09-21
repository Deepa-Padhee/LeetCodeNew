public class MergeTwoBinaryTrees {
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1==null){
            return root2;
        }
        if (root2==null){
            return root1;
        }
        root1.val = root1.val + root2.val;
        root1.left = mergeTrees(root1.left,root2.left);
        root1.right = mergeTrees(root1.right,root2.right);
        return root1;
    }

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3,node5,null);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1,node3,node2);

        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode1 = new TreeNode(1,null,treeNode4);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(3,null,treeNode7);
        TreeNode treeNode2 = new TreeNode(2,treeNode1,treeNode3);

        System.out.println(mergeTrees(node1,treeNode2));
    }
}
