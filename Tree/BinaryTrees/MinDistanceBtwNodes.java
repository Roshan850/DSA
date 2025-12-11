public class MinDistanceBtwNodes {
    public Node LCa2(Node root,int n1,int n2){
        if(root == null || n1 == root.data || n2 == root.data){
            return root;
        }
        Node leftLca = LCa2(root.left,n1,n2);
        Node rightLca = LCa2(root.right,n1,n2);

        if(leftLca == null){
            return rightLca;
        }
        if(rightLca == null){
            return leftLca;
        }
        return root;
    }
    public int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDis = lcaDist(root.left,n);
        int rightDis = lcaDist(root.right,n);
        if(leftDis == -1 && rightDis == -1){
            return -1;
        } else if (leftDis == -1) {

            return rightDis+1;
        }
        else {
            return leftDis+1;
        }
    }

    public int minCode(Node root,int n1,int n2){

        Node lca = LCa2(root,n1,n2);
        int Dis1 = lcaDist(lca,n1);
        int Dis2 = lcaDist(lca,n2);

        return Dis1 + Dis2;

    }
}
