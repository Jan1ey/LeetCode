/*
 * Solution: simulation
 * Difficulty level: Medium 
 * Date: 2021/10/30
 * Author: Jan1ey
 */

class Solution {
    public void nextPermutation(int[] nums) {
    	int length = nums.length;

    	for(int i = length - 2; i >= 0; --i) {
    		if(nums[i] < nums[i + 1]) {
    			for(int j = length-1; j >= (i + 1); --j) {
    				if(nums[j] > nums[i]) {
    					int swap = nums[i];
    					nums[i] = nums[j];
    					nums[j] = swap;

    					int left = i + 1, right = length - 1;
    					while(left < right) {
    						swap = nums[left];
    						nums[left] = nums[right];
    						nums[right] = swap;
    						++left;
    						--right;
    					}
    					return ;
    				}	
    			}
    		}
    	}

    	Arrays.sort(nums);
    }
}