/*
 * Solution: binary search
 * Difficulty level: Medium 
 * Date: 2021/10/30
 * Author: Jan1ey
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {
    	int beginIndex = binarySearch(nums, target);
    	int endIndex = binarySearch(nums, target + 1);
        int[] answerList = new int[2];

    	if(beginIndex >= 0 && nums[beginIndex] == target) {
    		if(endIndex == -1) {
    			answerList = new int[]{beginIndex, nums.length - 1};
    		} else {
    			answerList = new int[]{beginIndex, endIndex - 1};
    		}
    	} else {
    		answerList = new int[]{-1, -1};
    	}
        return answerList;
    }

    public int binarySearch(int[] nums, int target) {
    	int left = 0, right = nums.length - 1;
    	int answer = -1;

    	while(left <= right) {
    		int mid = (right - left) / 2 + left;

    		if(nums[mid] >= target) {
    			answer = mid;
    		}

    		if(nums[mid] >= target) {
    			right = mid - 1;
    		} else {
    			left = mid + 1;
    		}
    	}

    	return answer;
    }
}