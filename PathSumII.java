package com.rajesh.practice.easy.newpack;

import java.util.ArrayList;
import java.util.List;

import com.rajesh.practice.medium.TreeNode;

public class PathSumII
{
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> temp = new ArrayList<Integer>();

    public List<List<Integer>> pathSum(TreeNode root, int sum)
    {
        hasSum(root, sum);
        return result;
    }

    public void hasSum(TreeNode root, int sum)
    {
        if (root == null)
        {
            return;
        }

        if (sum - root.val == 0 && root.left == null && root.right == null)
        {
            List<Integer> list = new ArrayList<Integer>(temp);
            list.add(root.val);
            result.add(list);
            return;
        }

        temp.add(root.val);
        hasSum(root.left, sum - root.val);
        hasSum(root.right, sum - root.val);
        temp.remove(temp.size() - 1);
    }
}
