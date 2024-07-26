package trees;

import java.util.*;

public class Traversal {
    public static void postOrder(TreeNode root,List<Integer> ls){
        if(root==null){
            return;
        }
        postOrder(root.left,ls);
        postOrder(root.right,ls);
        ls.add(root.val);
    }

    public static void InOrder(TreeNode root,List<Integer> ls){
        if(root==null){
            return;
        }
        InOrder(root.left,ls);
        ls.add(root.val);
        InOrder(root.right,ls);
    }
    public static void preOrder(TreeNode root,List<Integer> ls){
        if(root==null){
            return;
        }
        ls.add(root.val);
        preOrder(root.left,ls);
        preOrder(root.right,ls);
    }


    public static void main(String[] args) {

    }


}
