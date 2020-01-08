package exercises;

import java.util.ArrayList;

public class ArrayListPracticeMath {

    public static Integer sumOfEven(ArrayList<Integer> intArray) {
        Integer counter = 0;
        for (int i : intArray) {
            if (i % 2 == 0) {
                counter += i;
            }
        } return counter;
    }

}
