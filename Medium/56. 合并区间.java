/*
 * Solution: sort
 * Difficulty level: Medium 
 * Date: 2021/11/04
 * Author: Jan1ey
 */

class Solution {
    public int[][] merge(int[][] intervals) {
    	Arrays.sort(intervals, new Comparator<int[]>() {
    		@Override
    		public int compare(int[] o1, int[] o2) {
    			if(o1[0] == o2[0]) {
    				return o1[1] - o2[1];
    			} else {
    				return o1[0] - o2[0];
    			}
    		}
    	});

    	int[] currentNums = intervals[0];
    	List<int[]> answerList = new ArrayList<>();
    	for(int i = 1; i < intervals.length; i++) {
    		int[] nextNums = intervals[i];
    		if(nextNums[0] <= currentNums[1]) {
    			currentNums[1] = Math.max(nextNums[1], currentNums[1]);
    		} else {
    			answerList.add(currentNums);
    			currentNums = nextNums;
    		}
    	}
    	answerList.add(currentNums);

    	int[][] answer = new int[answerList.size()][2];
    	for(int i = 0; i < answerList.size(); i++) {
    		answer[i] = answerList.get(i);
    	}

    	return answer;
    }
}