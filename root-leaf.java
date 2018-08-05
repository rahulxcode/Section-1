/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */

public class Solution {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        ArrayList<Integer>newsol=new ArrayList<>();
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        pathSum(A,B,newsol,res);
        return res;
    }
    void pathSum(TreeNode A,int sum,ArrayList<Integer>newsol,ArrayList<ArrayList<Integer>>res)
    {
        if(A==null)
            return;
        else
        {
            newsol.add(A.val);
            sum- =A.val;
            if(A.left==null && A.right==null && sum == 0)
                newsol.remove(newsol.size()-1);
                
            if(A.left!=null)
                pathSum(A.left,sum,newsol,res);
                
            if( A.right!=null)
                pathSum(A.right,sum,newsol,res);
        }
    }
}