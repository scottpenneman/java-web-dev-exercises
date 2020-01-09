package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter your favorite quote:");
        String quoteToCount = input.nextLine();

        char[] quoteArray = quoteToCount.toUpperCase().toCharArray();

        HashMap<Character, Integer> characterCount = new HashMap<>();

        for (char x : quoteArray) {
            if (!characterCount.containsKey(x) && Character.isLetter(x)) {
                characterCount.put(x, 1);
            } else if (Character.isLetter(x)) {
                int count = characterCount.get(x) + 1;
                characterCount.put(x, count);
            }
        }

        for (Map.Entry<Character, Integer> character : characterCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
