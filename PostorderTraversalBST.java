/*
Problem Statement : Given a binary tree, return the postorder traversal of its nodes’ values. Using recursion is not allowed.
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
	public ArrayList<Integer> postorderTraversal(TreeNode a) {
	    
	    if(a == null)
	        return null;
	        
	     ArrayList<Integer> postOrder = new ArrayList<>();
	     Stack st1 = new Stack();
	     Stack st2 = new Stack();
	     
	     TreeNode curr_node = a;
	     st1.push(curr_node);
	     
	     while(!st1.isEmpty()){
	         curr_node = (TreeNode)st1.pop();
	         st2.push(curr_node);
	         
	         if(curr_node.left != null)
	            st1.push(curr_node.left);
	            
	         if(curr_node.right != null)
	            st1.push(curr_node.right);
	     }
	     
	     while(!st2.isEmpty()){
	         curr_node = (TreeNode)st2.pop();
	         postOrder.add(curr_node.val);
	     }
	     
	     return postOrder;
	}
}

