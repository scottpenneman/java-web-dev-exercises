package exercises;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        System.out.println(numbers);

        Integer sum = ArrayListPracticeMath.sumOfEven(numbers);
        System.out.println(sum);

    }

}
