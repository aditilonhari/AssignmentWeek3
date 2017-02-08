/*
Problem Statement : Suppose a sorted array is rotated at some pivot unknown to you beforehand. (i.e., 0 1 2 4 5 6 7  might become 4 5 6 7 0 1 2 ).
You are given a target value to search. If found in the array, return its index, otherwise return -1. You may assume no duplicate exists in the array.
*/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> a, int b) {
	    
	    
	    if(a == null || a.size() == 0)
	        return -1;
	        
	    int low = 0, high = a.size()-1;
	   
	     while(low <= high){
	         int mid = (low + high) / 2;
	         
	         if(a.get(mid) == b)
	            return mid;
	            
	         if(a.get(mid) <= a.get(high)){
	             if(b > a.get(mid) && b <= a.get(high))
	                low = mid+1;
	              else 
	                high = mid-1;
	         }
	         
	         if(a.get(low) <= a.get(mid)){
	             if(b >= a.get(low) && b < a.get(mid))
	                high = mid-1;
	              else 
	                low = mid+1;
	         }
	     }
	     
	     return -1;
	}
}

