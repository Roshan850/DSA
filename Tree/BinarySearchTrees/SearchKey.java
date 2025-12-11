package BinarySearchTrees;

public class SearchKey {
    public boolean sCode(TreeNode root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        else if(key < root.data){
           return   sCode(root.left,key);
        }
        else {
           return sCode(root.right,key);
        }

    }
    public void inorderTrav(TreeNode root){
        if(root == null){
            return;
        }
        inorderTrav(root.left);
        System.out.print(root.data+"->");
        inorderTrav(root.right);
    }
}
