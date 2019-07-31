package chapter_001.src.test.java.ru.myjava.array;

import chapter_001.src.main.java.ru.myjava.array.ArrayDuplicate;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] originalArray = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = arrayDuplicate.remove(originalArray);
        String[] removedArray = new String[]{"Привет", "Мир", "Супер"};
        assertThat(result, is(removedArray));
    }
}