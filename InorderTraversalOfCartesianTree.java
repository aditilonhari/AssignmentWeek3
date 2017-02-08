/*
Problem Statement : Given an inorder traversal of a cartesian tree, construct the tree.
Cartesian tree : is a heap ordered binary tree, where the root is greater than all the elements in the subtree. 
Note: You may assume that duplicates do not exist in the tree. 
*/

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode buildTree(ArrayList<Integer> a) {
    
        TreeNode binaryTree = null;
        binaryTree = buildTreeHelper(a, 0, a.size()-1, binaryTree);
        return binaryTree;    
    }
    
    public TreeNode buildTreeHelper(ArrayList<Integer> a, int start, int end, TreeNode root){
        
        if(start > end)
            return null;
            
        int idx = getMaxNodeValueIndex(a, start, end);

        root = new TreeNode(a.get(idx));
        
        if(start == end)
            return root;

        root.left = buildTreeHelper(a, start, idx-1, root.left);
        root.right = buildTreeHelper(a, idx+1, end, root.right);
    
        return root;
    }
    
    public int getMaxNodeValueIndex(ArrayList<Integer> a, int start, int end){
        
        int max = a.get(start), maxIdx = start;
        for(int i = start+1; i<=end; i++){
            if(a.get(i) > max){
                max = a.get(i);
                maxIdx = i;
            }
        }
        
        return maxIdx;
    }

}

