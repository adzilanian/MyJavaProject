package chapter_001.src.main.java.ru.myjava.array;

import java.util.Arrays;

public class ArrayDuplicate {

    public String[] remove(String[] array) {

        return Arrays.copyOf(array,array.length);
    }
}
