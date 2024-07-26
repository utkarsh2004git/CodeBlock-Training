package trees;

public class SymmetricTree {

    public static boolean ans(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null) return true;

        if(root1==null|| root2==null) return true;

        if(root1.val!= root2.val) return  false;

        boolean lf=ans(root1.left,root2.right);
        boolean rt=ans(root1.right,root2.left);

        return lf&&rt;
    }

}
