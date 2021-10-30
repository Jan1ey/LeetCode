/*
 * Solution: recursion
 * Difficulty level: Medium 
 * Date: 2021/10/30
 * Author: Jan1ey
 */

class Solution {
    public List<String> generateParenthesis(int n) {

    	return recursion("", 0, 0, n);

    }

    public List<String> recursion(Sting previousString, int leftParenthesis, int rightParenthsis, int n) {
    	if(leftParenthesis == n && rightParenthsis == n) {
    		return new ArrayList<String>().add(previousString);
    	}

    	List<String> returnList = new ArrayList<>();
    	String currentString = new String();

    	if(leftParenthesis < n && leftParenthesis >= rightParenthsis) {
    		currentString = previousString + '(';
    		List<String> leftList = recursion(currentString, leftParenthesis + 1, rightParenthsis, n);
    	}

    	if(rightParenthsis < n && rightParenthsis < leftParenthesis) {
    		currentString = previousString + ')';
    		List<String> rightList = recursion(currentString, leftParenthesis, rightParenthsis + 1, n);
    	}

    	for(String iterator : leftList) {
    		returnList.add(iterator);
    	} 

    	for(String iterator : rightList) {
    		returnList.add(iterator);
    	}   

    	return returnList;	
    }
}