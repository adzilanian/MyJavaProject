package chapter_001.src.main.java.ru.myjava.array;

public class Turn {

    public int[] back(int[] array) {
        int turnedIndexOfArray = array.length-1;
        for (int originalIndex = 0; originalIndex < array.length/2; originalIndex++) {
            int tmp = array[originalIndex];
            array[originalIndex] = array[turnedIndexOfArray--];
            array[turnedIndexOfArray+1] = tmp;
        }
        return array;
    }
}
