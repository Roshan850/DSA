package BinarySearchTrees;

import java.util.ArrayList;

public class MergeTwoBST {
    public void inorderSeq(TreeNode root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        inorderSeq(root.left,arr);
        arr.add(root.data);
        inorderSeq(root.right,arr);
    }

    public TreeNode createBST(ArrayList<Integer> arr,int si,int end){
        if(si > end){
            return null;
        }
        int mid = (si + end)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = createBST(arr,si,mid-1);
        root.right = createBST(arr,mid+1,end);

        return root;


    }
    public TreeNode mergeBSTs(TreeNode root1,TreeNode root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        inorderSeq(root1,arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        inorderSeq(root2,arr2);


        //Merge sorted array
        int i=0;
        int j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                 finalArr.add(arr1.get(i));
                 i++;
            }else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }
        while (j< arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }

       return createBST(finalArr,0,finalArr.size()-1);

    }
    public void preorderTrav(TreeNode root){
        if(root == null) return;

        System.out.print(root.data+"->");
            preorderTrav(root.left);
            preorderTrav(root.right);
        }
    }

