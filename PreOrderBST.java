import java.util.ArrayList;
import java.util.List;

public class PreOrderBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public List<Integer> preOrder(TreeNode root, List<Integer> l){
        if (root == null) {
            return l;
        }
        l.add(root.val);
        preOrder(root.left, l);
        preOrder(root.right, l);
        return l;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        return preOrder(root, l);
    }
}
