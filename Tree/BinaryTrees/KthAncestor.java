class KthAncestor {
    public int kthCode(Node root,int n,int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDis = kthCode(root.left,n,k);
        int rightDis = kthCode(root.right,n,k);

        if(leftDis == -1 && rightDis == -1){
            return -1;
        }
        int max = Math.max(leftDis,rightDis);
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }
}
