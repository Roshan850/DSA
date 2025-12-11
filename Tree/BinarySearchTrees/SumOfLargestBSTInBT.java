package BinarySearchTrees;


class SumOfLargestBSTInBT {

    int maxSum = 0;

    public int maxSumBST(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private Info2 dfs(TreeNode root) {

        if (root == null) {
            return new Info2(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info2 left = dfs(root.left);
        Info2 right = dfs(root.right);

        boolean isBST = left.isBST && right.isBST &&
                root.data > left.max && root.data < right.min;

        if (!isBST) {
            return new Info2(false, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        int sum = left.sum + right.sum + root.data;
        int min = Math.min(root.data, left.min);
        int max = Math.max(root.data, right.max);

        maxSum = Math.max(maxSum, sum);

        return new Info2(true, sum, min, max);
    }
}

class Info2 {
    boolean isBST;
    int sum;
    int min, max;

    Info2(boolean isBST, int sum, int min, int max) {
        this.isBST = isBST;
        this.sum = sum;
        this.min = min;
        this.max = max;
    }
}

