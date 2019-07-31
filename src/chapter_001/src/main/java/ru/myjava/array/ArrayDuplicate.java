package chapter_001.src.main.java.ru.myjava.array;

import java.util.Arrays;

public class ArrayDuplicate {

    public String[] remove(String[] array) {
        int lenghtOfArray = array.length;
        for (int i = 0; i < lenghtOfArray; i++) {
            for (int j = i + 1; j < lenghtOfArray; j++) {
                if (array[i].equals(array[j])) {
                    if (lenghtOfArray - 1 - j >= 0) System.arraycopy(array, j + 1, array, j, lenghtOfArray - 1 - j);
                    j--;
                    lenghtOfArray--;
                }
            }
        }

        return Arrays.copyOf(array, lenghtOfArray);
    }
}
