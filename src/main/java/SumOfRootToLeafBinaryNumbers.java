public class SumOfRootToLeafBinaryNumbers {
    static int res =0;
    public static int sumRootToLeaf(TreeNode root) {
        loopNode(root,0);
        return res;
    }

    private static void loopNode(TreeNode node, int val){
        if (node == null){
            return;
        }
        val = val*2 + node.val;
        if (node.left == null && node.right == null){
            res = res + val;
        }

        loopNode(node.left,res);
        loopNode(node.right,res);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(0);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(0,a,b);
        TreeNode d = new TreeNode(0);
        TreeNode e = new TreeNode(1);
        TreeNode f = new TreeNode(1,d,e);
        TreeNode root = new TreeNode(1,c,f);
        System.out.print(sumRootToLeaf(root));
    }

}
