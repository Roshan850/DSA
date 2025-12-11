package BinarySearchTrees;

import java.util.ArrayList;

public class PrintRootToLeafPath {
    public void printRootToLeaf(TreeNode root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printP(path);
        }
        printRootToLeaf(root.left,path);
        printRootToLeaf(root.right,path);
        path.remove(path.size() - 1);

    }
    public void printP(ArrayList<Integer> path){
        for(int i = 0;i< path.size();i++){
            System.out.print(path.get(i) +"->");
        }
        System.out.println();
    }
}

//| Node | Action        | Path    |
//        | ---- | ------------- | ------- |
//        | 1    | add           | [1]     |
//        | 2    | add           | [1,2]   |
//        | 4    | add           | [1,2,4] |
//        | 4    | leaf → print  | [1,2]   |
//        | 2    | go right      | [1,2]   |
//        | 5    | add           | [1,2,5] |
//        | 5    | leaf → print  | [1,2]   |
//        | 2    | now backtrack | [1]     |
////        | 1    | go right → 3  | [1]     |
//                                                                                    1
//                                                                                   / \
//                                                                                   2   3
//                                                                                   / \
//                                                                                   4   5

//CALL 1
//        | print(1) |
//path = [1]
//
//CALL LEFT
//   | print(2) |
//path = [1,2]
//
//CALL LEFT
//       | print(4) |
//path = [1,2,4]
//LEAF → print
//       return
//               | print(2) |
//
//CALL RIGHT
//       | print(5) |
//path = [1,2,5]
//LEAF → print
//       return
//               | print(2) |
//
//both left & right done → REMOVE(2)
//path = [1]
//        return
//        | print(1) |
//
//CALL RIGHT
//   | print(3) |
//path = [1,3]
//LEAF → print
//   return
//           | print(1) |
//
//REMOVE(1)
//return
//
