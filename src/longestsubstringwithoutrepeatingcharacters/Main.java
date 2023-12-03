package longestsubstringwithoutrepeatingcharacters;

public class Main {

	public static void main(String[] args) {

		// 3. Longest Substring Without Repeating Characters
		// Medium
		
		// Given a string s, find the length of the longest substring
		// without repeating characters.
		
		// Example 1:
		// Input: s = "abcabcbb"
		// Output: 3
		// Explanation: The answer is "abc", with the length of 3.
		
		// Example 2:
		// Input: s = "bbbbb"
		// Output: 1
		// Explanation: The answer is "b", with the length of 1.
		
		// Example 3:
		// Input: s = "pwwkew"
		// Output: 3
		// Explanation: The answer is "wke", with the length of 3.
		// Notice that the answer must be a substring, "pwke" is a subsequence
		// and not a substring.
		
		// Constraints:
		// * 0 <= s.length <= 5 * 10^4
		// * s consists of English letters, digits, symbols and spaces
		
		
		
	}

	// Brute force algorithm, pretty slow
	public int lengthOfLongestSubstring(String s) {
		
		int maxLength = 0;
		
		for (int i = 0; i < s.length(); i++) {
			StringBuilder currentSubstring = new StringBuilder(); 
			for (int j = i; i < s.length(); j++) {
				if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
					break;
				}
				currentSubstring.append(s.charAt(j));
				// You can use this:
//				if (currentSubstring.length() > maxLength) {
//					maxLength = currentSubstring.length();
//				}
				// Or just use this:
				maxLength = Math.max(maxLength, currentSubstring.length());
			}
		}
		return maxLength;		
	}

	
}
