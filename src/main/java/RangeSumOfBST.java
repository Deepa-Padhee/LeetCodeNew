public class RangeSumOfBST {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        int result = 0;

        if (root.val>=low && root.val<=high){
            result = result + root.val;
        }
        if (root.val>low){
            result = result + rangeSumBST(root.left,low,high);
        }
        if (root.val<high){
            result = result + rangeSumBST(root.right,low,high);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node7 = new TreeNode(7);
        TreeNode node5 = new TreeNode(5,node3,node7);
        TreeNode node18 = new TreeNode(18);
        TreeNode node15 = new TreeNode(15,null,node18);

        TreeNode treeNode = new TreeNode(10,node5,node15);
        int result = rangeSumBST(treeNode,7,15);
        System.out.println(result);
    }
}
