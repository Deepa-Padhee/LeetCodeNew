public class SearchInABinarySearchTree {
    public static TreeNode searchBST1(TreeNode root, int val) {
        TreeNode blankNode =new TreeNode(0);
        if (root.val == val){
            return root;
        }
        else {
            if (root.left != null){
                blankNode = searchBST(root.left,val);
            }
            else if (root.right != null){
                blankNode = searchBST(root.right,val);
            }
            else {
                return blankNode;
            }
        }
        return  blankNode;
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if (root.val == val){
            return root;
        }
            if (val< root.val){
                return searchBST(root.left,val);
            }
            else {
               return searchBST(root.right,val);
            }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2,node1,node3);
        TreeNode node7 = new TreeNode(7);
        TreeNode node4 = new TreeNode(4,node2,node7);

        System.out.println(searchBST(node4,2));
    }

}
