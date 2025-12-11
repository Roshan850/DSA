import java.util.LinkedList;
import java.util.Queue;

public class KthLevelTravel {

    // kth level print by itrative way
    public void kthLevel(Node root, int k) {
        if (root == null) {

            return;
        }
        int level = 1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                level = level + 1;

                if (q.isEmpty()) {
                    return;
                } else {
                    q.add(null);
                }
            } else {
                if (level == k) {
                    System.out.print(currNode.data + " ");
                }
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // Recursive way of kth level

    public void kthLCode(Node root, int level , int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.println(root.data);
            return;
        }

        kthLCode(root.left, level+1,k);
        kthLCode(root.right, level+1,k);
    }


}
