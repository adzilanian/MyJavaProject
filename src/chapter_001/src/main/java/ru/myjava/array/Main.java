package chapter_001.src.main.java.ru.myjava.array;

import chapter_001.src.main.java.ru.myjava.array.Turn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] originalArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        Turn turn = new Turn();
        System.out.println(Arrays.toString(originalArray));
        int[] turnedArray = turn.back(originalArray);
        System.out.println(Arrays.toString(turnedArray));
    }
}
