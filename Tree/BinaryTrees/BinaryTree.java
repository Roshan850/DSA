import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    int idx = -1;
    public Node buildTree(int[] nodes){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }

        Node newNode = new Node(nodes[idx]);

        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }
    //PREORDER TRAVERSAL
    public void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    //INORDER TRAVERSAL
    public void inorderTreaversal(Node root){

        if(root == null){
            return;
        }
        inorderTreaversal(root.left);
        System.out.print(root.data+" ");
        inorderTreaversal(root.right);

    }
    //POSTORDER TRAVERSAL
    public void postorderTreaversal(Node root){

        if(root == null){
            return;
        }
        postorderTreaversal(root.left);
        postorderTreaversal(root.right);
        System.out.print(root.data+" ");

    }

    //LEVEL ORDER TRAVERSAL
    public void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }

         Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    //HEIGHT OF TREE
    public int height(Node root){
        if(root == null){
            return 0;
        }
        int lh,rh;
        lh = height(root.left);
        rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    //COUNT NUMBER OF NODES IN A TREE
    public int countNodes(Node root){
       int leftCount,rightCount;
        if(root == null){
            return 0;
        }


        leftCount =countNodes(root.left);
        rightCount = countNodes(root.right);

        return leftCount + rightCount +1;
    }

    //BINARY TREE NODES SUM
    public int sumOfNodesVal(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodesVal(root.left);
        int rightSum = sumOfNodesVal(root.right);

        return leftSum + rightSum +root.data ;
    }



    }

//    🧩 Step 1 – Start
//
//    Call: height(A)
//
//| height(A) |   ← top of stack
//
//🧩 Step 2 – A calls height(B)
//| height(B) |
//            | height(A) |
//
//            🧩 Step 3 – B calls height(D)
//| height(D) |
//            | height(B) |
//            | height(A) |
//
//            🧩 Step 4 – D calls height(null) (left child)
//            | height(null) |
//            | height(D)    |
//            | height(B)    |
//            | height(A)    |
//
//
//    height(null) returns 0 → popped out
//
//🧩 Step 5 – D calls height(null) (right child)
//            | height(null) |
//            | height(D)    |
//            | height(B)    |
//            | height(A)    |
//
//
//    height(null) returns 0 → popped out
//
//    Now:
//
//    Left height = 0
//
//    Right height = 0
//→ height(D) returns 1
//
//    Stack after returning:
//
//            | height(B) |
//            | height(A) |
//
//            🧩 Step 6 – Back to B, now call height(E)
//| height(E) |
//            | height(B) |
//            | height(A) |
//
//            🧩 Step 7 – E calls height(null) (left)
//            | height(null) |
//            | height(E)    |
//            | height(B)    |
//            | height(A)    |
//
//
//    Returns 0, popped.
//
//🧩 Step 8 – E calls height(null) (right)
//            | height(null) |
//            | height(E)    |
//            | height(B)    |
//            | height(A)    |
//
//
//    Returns 0, popped.
//
//            height(E) = max(0, 0) + 1 = 1 → returns 1
//
//    Stack after returning:
//
//            | height(B) |
//            | height(A) |
//
//            🧩 Step 9 – B now has both heights
//
//            lh = 1 (from D)
//    rh = 1 (from E)
//            → height(B) = max(1, 1) + 1 = 2
//
//    Stack after returning:
//
//            | height(A) |
//
//            🧩 Step 10 – A now calls height(C)
//| height(C) |
//            | height(A) |
//
//            🧩 Step 11 – C calls height(null) (left)
//            | height(null) |
//            | height(C)    |
//            | height(A)    |
//
//
//    Returns 0, popped.
//
//🧩 Step 12 – C calls height(null) (right)
//            | height(null) |
//            | height(C)    |
//            | height(A)    |
//
//
//    Returns 0, popped.
//
//            height(C) = 1 → returns 1
//
//    Stack after returning:
//
//            | height(A) |
//
//            🧩 Step 13 – Final calculation at A
//
//    lh = 2 (from B)
//    rh = 1 (from C)
//            → height(A) = max(2, 1) + 1 = 3
//
//    Stack is now empty ✅

    //        +-----------------------------------------+
//            | Step | Function on Top | Returned Value |
//            | ---- | --------------- | -------------- |
//            | 1    | height(A)       | -              |
//            | 2    | height(B)       | -              |
//            | 3    | height(D)       | -              |
//            | 4    | height(null)    | 0              |
//            | 5    | height(null)    | 0              |
//            | 6    | height(D)       | 1              |
//            | 7    | height(E)       | -              |
//            | 8    | height(null)    | 0              |
//            | 9    | height(null)    | 0              |
//            | 10   | height(E)       | 1              |
//            | 11   | height(B)       | 2              |
//            | 12   | height(C)       | -              |
//            | 13   | height(null)    | 0              |
//            | 14   | height(null)    | 0              |
//            | 15   | height(C)       | 1              |
//            | 16   | height(A)       | 3              |


