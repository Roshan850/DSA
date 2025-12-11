package BinarySearchTrees;

public class MirrorImg {
    public TreeNode codeMirror(TreeNode root){
        if(root == null){
            return null;
        }
        root.left =  codeMirror(root.left);
        root.right = codeMirror(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
