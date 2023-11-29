package wordfinder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the pool of letters");
		String letters = scanner.nextLine().toUpperCase();
		
		Map<Character, Integer> lettersCountMap = getCharacterCountMap(letters);
				
		BufferedReader reader = new BufferedReader(new FileReader("E:/ProjectsJavaEclipse/javalearning/src/wordfinder/dictionary.txt"));
		
		System.out.println("All possible words you can make with those letters:");
		
		for (String currentWord = reader.readLine(); currentWord != null; currentWord = reader.readLine()) {
			Map<Character, Integer> currentWordMap = getCharacterCountMap(currentWord);
			
			boolean canMakeCurrentWord = true;
			for (Character character : currentWordMap.keySet()) {
				int currentWordCharCount = currentWordMap.get(character);
				int lettersCharCount = lettersCountMap.containsKey(character)
						? lettersCountMap.get(character)
								: 0;
				
				if (currentWordCharCount > lettersCharCount) {
					canMakeCurrentWord = false;
					break;
				}
			}
			if (canMakeCurrentWord) {
				System.out.println(currentWord);
			}
		}
				
		// aabrt // valid, you can make the word bar
		// a -> 2
		// b -> 1
		// r -> 1
		// t -> 1
		// for others -> 0
		
		// aardvark // invalid, you can't make the word bar
		// a -> 3
		// b -> 0
		// r -> 2
		// ...
		
		// bar
		// a -> 1
		// b -> 1
		// r -> 1

		scanner.close();
		reader.close();

	}

	private static Map<Character, Integer> getCharacterCountMap(String letters) {
		Map<Character, Integer> lettersCountMap = new HashMap<>();
		
		for (int i = 0; i < letters.length(); i++) {
			char currentChar = letters.charAt(i);
			
			int count = lettersCountMap.containsKey(currentChar)
						? lettersCountMap.get(currentChar)
						: 0;
		
			lettersCountMap.put(currentChar, count + 1);		
		}
		
		return lettersCountMap;
	}
}
