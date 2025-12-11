public class SubTreeOfAnotherTree {
    public boolean isSubTree(Node root,Node subRoot){
        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

        return isSubTree(root.left,subRoot) || isSubTree(root.right,subRoot);
    }

    public boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null){
            return true;
        }
        else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }
        if(!isIdentical(node.left,subRoot.left)){
            return false;
        }
        return isIdentical(node.right, subRoot.right);
    }
}
