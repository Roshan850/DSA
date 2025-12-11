package BinarySearchTrees;

public class SortedArrayToBalancedBST {
    public TreeNode createBST(int[] arr,int st,int end){
        if(st> end){
            return null;
        }
        int mid = (st +end)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr,mid+1,end);
        return root;
    }
}
