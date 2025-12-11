import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LastCommonAncestor {
    // Main LCA function
    public Node lca(Node root, int n1, int n2) { // O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();


        if (!getPath(root, n1, path1) || !getPath(root, n2, path2)) {
            return null; // if either node not found
        }

        // Find the last common node in both paths
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        // Last common ancestor is the node just before they diverged
        return path1.get(i - 1);
    }

    // Helper function to store the path from root to a given node
    public boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null)
            return false;

        // add current node to path
        path.add(root);

        // if current node is the target node
        if (root.data == n)
            return true;

        // recursively check left and right subtrees
        if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
            return true;
        }

        // if not found in either subtree, remove current node from path
        path.removeLast();
        return false;
    }
    //Last common ancestor optimized approach
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

//    getPath(1, 5, [])
// ├── add(1) → [1]
//            ├── getPath(2, 5, [1])
// │    ├── add(2) → [1,2]
//            │    ├── getPath(4,5,[1,2])
// │    │    ├── add(4) → [1,2,4]
//            │    │    ├── left=null → false
//            │    │    ├── right=null → false
//            │    │    ├── remove(4) → [1,2]
//            │    │    └── return false
//            │    ├── getPath(5,5,[1,2])
// │    │    ├── add(5) → [1,2,5]
//            │    │    ├── found target → return true
//            │    └── return true
//            ├── return true



}

