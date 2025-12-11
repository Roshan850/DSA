package BinarySearchTrees;


public class ValidateBST {
    public boolean isValidBST(TreeNode root,TreeNode min,TreeNode max){
       if(root == null){
           return true;
       }
       if(min != null && root.data <= min.data){
           return false;
       }
       else if(max != null && root.data >= max.data){
           return false;
       }

           return isValidBST(root.left,min,root)
                   && isValidBST(root.right,root,max);

    }
}
