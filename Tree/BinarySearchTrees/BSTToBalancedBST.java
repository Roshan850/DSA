package BinarySearchTrees;

import java.util.ArrayList;

public class BSTToBalancedBST {
    public void convertBSTToSortedArray(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;
        convertBSTToSortedArray(root.left,arr);
        arr.add(root.data);
        convertBSTToSortedArray(root.right,arr);

    }
    public TreeNode creatBST(ArrayList<Integer> arr,int si,int end){
        if(si > end){
            return null;
        }
        int mid = (si + end)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = creatBST(arr,si,mid-1);
        root.right = creatBST(arr,mid+1,end);

        return root;

    }
    public TreeNode convertBST(TreeNode root){
        //Inorder sequence
        ArrayList<Integer> arr = new ArrayList<>();
        convertBSTToSortedArray(root,arr);

        // iorder to BalancedBST
        root = creatBST(arr,0,arr.size() - 1);
        return root;

    }
    public void preorderTraversel(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+"->");
        preorderTraversel(root.left);
        preorderTraversel(root.right);
    }

}
