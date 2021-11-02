/*
 * Solution: greedy algorithm
 * Difficulty level: Medium 
 * Date: 2021/11/02
 * Author: Jan1ey
 */

class Solution {
    public boolean canJump(int[] nums) {

    	boolean answer = false;

    	int maxIndex = 0;

    	for(int i = 0; i < nums.length - 1; ++i) {
    		if(i <= maxIndex) {
    			maxIndex = Math.max(i + nums[i], maxIndex);
    		}
    		if(maxIndex >= nums.length - 1) {
    			answer = true;
    		}
    	}

    	return answer;
    }
}