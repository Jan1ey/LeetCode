/*
 * Solution: binary search
 * Difficulty level: Medium 
 * Date: 2021/10/30
 * Author: Jan1ey
 */


class Solution {
    public int search(int[] nums, int target) {

    	return binarySearch(nums, target);
    }

    public int binarySearch(int[] nums, int target) {
    	int length = nums.length;
    	int left = 0, right = length - 1, mid = -1, answer = -1;

    	while(left <= right) {
    		mid = (right - left) / 2 + left;
            System.out.println(mid);
    		if(nums[mid] == target) {
    			answer = mid;
    		}

    		if(nums[left] < nums[mid]) {
    			if(target < nums[mid] && target >= nums[left]) {
    				right = mid - 1;
    			} else {
    				left = mid + 1;
    			}
    		} else {
    			if(target < nums[mid]) {
    				right = mid - 1;
    			} else {
    				left = mid + 1;
    			}
    		}
    	}
        return answer;
    }
}