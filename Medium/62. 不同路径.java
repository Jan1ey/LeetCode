/*
 * Solution: Math
 * Difficulty level: Medium 
 * Date: 2021/11/04
 * Author: Jan1ey
 */

class Solution {
    public int uniquePaths(int m, int n) {
    	int[][] answer = new int[m][n];
    	answer[0][0] = 1;
    	for(int i = 0; i < m; i++) {
    		for(int j = 0; j < n; j++) {
    			if(i - 1 >= 0) {
    				answer[i][j] += answer[i - 1][j];
    			}
    			if(j - 1 >= 0) {
    				answer[i][j] += answer[i][j - 1];
    			}
    		}
    	}

    	return answer[m - 1][n - 1];
    }	
}