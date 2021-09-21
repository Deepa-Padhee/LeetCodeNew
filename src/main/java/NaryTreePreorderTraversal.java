import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {

    static List<Integer> myList = new ArrayList<>();

    public static List<Integer> preorder(Node root) {
        preorderNarry(root);

        return myList;
    }

    private static void preorderNarry(Node root) {

        if (root == null) return;

        myList.add(root.val);

        for (Node node : root.children) {
            preorderNarry(node);
        }

    }

    public static void main(String[] args) {
        List<Node> rootList = new ArrayList<>();
        rootList.add(new Node());
        rootList.add(new Node(3));
        rootList.add(new Node(2));
        rootList.add(new Node(4));
        rootList.add(new Node());
        rootList.add(new Node(5));
        rootList.add(new Node(6));
        Node root = new Node(1,rootList);
        List<Integer> res = preorder(root);
        for (int i = 0;i< res.size();i++){
            System.out.print(res.get(i) + " ");
        }
    }
}
