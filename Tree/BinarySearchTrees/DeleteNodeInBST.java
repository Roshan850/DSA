package BinarySearchTrees;

class DeleteNodeInBST {
    public TreeNode dCode(TreeNode root,int val){
        if (root == null) {
            return null;
        }

        if (val < root.data) {
            root.left = dCode(root.left, val);
        }
        else if (val > root.data) {
            root.right = dCode(root.right, val);
        }
        else {
            // Node found

            // Case 1: No children
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            TreeNode IS = findIS(root.right);
            root.data = IS.data;
            root.right = dCode(root.right, IS.data);
        }

        return root;
    }

    public TreeNode findIS(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
