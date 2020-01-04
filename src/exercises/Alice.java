package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {

        String firstSentence = "Alice was beginning to get very tired of sitting" +
                " by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Part 4:");
        System.out.println("Enter a search term: ");
        String searchTerm = input.nextLine();
        System.out.println("It is " + firstSentence.toLowerCase().contains(searchTerm.toLowerCase())
                + " that the first sentence of Alice in Wonderland contains "
                + searchTerm + ".");

        // Part 5
        System.out.println("\nPart 5: ");
        System.out.println(searchTerm + " appears in the first sentence of Alice in Wonderland at " +
                "least once, beginning at Index " + firstSentence.toLowerCase().indexOf(searchTerm.toLowerCase())
                + ", and the length of " + searchTerm + " is " + searchTerm.length() + ".");
        String replacement = "";
        firstSentence = firstSentence.toLowerCase().replaceAll(searchTerm.toLowerCase(), replacement);
        System.out.println("When all occurrences of " + searchTerm + " are removed, the first sentence of Alice in Wonderland " +
                "looks like this: " + "\n" + firstSentence);
    }

}
