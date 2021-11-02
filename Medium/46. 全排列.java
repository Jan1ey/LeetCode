/*
 * Solution: recursion
 * Difficulty level: Medium 
 * Date: 2021/10/31
 * Author: Jan1ey
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {

    	List<Integer> list = new ArrayList<>();

    	return recursion(nums, list);

    }

    public List<List<Integer>> recursion(int[] nums, List<Integer> list) {
    	List<List<Integer>> returnList = new ArrayList<>();
    	if(list.length() == nums.length) {
    		returnList.add(list);
    		return list;
    	}

    	for(int i = 0; i < nums.length; ++i) {
    		if(!list.contains(nums[i])) {
    			List<Integer> currentList = new ArrayList<>();
    			for(int iterator : list) {
    				currentList.add(iterator);
    			}
    			currentList.add(nums[i]);

    			returnList.addAll(recursion(nums, currentList));
    		}
    	}

    	return returnList;
    }
}