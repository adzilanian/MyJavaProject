package chapter_001.src.main.java.ru.myjava.array.inheritance;

public class Shark extends Fish {

    private int finsNumber = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }
    public void display() {
        System.out.println(super.getAge());
        System.out.println(finsNumber);
    }
}
