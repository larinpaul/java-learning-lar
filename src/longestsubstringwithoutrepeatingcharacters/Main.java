package longestsubstringwithoutrepeatingcharacters;

import java.util.Map;
import java.util.HashMap;

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
	public int lengthOfLongestSubstringBruteForce(String s) {
		
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
	
	// Faster solution, Two Pointer solution
	public int lengthOfLongestSubstring(String s) {
		
		int maxLength = 0;
		
		Map<Character, Integer> visitedCharacters = new HashMap<>();
		
		for (int right = 0, left = 0; right < s.length(); right++) {
			char currentCharacter = s.charAt(right);
			if (visitedCharacters.containsKey(currentCharacter) 
					&& visitedCharacters.get(currentCharacter) >= left) {
				left = visitedCharacters.get(currentCharacter);
			}
			
			maxLength = Math.max(maxLength, right - left + 1);
		}
		
		return maxLength;
	}

	// The fastest solution
	public int lengthOfLongestSubstringFastest(String s) {
		
		int maxLength = 0;
		
		for (int right = 0, left = 0; right < s.length(); right++) {
			
			int indexOfFirstAppearanceInSubstring = s.indexOf(s.charAt(right), left);
			if (indexOfFirstAppearanceInSubstring != right) {
				left = indexOfFirstAppearanceInSubstring + 1;
			}
			
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;		
	}

}
