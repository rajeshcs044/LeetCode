package com.rajesh.practice;

public class LowestCommonAncestorOfABinarySearchTree
{
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
        if (root == null)
        {
            return null;
        }

        while ((root.val > p.val && root.val > q.val) || (root.val < p.val && root.val < q.val))
        {
            if (root.val > p.val && root.val > q.val)
            {
                root = root.left;
            }
            else
            {
                root = root.right;
            }
        }

        // Using recursion
        /*
         * if(root.val > p.val && root.val > q.val) { return lowestCommonAncestor(root.left, p, q); }
         *
         * if(root.val < p.val && root.val < q.val) { return lowestCommonAncestor(root.right, p, q); }
         */

        return root;
    }

    public static void main(String[] args)
    {
        TreeNode t1 = new TreeNode(6);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(0);
        TreeNode t5 = new TreeNode(4);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;

        System.out.println("Result : " + lowestCommonAncestor(t1, t2, t5).val);
    }

    private static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x)
        {
            val = x;
        }
    }
}