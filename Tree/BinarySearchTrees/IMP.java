package BinarySearchTrees;

import java.util.ArrayList;

public class IMP {
    public static void main(String[] args) {
//        TreeNode root= new TreeNode(27);
//        root.left = new TreeNode(15);
//        root.right = new TreeNode(28);
//        root.left.left = new TreeNode(11);
//        root.left.right = new TreeNode(16);
//        root.right = new TreeNode(26);
//        root.right.right = new TreeNode(29);
        Insert t1 = new Insert();

        SearchKey s = new SearchKey();
////
//        int[] arr = {1,4,3,5,6,8,10,11,14};
//        for(int i =0;i<arr.length;i++){
//            t1.insert(root,arr[i]);
//        }
//        s.inorderTrav(root);
//        int k =27;
//        if(s.sCode(root,k)) {
//   System.out.println("\nFound key");            27
//                                                /  \
//                                              15    28
//                                              / \    \
//                                            11  16     29

//}
//
//else{
//    System.out.println("\nNot Found");
//}
//DeleteNodeInBST d = new DeleteNodeInBST();
//d.dCode(root,28);
//        s.inorderTrav(root);
//        ArrayList<Integer> path = new ArrayList<>();
//        PrintRootToLeafPath p = new PrintRootToLeafPath();
        System.out.println();
//        p.printRootToLeaf(root,path);

//    PrintInRange p1 = new PrintInRange();
//  p1.codeR(root,11,20);
//        MirrorImg m = new MirrorImg();
//        TreeNode treeNode = m.codeMirror(root);
//        s.inorderTrav(treeNode);

//        int[] arr = {8,5,3,6,10,11,14};
//        TreeNode root = null;
//        for (int i = 0 ;i< arr.length;i++){
//            root = t1.insert(root,arr[i]);
//        }

//        s.inorderTrav(root);
//p1.codeR(root,5,12);

//        ValidateBST v = new ValidateBST();
//        if(v.isValidBST(root,null,null)){
//
//        System.out.println("\nBST is valid");
//        }else {
//            System.out.println("\nNot valid BST");
//        }
//       int[] numSort = {3,6,5,8,10,11,12};
//       SortedArrayToBalancedBST t2 =new SortedArrayToBalancedBST();
//       TreeNode bst = t2.createBST(numSort,0,numSort.length-1);
//
//       BSTToBalancedBST b = new BSTToBalancedBST();
//       ArrayList<Integer> arr = new ArrayList<>();
//       b.convertBSTToSortedArray(bst,arr);
//       for(int i=0;i< arr.size() - 1;i++){
//           System.out.print(arr.get(i)+",");
//       }

//        TreeNode root2 = new TreeNode(8);
//        root2.left = new TreeNode(6);
//        root2.left.left = new TreeNode(5);
//        root2.left.left.left = new TreeNode(3);
//
//        root2.right = new TreeNode(10);
//        root2.right.right = new TreeNode(11);
//        root2.right.right.right = new TreeNode(12);
//
//        BSTToBalancedBST b2 = new BSTToBalancedBST();
//        b2.preorderTraversel(root2);
//
//         System.out.println();
//       root2 =   b2.convertBST(root2);
//        b2.preorderTraversel(root2);

                                                                  //MERGE 2 BST
//        TreeNode root1 = new TreeNode(2);
//        root1.left = new TreeNode(1);
//        root1.right = new TreeNode(4);
//
//        TreeNode root2 = new TreeNode(9);
//        root2.left = new TreeNode(3);
//        root2.right = new TreeNode(12);
//
//        MergeTwoBST m = new MergeTwoBST();
//       TreeNode mergeRoot = m.mergeBSTs(root1,root2);
//        m.preorderTrav(mergeRoot);

                                                               //Largest BST size
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(20);

        root.right = new TreeNode(60);
        root.right.left = new TreeNode(45);
        root.right.right = new TreeNode(70);
        root.right.right.left = new TreeNode(65);
        root.right.right.right = new TreeNode(80);

        SizeOfLargestBST s2  = new SizeOfLargestBST();
        Info info = s2.largestBst(root);
//        System.out.printf("Max size of bst = "+ s2.maxBST);
        System.out.println();

        SumOfLargestBSTInBT s3 = new SumOfLargestBSTInBT();
        int  sum = s3.maxSumBST(root);
        System.out.printf("Largest sum is = "+sum);






    }
}
