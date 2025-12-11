package BinaryTrees;

public class TreeImp {
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
//       Node root =  tree.buildTree(nodes);
//        System.out.println(root.data);
//        System.out.print("Preorder traversal: ");
//        tree.preOrderTraversal(root);
//        System.out.println();
//        System.out.print("Inorder traversal: ");
//        tree.inorderTreaversal(root);
//        System.out.println();
//        System.out.print("Postorder traversal: ");
//        tree.postorderTreaversal(root);
//        System.out.println();
//        System.out.println("Level order traversal: ");
//        tree.kthLevel(root,2);

//        //height
//        System.out.println(tree.height(root));
//
//        System.out.println("Total node :"+tree.countNodes(root));
//
//        System.out.println("sum = "+tree.sumOfNodesVal(root));

//        DiameterOfTree d = new DiameterOfTree();
        Node root = new Node(10);
        root.left = new Node(9);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.right = new Node(11);
        root.right.left = new Node(12);
        root.right.right = new Node(13);

//        Node subRoot = new Node(11);
//        subRoot.left = new Node(12);
//        subRoot.right = new Node(13);

//        DiameterOfTree.Info fInfo = d.diamCode2(root);
//        System.out.println("Diameter of tree: "+ fInfo.diam);
//        System.out.println("Height of tree: "+ fInfo.ht);


//        SubTreeOfAnotherTree t= new SubTreeOfAnotherTree();
//        System.out.println(t.isSubTree(root,subRoot));
//        KthLevelTravel t = new KthLevelTravel();
//        System.out.println("Level order traversal: ");
//        t.kthLCode(root,1,3);

        //Last ancestor
//        int n1= 7;
//        int n2 = 12;
//        LastCommonAncestor l = new LastCommonAncestor();
//        System.out.println("Last common ancestor of "+n1+" and "+n2+": "+l.LCa2(root,n1,n2).data);

//        MinDistanceBtwNodes m = new MinDistanceBtwNodes();
//        System.out.println(m.minCode(root,n1,n2));
//        KthAncestor k = new KthAncestor();
//        k.kthCode(root,10,2);
//        System.out.println(root.left.data + root.right.data);

        TransformToSumTree t= new TransformToSumTree();
        t.sumCode(root);
        System.out.println(root.left.data);



    }
}
