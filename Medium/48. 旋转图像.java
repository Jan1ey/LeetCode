/*
 * Solution: symmetry flip
 * Difficulty level: Medium 
 * Date: 2021/10/31
 * Author: Jan1ey
 */

class Solution {
    public void rotate(int[][] matrix) {
    	int length = matrix.length;

    	int swap = 0;
    	for(int i = 0; i < length / 2; ++i) {
    		for(int j = 0; j < length; ++j) {
    			swap = matrix[i][j];
    			matrix[i][j] = matrix[length - i - 1][j];
    			matrix[length - i - 1][j] = swap;
    		}
    	}

    	for(int i = 0; i < length; ++i) {
    		for(int j = 0; j < i; ++j) {
    			swap = matrix[i][j];
    			matrix[i][j] = matrix[j][i];
    			matrix[j][i] = swap;
    		}
    	}
    }	
}

/*
 * Solution: Mathematical laws
 * Difficulty level: Medium 
 * Date: 2021/10/31
 * Author: Jan1ey
 */

class Solution {
    public void rotate(int[][] matrix) {

    }
}