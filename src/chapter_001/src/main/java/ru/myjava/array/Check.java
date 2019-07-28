package chapter_001.src.main.java.ru.myjava.array;

public class Check {

    public boolean mono(boolean[] data) {
        boolean result = false;
        int counterOfTrue = 0;
        for (boolean dataCheckOfTrue : data) {
            if (dataCheckOfTrue) {
                counterOfTrue++;
            }
            if (counterOfTrue == data.length || counterOfTrue == 0) {
                result = true;
            }
        }
            return result;
    }
}
