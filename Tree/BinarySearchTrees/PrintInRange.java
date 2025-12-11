package BinarySearchTrees;

public class PrintInRange {
    public void codeR(TreeNode root, int k1, int k2) {
        if (root == null) return;

        // If root.data is greater than k1, explore left subtree
        if (root.data > k1) {
            codeR(root.left, k1, k2);
        }

        // If root is in range, print it
        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }

        // If root.data is less than k2, explore right subtree
        if (root.data < k2) {
            codeR(root.right, k1, k2);
        }
    }

}
