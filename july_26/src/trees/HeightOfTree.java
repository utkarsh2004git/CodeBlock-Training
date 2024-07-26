package trees;
import java.lang.*;
public class HeightOfTree {

    public static int height(TreeNode root){
        if(root==null) return -1;

        int lf=height(root.left);
        int rt=height(root.right);

        return (Math.max(lf,rt)+1);
    }

    public static void main(String[] args) {

    }
}
