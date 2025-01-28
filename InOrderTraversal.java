import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    public class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public void inorder(TreeNode node, List<Integer> arr) {
        if (node == null)
            return;
        inorder(node.left, arr);
        arr.add(node.value);
        inorder(node.right, arr);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);    
        return ans;
    }
}
