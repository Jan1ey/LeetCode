/*
 * Solution: HashMap
 * Difficulty level: Medium 
 * Date: 2021/11/02
 * Author: Jan1ey
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

		Map<int[], List<String>> strMap = new HashMap<>();

		List<List<String>> answer = new LinkedList<>();

		for(int i = 0; i < strs.length; ++i) {
			String currentStr = strs[i];
			int[] countNums = new int[];
			
			for(int i = 0; i < currentStr.length(); ++i) {
				countNums[currentStr.charAt(i) - 'a']++;
			}

			if(strMap.containsKey(countNums)) {
				List<String> currentList = strMap.get(countNums);
				currentList.add(currentStr);
			} else {
				List<String> list = new LinkedList<String>();
				list.add(currentStr);
				strMap.put(countNums, list);
			}
		}

		answer.addAll(strMap.values());

		return answer;
    }
}