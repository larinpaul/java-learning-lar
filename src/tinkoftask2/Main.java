package tinkoftask2;

import java.util.Arrays;

public class Main {

    public static String findMinMaxLength(String text) {
        int maxLength = Integer.MAX_VALUE;
        int minLength = 0;
        int currentLength = 0;
        for (char c : text.toCharArray()) {
            if (c == '#') {
                maxLength = Math.min(maxLength, currentLength);
                minLength = Math.max(minLength, currentLength);
                currentLength = 0;
            } else {
                currentLength++;
            }
        }
        maxLength = Math.min(maxLength, currentLength);
        minLength = Math.max(minLength, currentLength);
        return minLength + " " + maxLength;
    }

    // Not the best tests though...
    public static void main(String[] args) {
        String[] testCases = {
            "a#aba",
            "You_know#how_to_solve#this_task",
            "a#b##c#d#",
            "#",
            "",
            "abcdefghij#",
            "a#bcdefghij#",
            "abcdefghij#a#",
            "a#a#a#a#a#a#a#a#a#"
        };
        
        System.out.println("Test the strings!");
        System.out.println(findMinMaxLength("a#aba"));
        System.out.println(findMinMaxLength("a#b##c#d#"));
        System.out.println(findMinMaxLength("abcdefghij#a#"));
        System.out.println(findMinMaxLength("You_know#how_to_solve#this_task"));
        System.out.println("Well, that was fun! :)");        
        
        String[] expectedResults = {
            "1 3",
            "8 12",
            "0 1",
            "1 1",
            "0 0",
            "10 10",
            "1 10",
            "1 10",
            "1 1"
        };
        for (int i = 0; i < testCases.length; i++) {
            String result = findMinMaxLength(testCases[i]);
            if (!result.equals(expectedResults[i])) {
                System.out.println("Test case " + (i+1) + ": Failed");
                System.out.println("Expected: " + expectedResults[i]);
                System.out.println("Actual: " + result);
            } else {
                System.out.println("Test case " + (i+1) + ": Passed");
            }
        }
    }

	
}