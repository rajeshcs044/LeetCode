package com.rajesh.practice.easy.newpack;

import com.rajesh.practice.medium.TreeNode;

public class PathSumIII
{
    public int pathSum(TreeNode root, int sum)
    {
        if (root == null)
        {
            return 0;
        }
        return pathFromSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int pathFromSum(TreeNode root, int sum)
    {
        if (root == null)
        {
            return 0;
        }
        return (root.val == sum ? 1 : 0) + pathFromSum(root.left, sum - root.val)
                + pathFromSum(root.right, sum - root.val);
    }
}
