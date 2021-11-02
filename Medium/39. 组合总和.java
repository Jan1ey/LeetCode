/*
 * Solution: recursion
 * Difficulty level: Medium 
 * Date: 2021/10/31
 * Author: Jan1ey
 */

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

    	List<Integer> list = new ArrayList<Integer>();

    	return recursion(candidates, list, target, 0);

    }

    public List<List<Integer>> recursion(int[] candidates, List<Integer> list, int target, int index) {
    	
    	List<List<Integer>> returnList = new ArrayList<>();
		
		if(target == 0) {
			returnList.add(list);
    		return returnList;
    	}
    	
    	for(int i = index; i < candidates.length; ++i) {
    		
    		if(target >= candidates[i]) {
    			List<Integer> currentList = new ArrayList<>();
    			for(int iterator : list) {
    				currentList.add(iterator);
    			}
    			currentList.add(candidates[i]);
    			List<List<Integer>> arrayList = recursion(candidates, currentList, target - candidates[i], i);
    			for(List<Integer> iterator : arrayList) {
    				returnList.add(iterator);
    			}
    		}
    	}

    	return returnList;
    }
}