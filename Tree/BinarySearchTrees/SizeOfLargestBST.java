package BinarySearchTrees;

class SizeOfLargestBST {
    public int maxBST = 0;
   public Info largestBst(TreeNode root){
       if(root == null){
           return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
       }
        Info leftInfo = largestBst(root.left);
        Info rightInfo = largestBst(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int max = Math.max(root.data,Math.max(leftInfo.max, rightInfo.max));
       int min = Math.min(root.data,Math.min(leftInfo.min, rightInfo.min));
       if(root.data <= leftInfo.max || root.data >= rightInfo.min){
           return new Info(false,size,min,max);
       }
       else if(leftInfo.isBST && rightInfo.isBST){
           maxBST = Math.max(size,maxBST);
           return new Info(true,size,min,max);
       }
       return new Info(false,size,min,max);



   }

}
class Info{
    boolean isBST;
    int min,max;
    int size;

    Info(boolean isBST,int size,int min,int max){
        this.isBST = isBST;
        this.size = size;
        this.min = min;
        this.max = max;
    }


}
