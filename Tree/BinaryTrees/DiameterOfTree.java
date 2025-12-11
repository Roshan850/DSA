public class DiameterOfTree {

    // O(n^2) approach 1
    public int diamCode1(Node root){
       if(root == null) {

           return 0;
       }

           int ldiam = diamCode1(root.left);
           int lh = height(root.right);
           int rdiam = diamCode1(root.right);
           int rh = height(root.right);

           int selfDiam = lh + rh + 1;

           return Math.max(selfDiam , Math.max(ldiam, rdiam));


    }

    //height of a binary tree
    public int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh) + 1;
    }


    // Approach 2 O(n)
    class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public Info diamCode2(Node root){
        if(root == null){
            return new Info(0,0);
        }

        Info lInfo = diamCode2(root.left);
        Info rInfo = diamCode2(root.right);

        int finalDiam = Math.max(Math.max(lInfo.diam, rInfo.diam) , lInfo.ht + rInfo.ht + 1);
        int finalht = Math.max(lInfo.ht, rInfo.ht) +1;

        return new Info(finalDiam,finalht);

    }
}
