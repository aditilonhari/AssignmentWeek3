/*
Problem Statement : Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order. You may assume no duplicates in the array.
*/
public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
	    
	    if(a == null || a.size() == 0)
	        return -1;
	        
	    int low = 0, high = a.size() -1;
	    
	    while(low <= high){
	        
	        int mid = (low+high)/2;

	        if(a.get(mid) == b)
	            return mid;
	        
	        if(mid+1 == a.size())
	                return mid+1;
	        if(mid-1 < 0)
	                return 0;
	                
	        if(a.get(mid) < b){
	            if(a.get(mid+1) > b){
	                return mid+1;
	            }
	            low = mid +1;
	        }
	         
	        if(a.get(mid) > b){
	            if(a.get(mid-1) < b){
	                return mid;
	            }
	            high = mid -1;
	        }
	    }
	    
	    return -1;
	}
}

