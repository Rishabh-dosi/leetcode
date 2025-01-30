public class MaximumDepthOfBinaryTree {
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
    public int dep(TreeNode root, int count){
        if(root == null) return count;
        if(root.right != null || root.left !=null) count+=1;
        return Math.max(dep(root.right, count), dep(root.left, count));
    }
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return dep(root, 1);
    }
}
