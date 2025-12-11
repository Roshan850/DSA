public class TransformToSumTree {
    public int sumCode(Node root){
        if(root == null){
            return 0;
        }
       int leftSum = sumCode(root.left);
        int rightSum = sumCode(root.right);

        int oldVal = root.data;
        root.data = leftSum + rightSum;
        return root.data + oldVal ;

    }

}
