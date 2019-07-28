package chapter_001.src.main.java.ru.myjava.array;

public class Turn {

    public int[] back(int[] array) {
        int turnedIndexOfArray = array.length-1;
        for (int i = 0; i < array.length/2; i++) {
            int tmp = array[i];
            array[i] = array[turnedIndexOfArray--];
            array[turnedIndexOfArray+1] = tmp;
        }
        return array;
    }
}
