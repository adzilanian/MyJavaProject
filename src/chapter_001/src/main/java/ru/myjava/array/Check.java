package chapter_001.src.main.java.ru.myjava.array;

public class Check {

    public boolean mono(boolean[] data) {
        boolean result = false;
        int count = 0;
        for (boolean datum : data) {
            if (datum) {
                count++;
            }
            if (count == data.length || count == 0) {
                result = true;
            }
        }
            return result;
    }
}
