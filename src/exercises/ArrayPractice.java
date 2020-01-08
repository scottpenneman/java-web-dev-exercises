package exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] arrayPractice = {1, 1, 2, 3, 5, 8};

        System.out.println("Part 1: Array Practice: ");
        for (int i : arrayPractice) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String drSeuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        System.out.println(drSeuss);
        String[] drSeussArray = drSeuss.split("\\.");
        System.out.println(Arrays.toString(drSeussArray));
    }

}
