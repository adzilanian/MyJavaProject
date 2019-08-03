package chapter_001.src.main.java.ru.myjava.array;

public class Check {

    public boolean mono(boolean[] data) {
        int counterOfTrue = 0;
        for (boolean dataCheckOfTrue : data) {
            if (dataCheckOfTrue) {
                counterOfTrue++;
            }
        }
        return counterOfTrue == data.length || counterOfTrue == 0;
    }
}
