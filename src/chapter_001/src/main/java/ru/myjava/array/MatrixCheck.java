package chapter_001.src.main.java.ru.myjava.array;

public class MatrixCheck {

    public boolean mono(boolean[][] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[1][1] != data[i][i] || data[1][1] != data[data.length - 1 - i][i]) {
                return false;
            }
        }
        return true;
    }

}