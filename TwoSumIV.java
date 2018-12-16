package com.rajesh.practice.easy.newpack;

import java.util.HashSet;
import java.util.Set;

import com.rajesh.practice.medium.TreeNode;

public class TwoSumIV
{
    public boolean findTarget(TreeNode root, int k)
    {
        if (root == null)
        {
            return false;
        }
        return dfs(root, new HashSet<Integer>(), k);
    }

    public boolean dfs(TreeNode root, Set<Integer> set, int k)
    {
        if (root == null)
        {
            return false;
        }
        if (set.contains(k - root.val))
        {
            return true;
        }
        set.add(root.val);
        return dfs(root.left, set, k) || dfs(root.right, set, k);
    }
}
