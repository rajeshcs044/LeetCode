package com.rajesh.practice.easy.newpack;

import com.rajesh.practice.medium.TreeNode;

public class MinimumDistanceBetweenBSTNodes
{
    int min = Integer.MAX_VALUE;
    Integer prev = null;

    public int minDiffInBST(TreeNode root)
    {
        inorder(root);

        return min;
    }

    public void inorder(TreeNode root)
    {
        if (root == null)
        {
            return;
        }

        inorder(root.left);

        if (prev != null)
        {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        inorder(root.right);
    }
}
